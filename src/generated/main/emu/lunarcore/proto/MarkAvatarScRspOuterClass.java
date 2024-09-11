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

public final class MarkAvatarScRspOuterClass {
  /**
   * Protobuf type {@code MarkAvatarScRsp}
   */
  public static final class MarkAvatarScRsp extends ProtoMessage<MarkAvatarScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 avatar_id = 5;</code>
     */
    private int avatarId;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional bool is_marked = 10;</code>
     */
    private boolean isMarked;

    private MarkAvatarScRsp() {
    }

    /**
     * @return a new empty instance of {@code MarkAvatarScRsp}
     */
    public static MarkAvatarScRsp newInstance() {
      return new MarkAvatarScRsp();
    }

    /**
     * <code>optional uint32 avatar_id = 5;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 5;</code>
     * @return this
     */
    public MarkAvatarScRsp clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 5;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 5;</code>
     * @param value the avatarId to set
     * @return this
     */
    public MarkAvatarScRsp setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public MarkAvatarScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public MarkAvatarScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool is_marked = 10;</code>
     * @return whether the isMarked field is set
     */
    public boolean hasIsMarked() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_marked = 10;</code>
     * @return this
     */
    public MarkAvatarScRsp clearIsMarked() {
      bitField0_ &= ~0x00000004;
      isMarked = false;
      return this;
    }

    /**
     * <code>optional bool is_marked = 10;</code>
     * @return the isMarked
     */
    public boolean getIsMarked() {
      return isMarked;
    }

    /**
     * <code>optional bool is_marked = 10;</code>
     * @param value the isMarked to set
     * @return this
     */
    public MarkAvatarScRsp setIsMarked(final boolean value) {
      bitField0_ |= 0x00000004;
      isMarked = value;
      return this;
    }

    @Override
    public MarkAvatarScRsp copyFrom(final MarkAvatarScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        retcode = other.retcode;
        isMarked = other.isMarked;
      }
      return this;
    }

    @Override
    public MarkAvatarScRsp mergeFrom(final MarkAvatarScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasIsMarked()) {
        setIsMarked(other.isMarked);
      }
      return this;
    }

    @Override
    public MarkAvatarScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      retcode = 0;
      isMarked = false;
      return this;
    }

    @Override
    public MarkAvatarScRsp clearQuick() {
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
      if (!(o instanceof MarkAvatarScRsp)) {
        return false;
      }
      MarkAvatarScRsp other = (MarkAvatarScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasIsMarked() || isMarked == other.isMarked);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeBoolNoTag(isMarked);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MarkAvatarScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // isMarked
            isMarked = input.readBool();
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isMarked, isMarked);
      }
      output.endObject();
    }

    @Override
    public MarkAvatarScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -407271946:
          case -617266975: {
            if (input.isAtField(FieldNames.isMarked)) {
              if (!input.trySkipNullValue()) {
                isMarked = input.readBool();
                bitField0_ |= 0x00000004;
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
    public MarkAvatarScRsp clone() {
      return new MarkAvatarScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MarkAvatarScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MarkAvatarScRsp(), data).checkInitialized();
    }

    public static MarkAvatarScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MarkAvatarScRsp(), input).checkInitialized();
    }

    public static MarkAvatarScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MarkAvatarScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating MarkAvatarScRsp messages
     */
    public static MessageFactory<MarkAvatarScRsp> getFactory() {
      return MarkAvatarScRspFactory.INSTANCE;
    }

    private enum MarkAvatarScRspFactory implements MessageFactory<MarkAvatarScRsp> {
      INSTANCE;

      @Override
      public MarkAvatarScRsp create() {
        return MarkAvatarScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName isMarked = FieldName.forField("isMarked", "is_marked");
    }
  }
}
