package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args){
        Connection connect = null;
        PreparedStatement prep_state = null;

        try {
            connect = DB.getConnection();
            prep_state = connect.prepareStatement(
                    "update seller "
                        +"set BaseSalary = BaseSalary+?"
                        +"where Id = ?");

            prep_state.setDouble(1,1000);
            prep_state.setInt(2, 7);

            int affected = prep_state.executeUpdate();

            System.out.println(affected + "rows affected");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeStatement(prep_state);
            DB.closeConnection();
        }
    }
}
