package jdbcıntro;
import java.sql.*;
import java.util.ArrayList;//4086 düzce2

public class JdbcIntro {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            conn = (Connection) helper.getConn(); 
            String sql = "delete from city where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, 4086);
            
            int result = statement.executeUpdate();
            System.out.println("Kayıt silindi . rows efected : "+result);
        } catch (SQLException e) {
            helper.showErrors(e);
        } finally {
            // conn null değilse kapat
            if (conn != null) {
                statement.close();
                conn.close();
                System.out.println("Bağlantı kapatıldı.");
            }
        }
    }
    
    
    public static void selectData()throws SQLException{//sql veri tabanındaki verileri ekrana yazdırmaya yarar.
        Connection conn = null;
        DbHelper helper = new DbHelper();
        Statement statement;
        ResultSet setit;
        try {
            conn = (Connection) helper.getConn(); // Burada conn'ın null olup olmadığını kontrol et
            statement = conn.createStatement();
            setit = statement.executeQuery("select  code,name,continent,region from country");
            ArrayList<Country> countries = new ArrayList<>();
            while(setit.next()){
                countries.add(
                        new Country(setit.getString("Code")
                        ,setit.getString("Name")
                        ,setit.getString("Continent")
                        ,setit.getString("Region"))
                );
            }
            System.out.println(countries.size());
        } catch (SQLException e) {
            helper.showErrors(e);
        } finally {
            // conn null değilse kapat
            if (conn != null) {
                conn.close();
                System.out.println("Bağlantı kapatıldı.");
            }
        }
    }
    public static void insertData() throws SQLException{//sql veri tabanındaki verilere yeni bir veri eklemeye yarar.
         Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            conn = (Connection) helper.getConn(); 
            String sql = "insert into city(Name,CountryCode,District,Population) values( ?,?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, "Düzce 2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 50000);
            int result = statement.executeUpdate();
            System.out.println("Kayıt eklendi. rows efected : "+result);
        } catch (SQLException e) {
            helper.showErrors(e);
        } finally {
            // conn null değilse kapat
            if (conn != null) {
                statement.close();
                conn.close();
                System.out.println("Bağlantı kapatıldı.");
            }
        }
    }
    
    public static void updateData()throws SQLException{//sql veri tabanındaki herhangi bir veriyi update etmeye yarar
        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            conn = (Connection) helper.getConn(); 
            String sql = "update city set population=10000,district = 'Turkey' where id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, 4086);
            
            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi. rows efected : "+result);
        } catch (SQLException e) {
            helper.showErrors(e);
        } finally {
            // conn null değilse kapat
            if (conn != null) {
                statement.close();
                conn.close();
                System.out.println("Bağlantı kapatıldı.");
            }
        }
    }
   public static void deleteData()throws SQLException{//sql veri tabanındaki herhangi bir tablodaki verileri silmeye yarar.
       
   } 
    
    
}
