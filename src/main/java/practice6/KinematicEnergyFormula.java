package practice6;

import java.util.Objects;

public class KinematicEnergyFormula implements Formula {
    private final double mass;
    private final double velocity;

    public KinematicEnergyFormula(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
        validate();
    }

    public KinematicEnergyFormula(Body body) {
        this.mass = body.mass();
        this.velocity = body.velocity();
        validate();
    }

    public double calculate() {
        return (mass * velocity * velocity) / 2;
    }

    public boolean validate() {
        if (mass < 0) {
            throw new IllegalArgumentException("Масса должна быть положительной!");
        }
        return true;
    }

    @Override
    public String toString() {
        return "(<mass> * <velocity>^2) / 2 = (" + mass + " * " + velocity + "^2) / 2";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KinematicEnergyFormula that = (KinematicEnergyFormula) o;
        return Double.compare(mass, that.mass) == 0 && Double.compare(velocity, that.velocity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, velocity);
    }
}
