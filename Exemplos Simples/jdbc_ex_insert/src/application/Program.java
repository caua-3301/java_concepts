package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args){
        Connection connect = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connect = DB.getConnection();
            PreparedStatement st = connect.prepareStatement(
                    "insert into seller"
                        +"(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                        +"values (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Cauã Pires Soares");
            st.setString(2, "caua@gmail.com");
            st.setDate(3, new Date(sdf.parse("05/11/2004").getTime()));
            st.setDouble(4, 3500);
            st.setInt(5, 2);

            int rows_affected = st.executeUpdate();

            //get id added
            if (rows_affected > 0) {
                ResultSet result = st.getGeneratedKeys();
                while(result.next()) {
                    int id = result.getInt(1);
                    System.out.println("Id added = " + id);
                }
            }
            else {
                System.out.println("No rows affected");
            }

            st.close();
        } catch (SQLException | ParseException err) {
            throw new RuntimeException(err);
        }
        finally {
            DB.closeConnection();
        }
    }
}
