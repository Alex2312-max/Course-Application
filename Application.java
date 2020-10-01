import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Application {
    public static void main(String[] args) {

        //Creating the arraylist
        ArrayList<User> ListOfUsers = new ArrayList<>();

        //Creating new users
        User user1 = new User("Alex", "Clefos", 13, "aclefos@yahoo.com", "ACTIVE",
                new Date(120, 9, 20));
        User user2 = new User("Cristi", "Nice", 13, "nice.cristi@yahoo.com", "NEW",
                new Date(120, 10, 1));
        User user3 = new User("Nicu", "Bilba", 13, "bilba13@yahoo.com", "BLOCKED",
                new Date(120, 6, 2));
        User user4 = new User("Radu", "Morari", 13, "radumorari4@yahoo.com", "INACTIVE",
                new Date(120, 8, 13));

        //Adding the users to ArrayList
        ListOfUsers.add(user1);
        ListOfUsers.add(user2);
        ListOfUsers.add(user3);
        ListOfUsers.add(user4);

        user1.CheckUserStatus();
        user2.CheckUserStatus();
        user3.CheckUserStatus();
        user4.CheckUserStatus();

        user1.SetUsersStatus();
        user2.SetUsersStatus();
        user3.SetUsersStatus();
        user4.SetUsersStatus();

        for (Object user: ListOfUsers) {
            System.out.println(user.toString());
        }
        /*I could not find a method to iterate the arraylist for using the methods for all 4 users simultaneously
        that s why it is needed to apply the methods for each user separately*/
    }
}
