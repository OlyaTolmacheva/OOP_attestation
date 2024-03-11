package view;

import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.getNumbers();
        System.out.println(controller.getResult());
    }
}
