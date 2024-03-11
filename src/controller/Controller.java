package controller;

import model.Calculation;
import java.util.Scanner;

public class Controller extends Calculation {
    Scanner scanner = new Scanner(System.in);
    private double num1;
    private double num2;
    private String op;

    public void getNumbers() {
        System.out.println("Введите первое число ");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число ");
        num2 = scanner.nextDouble();
        System.out.println("Введите + или * или / ");
        op = scanner.next();
    }
    @Override
    public double getResult() {
        super.getResult(this.num1, this.num2, this.op);
        return super.getResult();
    }
}
