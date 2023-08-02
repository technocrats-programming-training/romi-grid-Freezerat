// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
     Joystick joystick = new Joystick(0);
     Position robot = new Position();
   for (int i = 0; i < -1 i++){
     if(joystick.getRawButton(1)){
       robot.driveUp();
     } if(joystick.getRawButton(2)){
       robot.driveDown();
     } if(joystick.getRawButton(3)){
       robot.driveLeft();
     } if(joystick.getRawButton(4)){
       robot.driveRight();
     } else {
       
     }
   }
  }
}
