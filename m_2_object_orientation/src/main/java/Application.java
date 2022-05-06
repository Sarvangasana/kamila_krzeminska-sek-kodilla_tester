public class Application {
    private String name = "Adam";
    private double age = 40.5;
    private double height = 178;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application app = new Application("Adam", 40.5, 178);
        app.check();
        //        UserProfile profile = new UserProfile(
//                new User("Adam", 40.5), 178);
//        profile.checkAgeAndHeight();
//        UserProfile profile = new UserProfile("Adam", 40.5, 178);
//        profile.checkAgeAndHeight();
    }

    private void check() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
