import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        for (int i = 10; i < 15; i++) schedule[1][i] = true;
        a.printPeriod(2);
        System.out.println(" ");

        schedule = new boolean[8][60];
        for(int i = 25; i < 30; i++) schedule[1][i] = true;
        for(int i = 0; i < 15; i++) schedule[2][i] = true;
        for(int i = 41; i < 60; i++) schedule[2][i] = true;
        for(int i = 5; i < 30; i++) schedule[3][i] = true;
        for(int i = 44; i < 60; i++) schedule[3][i] = true;
        AppointmentBook b = new AppointmentBook(schedule);

        int period = 2;
        while(period < 5) {
            System.out.println("Period: " + period);
            b.printPeriod(period);
            period++;
            System.out.println();
        }

        // test case 1
        System.out.println(b.makeAppointment(2, 4, 22));
        System.out.println("Test Case 1");
        System.out.println();
        b.printPeriod(4);

        // test case 2
        System.out.println(b.makeAppointment(3, 4, 3));
        System.out.println("Test Case 2");
        System.out.println();
        b.printPeriod(3);

        // test case 3
        System.out.println(b.makeAppointment(2, 4, 30));
        System.out.println("Test Case 3");
        System.out.println();
    }
}
