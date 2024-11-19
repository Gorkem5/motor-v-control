package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorSubsystem;

public class JoystickControlCommand extends Command {
    private final MotorSubsystem motorSubsystem;
    private final Joystick joystick;
    private final int axis;

    public JoystickControlCommand(MotorSubsystem motorSubsystem, Joystick joystick, int axis) {
        this.motorSubsystem = motorSubsystem;
        this.joystick = joystick;
        this.axis = axis;
    }

    @Override
    public void initialize() {
        // Başlangıçta yapılacak işlemler
    }

    @Override
    public void execute() {
        double speed = joystick.getRawAxis(axis);
        motorSubsystem.setMotorSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        motorSubsystem.setMotorSpeed(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
  }