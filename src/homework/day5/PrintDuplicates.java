package homework.day5;

public class PrintDuplicates {
    public void findDuplicates(String text) {
        String[] duplicates = text.split(" ");

        for (int i = 0; i < duplicates.length; i++) {
            for (int x = i + 1; x < duplicates.length; x++) {
                if (duplicates[i].equals(duplicates[x])) {
                    System.out.println(duplicates[i]);
                }
            }
        }
    }
}
