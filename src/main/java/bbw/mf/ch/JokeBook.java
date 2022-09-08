package bbw.mf.ch;

import java.util.ArrayList;

public class JokeBook {
    private ArrayList<Joke> jokes;

    public JokeBook(ArrayList<Joke> jokes) {
        this.jokes = jokes;
    }

    public ArrayList<Joke> getJokes() {
        return jokes;
    }

    public void setJokes(ArrayList<Joke> jokes) {
        this.jokes = jokes;
    }

    @Override
    public String toString() {
        return "JokeBook{" +
                "jokes=" + jokes +
                '}';
    }
}
