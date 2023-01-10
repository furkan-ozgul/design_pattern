package adapter_pattern;

public class Main {
    public static void main(String[] args) {
    
        Player p = new Player();
        p.listeyeEkle(new Muzik("Müzik 1 "));
        p.listeyeEkle(new Muzik("Müzik 2 "));
        p.listeyeEkle(new Muzik("Müzik 3 "));
        p.Play();
        
    }
}
