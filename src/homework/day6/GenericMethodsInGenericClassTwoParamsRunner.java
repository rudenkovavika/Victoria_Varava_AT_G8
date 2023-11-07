package homework.day6;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> objectStrStr = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(objectStrStr.genericMethodGenArgs("a"));
        System.out.println(objectStrStr.genericMethodGenArgs("b", "c"));
        objectStrStr.genericMethodHalfGenArgs("d", "eeee");
        objectStrStr.genericMethodHalfGenArgs("f", "g", "hh");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<String, Integer> objectStrInt = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(objectStrInt.genericMethodGenArgs("a"));
        System.out.println(objectStrInt.genericMethodGenArgs("b", 3));
        objectStrInt.genericMethodHalfGenArgs("d", "eeeeeee");
        objectStrInt.genericMethodHalfGenArgs("f", 99, "hh");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<String, Double> objectStrDouble = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(objectStrDouble.genericMethodGenArgs("a"));
        System.out.println(objectStrDouble.genericMethodGenArgs("b", 3.7));
        objectStrDouble.genericMethodHalfGenArgs("d", "ee");
        objectStrDouble.genericMethodHalfGenArgs("f", 99.66, "hhhh");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> objectIntInt = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(objectIntInt.genericMethodGenArgs(1));
        System.out.println(objectIntInt.genericMethodGenArgs(2, 3));
        objectIntInt.genericMethodHalfGenArgs(4, "eeeeee");
        objectIntInt.genericMethodHalfGenArgs(5, 6, "hhhhhhhhhhhhhh");

    }
}
