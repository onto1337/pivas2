package db;

import java.sql.Connection;

public class DB {
    private static String url;
    private static String login;
    private static String password;
    private static String nameDB;
    private static String timeZone;
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }
}
