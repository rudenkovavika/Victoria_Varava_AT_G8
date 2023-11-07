package homework.day6;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> objectString = new GenericMethodsInGenericClassT<>();

        objectString.genericMethodOneGenArg("a");
        System.out.println(objectString.genericMethodTwoGenArgs("b", "c"));
        objectString.genericMethodHalfGenArgs("d", "eee");

        System.out.println("");

        GenericMethodsInGenericClassT<Integer> objectInteger = new GenericMethodsInGenericClassT<>();

        objectInteger.genericMethodOneGenArg(1);
        System.out.println(objectInteger.genericMethodTwoGenArgs(2, 3));
        objectInteger.genericMethodHalfGenArgs(4, "fdfd");

        System.out.println("");

        GenericMethodsInGenericClassT<Double> objectDouble = new GenericMethodsInGenericClassT<>();

        objectDouble.genericMethodOneGenArg(0.5);
        System.out.println(objectDouble.genericMethodTwoGenArgs(1.55, 4.555));
        objectDouble.genericMethodHalfGenArgs(7.66666, "pppppp");
    }
}
