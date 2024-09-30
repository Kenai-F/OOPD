package les08.les;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wil je de ballen laten vallen?" + "\n" + "ja/nee?");
        String answer = sc.nextLine();  // Read user input

        if(answer.equals("ja")) {
            Lottomachine lottomachine = new Lottomachine();

            lottomachine.voertrekkingUit();
        }
    }
}
