package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by 10413153 on 10/26/2015.
 */
public class Auto3blue extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    //DcMotor leftArm;
    //DcMotor rightArm;

    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        //rightArm = hardwareMap.dcMotor.get("right_arm");
        //leftArm = hardwareMap.dcMotor.get("left_arm");

        waitForStart();

        leftMotor.setPower(1.0);
        rightMotor.setPower(1.0);

        sleep(2000);

        leftMotor.setPower(1.0);
        rightMotor.setPower(-1.0);

        sleep(500);

        leftMotor.setPower(1.0);
        rightMotor.setPower(1.0);

        sleep(2500);

        leftMotor.setPower(1.0);
        rightMotor.setPower(-1.0);

        sleep(1000);

        leftMotor.setPower(1.0);
        rightMotor.setPower(1.0);

        sleep(3000);

        leftMotor.setPowerFloat();
        rightMotor.setPowerFloat();
    }
}