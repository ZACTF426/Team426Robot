package frc.robot;


import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/*

public class ColorWheelSystem extends Subsystem{
  private WPI_VictorSPX m_armMotor = new WPI_VictorSPX(9);
  private WPI_VictorSPX m_rotationMotor = new WPI_VictorSPX(8);
  
 
  private enum armState{
    IDLE,
    RAISING,
    LOWERING
  }

  public armState colorWheelArmState = armState.IDLE;
  
  public void spinColorWheel() {
    m_armMotor.set(1.0);
  }
  public void stopColorWheel() {
    m_armMotor.set(0.0);
  }
  public void reverseColorWheel() {
    m_armMotor.set(-1.0);
  }
  public void raiseColorWheelArm(){
      colorWheelArmState =armState.RAISING;
  }

  public void lowerColorWheelArm(){
    colorWheelArmState =armState.LOWERING;
  }

public void initDefaultCommand(){

}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
 
    if (colorWheelArmState == armState.LOWERING){
      m_armMotor.set(-1);
    }
    else if(colorWheelArmState == armState.RAISING){
      m_armMotor.set(-1);
    }
    else{
      m_armMotor.set(0);
    }
        
  }
}

*/