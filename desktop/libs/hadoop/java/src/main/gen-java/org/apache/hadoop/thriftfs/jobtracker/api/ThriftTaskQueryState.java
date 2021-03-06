/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.jobtracker.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * It corresponds to the (inferred) internal state of a TaskInProgress,
 * and not that of a TaskStatus.
 */
public enum ThriftTaskQueryState implements org.apache.thrift.TEnum {
  SUCCEEDED(0),
  FAILED(1),
  RUNNING(2),
  PENDING(3),
  KILLED(4);

  private final int value;

  private ThriftTaskQueryState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftTaskQueryState findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCEEDED;
      case 1:
        return FAILED;
      case 2:
        return RUNNING;
      case 3:
        return PENDING;
      case 4:
        return KILLED;
      default:
        return null;
    }
  }
}
