import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<UserData> users;

    public UserDatabase() {
        users = new ArrayList<>();
    }

    public void addUser(UserData user) {
        users.add(user);
    }

    public List<UserData> getUsers() {
        return users;
    }
}
