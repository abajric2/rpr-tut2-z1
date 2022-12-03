package ba.unsa.etf.rpr;

/**
 * Klasa za rad sa matematickim funkcijama
 * Implementira funkcije sinus i faktorijel
 * @author Amina Bajric
 */
public class Math {

    public static double PI=3.14159265358979;

    /**
     * funkcija za racunanje sinusa broja koji joj je prolslijedjen kao parametar
     * @param x
     * @return
     */
    public static double Sinus(double x) {
        double suma=0;
        for(int i = 0; i<=10; i++) {
            suma = suma + java.lang.Math.pow(-1, i) * (java.lang.Math.pow(x, 2 * i + 1)/Faktorijel(2 * i + 1));
        }
        return suma;
    }

    /**
     * funkcija za racunanje faktorijela broja koji joj je prolslijedjen kao parametar
     * @param x
     * @return
     */
    public static double Faktorijel (int x) {
        int faktorijel = 1;
        for(int i = 2; i <= x; i++) faktorijel = faktorijel * i;
        return faktorijel;
    }
}
