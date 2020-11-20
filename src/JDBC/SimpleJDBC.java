package JDBC;

import java.sql.*;

public class SimpleJDBC {
  public void connectDB() {
    try {
      Class.forName("org.postgresql.Driver");
      String url = "jdbc:postgresql://localhost:5432/learningjpa";
      String login = "bookgvi";
      String password = "1q2w#E$R";
      Connection con = DriverManager.getConnection(url, login, password);
      Statement statement = con.createStatement();
      ResultSet rs = statement.executeQuery("SELECT * FROM news");
      while (rs.next()) {
        int id = rs.getInt("id");
        String lang = rs.getString("lang");
        String title = rs.getString("title");
        Date date = new Date(rs.getLong("date") * 1000);
        System.out.printf("%s, %s, %s, %s%n", id, lang, title, date);
      }
      rs.close();
      statement.close();
      con.close();
    } catch (Exception ignored) {}
  }
}
