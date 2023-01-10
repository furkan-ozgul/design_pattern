package command_pattern;

public class Main {
    public static void main(String[] args) {
        Menu m = new Menu();
        Televizyon tv = new Televizyon();
        oncekiKanal komut_once = new oncekiKanal(tv);
        
        m.komutEkle(komut_once);
    }
}
