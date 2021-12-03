package pro.sky.java.homeworks.course2.calculator1.controller1;

import org.springframework.stereotype.Service;

@Service
public class Calculator1ServiceImpl implements Calculator1Service {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int plusInt(int num1, int num2) {
        return (num1+num2);
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + plusInt(num1, num2);
    }

    public int minusInt(int num1, int num2) {
        return (num1 - num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + minusInt(num1, num2);
    }

    public int multiplyInt(int num1, int num2) {
        return (num1 * num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + multiplyInt(num1, num2);
    }

    public int divideInt(int num1, int num2) {
        return (num1 / num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        } else return num1 + " / " + num2 + " = " + divideInt(num1, num2);
    }
}
