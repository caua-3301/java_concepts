package db;

import javax.swing.plaf.nimbus.State;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection connect = null;

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException err) {
                throw new DbException(err.getMessage());
            }
        }
    }

    public static  void closeResults(ResultSet res) {
        if (res != null) {
            try {
                res.close();
            } catch (SQLException err) {
                throw new DbException(err.getMessage());
            }
        }
    }

    //realizando a conexão
    public static Connection getConnection() {
        if (connect == null) {
            try {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            connect = DriverManager.getConnection(url, props);
            } catch (SQLException err) {
                throw new DbException(err.getMessage());
            }
        }
        return connect;
    }

    //fechando a conexão
    public static void closeConnection() {
        if (connect != null) {
            try {
            connect.close();
            } catch (SQLException err) {
                throw new DbException(err.getMessage());
            }
        }
    }

    //carregando as propriedades do banco de dados
    private static Properties loadProperties() {
        try(FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException err) {
            throw new DbException(err.getMessage());
        }
    }
}
