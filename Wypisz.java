

public class Wypisz {
    public Wypisz(String a) {
        System.out.println(String.valueOf(a.charAt(0)) +
                String.valueOf(a.charAt(a.length()-1)));
    }

    public Wypisz(String a, String b) {
        System.out.println(String.valueOf(a.charAt(0)) + String.valueOf(b.charAt(b.length() - 1)));
    }
}


