import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){ //A
            throw new RuntimeException("Mandatory information missing!"); //B
        }

        if (user.getUsername()==null){  //C
            user.setUsername(user.getEmail()); //D
        }

        int same = 1;
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) { //E
            same = 0; //F
            for (int i=0;i<allUsers.size();i++) { //G
                User existingUser = allUsers.get(i); //H
                if (existingUser.getEmail() == user.getEmail()) { //I
                    same += 1; //J
                }
                if (existingUser.getUsername() == user.getUsername()) { //K
                    same += 1; //L
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { //M
            return false; //N
        }
        else {
            if (!passwordLower.contains(" ")) { //O
                for (int i = 0; i < specialCharacters.length(); i++) { //P
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { //Q
                        return same == 0; //R
                    }
                }
            }
        }
        return false; //S

    } //T
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("test1", "Password123!", "test1@example.com"));
        userList.add(new User("test2", "Password123!", "test2@example.com"));
        userList.add(new User("test3", "Password123!", "test3@example.com"));
        userList.add(new User("test4", "Password123!", "test4@example.com"));

        User newUser = new User("Kiril", "Password123!", "kiril@gmail.com");

        System.out.println(function(newUser,userList));
    }
}
