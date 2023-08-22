import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int month_days[];

        month_days = new int[12];
        Scanner sc = new Scanner(System.in);

        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30; 
        month_days[11] = 31;     

        String[] month_names = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "November", "December" };

        System.out.print("Enter the month Name: ");
        String month_name = sc.next();

        for (int j = 0; j < month_names.length; j++) {
            if (month_name.equals(month_names[j])) {
                System.out.println(month_names[j] + " has " + month_days[j] + " days");
                break;
            }
        }
        sc.close();
    }
}