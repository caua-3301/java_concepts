package application;

import db.DB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args){
        Connection connect = null;
        Statement statement = null;

        try {
            connect = DB.getConnection();
            connect.setAutoCommit(false);

            statement = connect.createStatement();

            //transaction block
            {
                int rows_affected = statement.executeUpdate("update seller set BaseSalary = 4460 where DepartmentId = 3");
                int rows_affected_ = statement.executeUpdate("update seller set BaseSalary = 2245 where DepartmentId = 2");
            }

            connect.commit();
        } catch (SQLException err) {
            try {
                connect.rollback();
                System.out.println("Running error, rollback cause: " + err.getMessage());
            } catch (SQLException err_roll) {
                System.out.println("Running error, rollback failed: " + err_roll.getMessage());
            }
        }
    }
}
