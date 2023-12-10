// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated duty cycle PWM input data HAL JNI methods.
 * 
 * @see "hal/simulation/DutyCycleData.h"
 */
public class DutyCycleDataJNI extends JNIWrapper {

  /**
   * Register a callback on the initialization state.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the initialization state.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Checks if the device is initialized.
   * 
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Changes if the device is initialized
   * 
   * @param index index number of the simulated device
   * @param initialized the new value
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on the duty cycle frequency.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerFrequencyCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the duty cycle frequency.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelFrequencyCallback(int index, int uid);

  /**
   * Reads the duty cycle frequency.
   * 
   * @param index index number of the simulated device
   * @return int the frequency in Hz
   */
  public static native int getFrequency(int index);

  /**
   * Changes the duty cycle frequency.
   * 
   * @param index index number of the simulated device
   * @param frequency the new value
   */
  public static native void setFrequency(int index, int frequency);

  /**
   * Register a callback on the output value.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerOutputCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the output value.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelOutputCallback(int index, int uid);

  /**
   * Reads the output value.
   * 
   * @param index index number of the simulated device
   * @return the duty cycle output value, scaled approximately between 0 and 1
   */
  public static native double getOutput(int index);

  /**
   * Changes the duty cycle value.
   * 
   * @param index index number of the simulated device
   * @param output the new value
   */
  public static native void setOutput(int index, double output);

  /**
   * Resets all simulation data for a simulated device.
   * 
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);

  /**
   * Finds the associated duty cycle index number for the specified DIO channel.
   * @param channel the DIO channel index number
   * @return duty cycle index number or negative if none exists
   */
  public static native int findForChannel(int channel);
}
