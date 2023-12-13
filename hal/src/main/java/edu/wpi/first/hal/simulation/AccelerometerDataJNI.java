// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated accelerometer data HAL JNI methods.
 *
 * @see "hal/simulation/AccelerometerData.h"
 */
public class AccelerometerDataJNI extends JNIWrapper {
  /**
   * Register a callback to be run when this accelerometer activates.
   *
   * @param index index number of the simulated accelerometer
   * @param callback the callback
   * @param initialNotify whether to run the callback with the initial state
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerActiveCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregisters a callback that is run when this accelerometer activates.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated accelerometer
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelActiveCallback(int index, int uid);

  /**
   * Check whether an accelerometer is active.
   * @param index index number of the simulated accelerometer
   * @return true if active
   */
  public static native boolean getActive(int index);

  /**
   * Define whether an accelerometer is active.
   * @param index index number of the simulated accelerometer
   * @param active the new state
   */
  public static native void setActive(int index, boolean active);

  /**
   * Register a callback to be run whenever the range changes.
   *
   * @param index index number of the simulated accelerometer
   * @param callback the callback
   * @param initialNotify whether to call the callback with the initial state
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerRangeCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregisters a callback that is run whenever the range changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated accelerometer
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelRangeCallback(int index, int uid);

  /**
   * Check the range of an accelerometer.
   *
   * @param index index number of the simulated accelerometer
   * @return the accelerometer range
   */
  public static native int getRange(int index);


  /**
   * Change the range of an accelerometer.
   *
   * @param index index number of the simulated accelerometer
   * @param range the new accelerometer range
   */
  public static native void setRange(int index, int range);

  /**
   * Register a callback to be run whenever the X axis value changes.
   *
   * @param index index number of the simulated accelerometer
   * @param callback the callback
   * @param initialNotify whether to call the callback with the initial state
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerXCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregisters a callback that is run whenever the X axis value changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated accelerometer
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelXCallback(int index, int uid);

  /**
   * Measure the X axis value.
   *
   * @param index index number of the simulated accelerometer
   * @return the X axis measurement
   */
  public static native double getX(int index);

  /**
   * Change the X axis value of the accelerometer.
   *
   * @param index index number of the simulated accelerometer
   * @param x the new reading of the X axis
   */
  public static native void setX(int index, double x);

  /**
   * Register a callback to be run whenever the Y axis value changes.
   *
   * @param index index number of the simulated accelerometer
   * @param callback the callback
   * @param initialNotify whether to call the callback with the initial state
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerYCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregisters a callback that is run whenever the Y axis value changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated accelerometer
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelYCallback(int index, int uid);

  /**
   * Measure the Y axis value.
   *
   * @param index index number of the simulated accelerometer
   * @return the Y axis measurement
   */
  public static native double getY(int index);

  /**
   * Change the Y axis value of the accelerometer.
   *
   * @param index index number of the simulated accelerometer
   * @param y the new reading of the Y axis
   */
  public static native void setY(int index, double y);

  /**
   * Register a callback to be run whenever the Z axis value changes.
   *
   * @param index index number of the simulated accelerometer
   * @param callback the callback
   * @param initialNotify whether to call the callback with the initial state
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerZCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregisters a callback that is run whenever the Z axis value changes.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated accelerometer
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelZCallback(int index, int uid);

  /**
   * Measure the Z axis value.
   *
   * @param index index number of the simulated accelerometer
   * @return the Z axis measurement
   */
  public static native double getZ(int index);

  /**
   * Change the Z axis value of the accelerometer.
   *
   * @param index index number of the simulated accelerometer
   * @param z the new reading of the Z axis
   */
  public static native void setZ(int index, double z);

  /**
   * Reset all simulation data for an accelerometer.
   *
   * @param index index number of the simulated accelerometer
   */
  public static native void resetData(int index);
}
