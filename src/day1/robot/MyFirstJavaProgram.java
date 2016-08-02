package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot CoolMoD=new Robot();
for (int i = 0; i < 12; i++) {
CoolMoD.hide();	
//CoolMoD.hide();
CoolMoD.setPenColor(255, 0, 0);
CoolMoD.setSpeed(10);
CoolMoD.penDown();
CoolMoD.move(45);
CoolMoD.turn(30);
CoolMoD.sparkle();
	
}
/*CoolMoD.move(300);
CoolMoD.turn(90);
CoolMoD.move(300);	
CoolMoD.turn(90);
CoolMoD.move(300);
CoolMoD.turn(90);*/
		
	}
}
