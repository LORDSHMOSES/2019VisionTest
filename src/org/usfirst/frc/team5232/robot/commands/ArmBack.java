package org.usfirst.frc.team5232.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5232.robot.Robot;


public class ArmBack extends Command {
	
	public ArmBack() {
		requires(Robot.arm);
	}
	protected void initialize() {
	}
	protected void execute() {
		Robot.arm.ArmMotorControl(-1.0);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
	}
	protected void interrupted() {
	}
}
	