package PowtorzenieWiadomosci4_08;

public class OneWayList {

    OneWayListElement _head;
    int _counter;

    // dodajemy element na poczatku listy jednokierunkowej.

    public void addElementAtBeginning(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.date = newElement;
        p.next = _head;
        _head = p;
        _counter++;
    }

    public OneWayListElement getLastElement() {
        OneWayListElement iterator; // tworzymy zmiena "iterator" o typie OneWay...
        iterator = _head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        return iterator;
    }

    public void addElementAtEnd(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.date = newElement;
        OneWayListElement lastOne = getLastElement();
        lastOne.next = p;
        
    }
}


