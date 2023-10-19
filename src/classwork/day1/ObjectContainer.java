package classwork.day1;

public class ObjectContainer {

    Object[] objects = new Object[10];
    int counter = 0;

    public void add(Object incoming) {

        if (counter < objects.length) {
            objects[counter] = incoming;
            counter++;
        }
    }

    public Object removeLast() {
        Object removedObject = null;
        if (counter > 0) {
            removedObject = objects[counter - 1];
            counter--;
        }
        return removedObject;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}
