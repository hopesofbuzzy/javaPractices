package practice4.Task3_4;


public class Example {
    void main() {
        Formula[] formulas = new Formula[2];
        formulas[0] = new AccelerationFormula(5, 5);
        formulas[1] = new KinematicEnergyFormula(5, 2);
        for (Formula exp : formulas) {
            System.out.println(exp + " = " + exp.calculate());
        }
        System.out.println(new AccelerationFormula(5, 5).equals(formulas[0]));
    }
}
