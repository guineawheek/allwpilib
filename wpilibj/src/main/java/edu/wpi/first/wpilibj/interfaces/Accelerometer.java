// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.wpilibj.interfaces;

/**
 * Interface for 3-axis accelerometers.
 *
 * @deprecated This interface is being removed with no replacement.
 */
@Deprecated(since = "2024", forRemoval = true)
public interface Accelerometer {
  /**
   * Range of maximum acceleration the accelerometer should be configured to measure.
   * 
   * Smaller ranges often provide more resolution, but bigger ranges tolerate greater acceleration.
   */
  enum Range {
    /** +- 2G of maximum acceleration */
    k2G,
    /** +- 4G of maximum acceleration */
    k4G,
    /** +- 8G of maximum acceleration */
    k8G,
    /** +- 16G of maximum acceleration */
    k16G
  }

  /**
   * Common interface for setting the measuring range of an accelerometer.
   *
   * @param range The maximum acceleration, positive or negative, that the accelerometer will
   *     measure. Not all accelerometers support all ranges.
   */
  void setRange(Range range);

  /**
   * Common interface for getting the x-axis acceleration.
   *
   * @return The acceleration along the x-axis in g-forces
   */
  double getX();

  /**
   * Common interface for getting the y-axis acceleration.
   *
   * @return The acceleration along the y-axis in g-forces
   */
  double getY();

  /**
   * Common interface for getting the z axis acceleration.
   *
   * @return The acceleration along the z axis in g-forces
   */
  double getZ();
}
