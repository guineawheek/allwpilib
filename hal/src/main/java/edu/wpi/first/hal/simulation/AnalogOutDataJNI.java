// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated analog output data HAL JNI methods.
 *
 * @see "hal/simulation/AnalogOutData.h"
 */
public class AnalogOutDataJNI extends JNIWrapper {
  /**
   * Register a callback on the voltage.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the voltage is changed.
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerVoltageCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the voltage.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelVoltageCallback(int index, int uid);

  /**
   * Get the voltage.
   *
   * @param index index number of the simulated device
   * @return the voltage
   */
  public static native double getVoltage(int index);

  /**
   * Change the voltage.
   *
   * @param index index number of the simulated device
   * @param voltage the new value
   */
  public static native void setVoltage(int index, double voltage);

  /**
   * Register a callback on whether an analog output is initialized.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the device is initialized
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether an analog output is initialized.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Check if an analog output is initialized.
   *
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Change whether an analog output is initialized.
   *
   * @param index index number of the simulated device
   * @param initialized the new value
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Reset all simulation data for a simulated device.
   *
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);
}
