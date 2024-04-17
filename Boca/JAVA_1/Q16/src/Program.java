import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    private Map <Integer, User> userList;

    public Program () {
        this.userList = new HashMap<>();
    }

    public void userAdd (int key, User user) {
        userList.put(key, user);
    }

    private User userGet (int key) {
        return userList.get(key);
    }

    public String userName (int key) {
        User user = userGet(key);
        return user.getName();
    }

    public int userAge (int key) {
        User user = userGet(key);
        return user.getAge();
    }

    public void readUsers (int n, Scanner input) {
        int count = 0;
        while (count < n) {
            int RG = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            int age = input.nextInt();
            input.nextLine();
            User user = new User(RG, name, age);
            if (!(userList.containsKey(RG))) {
                this.userAdd(RG, user);
                count++;
            }
            else {
                System.out.println("Erro! RG já cadastrado. Digite os dados novamente");
            }
        }
    }

    public void searchMode (Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.isEmpty()) {
                break; 
            }
            String[] search = line.split("\\s+");int rgSearch = Integer.parseInt(search[0]);
            String typeSearch = search[1];

            if (typeSearch.equals("Nome")) {
                System.out.println(this.userName(rgSearch));
            }
            else if (typeSearch.equals("Idade")) {
                System.out.println(this.userAge(rgSearch));
            }
            else {
                break;
            }
        }
    }

}
