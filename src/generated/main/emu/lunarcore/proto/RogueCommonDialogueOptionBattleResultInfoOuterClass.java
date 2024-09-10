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

public final class RogueCommonDialogueOptionBattleResultInfoOuterClass {
  /**
   * Protobuf type {@code RogueCommonDialogueOptionBattleResultInfo}
   */
  public static final class RogueCommonDialogueOptionBattleResultInfo extends ProtoMessage<RogueCommonDialogueOptionBattleResultInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 battle_event_id = 8;</code>
     */
    private int battleEventId;

    private RogueCommonDialogueOptionBattleResultInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonDialogueOptionBattleResultInfo}
     */
    public static RogueCommonDialogueOptionBattleResultInfo newInstance() {
      return new RogueCommonDialogueOptionBattleResultInfo();
    }

    /**
     * <code>optional uint32 battle_event_id = 8;</code>
     * @return whether the battleEventId field is set
     */
    public boolean hasBattleEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 battle_event_id = 8;</code>
     * @return this
     */
    public RogueCommonDialogueOptionBattleResultInfo clearBattleEventId() {
      bitField0_ &= ~0x00000001;
      battleEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 battle_event_id = 8;</code>
     * @return the battleEventId
     */
    public int getBattleEventId() {
      return battleEventId;
    }

    /**
     * <code>optional uint32 battle_event_id = 8;</code>
     * @param value the battleEventId to set
     * @return this
     */
    public RogueCommonDialogueOptionBattleResultInfo setBattleEventId(final int value) {
      bitField0_ |= 0x00000001;
      battleEventId = value;
      return this;
    }

    @Override
    public RogueCommonDialogueOptionBattleResultInfo copyFrom(
        final RogueCommonDialogueOptionBattleResultInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        battleEventId = other.battleEventId;
      }
      return this;
    }

    @Override
    public RogueCommonDialogueOptionBattleResultInfo mergeFrom(
        final RogueCommonDialogueOptionBattleResultInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBattleEventId()) {
        setBattleEventId(other.battleEventId);
      }
      return this;
    }

    @Override
    public RogueCommonDialogueOptionBattleResultInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleEventId = 0;
      return this;
    }

    @Override
    public RogueCommonDialogueOptionBattleResultInfo clearQuick() {
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
      if (!(o instanceof RogueCommonDialogueOptionBattleResultInfo)) {
        return false;
      }
      RogueCommonDialogueOptionBattleResultInfo other = (RogueCommonDialogueOptionBattleResultInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBattleEventId() || battleEventId == other.battleEventId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(battleEventId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(battleEventId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonDialogueOptionBattleResultInfo mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // battleEventId
            battleEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.battleEventId, battleEventId);
      }
      output.endObject();
    }

    @Override
    public RogueCommonDialogueOptionBattleResultInfo mergeFrom(final JsonSource input) throws
        IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -79510147:
          case -766250873: {
            if (input.isAtField(FieldNames.battleEventId)) {
              if (!input.trySkipNullValue()) {
                battleEventId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public RogueCommonDialogueOptionBattleResultInfo clone() {
      return new RogueCommonDialogueOptionBattleResultInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonDialogueOptionBattleResultInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionBattleResultInfo(), data).checkInitialized();
    }

    public static RogueCommonDialogueOptionBattleResultInfo parseFrom(final ProtoSource input)
        throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionBattleResultInfo(), input).checkInitialized();
    }

    public static RogueCommonDialogueOptionBattleResultInfo parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionBattleResultInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonDialogueOptionBattleResultInfo messages
     */
    public static MessageFactory<RogueCommonDialogueOptionBattleResultInfo> getFactory() {
      return RogueCommonDialogueOptionBattleResultInfoFactory.INSTANCE;
    }

    private enum RogueCommonDialogueOptionBattleResultInfoFactory implements MessageFactory<RogueCommonDialogueOptionBattleResultInfo> {
      INSTANCE;

      @Override
      public RogueCommonDialogueOptionBattleResultInfo create() {
        return RogueCommonDialogueOptionBattleResultInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName battleEventId = FieldName.forField("battleEventId", "battle_event_id");
    }
  }
}
