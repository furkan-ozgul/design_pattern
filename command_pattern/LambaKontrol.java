package command_pattern;

public class LambaKontrol implements Command{
    Lamba lamba ; 

    public LambaKontrol(Lamba l){
        
    }

    @Override
    public void Execute() {
        if(lamba.lambaDegeri()==1) lamba.lambaKapa();
        else lamba.lambaAc();
        
    }

    @Override
    public String toString(){
        if(lamba.lambaDegeri()==1) lamba.lambaKapa();
        else return "Lambayi Aç";
        return null;
    }


}
