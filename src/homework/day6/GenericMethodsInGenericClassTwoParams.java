package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public Object genericMethodGenArgs(X x) {
        return (String.format("I received %d arguments of type: %s class",
                1, x.getClass().getSimpleName()));
    }

    public Object genericMethodGenArgs(X x, Y y) {
        return (String.format("I received %d arguments of type: %s class, %s class",
                2, x.getClass().getSimpleName(), y.getClass().getSimpleName()));
    }

    public void genericMethodHalfGenArgs(X x, String s) {
        System.out.println(String.format("I got an object of %s class and string with %s characters",
                x.getClass().getSimpleName(), s.toCharArray().length));
    }

    public void genericMethodHalfGenArgs(X x, Y y, String s) {
        System.out.println(String.format("I got an object of %s class and %s class and string with %s characters",
                x.getClass().getSimpleName(), y.getClass().getSimpleName(), s.toCharArray().length));
    }

}
