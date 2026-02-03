package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 30629;
        int motorAngle = 60;
        String teamName = "The Scrapers";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Name", teamName);
    }

    @Override
    public void loop() {

    }
}
