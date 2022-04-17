import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Scrambler scrambler = new Scrambler();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z ");


        String str = "To be, or not to be, that is the question:\n" +
                     " Time now - " + dataFormat.format(calendar.getTime());
        scrambler.scramblerCeaser(str);
        scrambler.Decoder();

        scrambler.print();





    }
}
