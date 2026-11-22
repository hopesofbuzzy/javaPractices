package practice6;

import java.util.Objects;

public class AccelerationFormula implements Formula {
    private final double mass;
    private final double force;

    public AccelerationFormula(double mass, double force) {
        this.mass = mass;
        this.force = force;
        validate();
    }

    public AccelerationFormula(Body body) {
        this.mass = body.mass();
        this.force = body.force();
        validate();
    }

    public double calculate() {
        return force / mass;
    }

    public boolean validate() {
        if (mass < 0) {
            throw new IllegalArgumentException("Масса должна быть положительной!");
        }
        return true;
    }

    @Override
    public String toString() {
        return "<force> / <mass> = " + force + " / " + mass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AccelerationFormula that = (AccelerationFormula) o;
        return Double.compare(mass, that.mass) == 0 && Double.compare(force, that.force) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, force);
    }
}
