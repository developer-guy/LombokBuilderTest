package builder;

/**
 * Created by Batuhan on 4.6.2016.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(EmailCommandBuilder.builder().
                to("bapaydin67@gmail.com").from("test@gmail.com").subject("Merhaba").topic("Napıyorsun").build().send());
    }
}
