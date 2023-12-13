// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated digital PWM output data HAL JNI methods.
 *
 * @see "hal/simulation/DigitalPWMData.h"
 */
public class DigitalPWMDataJNI extends JNIWrapper {
  /**
   * Register a callback on when the initialization state changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the initialization state changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on when the initialization state changes.
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
   * Changes the initialization state of the output.
   *
   * @param index index number of the simulated device
   * @param initialized the new initialization state
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on when the duty cycle output changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the duty cycle output changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerDutyCycleCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on when the duty cycle output changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelDutyCycleCallback(int index, int uid);

  /**
   * Checks the currently applied duty cycle.
   *
   * @param index index number of the simulated device
   * @return the duty cycle value
   */
  public static native double getDutyCycle(int index);

  /**
   * Changes the duty cycle output value.
   *
   * @param index index number of the simulated device
   * @param dutyCycle the new value.
   */
  public static native void setDutyCycle(int index, double dutyCycle);

  /**
   * Register a callback on whenver the pin changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the pin changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerPinCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whenever the pin changes
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelPinCallback(int index, int uid);

  /**
   * Checks the pin number
   *
   * @param index index number of the simulated device
   * @return pin number
   */
  public static native int getPin(int index);

  /**
   * Changes the pin number
   *
   * @param index index number of the simulated device
   * @param pin the new pin number
   */
  public static native void setPin(int index, int pin);

  /**
   * Resets all simulation data for a simulated device.
   *
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);

  /**
   * Finds the associated digital PWM output index number for the specified DIO channel.
   * @param channel the digital output channel index number
   * @return PWM output index number or negative if none exists
   */
  public static native int findForChannel(int channel);
}
