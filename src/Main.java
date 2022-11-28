public class Main {
    public static void main(String[] args) {
        task13();
        task4();
        task5();
        task67();
        task8();
    }
    public static void task13 () {
        System.out.println("Задачи 1-3");
        double dog = 8; // Пишем код для задачи 1
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4; // Пишем код для задачи 2
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5; // Пишем код для задачи 3
        cat = cat - 1.6;
        paper = paper + 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
        public static void task4 () {
            System.out.println("Задача 4");
            var friend = 19; // Пишем код для задачи 4
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
        }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5; // Пишем код для задачи 5
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task67 () {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2; // Пишем код для задачи 6
        var boxer2Weight = 82.7;
        var commonWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " + commonWeight + " кг ");

        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе межде боксерами " + differenceWeight + " кг");

        System.out.println("Задача 7");
        var difference2Weight = boxer2Weight % boxer1Weight; // Пишем код для задачи 7
        System.out.println("Разница в весе межде боксерами " + difference2Weight + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workInitCommonHours = 640; // Пишем код для задачи 8
        var workPersonalHours = 8;
        var personel = workInitCommonHours / workPersonalHours;
        System.out.println("Всего работников в компании — " + personel + " человек");

        var addedPersonel = personel + 94;
        var workFinalCommonHours = addedPersonel * 8;
        System.out.println("Если в компании работает " + addedPersonel + " человек, то всего " + workFinalCommonHours + " часов работы может быть поделено между сотрудниками");


    }
}