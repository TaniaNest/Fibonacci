package util;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public int getChose() {

        return scanner.nextInt();
    }

    public int getLength() {

        return scanner.nextInt();
    }

    public String getAnswer() {
        return scanner.next();
    }

}
