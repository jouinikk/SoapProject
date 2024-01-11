package Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Metier.Compte;
@WebService
public class BanqueService {
    private List<Compte> lesComptes;

    public BanqueService(){
        this.lesComptes = new ArrayList<Compte>();
        lesComptes.add(new Compte(123,120.03));
        lesComptes.add(new Compte(456,120.03));
        lesComptes.add(new Compte(789,120.03));

    }
    @WebMethod
    public List<Compte> getLesComptes(){
        return lesComptes;
    }

    @WebMethod
    public int convertire(@WebParam(name="montant") int montant){
        return montant*3;
    }

    public Compte getCompte(int code) throws Exception{
        Compte c = null;
        for (Compte compte:lesComptes){
            if(compte.getCode()==code){
                c=compte;
            }
        }
        if (c!=null) return c;
        else throw new NoSuchElementException("Compte innexistant");
    }

    public Double retireArgent(int code,Double montant) throws Exception {
        return getCompte(code).retireMontant(montant);
    }

    public Double alimenterCompte(int code,Double montant) throws Exception {
        return getCompte(code).AlimenterCompte(montant);
    }

}
