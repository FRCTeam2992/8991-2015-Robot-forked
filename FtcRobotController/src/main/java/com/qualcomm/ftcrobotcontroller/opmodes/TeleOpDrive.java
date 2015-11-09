package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TeleOpDrive extends OpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    //DcMotor leftArm;
    //DcMotor rightArm;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        //leftArm = hardwareMap.dcMotor.get("left_Arm");
        //rightArm = hardwareMap.dcMotor.get("right_Arm");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);//reversed motors need reversed values
    }

    @Override
    public void loop() {
        float leftJoy = gamepad1.left_stick_y;
        float rightJoy = gamepad1.right_stick_y;
        //float leftLimb = gamepad2.left_stick_y;
        //following code sets thresholds for the motor power. If the joysticks are less than 5% in either direction, nothing happens
        if (leftJoy > .05 || leftJoy <.05) {
            leftMotor.setPower(leftJoy);
            }
        if (rightJoy > .05 || rightJoy < -.05) {
            rightMotor.setPower(rightJoy);
        }
        if (leftJoy < .05 && leftJoy > -.05){
            leftMotor.setPower(0);
        }
        if (rightJoy < .05 && rightJoy > -.05){
            rightMotor.setPower(0);
        }
        //leftArm.setPower(leftLimb/2);
        //rightArm.setPower(leftLimb/2);
    }
}
