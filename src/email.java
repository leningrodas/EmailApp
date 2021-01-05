import java.util.Scanner;

public class email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String email;
    private String companysuffix = "codeup.com";

    // constructors
    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("email Created: " + this.firstName + " "+ this.lastName);


        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is:  " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companysuffix;
        System.out.println("your email is:"  + email);

    }

    private String setDepartment(){
        System.out.println("department Codes\n1 for Sales \n2 for development\n3 for accounting\n0 for none\nEnter department code: ");
        Scanner input = new Scanner(System.in);
        int choiceDep = input.nextInt();
        if(choiceDep == 1){return "Sales"; }
        else if (choiceDep == 2){return "Dev"; }
        else if(choiceDep == 3){return "Acc"; }
        else { return " ";}

    }
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1223456789!@#$%^&*";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altemail){
        this.alternateEmail = altemail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        System.out.println("alternate email: ");
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\ndisplay name: " + firstName + " " + lastName + " " +
             "\ncompany email: " + email +
              "\nmailbox capacity: " + mailboxCapacity + "GB";
    }


}
