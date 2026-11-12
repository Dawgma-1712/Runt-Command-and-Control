package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.DigitalInput;
import java.util.function.Supplier;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.BooleanPublisher;
import edu.wpi.first.networktables.DoubleSubscriber;

import com.ctre.phoenix6.hardware.CANrange;
import com.ctre.phoenix6.configs.CANrangeConfiguration;
import com.ctre.phoenix6.CANBus;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class CANRange extends SubsystemBase{

    private final int canRangeID = 0;
    private final CANBus defaultCANBus = new CANBus("rio");
    private final CANrange canRange = new CANrange(canRangeID, defaultCANBus);

    public CANRange(){
        CANrangeConfiguration configs = new CANrangeConfiguration();

        //change configs here

        canRange.getConfigurator().apply(configs);
    }

    public double getDistanceReading(){
        return canRange.getDistance().refresh().getValueAsDouble();
    }

    public boolean isObjectDetected(){
        return canRange.getIsDetected().refresh().getValue();
    }

    @Override
    public void periodic(){

    }


    
}
