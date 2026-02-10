package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.sun.tools.javac.tree.DCTree;

public class ArcadeDrive {
private DcMotor leftDrive, rightDrive;

public void init(HardwareMap hwMap){

leftDrive = hwMap.get(DcMotor.class, "leftdrive");
rightDrive = hwMap.get(DcMotor.class, "rightdrive");

leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);

}

public void drive(double throttle, double spin) {
    double leftPower = throttle + spin;
    double rightPower = throttle - spin;
    double largest = Math.max(Math.abs(leftPower), Math.abs(rightPower));
    if (largest > 1) {
        leftPower /= largest;
        rightPower /= largest;
    }
leftDrive.setPower(leftPower);
rightDrive.setPower(rightPower);


}
}
