package composite_pattern;

public class Metin implements Icerik {
    private String icerik;
    public Metin(String i){
        icerik = i ;
    }

    @Override
    public void Operation() {
        System.out.println("<p>" + icerik + "</p>");
        
    }

    @Override
    public void Add(Icerik i) {
        return;
        
    }

    @Override
    public void Remove(Icerik i) {
        return;
        
    }

    @Override
    public Icerik GetChild(int i) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
