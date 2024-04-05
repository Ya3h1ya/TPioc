package metier;

import dao.IDao;
import ext.DaoImpl2;

public class MetierImpl implements IMetier{
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);
    }
/*
Injecter dans la variable dao un objet
d'une classe qui implémente l'interface IDao
 */
    public void setDao(DaoImpl2 dao) {

        this.dao = dao;
    }
}
