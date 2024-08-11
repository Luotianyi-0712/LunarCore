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

public final class TakeOffRelicCsReqOuterClass {
  /**
   * Protobuf type {@code TakeOffRelicCsReq}
   */
  public static final class TakeOffRelicCsReq extends ProtoMessage<TakeOffRelicCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     */
    private int avatarId;

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     */
    private final RepeatedInt slotList = RepeatedInt.newEmptyInstance();

    private TakeOffRelicCsReq() {
    }

    /**
     * @return a new empty instance of {@code TakeOffRelicCsReq}
     */
    public static TakeOffRelicCsReq newInstance() {
      return new TakeOffRelicCsReq();
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @return this
     */
    public TakeOffRelicCsReq clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 8;</code>
     * @param value the avatarId to set
     * @return this
     */
    public TakeOffRelicCsReq setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     * @return whether the slotList field is set
     */
    public boolean hasSlotList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     * @return this
     */
    public TakeOffRelicCsReq clearSlotList() {
      bitField0_ &= ~0x00000002;
      slotList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSlotList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getSlotList() {
      return slotList;
    }

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableSlotList() {
      bitField0_ |= 0x00000002;
      return slotList;
    }

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     * @param value the slotList to add
     * @return this
     */
    public TakeOffRelicCsReq addSlotList(final int value) {
      bitField0_ |= 0x00000002;
      slotList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 slot_list = 5;</code>
     * @param values the slotList to add
     * @return this
     */
    public TakeOffRelicCsReq addAllSlotList(final int... values) {
      bitField0_ |= 0x00000002;
      slotList.addAll(values);
      return this;
    }

    @Override
    public TakeOffRelicCsReq copyFrom(final TakeOffRelicCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        slotList.copyFrom(other.slotList);
      }
      return this;
    }

    @Override
    public TakeOffRelicCsReq mergeFrom(final TakeOffRelicCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasSlotList()) {
        getMutableSlotList().addAll(other.slotList);
      }
      return this;
    }

    @Override
    public TakeOffRelicCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      slotList.clear();
      return this;
    }

    @Override
    public TakeOffRelicCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      slotList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakeOffRelicCsReq)) {
        return false;
      }
      TakeOffRelicCsReq other = (TakeOffRelicCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasSlotList() || slotList.equals(other.slotList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < slotList.length(); i++) {
          output.writeRawByte((byte) 40);
          output.writeUInt32NoTag(slotList.array()[i]);
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
        size += (1 * slotList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(slotList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakeOffRelicCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // slotList [packed=true]
            input.readPackedUInt32(slotList, tag);
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
          case 40: {
            // slotList [packed=false]
            tag = input.readRepeatedUInt32(slotList, tag);
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
        output.writeRepeatedUInt32(FieldNames.slotList, slotList);
      }
      output.endObject();
    }

    @Override
    public TakeOffRelicCsReq mergeFrom(final JsonSource input) throws IOException {
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
          case -1086791748:
          case 686820927: {
            if (input.isAtField(FieldNames.slotList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(slotList);
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
    public TakeOffRelicCsReq clone() {
      return new TakeOffRelicCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakeOffRelicCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakeOffRelicCsReq(), data).checkInitialized();
    }

    public static TakeOffRelicCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeOffRelicCsReq(), input).checkInitialized();
    }

    public static TakeOffRelicCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeOffRelicCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakeOffRelicCsReq messages
     */
    public static MessageFactory<TakeOffRelicCsReq> getFactory() {
      return TakeOffRelicCsReqFactory.INSTANCE;
    }

    private enum TakeOffRelicCsReqFactory implements MessageFactory<TakeOffRelicCsReq> {
      INSTANCE;

      @Override
      public TakeOffRelicCsReq create() {
        return TakeOffRelicCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName slotList = FieldName.forField("slotList", "slot_list");
    }
  }
}
