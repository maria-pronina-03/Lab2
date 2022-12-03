import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String date;
        boolean res = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date dd/mm/yyyy:");
        date = scan.nextLine();
        String pattern = "^((0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|2[0-9])[0-9]{2})$";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(date);
        if (date.matches(pattern)) {
            String days = date.substring(0,2);
            String months = date.substring(3,5);
            String years = date.substring(6,10);
            int day_int = Integer.parseInt(days);
            int months_int = Integer.parseInt(months);
            int year_int = Integer.parseInt(years);
            if(day_int > 31 || months_int > 12 || year_int > 9999 || year_int < 1899){
                System.out.println("Неккоректная дата");
            }
            else{
                if(months_int == 2){
                    if(day_int > 28){
                        System.out.println("Неккоректная дата");
                    }
                }
                else {
                    System.out.println("Дата корректная: " + date);
                }
            }
        }
        else {
            System.out.println("Неккоректная дата");
        }
    }
}