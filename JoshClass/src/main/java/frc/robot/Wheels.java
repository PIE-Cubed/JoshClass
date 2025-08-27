package frc.robot;

public class Wheels {

    private double location;

    public Wheels(double pos) {
        System.out.println("Running wheels constructor");
        location = pos;
    }

    public double getPosition() {
        System.out.println("functions");
        return location;
    }
}
