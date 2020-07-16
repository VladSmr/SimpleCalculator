import java.util.Scanner;

public class MainClass {
    String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String firstNUmber = null;
    String secondNumber = null;
    String sign = null;
    int a = 0;
    int b = 0;

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.readAndWrite();
        if (mainClass.isItRomanNumbers()) {
            mainClass.writeRomanNumbers();
            mainClass.calculateRomanNumbers(mainClass.a, mainClass.b);
        } else {
            mainClass.writeArabeNumbers();
            mainClass.calculateArabeNumbers(mainClass.a, mainClass.b);
        }
    }

    public void calculateArabeNumbers(int a, int b) {
        if (a < 1 || a > 10 || b < 1 || b > 10)
            System.out.println("Incorrect number, try again");
        else {
            switch (sign) {
                case "-":
                    System.out.println(a - b);
                    break;
                case "+":
                    System.out.println(a + b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Incorrect sign, try again");
                    break;
            }
        }
    }

    public void calculateRomanNumbers(int a, int b) {
        int result = 0;
        if (a < 1 || a > 10 || b < 1 || b > 10)
            System.out.println("Incorrect number, try again");
        else {
            switch (sign) {
                case "-":
                    result = a - b;
                    break;
                case "+":
                    result = a + b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Incorrect sign, try again");
                    break;
            }
            printRomanNumberResult(result);
        }
    }

    public void readAndWrite() {
        Scanner sc = new Scanner(System.in);
        firstNUmber = sc.next();
        sign = sc.next();
        secondNumber = sc.next();
        sc.close();
    }

    public boolean isItRomanNumbers() {
        boolean result = false;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanNumbers[i].equals(firstNUmber))
                result = true;
        }
        return result;
    }

    public void writeRomanNumbers() {
        for (int i = 0; i < romanNumbers.length; i++) {
            if (firstNUmber.equals(romanNumbers[i]))
                a = i + 1;
            if (secondNumber.equals(romanNumbers[i]))
                b = i + 1;
        }
    }

    public void writeArabeNumbers() {
        a = Integer.parseInt(firstNUmber);
        b = Integer.parseInt(secondNumber);
    }

    public void printRomanNumberResult(int a) {
        StringBuilder result = new StringBuilder();
        if (a < 1)
            System.out.println("Roman numbers are not enough to describe all you want to tell us");
        else if (a >= 1 && a <= 10)
            System.out.println(romanNumbers[a - 1]);
        else if (a > 10 && a < 20) {
            result.append("X").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 20) {
            result.append("XX");
        } else if (a > 20 && a < 30) {
            result.append("XX").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 30) {
            result.append("XXX");
        } else if (a > 30 && a < 40) {
            result.append("XXX").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 40) {
            result.append("XL");
        } else if (a > 40 && a < 50) {
            result.append("XL").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 50) {
            result.append("L");
        } else if (a > 50 && a < 60) {
            result.append("L").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 60) {
            result.append("LX");
        } else if (a > 60 && a < 70) {
            result.append("LX").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 70) {
            result.append("LXX");
        } else if (a > 70 && a < 80) {
            result.append("LXX").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 80) {
            result.append("LXXX");
        } else if (a > 80 && a < 90) {
            result.append("LXXX").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 90) {
            result.append("XC");
        } else if (a > 90 && a < 100) {
            result.append("XC").append(romanNumbers[(a % 10) - 1]);
        } else if (a == 100)
            result.append("C");
        System.out.println(result);
    }
}