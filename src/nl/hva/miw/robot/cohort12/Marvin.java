package nl.hva.miw.robot.cohort12;

import lejos.hardware.Brick;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.robotics.Color;
import models.*;
import ev3.exercises.library.*;

public class Marvin 

{ 
	 
    public static void main(String[] args)
    {
    	//lijnvolger oproepen (voor parcour)
    	LineFollower lijnvolger = new LineFollower();
    	lijnvolger.followLine();
    	
    	
//    	Music muziek = new Music("c");
//    	muziek.makeMusic();

    	

    	Scale scale = new Scale();
    		
    	
    	DriveWithMusic muziekDemo = new DriveWithMusic(scale);
    	muziekDemo.driveWithColor();

//    	DriveWithMusic muziekDemo = new DriveWithMusic();
//    	muziekDemo.driveWithColor();

    	

    	
    }
}