// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated analog gyro data HAL JNI methods.
 * 
 * @see "hal/simulation/AnalogGyroData.h"
 */
public class AnalogGyroDataJNI extends JNIWrapper {

  /**
   * Register a callback on the angle.
   * 
   * @param index index number of the simulated analog gyro
   * @param callback the callback that will be called whenever the angle changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAngleCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the angle.
   * 
   * @param index index number of the simulated analog gyro
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAngleCallback(int index, int uid);

  /**
   * Get the current angle of a gyro.
   * 
   * @param index index number of the simulated analog gyro
   * @return the angled measured by the gyro
   */
  public static native double getAngle(int index);

  /**
   * Change the angle measured by the gyro.
   * 
   * @param index index number of the simulated analog gyro
   * @param angle the new value
   */
  public static native void setAngle(int index, double angle);

  /**
   * Register a callback on the rate.
   * 
   * @param index index number of the simulated analog gyro
   * @param callback the callback that will be called whenever the rate changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerRateCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the rate.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated analog gyro
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelRateCallback(int index, int uid);

  /**
   * Get the rate of angle change on a gyro.
   * 
   * @param index index number of the simulated analog gyro
   * @return the rate
   */
  public static native double getRate(int index);

  /**
   * Set the rate of a gyro.
   * 
   * @param index index number of the simulated analog gyro
   * @param rate the new rate
   */
  public static native void setRate(int index, double rate);

  /**
   * Register a callback on whether a gyro is initialized.
   * 
   * @param index index number of the simulated analog gyro
   * @param callback the callback that will be called whenever the gyro is initialized
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether a gyro is initialized.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated analog gyro
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Check if a gyro is initialized.
   * 
   * @param index index number of the simulated analog gyro
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Set whether a gyro is initialized.
   * 
   * @param index index number of the simulated analog gyro
   * @param initialized the new value
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Reset all simulation data for a simulated analog gyro.
   * 
   * @param index index number of the simulated analog gyro
   */
  public static native void resetData(int index);
}
