
package org.usfirst.frc.team5232.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5232.robot.Robot;

/**
 *
 */
public class SimpleManualDrive extends Command {
    public SimpleManualDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
    }
	

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Robot.drivetrain.ArcadeDrive(1 * Robot.oi.rightStick.getY(), -1 * Robot.oi.rightStick.getX());
    	Robot.drivetrain.ManualMotorControl(-0.45  * Robot.m_oi.stick.getY() * java.lang.Math.abs(Robot.m_oi.stick.getY()), 0.45 * Robot.m_oi.stick.getY() * java.lang.Math.abs(Robot.m_oi.stick.getY()),-1 * Robot.m_oi.stick.getX() * java.lang.Math.abs(Robot.m_oi.stick.getX()), -1 * Robot.m_oi.stick.getX() * java.lang.Math.abs(Robot.m_oi.stick.getX()),-0.35 * Robot.m_oi.stick.getZ(), -0.85 * Robot.m_oi.stick.getZ());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
