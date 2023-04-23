import com.sun.source.tree.TryTree;

import java.util.*;
import java.sql.*;
class JDBC
{
    void insertrow(String a,String b,String c,String d,Object e,Object f,Object g,Object h,Object i,String j,Object k,Object l)
    {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "Biotech@5678");
            String q = "insert into Passenger values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,a);
            pstmt.setString(2,b);
            pstmt.setString(3,c);
            pstmt.setString(4,d);
            pstmt.setObject(5,e);
            pstmt.setObject(6,f);
            pstmt.setObject(7,g);
            pstmt.setObject(8,h);
            pstmt.setObject(9,i);
            pstmt.setString(10,j);
            pstmt.setObject(11,k);
            pstmt.setObject(12,l);
            pstmt.executeUpdate();
            con.close();

        } catch (Throwable m) {
            System.out.println(m);
        }
    }
    void deleterow(String a,String b,String c)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "Biotech@5678");
            Statement stmt =con.createStatement();
            stmt.executeUpdate("delete from Passenger where Passenger_fname='"+a+"' and Passenger_lname='"+b+"' and Passenger_mobNo='"+c+"'");
            System.out.println("Booking successfully cancelled.");
            con.close();
        }catch (Throwable d)
        {
            System.out.println(d);
        }
    }
    public static void main(String arv[])
    {

    }
}
