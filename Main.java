public class Main {

    public static void main(String[] args) {

        UserRegistration registration = new UserRegistration();

        User user1 = new User("Benjamin", "Kisa", 12345, "Computing"
        );

        String acknowledgement = registration.registerUser(user1);

        System.out.println(acknowledgement);
    }
}