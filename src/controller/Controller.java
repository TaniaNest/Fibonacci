package controller;

import model.Model;
import service.Service;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;


public class Controller {

    private Input input = new Input();
    private Info info = new Info();
    private Service service = new Service();
    private Instruction instruction = new Instruction();
    private Validator validator = new Validator();


    public int getNumber() {
        info.getCount("finite number");
        int number = input.getLength();
        while (!validator.isPositiveNumber(number)) {
            instruction.getInstruction();
            number = new Input().getLength();
        }
        return number;
    }

    public String fibonacciOfNumber(int first) {
        String sign = "";
        Model number = new Model(getNumber());
        for (int num : service.getFib(first, number)) {
            info.getSequence(sign, num);
            sign = ",";

        }
        return null;

    }

    public void choice() {
        info.getChoose();
        int method = input.getChose();
        switch (method) {
            case 1:
                info.getCount("first value of the range");
                fibonacciOfNumber(input.getLength());
                break;
            case 2:
                fibonacciOfNumber(0);
                break;
            default:
                repeat();
        }
    }

    public void repeat() {
        String exit;
        info.getRequest();
        exit = input.getAnswer();
        if (exit.equals("y") || exit.equals("yes")) {
            choice();
        } else {
            System.exit(0);
        }
    }

}
