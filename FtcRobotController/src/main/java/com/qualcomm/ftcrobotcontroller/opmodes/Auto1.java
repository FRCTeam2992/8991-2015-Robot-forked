package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by OWNER on 10/24/2015.
 */
public class Auto1 extends LinearOpMode{

    DcMotor leftMotor;
    DcMotor rightMotor;
    //DcMotor leftArm;
    //DcMotor RightArm;

    @Override
    public void runOpMode() throws InterruptedException{
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        //leftArm = hardwareMap.dcMotor.get("left_Arm");
        //rightArm = hardwareMap.dcMotor.get("right_Arm");

        waitForStart();

        leftMotor.setPower(1.0);
        rightMotor.setPower(1.0);

        sleep(1000);

        leftMotor.setPower(1.0);
        rightMotor.setPower(-1.0);

        sleep(1000);

        leftMotor.setPower(1.0);
        rightMotor.setPower(1.0);

        sleep(1000);

        leftMotor.setPower(1.0);
        rightMotor.setPower(-1.0);

        sleep(1000);

        leftMotor.setPower(1.0);
        rightMotor.setPower(1.0);

        sleep(1000);

        leftMotor.setPowerFloat();
        rightMotor.setPowerFloat();
    }
}
