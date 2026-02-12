package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.DigitalInput;
import java.util.function.Supplier;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.BooleanPublisher;
import edu.wpi.first.networktables.DoubleSubscriber;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.DutyCycleEncoder;


public class MockLauncherEncoder extends SubsystemBase{


    private double fullRotation = 17/360;
    
    private DutyCycleEncoder mockEncoder = new DutyCycleEncoder(0, fullRotation, 0);

    
    public MockLauncherEncoder(){
       
    }

    public double getAngle(){
        return mockEncoder.get();
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("Hood Angle", getAngle());

    }

   

}
