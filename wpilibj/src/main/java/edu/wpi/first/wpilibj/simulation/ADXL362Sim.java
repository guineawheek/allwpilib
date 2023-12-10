// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.wpilibj.simulation;

import edu.wpi.first.hal.SimDouble;
import edu.wpi.first.wpilibj.ADXL362;
import java.util.Objects;

/** Class to control a simulated ADXL362 accelerometer. */
public class ADXL362Sim {
  /** Simulated X-axis reading  */
  protected SimDouble m_simX;
  /** Simulated Y-axis reading */
  protected SimDouble m_simY;
  /** Simulated Z-axis reading */
  protected SimDouble m_simZ;

  /**
   * Constructor.
   *
   * @param device The device to simulate
   */
  public ADXL362Sim(ADXL362 device) {
    SimDeviceSim wrappedSimDevice =
        new SimDeviceSim("Accel:ADXL362" + "[" + device.getPort() + "]");
    initSim(wrappedSimDevice);
  }

  private void initSim(SimDeviceSim wrappedSimDevice) {
    m_simX = wrappedSimDevice.getDouble("x");
    m_simY = wrappedSimDevice.getDouble("y");
    m_simZ = wrappedSimDevice.getDouble("z");

    Objects.requireNonNull(m_simX);
    Objects.requireNonNull(m_simY);
    Objects.requireNonNull(m_simZ);
  }

  /**
   * Set the X-axis acceleration measured by the accelerometer in g-forces.
   * 
   * @param x the new value
   */
  public void setX(double x) {
    m_simX.set(x);
  }

  /**
   * Set the Y-axis acceleration measured by the accelerometer in g-forces.
   * 
   * @param y the new value
   */
  public void setY(double y) {
    m_simY.set(y);
  }

  /**
   * Set the Z-axis acceleration measured by the accelerometer in g-forces.
   * 
   * @param z the new value
   */
  public void setZ(double z) {
    m_simZ.set(z);
  }
}
