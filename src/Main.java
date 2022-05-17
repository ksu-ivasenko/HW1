public class Main {
    public static void main(String[] args) {

        // задание 1

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 12L;

        float e = 23.3f;
        double f = 2.23;

        //задание 2, 3, 4
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;

        float totalWeight = boxerTwo + boxerTwo;
        float substract = boxerOne - boxerTwo;
        System.out.println ("Общий вес двух бойцов составляет " + totalWeight);
        System.out.println ("Разница между весом певого и второго бойца составлыет " + substract );

        int banana = (5 * 80);
        int milk = (2 * 105);
        int icecream = (2 * 100);
        int egg = (4 * 70);

        int totalFoodWeight = banana + milk + icecream + egg;
        float weightKG = totalFoodWeight / 1000f;

        System.out.println ("Затврака спортсмена составляет " + weightKG + " кг");

        int loss = (7 * 1000);
        int perDayOne = loss / 250;
        int perDayTwo = loss / 500;
        System.out.println ("Если спортсмен будет терять по 250гр в день, понадобиться " + perDayOne + " дней");
        System.out.println ("Если спортсмен будет терять по 500гр в день, понадобиться " + perDayTwo + " дней");

        int averageDays = (perDayOne + perDayTwo)/2;
        System.out.println ("В среднем для похудения понадобиться " + averageDays + " дней");

        //Задание 5

    }
}