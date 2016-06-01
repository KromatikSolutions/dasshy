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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-30")
public class TError implements org.apache.thrift.TBase<TError, TError._Fields>, java.io.Serializable, Cloneable, Comparable<TError> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TError");

  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CODE_EXTENDED_FIELD_DESC = new org.apache.thrift.protocol.TField("codeExtended", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_DETAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("errorDetails", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField DEBUG_FIELD_DESC = new org.apache.thrift.protocol.TField("debug", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TErrorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TErrorTupleSchemeFactory());
  }

  private String message; // required
  private int code; // optional
  private String codeExtended; // optional
  private List<TErrorDetail> errorDetails; // optional
  private String debug; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE((short)1, "message"),
    CODE((short)2, "code"),
    CODE_EXTENDED((short)3, "codeExtended"),
    ERROR_DETAILS((short)4, "errorDetails"),
    DEBUG((short)5, "debug");

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
        case 1: // MESSAGE
          return MESSAGE;
        case 2: // CODE
          return CODE;
        case 3: // CODE_EXTENDED
          return CODE_EXTENDED;
        case 4: // ERROR_DETAILS
          return ERROR_DETAILS;
        case 5: // DEBUG
          return DEBUG;
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
  private static final int __CODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CODE,_Fields.CODE_EXTENDED,_Fields.ERROR_DETAILS,_Fields.DEBUG};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CODE_EXTENDED, new org.apache.thrift.meta_data.FieldMetaData("codeExtended", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_DETAILS, new org.apache.thrift.meta_data.FieldMetaData("errorDetails", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TErrorDetail.class))));
    tmpMap.put(_Fields.DEBUG, new org.apache.thrift.meta_data.FieldMetaData("debug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TError.class, metaDataMap);
  }

  public TError() {
  }

  public TError(
    String message)
  {
    this();
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TError(TError other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    this.code = other.code;
    if (other.isSetCodeExtended()) {
      this.codeExtended = other.codeExtended;
    }
    if (other.isSetErrorDetails()) {
      List<TErrorDetail> __this__errorDetails = new ArrayList<TErrorDetail>(other.errorDetails.size());
      for (TErrorDetail other_element : other.errorDetails) {
        __this__errorDetails.add(new TErrorDetail(other_element));
      }
      this.errorDetails = __this__errorDetails;
    }
    if (other.isSetDebug()) {
      this.debug = other.debug;
    }
  }

  public TError deepCopy() {
    return new TError(this);
  }

  @Override
  public void clear() {
    this.message = null;
    setCodeIsSet(false);
    this.code = 0;
    this.codeExtended = null;
    this.errorDetails = null;
    this.debug = null;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public int getCode() {
    return this.code;
  }

  public void setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
  }

  public void unsetCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  public String getCodeExtended() {
    return this.codeExtended;
  }

  public void setCodeExtended(String codeExtended) {
    this.codeExtended = codeExtended;
  }

  public void unsetCodeExtended() {
    this.codeExtended = null;
  }

  /** Returns true if field codeExtended is set (has been assigned a value) and false otherwise */
  public boolean isSetCodeExtended() {
    return this.codeExtended != null;
  }

  public void setCodeExtendedIsSet(boolean value) {
    if (!value) {
      this.codeExtended = null;
    }
  }

  public int getErrorDetailsSize() {
    return (this.errorDetails == null) ? 0 : this.errorDetails.size();
  }

  public java.util.Iterator<TErrorDetail> getErrorDetailsIterator() {
    return (this.errorDetails == null) ? null : this.errorDetails.iterator();
  }

  public void addToErrorDetails(TErrorDetail elem) {
    if (this.errorDetails == null) {
      this.errorDetails = new ArrayList<TErrorDetail>();
    }
    this.errorDetails.add(elem);
  }

  public List<TErrorDetail> getErrorDetails() {
    return this.errorDetails;
  }

  public void setErrorDetails(List<TErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
  }

  public void unsetErrorDetails() {
    this.errorDetails = null;
  }

  /** Returns true if field errorDetails is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorDetails() {
    return this.errorDetails != null;
  }

  public void setErrorDetailsIsSet(boolean value) {
    if (!value) {
      this.errorDetails = null;
    }
  }

  public String getDebug() {
    return this.debug;
  }

  public void setDebug(String debug) {
    this.debug = debug;
  }

  public void unsetDebug() {
    this.debug = null;
  }

  /** Returns true if field debug is set (has been assigned a value) and false otherwise */
  public boolean isSetDebug() {
    return this.debug != null;
  }

  public void setDebugIsSet(boolean value) {
    if (!value) {
      this.debug = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Integer)value);
      }
      break;

    case CODE_EXTENDED:
      if (value == null) {
        unsetCodeExtended();
      } else {
        setCodeExtended((String)value);
      }
      break;

    case ERROR_DETAILS:
      if (value == null) {
        unsetErrorDetails();
      } else {
        setErrorDetails((List<TErrorDetail>)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unsetDebug();
      } else {
        setDebug((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE:
      return getMessage();

    case CODE:
      return getCode();

    case CODE_EXTENDED:
      return getCodeExtended();

    case ERROR_DETAILS:
      return getErrorDetails();

    case DEBUG:
      return getDebug();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE:
      return isSetMessage();
    case CODE:
      return isSetCode();
    case CODE_EXTENDED:
      return isSetCodeExtended();
    case ERROR_DETAILS:
      return isSetErrorDetails();
    case DEBUG:
      return isSetDebug();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TError)
      return this.equals((TError)that);
    return false;
  }

  public boolean equals(TError that) {
    if (that == null)
      return false;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_codeExtended = true && this.isSetCodeExtended();
    boolean that_present_codeExtended = true && that.isSetCodeExtended();
    if (this_present_codeExtended || that_present_codeExtended) {
      if (!(this_present_codeExtended && that_present_codeExtended))
        return false;
      if (!this.codeExtended.equals(that.codeExtended))
        return false;
    }

    boolean this_present_errorDetails = true && this.isSetErrorDetails();
    boolean that_present_errorDetails = true && that.isSetErrorDetails();
    if (this_present_errorDetails || that_present_errorDetails) {
      if (!(this_present_errorDetails && that_present_errorDetails))
        return false;
      if (!this.errorDetails.equals(that.errorDetails))
        return false;
    }

    boolean this_present_debug = true && this.isSetDebug();
    boolean that_present_debug = true && that.isSetDebug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (!this.debug.equals(that.debug))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_codeExtended = true && (isSetCodeExtended());
    list.add(present_codeExtended);
    if (present_codeExtended)
      list.add(codeExtended);

    boolean present_errorDetails = true && (isSetErrorDetails());
    list.add(present_errorDetails);
    if (present_errorDetails)
      list.add(errorDetails);

    boolean present_debug = true && (isSetDebug());
    list.add(present_debug);
    if (present_debug)
      list.add(debug);

    return list.hashCode();
  }

  @Override
  public int compareTo(TError other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCodeExtended()).compareTo(other.isSetCodeExtended());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodeExtended()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codeExtended, other.codeExtended);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorDetails()).compareTo(other.isSetErrorDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorDetails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorDetails, other.errorDetails);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDebug()).compareTo(other.isSetDebug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debug, other.debug);
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
    StringBuilder sb = new StringBuilder("TError(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (isSetCode()) {
      if (!first) sb.append(", ");
      sb.append("code:");
      sb.append(this.code);
      first = false;
    }
    if (isSetCodeExtended()) {
      if (!first) sb.append(", ");
      sb.append("codeExtended:");
      if (this.codeExtended == null) {
        sb.append("null");
      } else {
        sb.append(this.codeExtended);
      }
      first = false;
    }
    if (isSetErrorDetails()) {
      if (!first) sb.append(", ");
      sb.append("errorDetails:");
      if (this.errorDetails == null) {
        sb.append("null");
      } else {
        sb.append(this.errorDetails);
      }
      first = false;
    }
    if (isSetDebug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      if (this.debug == null) {
        sb.append("null");
      } else {
        sb.append(this.debug);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TErrorStandardSchemeFactory implements SchemeFactory {
    public TErrorStandardScheme getScheme() {
      return new TErrorStandardScheme();
    }
  }

  private static class TErrorStandardScheme extends StandardScheme<TError> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TError struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CODE_EXTENDED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.codeExtended = iprot.readString();
              struct.setCodeExtendedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_DETAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.errorDetails = new ArrayList<TErrorDetail>(_list0.size);
                TErrorDetail _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TErrorDetail();
                  _elem1.read(iprot);
                  struct.errorDetails.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setErrorDetailsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DEBUG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.debug = iprot.readString();
              struct.setDebugIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TError struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCode()) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeI32(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.codeExtended != null) {
        if (struct.isSetCodeExtended()) {
          oprot.writeFieldBegin(CODE_EXTENDED_FIELD_DESC);
          oprot.writeString(struct.codeExtended);
          oprot.writeFieldEnd();
        }
      }
      if (struct.errorDetails != null) {
        if (struct.isSetErrorDetails()) {
          oprot.writeFieldBegin(ERROR_DETAILS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.errorDetails.size()));
            for (TErrorDetail _iter3 : struct.errorDetails)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.debug != null) {
        if (struct.isSetDebug()) {
          oprot.writeFieldBegin(DEBUG_FIELD_DESC);
          oprot.writeString(struct.debug);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TErrorTupleSchemeFactory implements SchemeFactory {
    public TErrorTupleScheme getScheme() {
      return new TErrorTupleScheme();
    }
  }

  private static class TErrorTupleScheme extends TupleScheme<TError> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TError struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMessage()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetCodeExtended()) {
        optionals.set(2);
      }
      if (struct.isSetErrorDetails()) {
        optionals.set(3);
      }
      if (struct.isSetDebug()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code);
      }
      if (struct.isSetCodeExtended()) {
        oprot.writeString(struct.codeExtended);
      }
      if (struct.isSetErrorDetails()) {
        {
          oprot.writeI32(struct.errorDetails.size());
          for (TErrorDetail _iter4 : struct.errorDetails)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetDebug()) {
        oprot.writeString(struct.debug);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TError struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readI32();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.codeExtended = iprot.readString();
        struct.setCodeExtendedIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.errorDetails = new ArrayList<TErrorDetail>(_list5.size);
          TErrorDetail _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new TErrorDetail();
            _elem6.read(iprot);
            struct.errorDetails.add(_elem6);
          }
        }
        struct.setErrorDetailsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.debug = iprot.readString();
        struct.setDebugIsSet(true);
      }
    }
  }

}

