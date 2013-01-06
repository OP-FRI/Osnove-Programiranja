package semop3;

public class Prijatelji extends Narocnik {
    
    private static final int N = 3;
    private String[] stevilkePrijateljev;
    
    public void NastaviPrijatelje (String[] st){
        this.stevilkePrijateljev = new String[N];
        this.stevilkePrijateljev = st;
    }
    
    public String[] VrniPrijatelje(){
        return this.stevilkePrijateljev;
    }
    
    public double znesekRacuna(){
        for (int i=0;i<k.length;i++){
            for (int j=0;j<stevilkePrijateljev.length;j++){
                if (!(k[i].VrniStevilko().equals(stevilkePrijateljev[j]))){
                    if (k[i].VrniDolzino() >= 60){
                        zr += (((double)k[i].VrniDolzino()/60)*k[i].vrniCeno());
                    } else {
                        zr += k[i].vrniCeno();
                    }
                } else {
                    zr = 0;
                }
            }
        }
        zr += mn;
        return zr;
    }
}
