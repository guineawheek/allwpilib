// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated digital I/O data HAL JNI methods.
 *
 * @see "hal/simulation/DIOData.h"
 */
public class DIODataJNI extends JNIWrapper {
  /**
   * Register a callback on the initialization state.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the initialization state changes
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
   * Check whether the DIO is initialized.
   *
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Change the DIO initialization state.
   *
   * @param index index number of the simulated device
   * @param initialized true if the simulated DIO is initialized
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on whenever the DIO value changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the DIO value changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerValueCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whenever the DIO value changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelValueCallback(int index, int uid);

  /**
   * Check the value of the DIO port.
   *
   * @param index index number of the simulated device
   * @return the DIO value
   */
  public static native boolean getValue(int index);

  /**
   * Change the value of the DIO port.
   *
   * @param index index number of the simulated device
   * @param value the new value
   */
  public static native void setValue(int index, boolean value);

  /**
   * Register a callback on whenever the pulse length changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the pulse length changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerPulseLengthCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the pulse length.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelPulseLengthCallback(int index, int uid);

  /**
   * Reads the pulse length.
   *
   * @param index index number of the simulated device
   * @return the pulse length
   */
  public static native double getPulseLength(int index);

  /**
   * Change the pulse length.
   *
   * @param index index number of the simulated device
   * @param pulseLength the new pulse length
   */
  public static native void setPulseLength(int index, double pulseLength);

  /**
   * Register a callback to be run whenever a DIO changes to be an input.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerIsInputCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whenever a DIO changes to be an input.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelIsInputCallback(int index, int uid);

  /**
   * Checks if the DIO is an input.
   *
   * @param index index number of the simulated device
   * @return true if input
   */
  public static native boolean getIsInput(int index);

  /**
   * Changes whether the DIO is an input.
   *
   * @param index index number of the simulated device
   * @param isInput whether the DIO is an input.
   */
  public static native void setIsInput(int index, boolean isInput);

  /**
   * Register a callback to be run when the filter index changes.
   *
   * @param index index number of the simulated device
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerFilterIndexCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback to be run when the filter index changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelFilterIndexCallback(int index, int uid);

  /**
   * Checks the filter index of the DIO.
   *
   * @param index index number of the simulated device
   * @return the filter index
   */
  public static native int getFilterIndex(int index);

  /**
   * Changes the filter index of the DIO.
   *
   * @param index index number of the simulated device
   * @param filterIndex the new filter index
   */
  public static native void setFilterIndex(int index, int filterIndex);

  /**
   * Resets all simulation data for a simulated device.
   *
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);
}
