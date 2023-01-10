package command_pattern;

public class oncekiKanal implements Command{

private Televizyon tv ;

    public oncekiKanal(Televizyon t){
        tv = t;
    }


    @Override
    public void Execute() {
        tv.birOncekiKanal();
        System.out.println("Geçerli Kanal : " + tv.gecerliKanal());
    }

    @Override
    public String toString(){
        return "Önceki Kanal";
    }
    
}
