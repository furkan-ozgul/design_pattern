package command_pattern;

public class Lamba {
    private int lamba;
    public Lamba(){
        lamba = 0 ; 

    }

    public void lambaAc(){
        System.out.println("Lamba Açildi");
        lamba = 1 ;
    }

    public void lambaKapa(){
        System.out.println("Lamba Kapandi");
        lamba = 0 ;
    }
    public int lambaDegeri(){
        return lamba ;
    
    }

    public String toString(){
        return null;
     
    }
}
