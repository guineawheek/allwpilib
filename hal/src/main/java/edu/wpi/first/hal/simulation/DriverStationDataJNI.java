// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.JNIWrapper;

/**
 * Simulated driver station data HAL JNI methods.
 * 
 * @see "hal/simulation/DriverStationData.h"
 */
public class DriverStationDataJNI extends JNIWrapper {
  /**
   * Register a callback on whether the DS is enabled.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerEnabledCallback(NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether the DS is enabled.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelEnabledCallback(int uid);

  /**
   * Check if the DS is enabled.
   * 
   * @return true ifenabled
   */
  public static native boolean getEnabled();

  /**
   * Change whether the DS is enabled.
   * 
   * @param enabled the new value
   */
  public static native void setEnabled(boolean enabled);

  /**
   * Register a callback on whether the DS is in autonomous mode.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAutonomousCallback(
      NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether the DS is in autonomous mode.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAutonomousCallback(int uid);

  /**
   * Check if the DS is in autonomous.
   * 
   * @return true if in autonomous
   */
  public static native boolean getAutonomous();

  /**
   * Change if the DS is in autonomous.
   * 
   * @param autonomous the new value
   */
  public static native void setAutonomous(boolean autonomous);

  /**
   * Register a callback on whether the DS is in test mode.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerTestCallback(NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether the DS is in test mode.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelTestCallback(int uid);

  /**
   * Check if the DS is in test.
   * 
   * @return true if in test
   */
  public static native boolean getTest();

  /**
   * Change whether the DS is in test.
   * 
   * @param test the new value
   */
  public static native void setTest(boolean test);

  /**
   * Register a callback on the emergency stop state.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerEStopCallback(NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the emergency stop state.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelEStopCallback(int uid);

  /**
   * Check if emergency stop is active.
   * 
   * @return true if emergency stopped
   */
  public static native boolean getEStop();

  /**
   * Change if emergency stop is active.
   * 
   * @param eStop the new value
   */
  public static native void setEStop(boolean eStop);

  /**
   * Register a callback on whether the FMS is connected.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerFmsAttachedCallback(
      NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether the FMS is connected.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelFmsAttachedCallback(int uid);

  /**
   * Check if the FMS is connected.
   * 
   * @return true if FMS is connected
   */
  public static native boolean getFmsAttached();

  /**
   * Change if the FMS is connected.
   * 
   * @param fmsAttached the new value
   */
  public static native void setFmsAttached(boolean fmsAttached);

  /**
   * Register a callback on whether the DS is attached.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerDsAttachedCallback(
      NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on whether the DS is attached.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelDsAttachedCallback(int uid);

  /**
   * Check if the DS is attached.
   * 
   * @return true if attached
   */
  public static native boolean getDsAttached();

  /**
   * Change if the DS is attached.
   * 
   * @param dsAttached the new value
   */
  public static native void setDsAttached(boolean dsAttached);

  /**
   * Register a callback on the alliance station ID.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerAllianceStationIdCallback(
      NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the alliance station ID.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelAllianceStationIdCallback(int uid);

  /**
   * Get the alliance station ID index number.
   * 
   * @return the alliance station index number
   */
  public static native int getAllianceStationId();

  /**
   * Set the alliance station ID index number.
   * 
   * @param allianceStationId the new index number
   */
  public static native void setAllianceStationId(int allianceStationId);

  /**
   * Register a callback to be run on the match time.
   * 
   * @param callback the callback that will be called
   * @param initialNotify whether to run the callback on the initial value
   * @return the internal UID for a new CallbackStore
   */
  public static native int registerMatchTimeCallback(
      NotifyCallback callback, boolean initialNotify);

  /**
   * Unregister a callback on the match time.
   * Used with CallbackStore to automatically unregister a callback upon freeing resources.
   * 
   * @param uid the internal UID of the CallbackStore to cancel
   */
  public static native void cancelMatchTimeCallback(int uid);

  /**
   * Get the current value of the match timer.
   *
   * @return the current match time
   */
  public static native double getMatchTime();

  /**
   * Sets the match timer.
   *
   * @param matchTime the new match time
   */
  public static native void setMatchTime(double matchTime);

  /**
   * Set all joystick axes all at once.
   * 
   * @param joystickNum the joystick to set
   * @param axesArray array of axis data
   */
  public static native void setJoystickAxes(byte joystickNum, float[] axesArray);

  /**
   * Set all joystick POVs all at once.
   * 
   * @param joystickNum the joystick to set
   * @param povsArray array of POV data
   */
  public static native void setJoystickPOVs(byte joystickNum, short[] povsArray);

  /**
   * Set all joystick buttons all at once.
   * 
   * @param joystickNum the joystick to set
   * @param buttons buttons data bitfield
   * @param count number of buttons
   */
  public static native void setJoystickButtons(byte joystickNum, int buttons, int count);

