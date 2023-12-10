// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.wpilibj.simulation;

import edu.wpi.first.hal.SimDouble;
import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.ADXL345_SPI;
import java.util.Objects;

/** Class to control a simulated ADXL345 accelerometer. */
public class ADXL345Sim {
  /** Simulated X-axis acceleration */
  protected SimDouble m_simX;
  /** Simulated Y-axis acceleration */
  protected SimDouble m_simY;
  /** Simulated Z-axis acceleration */
  protected SimDouble m_simZ;

  /**
   * Constructor.
   *
   * @param device The device to simulate
   */
  public ADXL345Sim(ADXL345_SPI device) {
    SimDeviceSim simDevice = new SimDeviceSim("Accel:ADXL345_SPI" + "[" + device.getPort() + "]");
    initSim(simDevice);
  }

  /**
   * Constructor.
   *
   * @param device The device to simulate
   */
  public ADXL345Sim(ADXL345_I2C device) {
    SimDeviceSim simDevice =
        new SimDeviceSim(
            "Accel:ADXL345_I2C" + "[" + device.getPort() + "," + device.getDeviceAddress() + "]");
    initSim(simDevice);
  }

  private void initSim(SimDeviceSim simDevice) {
    Objects.requireNonNull(simDevice);

    m_simX = simDevice.getDouble("x");
    m_simY = simDevice.getDouble("y");
    m_simZ = simDevice.getDouble("z");

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
