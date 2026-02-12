package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalInput;
import java.util.function.Supplier;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.BooleanPublisher;
import edu.wpi.first.networktables.DoubleSubscriber;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class DIO1 extends SubsystemBase{
    
    private final DigitalInput beamBreak = new DigitalInput(0);
    
    BooleanPublisher booleanPub; 

    public DIO1(){
       
    }

    public boolean isBlocked(){
        return beamBreak.get();
    }

    @Override
    public void periodic(){
        SmartDashboard.putBoolean("DIO1", isBlocked());
    }

   

}
