public class Main {
    public static void main(String[] args)

    {
        //Task 1
        int dog = 277777777;
        byte cat = -127;
        short snakeEater = 32000;
        long camelCase = 999999999999L;
        float parrot = 1.555555F;
        double tiger = 1.55555555555;
        System.out.println("Значение переменной dog с типом int равно " + dog );
        System.out.println("Значение переменной cat с типом byte равно " + cat );
        System.out.println("Значение переменной snakeEater с типом short равно " + snakeEater );
        System.out.println("Значение переменной camelCase с типом long равно " + camelCase );
        System.out.println("Значение переменной parrot с типом float равно " + parrot );
        System.out.println("Значение переменной tiger с типом double равно " + tiger );

        //Task 2
        float Parrot = 27.12f;
        long Dog = 987678965549L;
        double Tiger = 2.786;
        boolean snake = false;
        int Elephant = 569;
        short bird = -159;
        short Snake = 27897;
        byte elephant = 67;
        System.out.println(Parrot);
        System.out.println(Dog );
        System.out.println(Tiger);
        System.out.println(snake);
        System.out.println(Elephant);
        System.out.println(Snake);
        System.out.println(elephant);
        System.out.println(bird);
        //Task 3

        short totalPapersCount = 480;
        byte firstClassPupils = 23; //В рамках данной задачи думаю что нас не интересует кто ведет какой класс, так что указываю их как 1st, 2nd и 3rd class.
        byte secondClassPupils = 27; //В рамках данной задачи думаю что нас не интересует кто ведет какой класс, так что указываю их как 1st, 2nd и 3rd class.
        byte thirdClassPupils = 30; //В рамках данной задачи думаю что нас не интересует кто ведет какой класс, так что указываю их как 1st, 2nd и 3rd class.
        int totalPupils = firstClassPupils + secondClassPupils + thirdClassPupils;
        int paperListsPerPupil = totalPapersCount / totalPupils;
        System.out.println("На каждого ученика рассчитано "+ paperListsPerPupil +" листов бумаги");

        //Task 4
        int performancePerTwoMinutes = 16;
        int performance = performancePerTwoMinutes / 2;
        int twentyMinutesPerformance = performance * 20;
        int oneDayPerformance =  twentyMinutesPerformance * 72;
        int threeDaysPerformance = oneDayPerformance * 3;
        int oneMonthPerformance = threeDaysPerformance * 10;
        System.out.println("За 20 минут машина произвела бутылок "+ twentyMinutesPerformance +"  штук ");
        System.out.println("За сутки машина произвела бутылок "+ oneDayPerformance +"  штук ");
        System.out.println("За 3 суток минут машина произвела бутылок "+ threeDaysPerformance +"  штук ");
        System.out.println("За месяц минут машина произвела бутылок "+ oneMonthPerformance +"  штук ");

        //Task 5
        byte totalCansNeeded = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClassNumber = totalCansNeeded / cansPerClass;
        int whiteCansNeeded = totalClassNumber * whiteCansPerClass;
        int brownCansNeeded = totalClassNumber * brownCansPerClass;
        System.out.println("В школе, где "+ totalClassNumber +" классов, нужно "+ whiteCansNeeded +" банок белой краски и "+ brownCansNeeded +" банок коричневой краски");

        //Task 6
        byte oneBananaWeight = 80;
        byte milkMl = 100;
        int milkWeight = milkMl + 5;
        byte oneIceCream = 100;
        byte oneEggWeight = 70;
        int fiveBananas = oneBananaWeight * 5;
        int twoIceCreams = oneIceCream * 2;
        int milkTwoHundredML = milkWeight * 2;
        int fourEggs = oneEggWeight * 4;
        float totalWeightGr = fourEggs + milkTwoHundredML + twoIceCreams + fiveBananas;
        System.out.println(totalWeightGr +" Грамм");
        float totalWeightKg = totalWeightGr / 1000;
        System.out.println(totalWeightKg +" Килограмм");

        //Task 7
        byte weightShouldBeLostKg = 7;
        short kiloExchangeInGr = 1000;
        int weightShouldBeLostGr =  weightShouldBeLostKg * kiloExchangeInGr;
        short twoFiftyGrPerDay = 250;
        short fiveHundredGrPerDay = 500;
        int firstPath = weightShouldBeLostGr / twoFiftyGrPerDay;
        int secondPath = weightShouldBeLostGr / fiveHundredGrPerDay;
        System.out.println("Если спортсмен будет терять "+ twoFiftyGrPerDay +" грамм за день, то будет худеть "+ firstPath +" дней");
        System.out.println("Если спортсмен будет терять "+ fiveHundredGrPerDay +" грамм за день, то будет худеть "+ secondPath+" дней");

        //Task 8
        int oldMashaSalaryPerMonth = 67760;
        int oldDenisSalaryPerMonth= 83690;
        int oldKristinaSalaryPerMonth= 76230;
        int oldMashaSalaryPerYear= oldMashaSalaryPerMonth * 12;
        int oldDenisSalaryPerYear= oldDenisSalaryPerMonth * 12;
        int oldKristinaSalaryPerYear= oldKristinaSalaryPerMonth * 12;
        double newMashaSalaryPerMonth = oldMashaSalaryPerMonth * 1.1;
        double newDenisSalaryPerMonth =  oldDenisSalaryPerMonth * 1.1;
        double newKristinaSalaryPerMonth = oldKristinaSalaryPerMonth * 1.1;
        double newMashaSalaryPerYear = newMashaSalaryPerMonth * 12;
        double newDenisSalaryPerYear = newDenisSalaryPerMonth * 12;
        double newKristinaSalaryPerYear = newKristinaSalaryPerMonth * 12;
        double differenceMasha = newMashaSalaryPerYear - oldMashaSalaryPerYear;
        double differenceDenis = newDenisSalaryPerYear - oldDenisSalaryPerYear;
        double differenceKristina = newKristinaSalaryPerYear - oldKristinaSalaryPerYear;
        System.out.println("Маша теперь получает "+newMashaSalaryPerMonth+" рублей. Годовой доход вырос на "+differenceMasha+" рублей");
        System.out.println("Денис теперь получает "+newDenisSalaryPerMonth+" рублей. Годовой доход вырос на "+differenceDenis+" рублей");
        System.out.println("Кристина теперь получает "+newKristinaSalaryPerMonth+" рублей. Годовой доход вырос на "+differenceKristina+" рублей");
    }

}