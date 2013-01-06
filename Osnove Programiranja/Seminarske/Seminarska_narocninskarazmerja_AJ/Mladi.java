package semop3;

public class Mladi extends Narocnik {
    
    private static final int M = 100;
    
    public double znesekRacuna(double mesecnaNarocnina){
        int m = M*60;
        for (int i=0;i<k.length;i++){
            if (k[i].VrniDolzino()<=m){
                m -= k[i].VrniDolzino();
                if (m<0){
                    k[i].NastaviDolzino((k[i].VrniDolzino() + m));
                    zr += ((((double)k[i].VrniDolzino())/60)*k[i].vrniCeno());
                }
            } else {
                if (k[i].VrniDolzino()>=60){
                    zr += ((((double)k[i].VrniDolzino())/60)*k[i].vrniCeno());
                } else {
                    zr += k[i].vrniCeno();
                }
            }

        }
        zr += mn;
        return zr;
    }
}
