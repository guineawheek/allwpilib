// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated addressable LED data HAL JNI methods.
 *
 * @see "hal/simulation/AddressableLEDData.h"
 */
public class AddressableLEDDataJNI extends JNIWrapper {
  /**
   * Register a callback on the Initialized property.
   *
   * @param index index number of the simulated addressable LED
   * @param callback the callback that will be called on property change
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerInitializedCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the Initialized property.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated addressible LED
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelInitializedCallback(int index, int uid);

  /**
   * Check if initialized.
   *
   * @param index index number of the simulated addressible LED
   * @return true if initialized
   */
  public static native boolean getInitialized(int index);

  /**
   * Change the Initialized value of the LED strip.
   *
   * @param index index number of the simulated addressible LED
   * @param initialized the new value
   */
  public static native void setInitialized(int index, boolean initialized);

  /**
   * Register a callback on the output port.
   *
   * @param index index number of the simulated addressible LED
   * @param callback the callback that will be run whenever the output port is changed
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerOutputPortCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the output port.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated addressible LED
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelOutputPortCallback(int index, int uid);

  /**
   * Get the output port.
   *
   * @param index index number of the simulated addressible LED
   * @return the output port
   */
  public static native int getOutputPort(int index);

  /**
   * Change the output port.
   *
   * @param index index number of the simulated addressible LED
   * @param outputPort the new output port
   */
  public static native void setOutputPort(int index, int outputPort);

  /**
   * Register a callback on the length.
   *
   * @param index index number of the simulated addressible LED
   * @param callback the callback that will be called whenever the length is changed
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerLengthCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the length.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated addressible LED
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelLengthCallback(int index, int uid);

  /**
   * Get the length of the LED strip.
   *
   * @param index index number of the simulated addressible LED
   * @return the length
   */
  public static native int getLength(int index);

  /**
   * Change the length of the LED strip.
   *
   * @param index index number of the simulated addressible LED
   * @param length the new value
   */
  public static native void setLength(int index, int length);

  /**
   * Register a callback on whether the LEDs are running.
   *
   * @param index index number of the simulated addressible LED
   * @param callback the callback that will be called whenever the LED state is changed
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerRunningCallback(
      int index, NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether the LEDs are running.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated addressible LED
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelRunningCallback(int index, int uid);

  /**
   * Check if the LEDs are running.
   *
   * @param index index number of the simulated addressible LED
   * @return true if they are
   */
  public static native boolean getRunning(int index);

  /**
   * Change if the LEDs are running.
   *
   * @param index index number of the simulated addressible LED
   * @param running the new value
   */
  public static native void setRunning(int index, boolean running);

  /**
   * Register a callback on the LED data.
   *
   * @param index index number of the simulated addressible LED
   * @param callback the callback that will be called whenever the LED data is changed
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerDataCallback(int index, ConstBufferCallback callback);

  /**
   * Unregister a callback on the LED data.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   *
   * @param index index number of the simulated device
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelDataCallback(int index, int uid);

  /**
   * Get the LED data.
   *
   * @param index index number of the simulated addressible LED
   * @return the LED data
   */
  public static native byte[] getData(int index);

  /**
   * Change the LED data.
   *
   * @param index index number of the simulated addressible LED
   * @param data the new data
   */
  public static native void setData(int index, byte[] data);

  /**
   * Reset all simulation data for a simulated addressible LED.
   *
   * @param index index number of the simulated addressible LED
   */
  public static native void resetData(int index);

  /**
   * Finds the index number for a simulated addressible LED associated with a PWM channel.
   *
   * @param channel the PWM channel
   * @return The index number. Negative if no device found.
   */
  public static native int findForChannel(int channel);
}
