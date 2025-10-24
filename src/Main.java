import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(read());
    }
    public static int read() throws FileNotFoundException {
        int requests = 0;

        File f = new File("Schedules.txt");
        Scanner s = new Scanner(f);
        while(s.hasNextLine()) {
            boolean[][] schedule = new boolean[8][60];
            for(int period = 0; period < 8; period++) {
                for(int minute = 0; minute < 60; minute++) {
                    boolean b = s.nextBoolean();
                    System.out.print(b + " ");
                    schedule[period][minute] = b;
                }
            }
            AppointmentBook book = new AppointmentBook(schedule);
            if (book.makeAppointment(s.nextInt(), s.nextInt(), s.nextInt())) requests++;

        }
        return requests;
    }
}
