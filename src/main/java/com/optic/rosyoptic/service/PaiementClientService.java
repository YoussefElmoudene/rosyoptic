package com.optic.rosyoptic.service;

import com.optic.rosyoptic.bean.*;
import com.optic.rosyoptic.repository.PaiementClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class PaiementClientService {

    public List<PaiementClient> findByClientNomAndClientPrenom(String nom, String prenom) {
        return paiementClientDao.findByClientNomAndClientPrenom(nom, prenom);
    }

    public PaiementClient findByDate(Date date) {
        return paiementClientDao.findByDate(date);
    }

    public PaiementClient findByReference(String reference) {
        return paiementClientDao.findByReference(reference);
    }

    public List<PaiementClient> findAll() {
        return paiementClientDao.findAll();
    }

    public int save(PaiementClient paiementClient) {
        Client client ;
        Verres verre ;
        List<Montures> listMonture = new ArrayList<>();
        List<Montures> monturesList = paiementClient.getMonturesList();
        List<LunetteSoleil> lunetteSoleilList = new ArrayList<>();
        List<LunetteSoleil> lunetteList = paiementClient.getLunetteList();

        if (paiementClient.getClient() == null) {
            client = null;
        } else {
            client = clientService.findClientById(paiementClient.getClient().getId());
        }

        if (paiementClient.getVerre() == null) {
            verre = null;
        } else {
            verre = verreService.findVerresById(paiementClient.getVerre().getId());
        }


        for (Montures monture : monturesList) {
            Montures mont = new Montures();
            mont = montureService.findMonturesById(monture.getId());
            if (mont != null) {
                listMonture.add(this.cloneMonture(mont));
            }
        }
        for (LunetteSoleil lunette : lunetteList) {
            LunetteSoleil l = new LunetteSoleil();
            l = lunetteSoleilService.findLunetteSoleilById(lunette.getId());
            if (l != null) {
                lunetteSoleilList.add(this.cloneLunette(l));
            }
        }
        if (client == null) {
            return -1; // client required
        } else {
            if (lunetteSoleilList.size() == 0) {
                paiementClient.setLunetteList(null);
            }
            if (listMonture.size() == 0) {
                paiementClient.setMonturesList(null);
            }
            if (verre == null) {
                paiementClient.setVerre(null);
            }
            paiementClient.setLunetteList(lunetteSoleilList);
            paiementClient.setMonturesList(listMonture);
            paiementClient.setClient(client);
            paiementClient.setVerre(verre);
            paiementClientDao.save(paiementClient);
            return 0;
        }
    }

    public Montures cloneMonture(Montures monture) {
        Montures m = new Montures();
        m.setStock(monture.getStock());
        m.setFournisseur(monture.getFournisseur());
        m.setBuyingDate(monture.getBuyingDate());
        m.setPrice(monture.getPrice());
        m.setEtat(monture.getEtat());
        m.setMarque(monture.getMarque());
        m.setId(monture.getId());
        m.setModele(monture.getModele());
        m.setPriceTotale(monture.getPriceTotale());
        m.setSellingDate(monture.getSellingDate());
        m.setSeries(monture.getSeries());
        return m;
    }

    public LunetteSoleil cloneLunette(LunetteSoleil lunetteSoleil) {
        LunetteSoleil m = new LunetteSoleil();
        m.setQte(lunetteSoleil.getQte());
        m.setFournisseur(lunetteSoleil.getFournisseur());
        m.setBuyingDate(lunetteSoleil.getBuyingDate());
        m.setPrice(lunetteSoleil.getPrice());
        m.setEtat(lunetteSoleil.getEtat());
        m.setMarque(lunetteSoleil.getMarque());
        m.setId(lunetteSoleil.getId());
        m.setTotalPrice(lunetteSoleil.getTotalPrice());
        m.setSellingDate(lunetteSoleil.getSellingDate());
        m.setSeries(lunetteSoleil.getSeries());
        return m;
    }

    @Autowired
    private PaiementClientDao paiementClientDao;
    @Autowired
    private ClientService clientService;
    @Autowired
    private MontureService montureService;
    @Autowired
    private VerreService verreService;
    @Autowired
    private LunetteSoleilService lunetteSoleilService;
}
