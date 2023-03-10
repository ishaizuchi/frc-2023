package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
 
public class ClutchSubsystem extends SubsystemBase
{
    private CANSparkMax ClutchMotor=new CANSparkMax(10, MotorType.kBrushless);
    private Encoder encoder;
    private final double TickToMeters=(0.004*Math.PI)/180; 

    public ClutchSubsystem(){

    }

    public void setClutchMotor(double speed)
    {
        ClutchMotor.set(speed);
    }
    
    public double EncoderMeters()
    {
        return encoder.get()*TickToMeters;
    }
}
