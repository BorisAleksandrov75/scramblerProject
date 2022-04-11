public class Scrambler {

    private int key = 4;
    private String Alfavit = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789.,:; ";
    private String scramblerText;
    String textforscrambler;

    public String scrambleCeaser(String string) {
        textforscrambler = string;


        for (int i = 0; i < textforscrambler.length(); i++) {
            for (int j = 0; j < Alfavit.length(); j++) {
                if (Alfavit.charAt(j) == textforscrambler.charAt(i)) {
                     if (Alfavit.charAt(j) > 68) {
                         scramblerText += Alfavit.charAt(j);
                     } else {
                         scramblerText += Alfavit.charAt(j);
                     }
                }
            }
        }
        return scramblerText;
    }

    public void print () {
        System.out.println(scramblerText);
        System.out.println(scramblerText.charAt(0));
        System.out.println(textforscrambler.charAt(0));
    }
}