  /**
   * Gets the joystick outputs.
   * 
   * @param stick the joystick number
   * @return the joystick outputs
   */
  public static native long getJoystickOutputs(int stick);

  /**
   * Gets the joystick rumble.
   * 
   * @param stick the joystick number
   * @param rumbleNum Rumbler to get (0=left, 1=right)
   * @return The joystick rumble value
   */
  public static native int getJoystickRumble(int stick, int rumbleNum);

  /**
   * Sets match info.
   * 
   * @param eventName Event name
   * @param gameSpecificMessage Game-specific message
   * @param matchNumber Match number
   * @param replayNumber Replay number
   * @param matchType Match type
   */
  public static native void setMatchInfo(
      String eventName,
      String gameSpecificMessage,
      int matchNumber,
      int replayNumber,
      int matchType);

  /**
   * Registers a callback for all events.
   * 
   * This does not return a UID for a CallbackStore, so the callback handle must be stored in a 
   * place where it will not be GCed.
   * 
   * @param callback the callback
   * @param initialNotify whether to run the callback on the initial value
   */
  public static native void registerAllCallbacks(NotifyCallback callback, boolean initialNotify);

  /**
   * Updates DriverStation data so that new values are visible to the user program.
   */
  public static native void notifyNewData();

  /**
   * Sets suppression of DriverStation.reportError and reportWarning messages.
   * 
   * @param shouldSend if false then messages will be suppressed.
   */
  public static native void setSendError(boolean shouldSend);

  /**
   * Sets suppression of DriverStation.sendConsoleLIne messages.
   * 
   * @param shouldSend if false then messages will be suppressed.
   */
  public static native void setSendConsoleLine(boolean shouldSend);

  /**
   * Sets the state of one joystick button. Button indexes begin at 1.
   *
   * @param stick The joystick number
   * @param button The button index, beginning at 1
   * @param state The state of the joystick button
   */
  public static native void setJoystickButton(int stick, int button, boolean state);

  /**
   * Sets the value of the axis on a joystick.
   *
   * @param stick The joystick number
   * @param axis The analog axis number
   * @param value The value of the axis on the joystick
   */
  public static native void setJoystickAxis(int stick, int axis, double value);

  /**
   * Sets the state of a POV on a joystick.
   *
   * @param stick The joystick number
   * @param pov The POV number
   * @param value the angle of the POV in degrees, or -1 for not pressed
   */
  public static native void setJoystickPOV(int stick, int pov, int value);

  /**
   * Sets the state of all the buttons on a joystick.
   *
   * @param stick The joystick number
   * @param buttons The bitmap state of the buttons on the joystick
   */
  public static native void setJoystickButtonsValue(int stick, int buttons);

  /**
   * Sets the number of axes for a joystick.
   *
   * @param stick The joystick number
   * @param count The number of axes on the indicated joystick
   */
  public static native void setJoystickAxisCount(int stick, int count);

  /**
   * Sets the number of POVs for a joystick.
   *
   * @param stick The joystick number
   * @param count The number of POVs on the indicated joystick
   */
  public static native void setJoystickPOVCount(int stick, int count);

  /**
   * Sets the number of buttons for a joystick.
   *
   * @param stick The joystick number
   * @param count The number of buttons on the indicated joystick
   */
  public static native void setJoystickButtonCount(int stick, int count);

  /**
   * Sets the value of isXbox for a joystick.
   *
   * @param stick The joystick number
   * @param isXbox The value of isXbox
   */
  public static native void setJoystickIsXbox(int stick, boolean isXbox);

  /**
   * Sets the value of type for a joystick.
   *
   * @param stick The joystick number
   * @param type The value of type
   */
  public static native void setJoystickType(int stick, int type);

  /**
   * Sets the name of a joystick.
   *
   * @param stick The joystick number
   * @param name The value of name
   */
  public static native void setJoystickName(int stick, String name);

  /**
   * Sets the types of Axes for a joystick.
   *
   * @param stick The joystick number
   * @param axis The target axis
   * @param type The type of axis
   */
  public static native void setJoystickAxisType(int stick, int axis, int type);

  /**
   * Sets the game specific message.
   *
   * @param message the game specific message
   */
  public static native void setGameSpecificMessage(String message);

  /**
   * Sets the event name.
   *
   * @param name the event name
   */
  public static native void setEventName(String name);

  /**
   * Sets the match type.
   *
   * @param type the match type index (None=0, Practice=1, Quals=2, Elims=3)
   */
  public static native void setMatchType(int type);

  /**
   * Sets the match number.
   *
   * @param matchNumber the match number
   */
  public static native void setMatchNumber(int matchNumber);

  /**
   * Sets the replay number.
   *
   * @param replayNumber the replay number
   */
  public static native void setReplayNumber(int replayNumber);

  /** Reset all simulation data for the DS.  */
  public static native void resetData();
}
