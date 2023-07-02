import java.util.ArrayList;

public class UserManager {
    private static UserManager instance;
    ArrayList<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
       


    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(String name, String lastname, int age) {
        User user = new User(name, lastname, age);
        userList.add(user);
    }

    public void userList() {
        for (User users : userList) {
            System.out.println(users.name + " " + users.lastname + " " + users.age);

        }
    }

    public void removeUser(String name) {
            User userToRemove = null;
        for (User users : userList) {
            if (users.getName().equals(name)) {
                userToRemove = users;
                break;
            }
        }
        if (userToRemove != null) {
            userList.remove(userToRemove);
            System.out.println("Usuario eliminado: " + userToRemove.getName());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    

    }

}
