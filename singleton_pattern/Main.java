package singleton_pattern;

public class Main {
    public static void main(String[] args) {
        TekSinif t = TekSinif.Instance();
        System.out.println(t.degerAl());
        t.degerYaz(20);
        TekSinif u = TekSinif.Instance();
        System.out.println(u.degerAl());
    }
}
