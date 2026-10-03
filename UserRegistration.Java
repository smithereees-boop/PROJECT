import java.util.HashMap;
import java.util.Map;

public class UserRegistration {

    private Map<Integer, User> users = new HashMap<>();

    public String registerUser(User user) {

        users.put(user.getIDNo(), user);

        return "Registration successful for " + user.getFirstName();
    }
}