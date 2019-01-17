/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5232.robot.subsystems;

import org.usfirst.frc.team5232.robot.RobotMap;
import org.usfirst.frc.team5232.robot.commands.ArmIdle;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Arm extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	PWMTalonSRX ArmMotor = new PWMTalonSRX(RobotMap.armCIM);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		// The default command should always be an idle command so that the system doesn't do anything unless a button is pressed.
		setDefaultCommand(new ArmIdle());
	}
	public void ArmMotorControl(double armvalue) {
    	ArmMotor.set(armvalue);
}
}
