package bbw.mf.ch;

import java.sql.*;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/jokedb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection connection = DriverManager.getConnection(connectionURL, "root", "1234");
            Statement statement = connection.createStatement();
            ResultSet foundEntries = statement.executeQuery("SELECT * FROM joke");
            while (foundEntries.next()) {
                JokeBook jokeBook = new JokeBook(new ArrayList<Joke>());
                Joke joke = new Joke(foundEntries.getInt("id"), foundEntries.getString("text"), foundEntries.getDate("date"), foundEntries.getInt("rating"));
                jokeBook.getJokes().add(joke);
                System.out.println(jokeBook);
            }
            foundEntries.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

