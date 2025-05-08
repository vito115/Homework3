public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte lemon = 2;
        short potatoes = 3;
        int apples = 4;
        long tomatoes = 6;
        float juice = 3.5f;
        double water = 10.0;

        System.out.println("Значение переменной eggs с типом byte равно " + lemon);
        System.out.println("Значение переменной potatoes с типом short равно " + potatoes);
        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной tomatoes с типом long равно " + tomatoes);
        System.out.println("Значение переменной milk с типом float равно " + juice);
        System.out.println("Значение переменной water с типом double равно " + water);

        System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println("Задача 3");

        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        short paper = 480;
        int student = paper / (Ludmila + Anna + Ekaterina);
        System.out.println("На каждого ученика расчитано " + student + " листов бумаги");

        System.out.println("Задача 4");

        byte bottle = 16;
        int bottleMinute = bottle / 2;
        int production1 = bottleMinute * 20;
        System.out.println("За 20 мин машина произвела " + production1 + " штук бутылок");

        int production2 = (bottleMinute * 60) * 24;
        System.out.println("За сутки машина произвела " + production2 + " штук бутылок");

        int production3 = production2 * 3;
        System.out.println("За 3 дня машина произвела " + production3 + " штук бутылок");

        int production4 = production2 * 30;
        System.out.println("За месяц машина произвела " + production4 + " штук бутылок");

        System.out.println("Задача 5");

        byte balloons = 120;
        byte white = 2;
        byte brown = 4;
        int classes = balloons / (white + brown);
        int whiteClasses = classes * white;
        int brownClasses = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteClasses + " банок белой краски и "
        + brownClasses + " банок коричневой краски");

        System.out.println("Задача 6");

        byte banan = 80;
        int bananas = banan * 5;
        byte milk1 = 105;
        int milk2 = milk1 * 2;
        byte icecream = 100;
        int icecream2 = icecream * 2;
        byte egg = 70;
        int eggs = egg * 4;

        int blend = bananas + milk2 + icecream2 + eggs;
        System.out.println("Вес завтрака " + blend + " граммм");

        float blend2 = (blend / 1000f);
        System.out.println("Вес завтрака " + blend2 + " килограмм");

        System.out.println("Задача 7");

        byte goal = 7;
        float weight1 = goal / 0.250f;
        float weight2 = goal / 0.500f;
        float weightAverage = (weight1 + weight2) / 2f;
        System.out.println("На долгое похудение уйдет " + weight1 + " дней");
        System.out.println("На быстрое похудение уйдет " + weight2 + " дней");
        System.out.println("Среднее количество дней равно " + weightAverage);

        System.out.println("Задача 8");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryMasha1 = salaryMasha * 1.1f;
        float salaryDenis1 = salaryDenis * 1.1f;
        float salaryKristina1 = salaryKristina * 1.1f;
        float differenceMasha = (salaryMasha1 * 12) - (salaryMasha * 12f);
        System.out.println("Маша теперь получает " + salaryMasha1 + " рублей. Годовой доход вырос на "
                + differenceMasha + " рублей");
        float differenceDenis = (salaryDenis1 * 12) - (salaryDenis * 12f);
        System.out.println("Денис теперь получает " + salaryDenis1 + " рублей. Годовой доход вырос на "
                + differenceDenis + " рублей");
        float differenceKristina = (salaryKristina1 * 12) - (salaryKristina * 12f);
        System.out.println("Кристина теперь получает " + salaryKristina1 + " рублей. Годовой доход вырос на "
                + differenceKristina + " рублей");
    }
}