package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T x) {
        System.out.println(String.format("I am an object of %s class", x.getClass().getSimpleName()));
    }

    public Object genericMethodTwoGenArgs(T x, T y) {
        return (String.format("We are objects of %s class and %s class",
                x.getClass().getSimpleName(), y.getClass().getSimpleName()));
    }

    public void genericMethodHalfGenArgs(T x, String n) {
        System.out.println(String.format("I got an object of %s class and string with %s characters",
                x.getClass().getSimpleName(), n.toCharArray().length));
    }
}
