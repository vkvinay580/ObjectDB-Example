package alhasan.dbms;
import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.List;
import com.objectdb.*;

public class LibraryManager{

    public void libraryRelationalDB(){
        System.out.println("Connecting to SQLite database...");
        // db parameters
        String url = "jdbc:sqlite:identifier.sqlite";

        //connecting to database...
        Connection conn = null;


        //Reading from database...
        String sql = "SELECT * FROM books";

        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString(1) +  "\t" +
                        rs.getString(2) + "\t" +
                        rs.getInt(3)+ "\t" +
                        rs.getInt(4)+ "\t" +
                        rs.getString(5)+ "\t" +
                        rs.getInt(6));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public void userObjectDB(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/user.odb");
        EntityManager em = emf.createEntityManager();
        //store a user
        em.getTransaction().begin();
        for(int i=0;i<1000;i++) {
            int hundreds = i / 100;
            int tens = (i - hundreds) / 10;
            int ones = i - (hundreds + tens);
            User user = new User(i, "USER " + hundreds + tens + ones, i, "@user" + hundreds + tens + ones);
            em.persist(user);
        }
        em.getTransaction().commit();
        /*
        //Find number of users in the database...
        Query q1 = em.createQuery("select  count(user) from User user");
        System.out.println("Number of available Users: "+q1.getSingleResult());

         */
        //Retrieve All Users...
        TypedQuery<User> query =
                em.createQuery("select user from User user",User.class);

        List<User> results = query.getResultList();
        for (User user:results){
            System.out.println(user.getUserStringDetails());
        }
        em.close();
        emf.close();

    }

    public void libraryObjectDB(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/libaray.odb");
        EntityManager em = emf.createEntityManager();
        //store a user
        em.getTransaction().begin();
        Book book = new Book();
        Staff staff = new Staff();
        AuthenticationSystem authenticationSystem = new AuthenticationSystem();
        PhoneNo phoneNo = new PhoneNo();
        Reader reader = new Reader();
        Publisher publisher = new Publisher();
        Report report = new Report();
        em.persist(book);
        em.persist(staff);
        em.persist(authenticationSystem);
        em.persist(phoneNo);
        em.persist(reader);
        em.persist(publisher);
        em.persist(report);
        em.getTransaction().commit();
        /*
        //Find number of users in the database...
        Query q1 = em.createQuery("select  count(user) from User user");
        System.out.println("Number of available Users: "+q1.getSingleResult());


        //Retrieve All Users...
        TypedQuery<User> query =
                em.createQuery("select user from User user",User.class);

        List<User> results = query.getResultList();
        for (User user:results){
            System.out.println(user.getUserStringDetails());
        }
        */
        em.close();
        emf.close();

    }

    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();
        lib.libraryObjectDB();
    }
}
