package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {

   int xCoordinate = 0;
   int yCoordinate = 0;
    public void driveUp() throws InterruptedException {
      driveDistance(12);
      yCoordinate ++;
    }

    public void driveDown() throws InterruptedException {
    driveDistance(-12);
      yCoordinate --;
    }

    public void driveRight() throws InterruptedException {
    turnDegrees(90);
      driveDistance(12);
      xCoordinate ++;
     turnDegrees(-90); 
    }

    public void driveLeft() throws InterruptedException {
    turnDegrees(-90);
      driveDistance(12);
      xCoordinate --;
      turnDegrees(90);
    }

    public void returnToHome() {

    }

    public String toString() {
        return "the romis position is " + "(" + xCoordinate + "," + yCoordinate + ')';
    }
}
