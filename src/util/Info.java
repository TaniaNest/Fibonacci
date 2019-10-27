package util;

public class Info {

    public void getInfo() {

        System.out.print("Input length: ");
    }

    public void getSequence(String sign, int number) {
        System.out.print(sign + number);
    }

    public void getCount(String param) {

        System.out.print("Input  " + param + ": ");
    }

    public void getChoose() {

        System.out.print("Choose action: ");
    }

    public void getRequest() {

        System.out.print("Do you want to exit or continue: ");
    }
}
