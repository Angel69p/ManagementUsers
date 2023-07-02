

public class App {
    public static void main(String[] args) throws Exception {
        UserManager userManager = UserManager.getInstance();

        userManager.addUser("Jose", "pertuz", 19);

        userManager.addUser("Angel", "pertuz", 19);

        
        userManager.removeUser("Jose");

        userManager.userList();

    }
}
