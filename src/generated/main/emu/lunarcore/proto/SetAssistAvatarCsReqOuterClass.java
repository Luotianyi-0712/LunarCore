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

public final class SetAssistAvatarCsReqOuterClass {
  /**
   * Protobuf type {@code SetAssistAvatarCsReq}
   */
  public static final class SetAssistAvatarCsReq extends ProtoMessage<SetAssistAvatarCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 avatar_id = 10;</code>
     */
    private int avatarId;

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     */
    private final RepeatedInt avatarIdList = RepeatedInt.newEmptyInstance();

    private SetAssistAvatarCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetAssistAvatarCsReq}
     */
    public static SetAssistAvatarCsReq newInstance() {
      return new SetAssistAvatarCsReq();
    }

    /**
     * <code>optional uint32 avatar_id = 10;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 10;</code>
     * @return this
     */
    public SetAssistAvatarCsReq clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 10;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 10;</code>
     * @param value the avatarId to set
     * @return this
     */
    public SetAssistAvatarCsReq setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     * @return whether the avatarIdList field is set
     */
    public boolean hasAvatarIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     * @return this
     */
    public SetAssistAvatarCsReq clearAvatarIdList() {
      bitField0_ &= ~0x00000002;
      avatarIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getAvatarIdList() {
      return avatarIdList;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableAvatarIdList() {
      bitField0_ |= 0x00000002;
      return avatarIdList;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     * @param value the avatarIdList to add
     * @return this
     */
    public SetAssistAvatarCsReq addAvatarIdList(final int value) {
      bitField0_ |= 0x00000002;
      avatarIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 14;</code>
     * @param values the avatarIdList to add
     * @return this
     */
    public SetAssistAvatarCsReq addAllAvatarIdList(final int... values) {
      bitField0_ |= 0x00000002;
      avatarIdList.addAll(values);
      return this;
    }

    @Override
    public SetAssistAvatarCsReq copyFrom(final SetAssistAvatarCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        avatarIdList.copyFrom(other.avatarIdList);
      }
      return this;
    }

    @Override
    public SetAssistAvatarCsReq mergeFrom(final SetAssistAvatarCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasAvatarIdList()) {
        getMutableAvatarIdList().addAll(other.avatarIdList);
      }
      return this;
    }

    @Override
    public SetAssistAvatarCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      avatarIdList.clear();
      return this;
    }

    @Override
    public SetAssistAvatarCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetAssistAvatarCsReq)) {
        return false;
      }
      SetAssistAvatarCsReq other = (SetAssistAvatarCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasAvatarIdList() || avatarIdList.equals(other.avatarIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < avatarIdList.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(avatarIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * avatarIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(avatarIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetAssistAvatarCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // avatarIdList [packed=true]
            input.readPackedUInt32(avatarIdList, tag);
            bitField0_ |= 0x00000002;
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
          case 112: {
            // avatarIdList [packed=false]
            tag = input.readRepeatedUInt32(avatarIdList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeRepeatedUInt32(FieldNames.avatarIdList, avatarIdList);
      }
      output.endObject();
    }

    @Override
    public SetAssistAvatarCsReq mergeFrom(final JsonSource input) throws IOException {
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
          case -1214270702:
          case 1824281692: {
            if (input.isAtField(FieldNames.avatarIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(avatarIdList);
                bitField0_ |= 0x00000002;
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
    public SetAssistAvatarCsReq clone() {
      return new SetAssistAvatarCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetAssistAvatarCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetAssistAvatarCsReq(), data).checkInitialized();
    }

    public static SetAssistAvatarCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetAssistAvatarCsReq(), input).checkInitialized();
    }

    public static SetAssistAvatarCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetAssistAvatarCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetAssistAvatarCsReq messages
     */
    public static MessageFactory<SetAssistAvatarCsReq> getFactory() {
      return SetAssistAvatarCsReqFactory.INSTANCE;
    }

    private enum SetAssistAvatarCsReqFactory implements MessageFactory<SetAssistAvatarCsReq> {
      INSTANCE;

      @Override
      public SetAssistAvatarCsReq create() {
        return SetAssistAvatarCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName avatarIdList = FieldName.forField("avatarIdList", "avatar_id_list");
    }
  }
}
