//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double initialBal = 5000;
        double oneMonthBal;
        double twoMonthBal;
        oneMonthBal = initialBal * 1.17;
        System.out.println("Your interest due after 1 month is " + oneMonthBal + ".");
        twoMonthBal = oneMonthBal * 1.17;
        System.out.println("Your interest due after 2 months is " + twoMonthBal + ".");
    }
}