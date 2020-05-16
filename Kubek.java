

import java.awt.Color;

public class Kubek {
    private String materiał;
    private int pojemność;
    private Color kolor;
    private String nadruk;

    public Kubek(String materiał) {
        this.materiał = materiał;
    }

    public Kubek(String materiał, int pojemność, Color kolor, String nadruk) {
        this.materiał = materiał;
        this.pojemność = pojemność;
        this.kolor = kolor;
        this.nadruk = nadruk;
    }

    public Kubek(String materiał, int pojemność, Color kolor) {
        this.materiał = materiał;
        this.pojemność = pojemność;
        this.kolor = kolor;
    }
    public Kubek(String materiał, int pojemność,String nadruk){
        this.materiał = materiał;
        this.pojemność = pojemność;
        this.nadruk = nadruk;
    }

    public Kubek(String materiał, String nadruk) {
        this.materiał = materiał;
        this.nadruk = nadruk;
    }

    public Kubek(int pojemność) {
        this.pojemność = pojemność;
    }

    public Kubek(Color kolor) {
        this.kolor = kolor;
    }

    public Kubek(int pojemność, String nadruk) {
        this.pojemność = pojemność;
        this.nadruk = nadruk;
    }
}
