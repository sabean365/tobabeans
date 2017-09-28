/*
@ Sarah Bean 9/27 - DBUtil file using JPA
 */
package toba.data;

import toba.business.User;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

    //create EntityManagerFacory object
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("TOBAPU2");
    
    //call getter to return object emf
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}