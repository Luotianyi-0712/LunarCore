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
import us.hebi.quickbuf.RepeatedInt;

public final class RogueAeonInfoOuterClass {
  /**
   * Protobuf type {@code RogueAeonInfo}
   */
  public static final class RogueAeonInfo extends ProtoMessage<RogueAeonInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 unlock_aeon_enhance_num = 9;</code>
     */
    private int unlockAeonEnhanceNum;

    /**
     * <code>optional uint32 unlock_aeon_num = 10;</code>
     */
    private int unlockAeonNum;

    /**
     * <code>optional bool is_unlocked = 5;</code>
     */
    private boolean isUnlocked;

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     */
    private final RepeatedInt aeonIdList = RepeatedInt.newEmptyInstance();

    private RogueAeonInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueAeonInfo}
     */
    public static RogueAeonInfo newInstance() {
      return new RogueAeonInfo();
    }

    /**
     * <code>optional uint32 unlock_aeon_enhance_num = 9;</code>
     * @return whether the unlockAeonEnhanceNum field is set
     */
    public boolean hasUnlockAeonEnhanceNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 unlock_aeon_enhance_num = 9;</code>
     * @return this
     */
    public RogueAeonInfo clearUnlockAeonEnhanceNum() {
      bitField0_ &= ~0x00000001;
      unlockAeonEnhanceNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 unlock_aeon_enhance_num = 9;</code>
     * @return the unlockAeonEnhanceNum
     */
    public int getUnlockAeonEnhanceNum() {
      return unlockAeonEnhanceNum;
    }

    /**
     * <code>optional uint32 unlock_aeon_enhance_num = 9;</code>
     * @param value the unlockAeonEnhanceNum to set
     * @return this
     */
    public RogueAeonInfo setUnlockAeonEnhanceNum(final int value) {
      bitField0_ |= 0x00000001;
      unlockAeonEnhanceNum = value;
      return this;
    }

    /**
     * <code>optional uint32 unlock_aeon_num = 10;</code>
     * @return whether the unlockAeonNum field is set
     */
    public boolean hasUnlockAeonNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 unlock_aeon_num = 10;</code>
     * @return this
     */
    public RogueAeonInfo clearUnlockAeonNum() {
      bitField0_ &= ~0x00000002;
      unlockAeonNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 unlock_aeon_num = 10;</code>
     * @return the unlockAeonNum
     */
    public int getUnlockAeonNum() {
      return unlockAeonNum;
    }

    /**
     * <code>optional uint32 unlock_aeon_num = 10;</code>
     * @param value the unlockAeonNum to set
     * @return this
     */
    public RogueAeonInfo setUnlockAeonNum(final int value) {
      bitField0_ |= 0x00000002;
      unlockAeonNum = value;
      return this;
    }

    /**
     * <code>optional bool is_unlocked = 5;</code>
     * @return whether the isUnlocked field is set
     */
    public boolean hasIsUnlocked() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_unlocked = 5;</code>
     * @return this
     */
    public RogueAeonInfo clearIsUnlocked() {
      bitField0_ &= ~0x00000004;
      isUnlocked = false;
      return this;
    }

    /**
     * <code>optional bool is_unlocked = 5;</code>
     * @return the isUnlocked
     */
    public boolean getIsUnlocked() {
      return isUnlocked;
    }

    /**
     * <code>optional bool is_unlocked = 5;</code>
     * @param value the isUnlocked to set
     * @return this
     */
    public RogueAeonInfo setIsUnlocked(final boolean value) {
      bitField0_ |= 0x00000004;
      isUnlocked = value;
      return this;
    }

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     * @return whether the aeonIdList field is set
     */
    public boolean hasAeonIdList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     * @return this
     */
    public RogueAeonInfo clearAeonIdList() {
      bitField0_ &= ~0x00000008;
      aeonIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAeonIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getAeonIdList() {
      return aeonIdList;
    }

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableAeonIdList() {
      bitField0_ |= 0x00000008;
      return aeonIdList;
    }

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     * @param value the aeonIdList to add
     * @return this
     */
    public RogueAeonInfo addAeonIdList(final int value) {
      bitField0_ |= 0x00000008;
      aeonIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 aeon_id_list = 7;</code>
     * @param values the aeonIdList to add
     * @return this
     */
    public RogueAeonInfo addAllAeonIdList(final int... values) {
      bitField0_ |= 0x00000008;
      aeonIdList.addAll(values);
      return this;
    }

    @Override
    public RogueAeonInfo copyFrom(final RogueAeonInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        unlockAeonEnhanceNum = other.unlockAeonEnhanceNum;
        unlockAeonNum = other.unlockAeonNum;
        isUnlocked = other.isUnlocked;
        aeonIdList.copyFrom(other.aeonIdList);
      }
      return this;
    }

    @Override
    public RogueAeonInfo mergeFrom(final RogueAeonInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUnlockAeonEnhanceNum()) {
        setUnlockAeonEnhanceNum(other.unlockAeonEnhanceNum);
      }
      if (other.hasUnlockAeonNum()) {
        setUnlockAeonNum(other.unlockAeonNum);
      }
      if (other.hasIsUnlocked()) {
        setIsUnlocked(other.isUnlocked);
      }
      if (other.hasAeonIdList()) {
        getMutableAeonIdList().addAll(other.aeonIdList);
      }
      return this;
    }

    @Override
    public RogueAeonInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockAeonEnhanceNum = 0;
      unlockAeonNum = 0;
      isUnlocked = false;
      aeonIdList.clear();
      return this;
    }

    @Override
    public RogueAeonInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      aeonIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueAeonInfo)) {
        return false;
      }
      RogueAeonInfo other = (RogueAeonInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasUnlockAeonEnhanceNum() || unlockAeonEnhanceNum == other.unlockAeonEnhanceNum)
        && (!hasUnlockAeonNum() || unlockAeonNum == other.unlockAeonNum)
        && (!hasIsUnlocked() || isUnlocked == other.isUnlocked)
        && (!hasAeonIdList() || aeonIdList.equals(other.aeonIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(unlockAeonEnhanceNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(unlockAeonNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isUnlocked);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < aeonIdList.length(); i++) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(aeonIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unlockAeonEnhanceNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unlockAeonNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * aeonIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(aeonIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueAeonInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // unlockAeonEnhanceNum
            unlockAeonEnhanceNum = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // unlockAeonNum
            unlockAeonNum = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isUnlocked
            isUnlocked = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // aeonIdList [packed=true]
            input.readPackedUInt32(aeonIdList, tag);
            bitField0_ |= 0x00000008;
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
          case 56: {
            // aeonIdList [packed=false]
            tag = input.readRepeatedUInt32(aeonIdList, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.unlockAeonEnhanceNum, unlockAeonEnhanceNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.unlockAeonNum, unlockAeonNum);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isUnlocked, isUnlocked);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.aeonIdList, aeonIdList);
      }
      output.endObject();
    }

    @Override
    public RogueAeonInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1040991167:
          case 7773396: {
            if (input.isAtField(FieldNames.unlockAeonEnhanceNum)) {
              if (!input.trySkipNullValue()) {
                unlockAeonEnhanceNum = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -281209953:
          case -952729371: {
            if (input.isAtField(FieldNames.unlockAeonNum)) {
              if (!input.trySkipNullValue()) {
                unlockAeonNum = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1004219859:
          case -945979816: {
            if (input.isAtField(FieldNames.isUnlocked)) {
              if (!input.trySkipNullValue()) {
                isUnlocked = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1452976956:
          case 953805318: {
            if (input.isAtField(FieldNames.aeonIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(aeonIdList);
                bitField0_ |= 0x00000008;
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
    public RogueAeonInfo clone() {
      return new RogueAeonInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueAeonInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueAeonInfo(), data).checkInitialized();
    }

    public static RogueAeonInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueAeonInfo(), input).checkInitialized();
    }

    public static RogueAeonInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueAeonInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueAeonInfo messages
     */
    public static MessageFactory<RogueAeonInfo> getFactory() {
      return RogueAeonInfoFactory.INSTANCE;
    }

    private enum RogueAeonInfoFactory implements MessageFactory<RogueAeonInfo> {
      INSTANCE;

      @Override
      public RogueAeonInfo create() {
        return RogueAeonInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName unlockAeonEnhanceNum = FieldName.forField("unlockAeonEnhanceNum", "unlock_aeon_enhance_num");

      static final FieldName unlockAeonNum = FieldName.forField("unlockAeonNum", "unlock_aeon_num");

      static final FieldName isUnlocked = FieldName.forField("isUnlocked", "is_unlocked");

      static final FieldName aeonIdList = FieldName.forField("aeonIdList", "aeon_id_list");
    }
  }
}
