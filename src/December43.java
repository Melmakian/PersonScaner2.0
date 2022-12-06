import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class December43 {
    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner scanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }
        public Person read() throws IOException{
            String s = scanner.nextLine();
            String[] split = s.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4])-1, Integer.parseInt(split[3]));
            Date date=calendar.getTime();
            Person person = new Person(split[1],split[2], split[0], date);
            return person;
        }
        public void close() throws IOException{
            this.scanner.close();
        }
    }
}
