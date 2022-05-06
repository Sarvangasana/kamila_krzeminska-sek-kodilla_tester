//public class UserProfile { // KOMPOZYCJA
//    private User user;
//    private double height;
//
//    public UserProfile(User user, double height) {
//        this.user = user;
//        this.height = height;
//    }
//
//    public void checkAgeAndHeight() {
//        if (user.getName() != null) {
//            if (user.getAge() > 30 && height > 160) {
//                System.out.println("User is older than 30 and taller than 160cm");
//            } else {
//                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
//            }
//        }
//    }
//}
public class UserProfile extends User { // ROZSZERZENIE
    private double height;

    public UserProfile(String name, double age, double height) {
        super(name, age);
        this.height = height;
    }

    public void checkAgeAndHeight() {
        if (getName() != null) {
            if (getAge() > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
