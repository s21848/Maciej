

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Zad1
            Wypisz wypisz = new Wypisz("abcdefg");
            Wypisz wypisz1 = new Wypisz("abcdefg", "1234567");


        //Zad2
        Mat mat = new Mat();

        System.out.println("1+2=" + mat.dodaj(1, 2));
        System.out.println("1+2+3=" + mat.dodaj(1, 2, 3));
        System.out.println("1+2+3+4=" + mat.dodaj(1, 2, 3, 4));

        System.out.println("1+2=" + mat.dodaj(1L, 2L));
        System.out.println("1+2+3=" + mat.dodaj(1L, 2L, 3L));
        System.out.println("1+2+3+4=" + mat.dodaj(1L, 2L, 3L, 4L));


        //Zad3
        Kubek kubek = new Kubek("metal", 250, Color.black, "Siema");
        Kubek kubek1 = new Kubek("plastik", 500, Color.cyan);
        Kubek kubek2 = new Kubek("porcelana", 150, "Elo");
        Kubek kubek3 = new Kubek("plastik", "Dzień dobry");
        Kubek kubek4 = new Kubek("drewno");
        Kubek kubek5 = new Kubek(300);
        Kubek kubek6 = new Kubek(Color.blue);
        Kubek kubek7= new Kubek(250, "Cześć");

    }
}
