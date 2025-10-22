import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

    }
    public static int read() throws FileNotFoundException {
        int requests = 0;

        File f = new File("Schedules.txt");
        Scanner s = new Scanner(f);
        while(s.hasNextLine()) {
            boolean[][] schedule = new boolean[8][60];
            for(int period = 0; period < 7; period++) {
                for(int minute = 0; minute < 59; minute++) {
                    schedule[period][minute] = s.nextBoolean();
                }
            }
            AppointmentBook book = new AppointmentBook(schedule);
            book.makeAppointment(s.nextInt(), s.nextInt(), s.nextInt());

        }
    }
}
