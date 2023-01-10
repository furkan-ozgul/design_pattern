package adapter_pattern;

public class OGG {
    private String sarkiadi;
    public OGG(String s){
        sarkiadi = s;
    }
    public void OGGOynat(int hiz){
        System.out.println(sarkiadi + " " + hiz + " " + "hızında çalışıyor.");
    }
}
