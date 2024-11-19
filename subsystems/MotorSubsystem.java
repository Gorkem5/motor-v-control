// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class MotorSubsystem extends SubsystemBase {
    private final PWMVictorSPX motor;

    public MotorSubsystem(int motorPort) {
        motor = new PWMVictorSPX(motorPort);
        motor.setSafetyEnabled(true); // Motor güvenliği etkin
    }

    public void setMotorSpeed(double speed) {
        motor.set(speed);
    }
}
