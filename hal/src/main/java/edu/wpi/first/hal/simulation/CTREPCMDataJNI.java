// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated CTRE PCM data HAL JNI methods.
 *
 * @see "hal/simulation/CTREPCMData.h"
 */
public class CTREPCMDataJNI extends JNIWrapper {
  /**
   * Register a callback on when the PCM is initialized.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called when the PCM initialization state changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the PCM initialization state.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Check if the PCM has been initialized.
   *
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Change whether the PCM has been initialized.
   *
   * @param index index number of the simulated device
   * @param initialized true for initialized
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on a solenoid output.
   *
   * @param index index number of the simulated device
   * @param channel the channel to monitor
   * @param callback the callback that will be called whenever a solenoid output changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerSolenoidOutputCallback(
      int index, int channel, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on a solenoid output.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param channel the channel to monitor
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelSolenoidOutputCallback(int index, int channel, int uid);

  /**
   * Check the solenoid output on a specific channel.
   *
   * @param index index number of the simulated device
   * @param channel the channel to check
   * @return the solenoid output
   */
  public static native boolean getSolenoidOutput(int index, int channel);

  /**
   * Change the solenoid output on a specific channel.
   *
   * @param index index number of the simulated device
   * @param channel the channel to change
   * @param solenoidOutput the new solenoid output
   */
  public static native void setSolenoidOutput(int index, int channel, boolean solenoidOutput);

  /**
   * Register a callback on the compressor on/off state.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the compressor on/off state changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerCompressorOnCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the compressor on/off state.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelCompressorOnCallback(int index, int uid);

  /**
   * Check if the compressor is on.
   *
   * @param index index number of the simulated device
   * @return true if the compressor is on
   */
  public static native boolean getCompressorOn(int index);

  /**
   * Change the compressor on/off state.
   *
   * @param index index number of the simulated device
   * @param compressorOn the new compressor on/off state
   */
  public static native void setCompressorOn(int index, boolean compressorOn);

  /**
   * Register a callback on whenever the closed loop state changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the closed loop state changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerClosedLoopEnabledCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the closed loop state.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelClosedLoopEnabledCallback(int index, int uid);

  /**
   * Checks if closed loop compressor control is enabled.
   *
   * @param index index number of the simulated device
   * @return true if active
   */
  public static native boolean getClosedLoopEnabled(int index);

  /**
   * Turn on/off the closed loop control of the compressor.
   *
   * @param index index number of the simulated device
   * @param closeLoopEnabled whether the control loop is active
   */
  public static native void setClosedLoopEnabled(int index, boolean closeLoopEnabled);

  /**
   * Register a callback on when the pressure switch value changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the pressure switch value changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerPressureSwitchCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the pressure switch value.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelPressureSwitchCallback(int index, int uid);

  /**
   * Check the pressure switch value.
   *
   * @param index index number of the simulated device
   * @return the pressure switch value
   */
  public static native boolean getPressureSwitch(int index);

  /**
   * Change the value of the pressure switch.
   *
   * @param index index number of the simulated device
   * @param pressureSwitch the new value
   */
  public static native void setPressureSwitch(int index, boolean pressureSwitch);

  /**
   * Register a callback on the compressor current.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the compressor current changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerCompressorCurrentCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the compressor current.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelCompressorCurrentCallback(int index, int uid);

  /**
   * Checks the compressor current.
   *
   * @param index index number of the simulated device
   * @return the compressor current
   */
  public static native double getCompressorCurrent(int index);

  /**
   * Changes the compressor current.
   *
   * @param index index number of the simulated device
   * @param compressorCurrent the new current
   */
  public static native void setCompressorCurrent(int index, double compressorCurrent);

  /**
   * Register a callback method for all non-solenoid related state changes.
   *
   * This function does not instantiate CallbackStores.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever a non-solenoid related state changes
   * @param initialNotify whether to run the callback on the initial value
   */
  public static native void registerAllNonSolenoidCallbacks(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Register a callback method for solenoid related state changes on a specific channel
   *
   * This function does not instantiate CallbackStores.
   *
   * @param index index number of the simulated device
   * @param channel the channel associated with the solenoid
   * @param callback the callback that will be called whenever a non-solenoid related state changes
   * @param initialNotify whether to run the callback on the initial value
   */
  public static native void registerAllSolenoidCallbacks(
      int index, int channel, NotifyCallback callback, boolean initialNotify);

  /**
   * Reset all simulation data for a simulated device.
   *
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);
}
