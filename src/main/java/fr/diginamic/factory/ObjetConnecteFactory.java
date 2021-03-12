package fr.diginamic.factory;
import java.lang.reflect.InvocationTargetException;

public class ObjetConnecteFactory<T extends ObjetConnecte> {

    public static <T extends ObjetConnecte> T getObjetConnecte(ObjetConnecte objetConnecte) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> act = Class.forName(objetConnecte.getNomTotal());
        Class<T> clazz = (Class<T>) Class.forName(objetConnecte.getNomTotal());
        T activityClass =  clazz.getDeclaredConstructor(Integer.class).newInstance(objetConnecte.getLimiteVolt());
        return activityClass;
    }
}
