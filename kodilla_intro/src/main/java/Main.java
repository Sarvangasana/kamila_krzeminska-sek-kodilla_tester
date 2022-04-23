public class Main {
    public static void main(String[] args) {
        /* Do zadania 2.4.:
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(2);
        grades.add(4);
        System.out.println(grades.lastGrade());
        System.out.println(grades.averageOfGrades()); */

        // Do zadania 2.5. cz. 1:
        User user1 = new User("Maciek", 20);
        User user2 = new User("Wiola", 25);
        User user3 = new User("Michał", 15);
        User user4 = new User("Beata", 18);
        User user5 = new User("Maria", 12);

        User[] users = {user1, user2, user3, user4, user5};

        System.out.println(User.averageOfAge(users));

        User.printUserNameYoungerThanAverage(users);

        // Do zadania 2.5. cz. 2 (random numbers):
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.shuffleAndSumRandomNumbers();
        System.out.println(randomNumbers.getMin());
        System.out.println(randomNumbers.getMax());
    }
}
