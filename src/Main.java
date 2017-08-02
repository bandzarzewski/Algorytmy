/**
 * Created by RENT on 2017-07-21.
 */
public class Main {
    public static void main(String[] args) {
        String napis ="Ala ma duzego Psa";


        public static int wystapienie_litera(String napis, char litera)
        {
            int ile_liter = 0;  // zmienna, w której będziemy przechowywać
            // liczbę zliczonych znaków
            char znak_z_napisu; // zmienna do pobierania kolejnych liter z napisu
            for (int i = 0 ; i < napis.length() ; i++) // przejście po napisie
            {
                znak_z_napisu = napis.charAt(i); // pobieramy pojedynczy znak z napisu
                if(znak_z_napisu == litera) // porównanie ze znakiem
                {                           // przekazywanym jako parametr
                    ile_liter++; // zwiększamy wartość zmiennej
                }
            }
            return ile_liter;
        }

    }
}
