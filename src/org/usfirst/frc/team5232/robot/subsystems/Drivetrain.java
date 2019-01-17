
package org.usfirst.frc.team5232.robot.subsystems;

import org.usfirst.frc.team5232.robot.Robot;
import org.usfirst.frc.team5232.robot.RobotMap;
import org.usfirst.frc.team5232.robot.commands.SimpleManualDrive;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	PWMTalonSRX RightMotor1 = new PWMTalonSRX(RobotMap.rightDriveCIM1);
	PWMTalonSRX RightMotor2 = new PWMTalonSRX(RobotMap.rightDriveCIM2);
	PWMTalonSRX RightMotor3 = new PWMTalonSRX(RobotMap.rightDriveCIM3);
	PWMTalonSRX LeftMotor1 = new PWMTalonSRX(RobotMap.leftDriveCIM1);
	PWMTalonSRX LeftMotor2 = new PWMTalonSRX(RobotMap.leftDriveCIM2);
	PWMTalonSRX LeftMotor3 = new PWMTalonSRX(RobotMap.leftDriveCIM3); 
	

	

	
	public void initDefaultCommand() {
    	setDefaultCommand(new SimpleManualDrive());
    }
	
	
    public void ManualMotorControl(double leftValue, double rightValue, double leftturnValue, double rightturnValue, double leftZvalue, double rightZvalue) {
    	boolean turbo = Robot.m_oi.stick.getRawButton(1);
    	if (turbo == true) {
        RightMotor1.set(2 * rightValue + rightturnValue + rightZvalue);
        RightMotor2.set(2 * rightValue + rightturnValue + rightZvalue);
        RightMotor3.set(2 * rightValue + rightturnValue + rightZvalue);
        LeftMotor1.set(2 * leftValue + leftturnValue + leftZvalue);
        LeftMotor2.set(2 * leftValue + leftturnValue + leftZvalue);
        LeftMotor3.set(2 * leftValue + leftturnValue + leftZvalue);	
    	}
    	else {
        RightMotor1.set(.3*(rightValue + rightturnValue + rightZvalue));
        RightMotor2.set(.3*(rightValue + rightturnValue + rightZvalue));
        RightMotor3.set(.3*(rightValue + rightturnValue + rightZvalue));
        LeftMotor1.set(.3*(leftValue + leftturnValue + leftZvalue));
        LeftMotor2.set(.3*(leftValue + leftturnValue + leftZvalue));
        LeftMotor3.set(.3*(leftValue + leftturnValue + leftZvalue));	
    	/*The left and right are mixed up just so you know :) */	
    	}
	}

}
