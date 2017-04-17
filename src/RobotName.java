


import org.jointheleague.graphical.robot.Robot;


public class RobotName {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
             Robot test2;
             test2= new Robot ("mini");
        // 3. Put the robot's pen down
             test2.penDown();
        // 6. Make the robot move as fast as possible
             test2.setSpeed(100);

        // 5. Do everything below here 4 times
test2.move(50);
test2.move(-50);
test2.turn(90);         
test2.move(100);
test2.turn(-90); 
test2.move(200);


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
   }

