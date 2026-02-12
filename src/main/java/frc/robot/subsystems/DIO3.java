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


public class DIO3 extends SubsystemBase{
    
    private final DigitalInput beamBreak = new DigitalInput(0);
    
    BooleanPublisher booleanPub; 

    public DIO3(){
       
    }

    public boolean isBlocked(){
        return beamBreak.get();
    }

    @Override
    public void periodic(){
        SmartDashboard.putBoolean("IsBlocked", isBlocked());
    }

   

}
