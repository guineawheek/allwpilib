// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.wpilibj.romi;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;

/**
 * RomiMotor.
 *
 * <p>A general use PWM motor controller representing the motors on a Romi robot
 */
public class RomiMotor extends PWMMotorController {
  /** Common initialization code called by all constructors. */
  protected void initRomiMotor() {
    m_pwm.setPeriodMultiplier(PWM.PeriodMultiplier.k1X);
    m_pwm.setSpeed(0.0);
    m_pwm.setZeroLatch();
  }

  /**
   * Constructor.
   *
   * @param channel The PWM channel that the RomiMotor is attached to. 0 is the left motor, 1 is the
   *     right.
   */
  public RomiMotor(final int channel) {
    super("Romi Motor", channel);
    initRomiMotor();
  }
}
