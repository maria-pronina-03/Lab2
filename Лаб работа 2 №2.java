import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваш пароль:");
        password = scan.nextLine();
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        if (password.matches(pattern)) {
            System.out.println("Пароль надежен");
        }
        else {
            System.out.println("Пароль ненадежен. Попробуйте снова ");
        }
    }
}