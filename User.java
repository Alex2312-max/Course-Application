import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {

    String firstname;
    String lastname;
    int age;
    String email;
    String status;
    Date timestamp;

    //Using Constructor
    public User(String firstname, String lastname, int age, String email, String status, Date timestamp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timestamp = timestamp;
    }
    //Method for changing status from "NEW" to "ACTIVE" based on time condition
    public String CheckUserStatus(){

        //Using calendar class we get the current day
        DateFormat df = new SimpleDateFormat("dd");
        Calendar CurrentDay = Calendar.getInstance();
        String date = df.format(CurrentDay.getTime());
        //Using calendar we get the exact day and stock its value in variable day
        CurrentDay.setTime(this.timestamp);
        int day = CurrentDay.get(Calendar.DATE);
        //Using valueOf change from string to integer
        int date1  = Integer.valueOf(date);
        if((this.status == "NEW") && (date1 > day - 1)){
            this.status = "ACTIVE";
        }
        return this.status;
    }

    //Method for checking and changing the status of users "INACTIVE" for more than a month
    public String SetUsersStatus(){

        DateFormat df = new SimpleDateFormat("MM");
        Calendar CurrentDay = Calendar.getInstance();
        String date = df.format(CurrentDay.getTime());
        int date1  = Integer.valueOf(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(this.timestamp);
        int month = cal.get(Calendar.MONTH);
        if (date1 - 1 > month ) {
            this.status = "BLOCKED";
        }
        return this.status;
    }
    //Override the toString method
    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' + ", lastname='" + this.lastname + '\'' +
                ", age=" + this.age +
                ", email='" + this.email + '\'' +
                ", status='" + this.status + '\'' +
                ", timestamp=" + this.timestamp +
                '}';
    }
}


