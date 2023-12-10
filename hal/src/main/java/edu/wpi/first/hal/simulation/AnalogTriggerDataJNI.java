// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated analog trigger data HAL JNI methods.
 * 
 * @see "hal/simulation/AnalogTriggerData.h"
 */
public class AnalogTriggerDataJNI extends JNIWrapper {
  /**
   * Register a callback on whether an analog trigger is initialized.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the device is initialized
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether an analog trigger is initialized.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Check if an analog trigger is initialized.
   * 
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Change whether an analog trigger is initialized.
   * 
   * @param index index number of the simulated device
   * @param initialized the new value
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on the trigger lower bound.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the trigger lower bound changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerTriggerLowerBoundCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the trigger lower bound.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelTriggerLowerBoundCallback(int index, int uid);

  /**
   * Get the trigger lower bound.
   * 
   * @param index index number of the simulated device
   * @return the lower bound
   */
  public static native double getTriggerLowerBound(int index);

  /**
   * Change the trigger lower bound. 
   * 
   * @param index index number of the simulated device
   * @param triggerLowerBound the new lower bound
   */
  public static native void setTriggerLowerBound(int index, double triggerLowerBound);

  /**
   * Register a callback on the trigger upper bound.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the trigger upper bound changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerTriggerUpperBoundCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the trigger upper bound.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelTriggerUpperBoundCallback(int index, int uid);

  /**
   * Get the trigger upper bound.
   * 
   * @param index index number of the simulated device
   * @return the upper bound
   */
  public static native double getTriggerUpperBound(int index);

  /**
   * Change the trigger upper bound.
   * 
   * @param index index number of the simulated device
   * @param triggerUpperBound the upper bound
   */
  public static native void setTriggerUpperBound(int index, double triggerUpperBound);

  /**
   * Reset all simulation data for a simulated device.
   * 
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);

  /**
   * Finds the index number for an analog trigger corresponding to the analog input channel.
   * 
   * @param channel analog input channel
   * @return analog trigger index if it exists, else a negative value.
   */
  public static native int findForChannel(int channel);
}
