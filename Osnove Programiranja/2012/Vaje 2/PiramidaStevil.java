import java.util.Scanner;

public class PiramidaStevil{
    static int x;
    static Scanner sc = new Scanner(System.in);
    static int vrstica;
    
    public static void main(){
        System.out.print("Vnesite višino piramide: ");
        x = sc.nextInt();
        Piramida();
    }

    public static void Piramida(){
        for(int i=1;i<=x;i++){
            int d = i;
            vrstica = i;
            while((x-d)>0){
                System.out.print(" ");
                d++;
            }
            if (vrstica<3){
                for(int j=i;j<=i;j++){
                    if(j==1){
                        System.out.print(j);
                    }else if(j>1){
                        while(j<=(i+2)){
                            System.out.print(j);
                            j++;
                        }
                        j=i;
                    }
                }
            }else if (vrstica>=3){
                for(int j=i;j<=i;j++){
                    if(j==1){
                        System.out.print(j);
                    }else if(j>1){
                        while(j<=(i+3)){
                            System.out.print(j);
                            j++;
                        }
                        for(int x=j;x<(j+1);++x){
                            System.out.print(x);
                        }
                        j=i;
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
