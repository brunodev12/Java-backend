package conexion_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class Conexion_MYSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here

        Connection conexion;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/nba";
            conexion = DriverManager.getConnection(url, "root", "root");
            String sql = "SELECT * FROM equipos";
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs);
            while(rs.next()){
                String s = rs.getString("Nombre");
                System.out.println(s);
            }
        } catch(SQLException e){
            conexion = null;
            e.printStackTrace();
        }
        

    }

}
