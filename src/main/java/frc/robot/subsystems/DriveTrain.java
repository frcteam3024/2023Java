
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import frc.robot.Constants;
import frc.robot.commands.TankDrive;


public class DriveTrain extends SubsystemBase {
  private CANSparkMax frontLeftMotor  = new CANSparkMax(Constants.FRONT_LEFT_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax frontRightMotor= new CANSparkMax(Constants.FRONT_RIGHT_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax backRightMotor  = new CANSparkMax(Constants.BACK_RIGHT_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax backLeftMotor    = new CANSparkMax(Constants.BACK_LEFT_MOTOR_ID, CANSparkMaxLowLevel.MotorType.kBrushless);

  /** Creates a new SpinMotor. */
  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  //@Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    frontLeftMotor.set(-speed);
    backLeftMotor.set(-speed);
  }

  public void setRightMotors(double speed) {
    frontRightMotor.set(speed);
    backRightMotor.set(speed);
  }

}