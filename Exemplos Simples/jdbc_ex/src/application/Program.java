package application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args){
        Connection connect = null;
        Statement st = null;
        ResultSet result = null;

        try {
            connect = DB.getConnection();
            st = connect.createStatement();
            result = st.executeQuery("select * from department");

            while(result.next()) {
                System.out.printf("%d, %s%n", result.getInt("Id"), result.getString("Name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeConnection();
            DB.closeResults(result);
            DB.closeStatement(st);
        }
    }
}
