package singleton_pattern;

public class TekSinif {
    private int deger;
    private TekSinif(){
        deger=12;
    }

    public int degerAl(){ return deger; }
    public void degerYaz(int a){
        deger=a;
    }

    //singleton

    private static TekSinif uniqueInstance = null;
    public static TekSinif Instance(){
        if(uniqueInstance==null){
            uniqueInstance= new TekSinif();
        }
        return uniqueInstance;
    }
    
}
