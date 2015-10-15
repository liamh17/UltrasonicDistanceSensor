
package org.usfirst.frc.team3167.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Ultrasonic;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	private Jaguar jag; 
	private Ultrasonic sensor;
	public double distance = sensor.getRangeInches();  
	
    public void robotInit() {
       	jag = new Jaguar(1);
    	sensor = new Ultrasonic(1, 2); 
    	
    	sensor.setEnabled(true);
    	sensor.setAutomaticMode(true);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	if(distance > 10.0) {
    		jag.set(0.5);
    	}
    	else if(distance < 10.0) {
    		jag.set(-0.5);
    	}
    	else {
    		jag.set(0.0);
    	}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
