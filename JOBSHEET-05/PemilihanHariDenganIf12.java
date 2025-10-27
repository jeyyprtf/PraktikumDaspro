    import java.util.Scanner;
    public class PemilihanHariDenganIf12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String dayType;
            int day;
            System.out.print("Input day (1-7): ");
            day = sc.nextInt();
            if (day == 1) {
                dayType = "Weekday";
            } else if (day == 2) {
                dayType = "Weekday";
            } else if (day == 3) {
                dayType = "Weekday";
            } else if (day == 4) {
                dayType = "Weekday";
            } else if (day == 5) {
                dayType = "Weekday";
            } else if (day == 6) {
                dayType = "Weekend";
            } else if (day == 7) {
                dayType = "Weekend";
            } else {
                dayType = "Invalid number";
            }
            System.out.println(dayType);
            sc.close();
        }
    }
