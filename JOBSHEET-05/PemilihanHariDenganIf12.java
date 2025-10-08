    import java.util.Scanner;
    public class PemilihanHariDenganIf12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String dayName, dayType;
            System.out.print("Input day name: ");
            dayName = sc.nextLine();
            if (dayName.equalsIgnoreCase("monday") || dayName.equalsIgnoreCase("tuesday") || dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("thursday") || dayName.equalsIgnoreCase("friday")) {
                dayType = "Weekday";
            } else if (dayName.equalsIgnoreCase("saturday") || dayName.equalsIgnoreCase("sunday")) {
                dayType = "Weekend";
            } else {
                dayType = "Invalid day name";
            }
            System.out.println(dayName + " is a " + dayType);
            sc.close();
        }
    }
