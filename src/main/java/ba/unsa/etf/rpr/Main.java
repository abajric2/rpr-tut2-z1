package ba.unsa.etf.rpr;

public class Main
{
    /**
     * Funckija koja testira da li je prvi argument unesen s konzole ispravan
     * @param args
     */
    private static void provjeraPrvogArgumenata(String[] args) {
        if (args.length!=2) {
            System.err.println("Neispravan broj argumenata");
            System.exit(0);
        }
        else if(!args[0].equals("sinus") && !args[0].equals("faktorijel")) {
            System.err.println("Neispravna funkcija");
            System.exit(0);
        }
    }
    /**
     * Funkcija koja testira da li je drugi arguemnt unesen s konzole ispravan
     * @param args
     * @return
     */
    private static double provjeraDrugogArgumenta(String[] args) {
        double ulaz = 0;
        try {
            ulaz=Double.parseDouble(args[1]);
        }
        catch(Exception izuzetak) {
            System.err.println("Neispravan drugi argument");
            System.exit(0);
        }
        return ulaz;
    }
    public static void main( String[] args )
    {
        provjeraPrvogArgumenata(args);
        String f = args[0];
        double ulaz = provjeraDrugogArgumenta(args);
        switch(f) {
                case "sinus":
                    System.out.println("sinus(" + ulaz + ") = " + Math.Sinus(ulaz));
                    break;
                case "faktorijel":
                    System.out.println("faktorijel(" + ulaz + ") = " + Math.Faktorijel((int)ulaz));
                    break;
        }
    }
}


