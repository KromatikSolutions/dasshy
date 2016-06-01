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
public class TPolicyList implements org.apache.thrift.TBase<TPolicyList, TPolicyList._Fields>, java.io.Serializable, Cloneable, Comparable<TPolicyList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPolicyList");

  private static final org.apache.thrift.protocol.TField POLICIES_FIELD_DESC = new org.apache.thrift.protocol.TField("policies", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPolicyListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPolicyListTupleSchemeFactory());
  }

  private List<TPolicy> policies; // required
  private int offset; // optional
  private int limit; // optional
  private int total; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POLICIES((short)1, "policies"),
    OFFSET((short)2, "offset"),
    LIMIT((short)3, "limit"),
    TOTAL((short)4, "total");

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
        case 1: // POLICIES
          return POLICIES;
        case 2: // OFFSET
          return OFFSET;
        case 3: // LIMIT
          return LIMIT;
        case 4: // TOTAL
          return TOTAL;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private static final int __LIMIT_ISSET_ID = 1;
  private static final int __TOTAL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OFFSET,_Fields.LIMIT,_Fields.TOTAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POLICIES, new org.apache.thrift.meta_data.FieldMetaData("policies", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPolicy.class))));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPolicyList.class, metaDataMap);
  }

  public TPolicyList() {
  }

  public TPolicyList(
    List<TPolicy> policies)
  {
    this();
    this.policies = policies;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPolicyList(TPolicyList other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPolicies()) {
      List<TPolicy> __this__policies = new ArrayList<TPolicy>(other.policies.size());
      for (TPolicy other_element : other.policies) {
        __this__policies.add(new TPolicy(other_element));
      }
      this.policies = __this__policies;
    }
    this.offset = other.offset;
    this.limit = other.limit;
    this.total = other.total;
  }

  public TPolicyList deepCopy() {
    return new TPolicyList(this);
  }

  @Override
  public void clear() {
    this.policies = null;
    setOffsetIsSet(false);
    this.offset = 0;
    setLimitIsSet(false);
    this.limit = 0;
    setTotalIsSet(false);
    this.total = 0;
  }

  public int getPoliciesSize() {
    return (this.policies == null) ? 0 : this.policies.size();
  }

  public java.util.Iterator<TPolicy> getPoliciesIterator() {
    return (this.policies == null) ? null : this.policies.iterator();
  }

  public void addToPolicies(TPolicy elem) {
    if (this.policies == null) {
      this.policies = new ArrayList<TPolicy>();
    }
    this.policies.add(elem);
  }

  public List<TPolicy> getPolicies() {
    return this.policies;
  }

  public void setPolicies(List<TPolicy> policies) {
    this.policies = policies;
  }

  public void unsetPolicies() {
    this.policies = null;
  }

  /** Returns true if field policies is set (has been assigned a value) and false otherwise */
  public boolean isSetPolicies() {
    return this.policies != null;
  }

  public void setPoliciesIsSet(boolean value) {
    if (!value) {
      this.policies = null;
    }
  }

  public int getOffset() {
    return this.offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
    setOffsetIsSet(true);
  }

  public void unsetOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public int getLimit() {
    return this.limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
  }

  public void unsetLimit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  public int getTotal() {
    return this.total;
  }

  public void setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
  }

  public void unsetTotal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POLICIES:
      if (value == null) {
        unsetPolicies();
      } else {
        setPolicies((List<TPolicy>)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((Integer)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((Integer)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POLICIES:
      return getPolicies();

    case OFFSET:
      return getOffset();

    case LIMIT:
      return getLimit();

    case TOTAL:
      return getTotal();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POLICIES:
      return isSetPolicies();
    case OFFSET:
      return isSetOffset();
    case LIMIT:
      return isSetLimit();
    case TOTAL:
      return isSetTotal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPolicyList)
      return this.equals((TPolicyList)that);
    return false;
  }

  public boolean equals(TPolicyList that) {
    if (that == null)
      return false;

    boolean this_present_policies = true && this.isSetPolicies();
    boolean that_present_policies = true && that.isSetPolicies();
    if (this_present_policies || that_present_policies) {
      if (!(this_present_policies && that_present_policies))
        return false;
      if (!this.policies.equals(that.policies))
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    boolean this_present_total = true && this.isSetTotal();
    boolean that_present_total = true && that.isSetTotal();
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_policies = true && (isSetPolicies());
    list.add(present_policies);
    if (present_policies)
      list.add(policies);

    boolean present_offset = true && (isSetOffset());
    list.add(present_offset);
    if (present_offset)
      list.add(offset);

    boolean present_limit = true && (isSetLimit());
    list.add(present_limit);
    if (present_limit)
      list.add(limit);

    boolean present_total = true && (isSetTotal());
    list.add(present_total);
    if (present_total)
      list.add(total);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPolicyList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPolicies()).compareTo(other.isSetPolicies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPolicies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.policies, other.policies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(other.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, other.total);
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
    StringBuilder sb = new StringBuilder("TPolicyList(");
    boolean first = true;

    sb.append("policies:");
    if (this.policies == null) {
      sb.append("null");
    } else {
      sb.append(this.policies);
    }
    first = false;
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
      first = false;
    }
    if (isSetTotal()) {
      if (!first) sb.append(", ");
      sb.append("total:");
      sb.append(this.total);
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

  private static class TPolicyListStandardSchemeFactory implements SchemeFactory {
    public TPolicyListStandardScheme getScheme() {
      return new TPolicyListStandardScheme();
    }
  }

  private static class TPolicyListStandardScheme extends StandardScheme<TPolicyList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPolicyList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POLICIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.policies = new ArrayList<TPolicy>(_list18.size);
                TPolicy _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = new TPolicy();
                  _elem19.read(iprot);
                  struct.policies.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setPoliciesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.offset = iprot.readI32();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limit = iprot.readI32();
              struct.setLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = iprot.readI32();
              struct.setTotalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPolicyList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.policies != null) {
        oprot.writeFieldBegin(POLICIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.policies.size()));
          for (TPolicy _iter21 : struct.policies)
          {
            _iter21.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI32(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI32(struct.limit);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotal()) {
        oprot.writeFieldBegin(TOTAL_FIELD_DESC);
        oprot.writeI32(struct.total);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPolicyListTupleSchemeFactory implements SchemeFactory {
    public TPolicyListTupleScheme getScheme() {
      return new TPolicyListTupleScheme();
    }
  }

  private static class TPolicyListTupleScheme extends TupleScheme<TPolicyList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPolicyList struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPolicies()) {
        optionals.set(0);
      }
      if (struct.isSetOffset()) {
        optionals.set(1);
      }
      if (struct.isSetLimit()) {
        optionals.set(2);
      }
      if (struct.isSetTotal()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPolicies()) {
        {
          oprot.writeI32(struct.policies.size());
          for (TPolicy _iter22 : struct.policies)
          {
            _iter22.write(oprot);
          }
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeI32(struct.offset);
      }
      if (struct.isSetLimit()) {
        oprot.writeI32(struct.limit);
      }
      if (struct.isSetTotal()) {
        oprot.writeI32(struct.total);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPolicyList struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.policies = new ArrayList<TPolicy>(_list23.size);
          TPolicy _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = new TPolicy();
            _elem24.read(iprot);
            struct.policies.add(_elem24);
          }
        }
        struct.setPoliciesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.offset = iprot.readI32();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.limit = iprot.readI32();
        struct.setLimitIsSet(true);
      }
      if (incoming.get(3)) {
        struct.total = iprot.readI32();
        struct.setTotalIsSet(true);
      }
    }
  }

}

