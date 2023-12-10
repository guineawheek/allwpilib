// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated analog input data HAL JNI methods.
 * 
 * @see "hal/simulation/AnalogInData.h"
 */
public class AnalogInDataJNI extends JNIWrapper {

  /**
   * Register a callback on whether an analog input is initialized.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the device is initialized
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether an analog input is initialized.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Check if an analog input is initialized.
   * 
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Change whether an analog input is initialized.
   * 
   * @param index index number of the simulated device
   * @param initialized the new value
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on the number of average bits.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the number of average bits changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAverageBitsCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregster a callback on the number of average bits.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAverageBitsCallback(int index, int uid);

  /**
   * Get the number of average bits.
   * 
   * @param index index number of the simulated device
   * @return the number of average bits
   */
  public static native int getAverageBits(int index);

  /**
   * Change the number of average bits.
   * 
   * @param index index number of the simulated device
   * @param averageBits the new value
   */
  public static native void setAverageBits(int index, int averageBits);

  /**
   * Register a callback on the amount of oversampling bits.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the oversampling bits change
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerOversampleBitsCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregster a callback on the amount of oversampling bits.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelOversampleBitsCallback(int index, int uid);

  /**
   * Gets the amount of oversampling bits.
   * 
   * @param index index number of the simulated device
   * @return the amount of oversampling bits
   */
  public static native int getOversampleBits(int index);

  /**
   * Change the amount of oversampling bits.
   * 
   * @param index index number of the simulated device 
   * @param oversampleBits the new value
   */
  public static native void setOversampleBits(int index, int oversampleBits);

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
   * Register a callback on whether the accumulator is initialized.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the accumulator is initialized
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAccumulatorInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregsiter a callback on whether the accumulator is initialized.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAccumulatorInitializedCallback(int index, int uid);

  /**
   * Check if the accumulator has been initialized.
   * 
   * @param index index number of the simulated device
   * @return true if initialized
   */
  public static native boolean getAccumulatorInitialized(int index);

  /**
   * Change whether the accumulator has been initialized.
   * 
   * @param index index number of the simulated device
   * @param accumulatorInitialized the new valup
   */
  public static native void setAccumulatorInitialized(int index, boolean accumulatorInitialized);

  /**
   * Register a callback on the accumulator value.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the accumulator value is changed
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAccumulatorValueCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the accumulator value.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAccumulatorValueCallback(int index, int uid);

  /**
   * Get the accumulator value.
   * 
   * @param index index number of the simulated device
   * @return the accumulator value
   */
  public static native long getAccumulatorValue(int index);

  /**
   * Change the accumulator value.
   * 
   * @param index index number of the simulated device
   * @param accumulatorValue the new value
   */
  public static native void setAccumulatorValue(int index, long accumulatorValue);

  /**
   * Register a callback on the accumulator count.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the accumulator count changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAccumulatorCountCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the accumulator count.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAccumulatorCountCallback(int index, int uid);

  /**
   * Get the accumulator count.
   * 
   * @param index index number of the simulated device
   * @return the accumulator count
   */
  public static native long getAccumulatorCount(int index);

  /**
   * Change the accumulator count.
   * 
   * @param index index number of the simulated device
   * @param accumulatorCount the new count.
   */
  public static native void setAccumulatorCount(int index, long accumulatorCount);

  /**
   * Register a callback on the accumulator center.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the accumulator center changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAccumulatorCenterCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the accumulator center.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAccumulatorCenterCallback(int index, int uid);

  /**
   * Get the accumulator center.
   * 
   * @param index index number of the simulated device
   * @return the accumulator center
   */
  public static native int getAccumulatorCenter(int index);

  /**
   * Change the accumulator center. 
   * 
   * @param index index number of the simulated device
   * @param AccumulatorCenter the new center
   */
  public static native void setAccumulatorCenter(int index, int AccumulatorCenter);

  /**
   * Register a callback on the accumulator deadband.
   * 
   * @param index index number of the simulated device
   * @param callback the callback that will be called whenever the accumulator deadband changes
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAccumulatorDeadbandCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the accumulator deadband.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAccumulatorDeadbandCallback(int index, int uid);

  /**
   * Get the accumulator deadband.
   * 
   * @param index index number of the simulated device
   * @return the deadband
   */
  public static native int getAccumulatorDeadband(int index);

  /**
   * Change the accumulator deadband.
   * 
   * @param index index number of the simulated device
   * @param AccumulatorDeadband the new deadband
   */
  public static native void setAccumulatorDeadband(int index, int AccumulatorDeadband);

  /**
   * Reset all simulation data for a simulated device.
   * 
   * @param index index number of the simulated device
   */
  public static native void resetData(int index);
}
