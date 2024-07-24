package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args){
        Connection connect = null;
        PreparedStatement preparet_statement = null;

        try {
            connect = DB.getConnection();
            preparet_statement = connect.prepareStatement(
                    "delete from seller where Id = ?");

            preparet_statement.setInt(1, 8);

            int rows_removed = preparet_statement.executeUpdate();

            System.out.println(rows_removed + " are removed");
        } catch (SQLException err) {
            throw new DbIntegrityException(err.getMessage());
        }
        finally {
            DB.closeStatement(preparet_statement);
            DB.closeConnection();
        }
    }
}
