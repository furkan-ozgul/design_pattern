package factory_pattern;

public class MercedesFactory extends ArabaFactory{

    @Override
    public Araba ArabaUret() {
        return new Mercedes();
    }
}