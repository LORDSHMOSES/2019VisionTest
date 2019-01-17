//Every subsystem needs an idle command so that it doesn't crash.
package org.usfirst.frc.team5232.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5232.robot.Robot;


public class ArmIdle extends Command {
	
	public ArmIdle() {
		requires(Robot.arm);
	}
	protected void initialize() {
	}
	protected void execute() {
		Robot.arm.ArmMotorControl(0.0);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
	}
	protected void interrupted() {
	}
}
	