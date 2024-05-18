package application;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql {
    static String url = "jdbc:mysql://localhost:3306/doctor";
    static String username = "root";
    static String password = "saymmfladw";
    static Connection driver ;
     private static void initDB() {
         try {
             driver =  DriverManager.getConnection(url,username, password);
             System.out.println("Connect to MYSQL");

         }catch(Exception e) {
             System.out.println("FAILED TO CONNECT TO THE DB");
             System.exit(-1);
         }
    }


     public static Boolean addToDatabase(String query) {
         try {
        initDB();
        Statement st = driver.createStatement();
        int count = st.executeUpdate(query);
        System.out.println("ajouter avec succes");
        st.close();
        return true;

    } 
    catch(Exception e) {
        System.out.println(e.getMessage());
        return false ; 
    }
}
     public static Boolean selectfromDatabase(String query, String column , String column1) {
         try {
                initDB();
                Statement st = driver.createStatement();
                ResultSet rs = st.executeQuery(query);
                 boolean found = false;
                while(rs.next()) {
                    String name = rs.getString(column);
                    System.out.println(name);
                    String first_name = rs.getString(column1);
                    System.out.println(first_name);
                    found =true;

            }    if (found) {
                System.out.println("trouvé");
            }else System.out.println("non for some reason");

            st.close();
                return true;
            } 
            catch(Exception e) {
                System.out.println(e.getMessage());
                return false ; 
            }
     }
}