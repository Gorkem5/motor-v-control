package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.JoystickControlCommand;
import frc.robot.subsystems.MotorSubsystem;

public class RobotContainer {
    private final MotorSubsystem motorSubsystem = new MotorSubsystem(0);
    private final Joystick joystick = new Joystick(0);

    public RobotContainer() {
        configureBindings();
    }

    private void configureBindings() {
        motorSubsystem.setDefaultCommand(new JoystickControlCommand(motorSubsystem, joystick, 1));
    }

    public Command getAutonomousCommand() {
        return null;
    }
}