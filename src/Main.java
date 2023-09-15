public class Main {
    public static void main(String[] args) {
        System.out.println("2 курс, ДЗ 2");
        MyApp();
    }

    public static void MyApp() {
        Gryffindor gryffindor = new Gryffindor("Гарри", "Поттер", 47, 61, 89, 55, 88);
        Gryffindor gryffindor1 = new Gryffindor("Гермиона", "Грейнджер", 29, 39, 28, 45, 67);
        Gryffindor gryffindor2 = new Gryffindor("Рон", "Уизли", 39, 27, 50, 45, 77);
        Hufflepuff hufflepuff = new Hufflepuff("Захария", "Смит", 47, 61, 89, 78, 33);
        Hufflepuff hufflepuff1 = new Hufflepuff("Седрик", "Диггори", 29, 39, 28, 45, 45);
        Hufflepuff hufflepuff2 = new Hufflepuff("Джастин", "Финч-Флетчли", 39, 27, 50, 22, 33);
        Slytherin slytherin = new Slytherin("Драко", "Малфой", 47, 61, 45, 56, 78, 66, 22);
        Slytherin slytherin1 = new Slytherin("Грэхэм", "Монтегю", 29, 39, 28, 34, 88, 55, 89);
        Slytherin slytherin2 = new Slytherin("Грегори", "Гойл", 39, 27, 50, 77, 23, 55, 33);
        Ravenclaw ravenclaw = new Ravenclaw("Чжоу Чанг", "Чжоу Чанг", 44, 56, 67, 77, 45, 22);
        Ravenclaw ravenclaw1 = new Ravenclaw("Падма", "Патил", 66, 77, 89, 99, 33, 45);
        Ravenclaw ravenclaw2 = new Ravenclaw("Маркус", "Белби", 55, 87, 55, 33, 56, 67);

        Hogwarts hogwarts = new Hogwarts();

        System.out.println("====Гриффиндор====");
        gryffindor.showStudents();
        gryffindor1.showStudents();
        gryffindor2.showStudents();
        System.out.println("====Пуффендуй====");
        hufflepuff.showStudents();
        hufflepuff1.showStudents();
        hufflepuff2.showStudents();
        System.out.println("====Слизерин====");
        slytherin.showStudents();
        slytherin1.showStudents();
        slytherin2.showStudents();
        System.out.println("====Когтевран====");
        ravenclaw.showStudents();
        ravenclaw1.showStudents();
        ravenclaw2.showStudents();
        System.out.println("================================");

        hogwarts.compareStudents(gryffindor2, gryffindor);
        hogwarts.compareStudents(slytherin, slytherin2);
        hogwarts.compareStudents(ravenclaw1, ravenclaw);
        hogwarts.compareStudents(hufflepuff, hufflepuff2);

        System.out.println("\n================================");

        hogwarts.studentEquals(gryffindor2, gryffindor);
        hogwarts.studentEquals(slytherin, slytherin2);
        hogwarts.studentEquals(ravenclaw1, ravenclaw);
        hogwarts.studentEquals(hufflepuff, hufflepuff2);

        System.out.println("\n================================");


    }
}