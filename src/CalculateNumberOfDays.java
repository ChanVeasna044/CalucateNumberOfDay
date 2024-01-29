import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculateNumberOfDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (dd-MM-yyyy): ");
        String dateOne = scanner.next();

        System.out.print("Enter second date (dd-MM-yyyy): ");
        String dateTwo = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(dateOne, formatter);
        LocalDate date2 = LocalDate.parse(dateTwo, formatter);

        long daysDifference = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Difference in days: " + daysDifference + " days");
    }
}