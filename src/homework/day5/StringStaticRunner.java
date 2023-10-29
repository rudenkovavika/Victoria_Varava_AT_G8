package homework.day5;

public class StringStaticRunner {
    public static void main(String[] args) {
        PrintToColumnStatic printToColumnStatic = new PrintToColumnStatic();
        printToColumnStatic.printColumn("Выведи в столбик");

        PrintDuplicatesStatic printDuplicatesStatic = new PrintDuplicatesStatic();
        printDuplicatesStatic.findDuplicates("мама мыла мама раму чисто раму быстро");

        NumbersToArrayStatic numbersToArrayStatic = new NumbersToArrayStatic();
        numbersToArrayStatic.findNumbers("ол047!f83f2lv");

        CurrentDateAndTimeStatic currentDateAndTimeStatic = new CurrentDateAndTimeStatic();
        currentDateAndTimeStatic.printDateAndTime();

        ChangeFormatOfDateStatic changeFormatOfDateStatic = new ChangeFormatOfDateStatic();
        changeFormatOfDateStatic.formatOfDate("22.00 07.09.2020");
    }
}
