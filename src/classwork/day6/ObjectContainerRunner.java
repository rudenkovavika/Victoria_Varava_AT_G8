package classwork.day6;

public class ObjectContainerRunner {
    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();

        objectContainer.add(1);
        objectContainer.add(5);
        objectContainer.add(10);

        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());
        }
    }
}