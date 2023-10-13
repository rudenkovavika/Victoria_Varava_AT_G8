package homework.day3.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        CycleTaskWhile cycleTaskWhile = new CycleTaskWhile();
        cycleTaskWhile.printAllInt();

        CycleTaskFor cycleTaskFor = new CycleTaskFor();
        cycleTaskFor.printOddNumbers();

        CycleTaskEmptyArray cycleTaskEmptyArray = new CycleTaskEmptyArray();
        int[] array = new int[7];
        cycleTaskEmptyArray.printRandomNumbers(array);
        cycleTaskEmptyArray.printAllElements(array);
        cycleTaskEmptyArray.printAllElementsReverse(array);
        cycleTaskEmptyArray.printMultiplication(array);
        cycleTaskEmptyArray.printSquare(array);
        cycleTaskEmptyArray.printMinElement(array);
        cycleTaskEmptyArray.changeFirstAndLastElements(array);
        cycleTaskEmptyArray.descendingSortElements(array);
    }
}
