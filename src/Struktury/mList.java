package Struktury;


public class mList {
    Element _head;
    Element _tail;
    int _counter;

    public void goThroughListForward(mList list) {
        Element p = list._head;
        while (p.next != null) {
            p = p.next;
        }
    }

    public void goThroughListBack(mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBegining(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list._counter++;// zwiekszamy licznik o jeden

        if (p.next != null) {
            Element nextEl = p.next; // doadajemy nowy element
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = list._tail;
        p.next = null;
        list._tail = p;
        list._counter++; // ?

        if (p.prev != null) {
            Element nextEl = p.prev;
            nextEl.next = p;

        } else {
            list._head = p;
        }

    }

    public Element getElementForward(int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public Element getElementBackward(int data, mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            if (p.data == data) {
                break;
            }
            p = p.prev;
        }
        return p;
    }

    public void printAllElements(mList list) {
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;

        }
    }

    public void addElementBeforeElement(int elementToAdd, int elementBefore, mList list) {
        Element before = list.getElementForward(elementBefore, list);

        if (before == list._head) {
            list.addElementAtBegining(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list._counter++;

        }
    }

    public void addElementAfterElement(int elementToAdd, int elementAfter, mList list) {
        Element after = list.getElementBackward(elementAfter, list);

        if (after == list._tail) {
            list.addElementAtEnd(elementToAdd, list);
            Element p = new Element();
            p.data = elementToAdd;
            p.next = after.next;
            p.prev = after;
            Element nextAfter = after.next;
            nextAfter.prev = p;

            after.next = p;
            list._counter++;

        }
    }


}


