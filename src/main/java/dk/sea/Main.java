package dk.sea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Calculator calc = new Calculator();
        int result = calc.add(2,2);

        System.out.println("result is: " + result);
    }
}
