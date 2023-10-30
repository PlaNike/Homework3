public class Main {
    public static void main(String[] args) {
        //task1,2
        byte a = 67;
        short b = -159;
        int c = 569;
        long d = 98767896549L;
        double e = 2.786;
        double f = 27.12;
        short g = 27897;
        System.out.println("Значение переменной" + a + "с типом byte равно 67");
        System.out.println("Значение переменной" + b + "с типом short ровно -159");
        System.out.println("Значение переменной" + c + "с типом int ровно 569");
        System.out.println("Значение переменной" + d + "с типом long ровно 98767896549L");
        System.out.println("Значение переменной" + e + "с типом double ровно 2.786");
        System.out.println("Значение переменной" + f + "с типом double ровно 27.12");
        System.out.println("Значение переменной" + g + "с типом short ровно 27897");
        //task3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paper = 480;
        int overKlass = teacher1 + teacher2 + teacher3;
        int expensed = paper / overKlass;
        System.out.println("На каждого ученика рассчитанно" + expensed + "листов бумаги");
        //task4
        byte speedMash = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int speedMin = speedMash / 2;
        int end1 = time1 * speedMin;
        System.out.println("За" + time1 + "машина произвела" + end1 + "штук бутылок");
        int end2 = time2 * speedMin;
        System.out.println("За" + time2 + "машина произвела" + end2 + "штук бутылок");
        int end3 = time3 * speedMin;
        System.out.println("За" + time3 + "машина произвела" + end3 + "штук бутылок");
        int end4 = time4 * speedMin;
        System.out.println("За" + time4 + "машина произвела" + end4 + "штук бутылок");
        //task 5
        byte totalCans = 120;
        byte cansWhite = 2;
        byte cansBrown = 4;
        int class1 = cansWhite + cansBrown;
        int totalClass = totalCans / class1;
        int totalCansWhite = cansWhite * totalClass;
        int totalCansBrown = cansBrown * totalClass;
        System.out.println("В школе,где" + totalClass + "классов,нужно" + totalCansWhite +
                "банок белой краски и" + totalCansBrown + "банок коричневой краски ");
//task6
        int totalBonano = 80 * 5;
        int totalMilk = 105 * 2;
        int totalIceCream = 100 * 2;
        int totalEggs = 70 * 4;
        int totalWeight = totalBonano + totalMilk + totalEggs + totalIceCream;
        float totalWeightKg = totalWeight / 1000f;
        System.out.println("Вес спортзавтрака в г" + totalWeight + "Вес спортзавтрака в кг " + totalWeightKg);
        //task7
        int weightToLose = 7;
        int weightMin = 250;
        int weightMax = 500;
        int dietMax = weightToLose * 1000 / weightMin;
        int dietMin = weightToLose * 1000 / weightMax;
        int dietAverage = (dietMin + dietMax) / 2;
        System.out.println("минимальное количество дней для похудения " + dietMin);
        System.out.println("максимальное количество дней для похудения " + dietMax);
        System.out.println("среднее количество дней для похудуния" + dietAverage);
//task 8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int masha1 = masha + (67760 / 100 * 10);
        int denis1 = denis + (83690 / 100 * 10);
        int kris1 = kris + (76230 / 100 * 10);
        int annualIncomeMasha = masha * 12;
        long annualIncomeDenis = denis * 12L;
        int annualIncomeKris = kris * 12;
        int annualIncomeMasha1 = masha1 * 12;
        long annualIncomeDenis1 = denis1 * 12L;
        long annualIncomeKris1 = kris1 * 12L;
        int incomeDefferenceMasha = annualIncomeMasha1 - annualIncomeMasha;
        long incomeDefferenceDenis = annualIncomeDenis1 - annualIncomeDenis;
        long incomeDefferenceKris = annualIncomeKris1 - annualIncomeKris;
        System.out.println("Маша теперь получает" + masha1 + "Годовой доход вырос на" + incomeDefferenceMasha);
        System.out.println("Денис теперь получает" + denis1 + "Годовой доход вырос на" + incomeDefferenceDenis);
        System.out.println("Кристина теперь получает" + kris1 + "Годовой доход вырос на" + incomeDefferenceKris);
    }}