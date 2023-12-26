import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
        String time12Hour = "11:30:45 PM"; 

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("h:mm:ss a");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time = LocalTime.parse(time12Hour, inputFormat);

        String militaryTime = time.format(outputFormat);

        System.out.println("Military Time: " + militaryTime);
    }
}
