package Mentoring._16_Haziran;

import java.util.ArrayList;

public class Movie {
    final int id; // yaparken kırmızı oldu
    String title;
    String studio;
    String rating;
    static int ID;
    static ArrayList<Movie> list=new ArrayList<>();

    public Movie(int id, String title, String studio, String rating) {
        this.id = ++ID;
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        list.add(this);

    }

    public Movie(String title, String studio, String pg15) {
        this.id=++ID;
        this.title = title;
        this.studio = studio;
        this.rating="PG";
        list.add(this);
    }
    public ArrayList<Movie> getPG(ArrayList<Movie> list) {
        ArrayList<Movie> returnList = new ArrayList<>();
        for (Movie movie : list) {
            if (movie.rating.equalsIgnoreCase("PG"));}
        return returnList;
    }}

