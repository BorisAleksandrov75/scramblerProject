import java.util.ArrayList;
import java.util.Arrays;

public class Scrambler {

    private String Alfavit = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789.,:; ";
    int key = 10;
    private ArrayList<Character> scramblerText = new ArrayList<>();
    private ArrayList<Character> decoderText = new ArrayList<>();

//    String[] alfavit = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
//                "O","P","Q","R","S","T","U","V","W","X","Y","Z","_","0","1","2","3"
//                ,"4","5","6","7","8","9"};

    public void scramblerCeaser(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < Alfavit.length(); j++) {
                int a = j + key;
                if (string.charAt(i) == Alfavit.charAt(j)) {
                    if (a > Alfavit.length()) {
                        scramblerText.add(Alfavit.charAt(a - Alfavit.length()));
                    } else if (a < Alfavit.length()) {
                        scramblerText.add(Alfavit.charAt(a));
                    }
                }

            }

        }

    }

    public void Decoder() {
        for (int i = 0; i < scramblerText.size(); i++) {
            for (int j = 0; j < Alfavit.length(); j++) {
                int b = j - key;
                String a = String.valueOf(Alfavit.charAt(j));
                String s = String.valueOf(scramblerText.get(i));
                if (a.equals(s)) {
                    if (b < 0) {
                        decoderText.add(Alfavit.charAt(b + Alfavit.length()));
                    } else if (b > 0) {
                        decoderText.add(Alfavit.charAt(b));
                    }

                }

            }

        }
    }



    public void print() {
       String result = "";
       String result2 = "";

        for (int j = 0; j < scramblerText.size(); j++) {
            result += scramblerText.get(j) + " ";
        }

        for (int i = 0; i < decoderText.size(); i++) {
            result2 += decoderText.get(i) + " ";

        }

        System.out.println("Code text = " + result);
        System.out.println("Decoder text = " + result2);
    }
}
