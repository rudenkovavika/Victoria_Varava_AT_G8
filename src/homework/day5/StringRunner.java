package homework.day5;

public class StringRunner {
    public static void main(String[] args) {
        PrintToColumn printToColumn = new PrintToColumn();
        printToColumn.printColumn("Выведи в столбик");

        PrintDuplicates printDuplicates = new PrintDuplicates();
        printDuplicates.findDuplicates("мама мыла мама раму чисто раму быстро");

        NumbersToArray numbersToArray = new NumbersToArray();
        numbersToArray.findNumbers("ол047!f83f2lv");

        CurrentDateAndTime currentDateAndTime = new CurrentDateAndTime();
        currentDateAndTime.printDateAndTime();

        ChangeFormatOfDate changeFormatOfDate = new ChangeFormatOfDate();
        changeFormatOfDate.formatOfDate("22.00 07.09.2020");
    }
}
