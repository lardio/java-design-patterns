package fr.diginamic.factory;

import java.lang.reflect.InvocationTargetException;

public class FactoryTest {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        EnceinteConnectee enceinte = new EnceinteConnectee(12);
        ObjetConnecte t = ObjetConnecteFactory.getObjetConnecte(enceinte);

        System.out.println(t.getClass().getSimpleName()); // test ok
        System.out.println(t.getLimiteVolt()); // test ok
    }
}
