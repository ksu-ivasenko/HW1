public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){


        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 12L;
        float e = 23.3f;
        double f = 2.23;}


    public static void task2() {

        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;

        float totalWeight = boxerTwo + boxerTwo;
        float substract = boxerOne - boxerTwo;
        System.out.println ("Общий вес двух бойцов составляет " + totalWeight);
        System.out.println ("Разница между весом певого и второго бойца составлыет " + substract );}

    public static void task3(){

        int banana = (5 * 80);
        int milk = (2 * 105);
        int icecream = (2 * 100);
        int egg = (4 * 70);

        int totalFoodWeight = banana + milk + icecream + egg;
        float weightKG = totalFoodWeight / 1000f;

        System.out.println ("Затврака спортсмена составляет " + weightKG + " кг");}

    public static void task4(){

        int loss = (7 * 1000);
        int perDayOne = loss / 250;
        int perDayTwo = loss / 500;
        System.out.println ("Если спортсмен будет терять по 250гр в день, понадобиться " + perDayOne + " дней");
        System.out.println ("Если спортсмен будет терять по 500гр в день, понадобиться " + perDayTwo + " дней");

        int averageDays = (perDayOne + perDayTwo)/2;
        System.out.println ("В среднем для похудения понадобиться " + averageDays + " дней");}

    public static void task5(){

        int incomeMasha = 67_760;
        int incomeDenis = 83_690;
        int incomeKristina = 76_230;

        float newincomeMasha = incomeMasha * 1.1f;
        float differenceMasha = newincomeMasha * 12 - incomeMasha * 12;
        System.out.println ("Маша теперь получает " + newincomeMasha + " рублей в месяц. Годовой доход вырос на " + differenceMasha);

        float newincomeDenis = incomeDenis * 1.1f;
        float differenceDenis = newincomeDenis * 12 - incomeDenis * 12;
        System.out.println ("Денис теперь получает " + newincomeDenis + " рублей в месяц. Годовой доход вырос на " + differenceDenis);

        float newincomeKristina = incomeKristina * 1.1f;
        float differenceKristina = newincomeKristina * 12 - incomeKristina * 12;
        System.out.println("Кристина теперь получает " + newincomeKristina + "рублей в месяц. Годовой доход вырос на " + differenceKristina);



    }
}