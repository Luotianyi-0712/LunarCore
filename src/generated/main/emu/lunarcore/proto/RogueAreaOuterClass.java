// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class RogueAreaOuterClass {
  /**
   * Protobuf type {@code RogueArea}
   */
  public static final class RogueArea extends ProtoMessage<RogueArea> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 area_id = 4;</code>
     */
    private int areaId;

    /**
     * <code>optional uint32 cur_reach_room_num = 10;</code>
     */
    private int curReachRoomNum;

    /**
     * <code>optional uint32 map_id = 13;</code>
     */
    private int mapId;

    /**
     * <code>optional .RogueAreaStatus rogue_area_status = 6;</code>
     */
    private int rogueAreaStatus;

    /**
     * <code>optional .RogueStatus rogue_status = 9;</code>
     */
    private int rogueStatus;

    /**
     * <code>optional bool is_reward_taken = 7;</code>
     */
    private boolean isRewardTaken;

    private RogueArea() {
    }

    /**
     * @return a new empty instance of {@code RogueArea}
     */
    public static RogueArea newInstance() {
      return new RogueArea();
    }

    /**
     * <code>optional uint32 area_id = 4;</code>
     * @return whether the areaId field is set
     */
    public boolean hasAreaId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 area_id = 4;</code>
     * @return this
     */
    public RogueArea clearAreaId() {
      bitField0_ &= ~0x00000001;
      areaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 area_id = 4;</code>
     * @return the areaId
     */
    public int getAreaId() {
      return areaId;
    }

    /**
     * <code>optional uint32 area_id = 4;</code>
     * @param value the areaId to set
     * @return this
     */
    public RogueArea setAreaId(final int value) {
      bitField0_ |= 0x00000001;
      areaId = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_reach_room_num = 10;</code>
     * @return whether the curReachRoomNum field is set
     */
    public boolean hasCurReachRoomNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cur_reach_room_num = 10;</code>
     * @return this
     */
    public RogueArea clearCurReachRoomNum() {
      bitField0_ &= ~0x00000002;
      curReachRoomNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_reach_room_num = 10;</code>
     * @return the curReachRoomNum
     */
    public int getCurReachRoomNum() {
      return curReachRoomNum;
    }

    /**
     * <code>optional uint32 cur_reach_room_num = 10;</code>
     * @param value the curReachRoomNum to set
     * @return this
     */
    public RogueArea setCurReachRoomNum(final int value) {
      bitField0_ |= 0x00000002;
      curReachRoomNum = value;
      return this;
    }

    /**
     * <code>optional uint32 map_id = 13;</code>
     * @return whether the mapId field is set
     */
    public boolean hasMapId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 map_id = 13;</code>
     * @return this
     */
    public RogueArea clearMapId() {
      bitField0_ &= ~0x00000004;
      mapId = 0;
      return this;
    }

    /**
     * <code>optional uint32 map_id = 13;</code>
     * @return the mapId
     */
    public int getMapId() {
      return mapId;
    }

    /**
     * <code>optional uint32 map_id = 13;</code>
     * @param value the mapId to set
     * @return this
     */
    public RogueArea setMapId(final int value) {
      bitField0_ |= 0x00000004;
      mapId = value;
      return this;
    }

    /**
     * <code>optional .RogueAreaStatus rogue_area_status = 6;</code>
     * @return whether the rogueAreaStatus field is set
     */
    public boolean hasRogueAreaStatus() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueAreaStatus rogue_area_status = 6;</code>
     * @return this
     */
    public RogueArea clearRogueAreaStatus() {
      bitField0_ &= ~0x00000008;
      rogueAreaStatus = 0;
      return this;
    }

    /**
     * <code>optional .RogueAreaStatus rogue_area_status = 6;</code>
     * @return the rogueAreaStatus
     */
    public RogueAreaStatusOuterClass.RogueAreaStatus getRogueAreaStatus() {
      return RogueAreaStatusOuterClass.RogueAreaStatus.forNumber(rogueAreaStatus);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RogueArea#getRogueAreaStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getRogueAreaStatusValue() {
      return rogueAreaStatus;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link RogueAreaStatusOuterClass.RogueAreaStatus}. Setting an invalid value
     * can cause {@link RogueArea#getRogueAreaStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RogueArea setRogueAreaStatusValue(final int value) {
      bitField0_ |= 0x00000008;
      rogueAreaStatus = value;
      return this;
    }

    /**
     * <code>optional .RogueAreaStatus rogue_area_status = 6;</code>
     * @param value the rogueAreaStatus to set
     * @return this
     */
    public RogueArea setRogueAreaStatus(final RogueAreaStatusOuterClass.RogueAreaStatus value) {
      bitField0_ |= 0x00000008;
      rogueAreaStatus = value.getNumber();
      return this;
    }

    /**
     * <code>optional .RogueStatus rogue_status = 9;</code>
     * @return whether the rogueStatus field is set
     */
    public boolean hasRogueStatus() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueStatus rogue_status = 9;</code>
     * @return this
     */
    public RogueArea clearRogueStatus() {
      bitField0_ &= ~0x00000010;
      rogueStatus = 0;
      return this;
    }

    /**
     * <code>optional .RogueStatus rogue_status = 9;</code>
     * @return the rogueStatus
     */
    public RogueStatusOuterClass.RogueStatus getRogueStatus() {
      return RogueStatusOuterClass.RogueStatus.forNumber(rogueStatus);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RogueArea#getRogueStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getRogueStatusValue() {
      return rogueStatus;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link RogueStatusOuterClass.RogueStatus}. Setting an invalid value
     * can cause {@link RogueArea#getRogueStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RogueArea setRogueStatusValue(final int value) {
      bitField0_ |= 0x00000010;
      rogueStatus = value;
      return this;
    }

    /**
     * <code>optional .RogueStatus rogue_status = 9;</code>
     * @param value the rogueStatus to set
     * @return this
     */
    public RogueArea setRogueStatus(final RogueStatusOuterClass.RogueStatus value) {
      bitField0_ |= 0x00000010;
      rogueStatus = value.getNumber();
      return this;
    }

    /**
     * <code>optional bool is_reward_taken = 7;</code>
     * @return whether the isRewardTaken field is set
     */
    public boolean hasIsRewardTaken() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional bool is_reward_taken = 7;</code>
     * @return this
     */
    public RogueArea clearIsRewardTaken() {
      bitField0_ &= ~0x00000020;
      isRewardTaken = false;
      return this;
    }

    /**
     * <code>optional bool is_reward_taken = 7;</code>
     * @return the isRewardTaken
     */
    public boolean getIsRewardTaken() {
      return isRewardTaken;
    }

    /**
     * <code>optional bool is_reward_taken = 7;</code>
     * @param value the isRewardTaken to set
     * @return this
     */
    public RogueArea setIsRewardTaken(final boolean value) {
      bitField0_ |= 0x00000020;
      isRewardTaken = value;
      return this;
    }

    @Override
    public RogueArea copyFrom(final RogueArea other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        areaId = other.areaId;
        curReachRoomNum = other.curReachRoomNum;
        mapId = other.mapId;
        rogueAreaStatus = other.rogueAreaStatus;
        rogueStatus = other.rogueStatus;
        isRewardTaken = other.isRewardTaken;
      }
      return this;
    }

    @Override
    public RogueArea mergeFrom(final RogueArea other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAreaId()) {
        setAreaId(other.areaId);
      }
      if (other.hasCurReachRoomNum()) {
        setCurReachRoomNum(other.curReachRoomNum);
      }
      if (other.hasMapId()) {
        setMapId(other.mapId);
      }
      if (other.hasRogueAreaStatus()) {
        setRogueAreaStatusValue(other.rogueAreaStatus);
      }
      if (other.hasRogueStatus()) {
        setRogueStatusValue(other.rogueStatus);
      }
      if (other.hasIsRewardTaken()) {
        setIsRewardTaken(other.isRewardTaken);
      }
      return this;
    }

    @Override
    public RogueArea clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      areaId = 0;
      curReachRoomNum = 0;
      mapId = 0;
      rogueAreaStatus = 0;
      rogueStatus = 0;
      isRewardTaken = false;
      return this;
    }

    @Override
    public RogueArea clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueArea)) {
        return false;
      }
      RogueArea other = (RogueArea) o;
      return bitField0_ == other.bitField0_
        && (!hasAreaId() || areaId == other.areaId)
        && (!hasCurReachRoomNum() || curReachRoomNum == other.curReachRoomNum)
        && (!hasMapId() || mapId == other.mapId)
        && (!hasRogueAreaStatus() || rogueAreaStatus == other.rogueAreaStatus)
        && (!hasRogueStatus() || rogueStatus == other.rogueStatus)
        && (!hasIsRewardTaken() || isRewardTaken == other.isRewardTaken);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(curReachRoomNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(mapId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeEnumNoTag(rogueAreaStatus);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 72);
        output.writeEnumNoTag(rogueStatus);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 56);
        output.writeBoolNoTag(isRewardTaken);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curReachRoomNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mapId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(rogueAreaStatus);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(rogueStatus);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueArea mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // areaId
            areaId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // curReachRoomNum
            curReachRoomNum = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // mapId
            mapId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // rogueAreaStatus
            final int value = input.readInt32();
            if (RogueAreaStatusOuterClass.RogueAreaStatus.forNumber(value) != null) {
              rogueAreaStatus = value;
              bitField0_ |= 0x00000008;
            }
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // rogueStatus
            final int value = input.readInt32();
            if (RogueStatusOuterClass.RogueStatus.forNumber(value) != null) {
              rogueStatus = value;
              bitField0_ |= 0x00000010;
            }
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // isRewardTaken
            isRewardTaken = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.areaId, areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.curReachRoomNum, curReachRoomNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.mapId, mapId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeEnum(FieldNames.rogueAreaStatus, rogueAreaStatus, RogueAreaStatusOuterClass.RogueAreaStatus.converter());
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.rogueStatus, rogueStatus, RogueStatusOuterClass.RogueStatus.converter());
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.isRewardTaken, isRewardTaken);
      }
      output.endObject();
    }

    @Override
    public RogueArea mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1409553784:
          case -746472947: {
            if (input.isAtField(FieldNames.areaId)) {
              if (!input.trySkipNullValue()) {
                areaId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 888045080:
          case 328196941: {
            if (input.isAtField(FieldNames.curReachRoomNum)) {
              if (!input.trySkipNullValue()) {
                curReachRoomNum = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 103663511:
          case -1081377058: {
            if (input.isAtField(FieldNames.mapId)) {
              if (!input.trySkipNullValue()) {
                mapId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -731414439:
          case -1961715457: {
            if (input.isAtField(FieldNames.rogueAreaStatus)) {
              if (!input.trySkipNullValue()) {
                final RogueAreaStatusOuterClass.RogueAreaStatus value = input.readEnum(RogueAreaStatusOuterClass.RogueAreaStatus.converter());
                if (value != null) {
                  rogueAreaStatus = value.getNumber();
                  bitField0_ |= 0x00000008;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -836112788:
          case 1898767863: {
            if (input.isAtField(FieldNames.rogueStatus)) {
              if (!input.trySkipNullValue()) {
                final RogueStatusOuterClass.RogueStatus value = input.readEnum(RogueStatusOuterClass.RogueStatus.converter());
                if (value != null) {
                  rogueStatus = value.getNumber();
                  bitField0_ |= 0x00000010;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -522199218:
          case 1351172268: {
            if (input.isAtField(FieldNames.isRewardTaken)) {
              if (!input.trySkipNullValue()) {
                isRewardTaken = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueArea clone() {
      return new RogueArea().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueArea parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueArea(), data).checkInitialized();
    }

    public static RogueArea parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueArea(), input).checkInitialized();
    }

    public static RogueArea parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueArea(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueArea messages
     */
    public static MessageFactory<RogueArea> getFactory() {
      return RogueAreaFactory.INSTANCE;
    }

    private enum RogueAreaFactory implements MessageFactory<RogueArea> {
      INSTANCE;

      @Override
      public RogueArea create() {
        return RogueArea.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName areaId = FieldName.forField("areaId", "area_id");

      static final FieldName curReachRoomNum = FieldName.forField("curReachRoomNum", "cur_reach_room_num");

      static final FieldName mapId = FieldName.forField("mapId", "map_id");

      static final FieldName rogueAreaStatus = FieldName.forField("rogueAreaStatus", "rogue_area_status");

      static final FieldName rogueStatus = FieldName.forField("rogueStatus", "rogue_status");

      static final FieldName isRewardTaken = FieldName.forField("isRewardTaken", "is_reward_taken");
    }
  }
}
