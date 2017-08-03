package ZadDom;


public class Zad2_Flamaster {
    public static void main(String[] args) {
        String[] input = new String[]{"Nazwa Alg", "OPSS", "ABCDEF", "ABBCCCDDDDEEEEE"};

        int letter = 0; // Licznik zliczający wszystkie literki
        for (int i = 1; i < input.length; i++) {


            String word = input[i]; //Zapisujemy do zmiennej word aktualnie przetwarzane słowo
            StringBuilder text = new StringBuilder(word);
            String result = "";
            // char[] lettersInWord = word.toCharArray();

            while (text.length() != 0) {
                int count = 0;
                char test = text.charAt(0);
                while (text.indexOf(test + "") != -1) {
                    text.deleteCharAt(text.indexOf(test + ""));
                    count++;
                }
                result = result + test + count;
            }
            System.out.printf(" %s ", result);
        }
    }
}


//}
//    private int LiczbaLiterWzdaniu(String word, char litera) {
//        int liczbaLiter = 0;
//        char znakZnapisu;
//        litera = String.valueOf(litera).toUpperCase().charAt(0);
//        for (int j = 0; j < word.length(); j++) { // przejscie po napisie
//
//            znakZnapisu = word.charAt(j); // pobieramy pojedynczy znak z word
//            znakZnapisu = String.valueOf(znakZnapisu).toUpperCase().charAt(0);
//
//            if (znakZnapisu == litera) {
//                liczbaLiter++;
//            }
//        }
//        return liczbaLiter;
//
//
//    }
//}


//            for (int j = 0; j < word.length(); j++) {
//                for (int k = 0; k < word.length(); k++) {
//                    if (word.charAt(j) == word.charAt(k)) {
//                        liczbaLiter++;
//                    }
//                }//
//                System.out.print(liczbaLiter);
//            }
// dzieliy stringi na pojedyncze znaki i tworzymy tablice
//            char[] letters = word.toCharArray();

//    String s = "mmababctamantlslmag";
//    int distinct = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//        for (int j = 0; j < s.length(); j++) {
//
//        if (s.charAt(i) == s.charAt(j)) {
//        distinct++;
//
//        }
//        }
//        System.out.println(s.charAt(i) + "--" + distinct);
//        String d = String.valueOf(s.charAt(i)).trim();
//        s = s.replaceAll(d, "");
//        distinct = 0;
//
//        }