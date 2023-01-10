package factory_pattern;

public class SahinFactory extends ArabaFactory{

    @Override
    public Araba ArabaUret() {
        return new Sahin();
    }
    
}
