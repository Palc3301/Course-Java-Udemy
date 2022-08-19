package application;

import entities.Comment_138;
import entities.Post_138;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program_138 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment_138 c1 = new Comment_138("Have a nice trip!");
        Comment_138 c2 = new Comment_138("Wow that's awesome!");
        Post_138 p1 = new Post_138(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
                "I'm going to visist this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment_138 c3 = new Comment_138("Good night");
        Comment_138 c4 = new Comment_138("May the Force be with you");
        Post_138 p2 = new Post_138(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1);
    }
}
