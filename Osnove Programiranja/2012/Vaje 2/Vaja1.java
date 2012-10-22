/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaje2;

/**
 *
 * @author aj2762
 */
public class Vaja1 {
    
    public static void main(String[] args) {
        int st= 5271;
        while (st>0){
            int stevka = st%10;
            System.out.print(stevka + " ");
            st=st/10;
        }
    }
}
