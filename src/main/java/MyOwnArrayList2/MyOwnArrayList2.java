package MyOwnArrayList2;

import java.util.Arrays;

public class MyOwnArrayList2<T> {

    private T[] elements;
    private int count;
    private static final int SIZE = 10;


    public MyOwnArrayList2() {
        this.elements = (T[]) new Object[SIZE];
        this.count = count;
    }

    public void addElement(T element) {
        if (count == SIZE) {
            throw new IllegalArgumentException("Over size MyOwnArrayList2 " + SIZE);
        } else {
            this.elements[count] = element;
            count++;
        }
    }

    public T getElement(int index) {
        if (index < 0 && index > elements.length) {
            throw new IndexOutOfBoundsException("Index out of bond 0-" + elements.length);
        }
        if (elements[index] == null) {
            throw new NullPointerException("object with index " + index + " is Null");
        } else {
            return elements[index];

        }
    }

    public boolean removeElement(int index) {   //метод удаления елемента
        T[] newList = (T[]) new Object[SIZE];
        if (index <= 0 && index > elements.length) {
            throw new IndexOutOfBoundsException("Index out of bond 0-" + elements.length);
        } else {
            int newIndex = 0;
            for (int i = 0; i < elements.length; i++) {
                if (i != index) {
                    newList[newIndex] = elements[i];
                    newIndex++;
                }
            }

        }
        elements = newList;
        return true;
    }

    @Override
    public String toString() {
        return "MyOwnArrayList2{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
