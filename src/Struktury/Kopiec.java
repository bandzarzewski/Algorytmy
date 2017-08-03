package Struktury;

public class Kopiec {

    public Kopiec(int n) {   // KONSTRUKTOR
        _date = new int[n];
    }

    int _date[];
    int _counter = 0; // zliczanie

    public void insertElement(int element) {

        int i = _counter;
        _counter++;
        int j = Math.floorDiv(i - 1, 2);

        while (i > 0 && _date[j] < element) {
            _date[i] = _date[j];
            i = j;
            j = Math.floorDiv(i - 1, 2);
        }
        _date[i] = element;
    }

    public void printAllElemts() {
        for (int i = 0; i < _date.length; i++) {
            System.out.printf("%d ", _date[i]);
        }
    }
}
