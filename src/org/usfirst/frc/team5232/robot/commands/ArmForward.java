package org.usfirst.frc.team5232.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5232.robot.Robot;


public class ArmForward extends Command {
	
	public ArmForward() {
		requires(Robot.arm);
	}
	protected void initialize() {
	}
	protected void execute() {
		Robot.arm.ArmMotorControl(1.0);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
	}
	protected void interrupted() {
	}
}
	