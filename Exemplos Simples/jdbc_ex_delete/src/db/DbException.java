package db;

public class DbException extends RuntimeException{
    public DbException(String err) {
        super(err);
    }
}
