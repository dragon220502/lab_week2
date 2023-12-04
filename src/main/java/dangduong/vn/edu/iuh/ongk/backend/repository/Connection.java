package dangduong.vn.edu.iuh.ongk.backend.repository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Connection {
    private EntityManagerFactory em;
    private static Connection inStance;

    private Connection() {
        em = Persistence.createEntityManagerFactory("defailt");

    }

    public static Connection getInStance() {
        if(inStance==null){
            inStance = new Connection();
        }
        return inStance;
    }

    public EntityManagerFactory getEm() {
        return em;
    }
}
