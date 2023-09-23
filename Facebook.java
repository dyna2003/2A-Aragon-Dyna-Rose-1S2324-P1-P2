import java.util.Scanner;

public class Facebook {
    private String Email;
    private int Password;

    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    
    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        this.Password = password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Facebook facebook = new Facebook();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        facebook . setEmail(email);

        System.out.print("Enter your password: ");
        int password = scanner.nextInt();
        facebook.setPassword(password);

 
        System.out.println("Email: " + facebook.getEmail());
        System.out.println("Password: " + facebook.getPassword());
 
    }
       }
