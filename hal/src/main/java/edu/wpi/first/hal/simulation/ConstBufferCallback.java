// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

/**
 * Functional interface representing a callback that takes an immutable buffer.
 * 
 * This is typically associated with data being written through SPI/I2C/CAN simulation.
 */
public interface ConstBufferCallback {
  /**
   * The callback function itself.
   * 
   * @param name a string associated with the trigger of the callback.
   *     The source of these names typically derives from a C++ function passed into the 
   *     <code>SimCallbackRegistry</code> template parameters as its "get name" function.
   *     The name functions themselves are typically defined via the 
   *     <code>HAL_SIMCALLBACKREGISTRY_DEFINE_NAME</code> macro.
   * @param buffer bytes associated with the callback event.
   *     This buffer should be considered immutable -- mutations made during the callback will not
   *     affect anything outside the callback itself.
   * @param count The length of the buffer.
   */
  void callback(String name, byte[] buffer, int count);
}
