package factory_pattern;

public class Sahin extends Araba{

    public Sahin(){
        maksHiz = 100;
        anlikHiz = 0 ;
    }

    @Override
    public int maksHizAl() {
        return maksHiz;
    }

    @Override
    public String marka() {
        return "Şahin";
    }

    @Override
    public void hiziBelirle(int s) {
        anlikHiz = s;
    }
    
}
