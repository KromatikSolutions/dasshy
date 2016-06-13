/**
 * Dasshy - Real time and Batch Analytics Open Source System
 * Copyright (C) 2016 Kromatik Solutions (http://kromatiksolutions.com)
 *
 * This file is part of Dasshy
 *
 * Dasshy is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Dasshy is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Dasshy.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.kromatik.dasshy.thrift.model;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-13")
public class TStreamingBatchClock implements org.apache.thrift.TBase<TStreamingBatchClock, TStreamingBatchClock._Fields>, java.io.Serializable, Cloneable, Comparable<TStreamingBatchClock> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStreamingBatchClock");

  private static final org.apache.thrift.protocol.TField INTERVAL_FIELD_DESC = new org.apache.thrift.protocol.TField("interval", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TStreamingBatchClockStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TStreamingBatchClockTupleSchemeFactory());
  }

  private long interval; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTERVAL((short)1, "interval");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INTERVAL
          return INTERVAL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __INTERVAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTERVAL, new org.apache.thrift.meta_data.FieldMetaData("interval", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStreamingBatchClock.class, metaDataMap);
  }

  public TStreamingBatchClock() {
  }

  public TStreamingBatchClock(
    long interval)
  {
    this();
    this.interval = interval;
    setIntervalIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStreamingBatchClock(TStreamingBatchClock other) {
    __isset_bitfield = other.__isset_bitfield;
    this.interval = other.interval;
  }

  public TStreamingBatchClock deepCopy() {
    return new TStreamingBatchClock(this);
  }

  @Override
  public void clear() {
    setIntervalIsSet(false);
    this.interval = 0;
  }

  public long getInterval() {
    return this.interval;
  }

  public void setInterval(long interval) {
    this.interval = interval;
    setIntervalIsSet(true);
  }

  public void unsetInterval() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INTERVAL_ISSET_ID);
  }

  /** Returns true if field interval is set (has been assigned a value) and false otherwise */
  public boolean isSetInterval() {
    return EncodingUtils.testBit(__isset_bitfield, __INTERVAL_ISSET_ID);
  }

  public void setIntervalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INTERVAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INTERVAL:
      if (value == null) {
        unsetInterval();
      } else {
        setInterval((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INTERVAL:
      return getInterval();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INTERVAL:
      return isSetInterval();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TStreamingBatchClock)
      return this.equals((TStreamingBatchClock)that);
    return false;
  }

  public boolean equals(TStreamingBatchClock that) {
    if (that == null)
      return false;

    boolean this_present_interval = true;
    boolean that_present_interval = true;
    if (this_present_interval || that_present_interval) {
      if (!(this_present_interval && that_present_interval))
        return false;
      if (this.interval != that.interval)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_interval = true;
    list.add(present_interval);
    if (present_interval)
      list.add(interval);

    return list.hashCode();
  }

  @Override
  public int compareTo(TStreamingBatchClock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetInterval()).compareTo(other.isSetInterval());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterval()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interval, other.interval);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TStreamingBatchClock(");
    boolean first = true;

    sb.append("interval:");
    sb.append(this.interval);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetInterval()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'interval' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TStreamingBatchClockStandardSchemeFactory implements SchemeFactory {
    public TStreamingBatchClockStandardScheme getScheme() {
      return new TStreamingBatchClockStandardScheme();
    }
  }

  private static class TStreamingBatchClockStandardScheme extends StandardScheme<TStreamingBatchClock> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TStreamingBatchClock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTERVAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.interval = iprot.readI64();
              struct.setIntervalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TStreamingBatchClock struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INTERVAL_FIELD_DESC);
      oprot.writeI64(struct.interval);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStreamingBatchClockTupleSchemeFactory implements SchemeFactory {
    public TStreamingBatchClockTupleScheme getScheme() {
      return new TStreamingBatchClockTupleScheme();
    }
  }

  private static class TStreamingBatchClockTupleScheme extends TupleScheme<TStreamingBatchClock> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStreamingBatchClock struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.interval);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStreamingBatchClock struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.interval = iprot.readI64();
      struct.setIntervalIsSet(true);
    }
  }

}
