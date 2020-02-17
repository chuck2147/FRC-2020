/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class IndexerSubsystem extends SubsystemBase {
  private final CANSparkMax wheelMotor = new CANSparkMax(RobotMap.INDEXER_FRONT_MOTOR, MotorType.kBrushless);  
  private final CANSparkMax beltMotor = new CANSparkMax(RobotMap.INDEXER_BACK_MOTOR, MotorType.kBrushless);
  private final AnalogInput ballSensor = new AnalogInput(RobotMap.BALL_SENSOR);

  public IndexerSubsystem() {}
  public void runBack() {
    wheelMotor.set(-0.25);
  }
  public void runFront() {
    beltMotor.set(-0.25);
  }
 
  public void stopFront() {
    beltMotor.set(0);
  }
  public void stopBack() {
    wheelMotor.set(0);
  }
}
