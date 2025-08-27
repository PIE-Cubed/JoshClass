package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class Controller {
    ZorroController driveController;

    private XboxController minipController;

    public Controller() {
        System.out.println("Controller Legally Exists in This Dimensional Pocket in Time and Space With No Problems whatsoever :D      For Now :)");
        driveController = new ZorroController(0);
    }

    public double getForwardPower() {
        double power = -1 * driveController.getLeftY();
        return power;
    }

    public double getStrafePower() {
        double power = -1 * driveController.getLeftX();
        return power;
    }

    public double getRotatePower() {
        double power = -1 * driveController.getRightX();
        return power;
    }

}
