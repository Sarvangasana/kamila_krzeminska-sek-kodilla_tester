public class User {
    private final String name;
    private final double age;

    public User(String name, double age) {
        this.name = name;
        this.age = age;
    }

    /*MOŻNA UŻYC PETLI "ENHANCED FOR":
        for (User i: array) {
            i.getAge();
        }
        ALBO ZWYKLEJ PETLI "FOR": */
    public static double averageOfAge(User[] users) {
        if (users.length > 0) {
            double sum = 0.0;
            for (int i = 0; i < users.length; i++) {
                sum += users[i].getAge();
            }
            return sum / users.length;
        }
        return 0;
    }

    public static void printUserNameYoungerThanAverage(User[] users) {
        double average = averageOfAge(users);

        for (int i = 0; i < users.length; i++) {
            if ( users[i].getAge() < average)
                System.out.println(users[i].getName());
        }
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
}