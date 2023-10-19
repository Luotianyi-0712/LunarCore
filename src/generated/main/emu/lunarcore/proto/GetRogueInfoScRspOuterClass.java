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

public final class GetRogueInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetRogueInfoScRsp}
   */
  public static final class GetRogueInfoScRsp extends ProtoMessage<GetRogueInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueInfo rogue_info = 3;</code>
     */
    private final RogueInfoOuterClass.RogueInfo rogueInfo = RogueInfoOuterClass.RogueInfo.newInstance();

    private GetRogueInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetRogueInfoScRsp}
     */
    public static GetRogueInfoScRsp newInstance() {
      return new GetRogueInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public GetRogueInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetRogueInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 3;</code>
     * @return whether the rogueInfo field is set
     */
    public boolean hasRogueInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 3;</code>
     * @return this
     */
    public GetRogueInfoScRsp clearRogueInfo() {
      bitField0_ &= ~0x00000002;
      rogueInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueInfoOuterClass.RogueInfo getRogueInfo() {
      return rogueInfo;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueInfoOuterClass.RogueInfo getMutableRogueInfo() {
      bitField0_ |= 0x00000002;
      return rogueInfo;
    }

    /**
     * <code>optional .RogueInfo rogue_info = 3;</code>
     * @param value the rogueInfo to set
     * @return this
     */
    public GetRogueInfoScRsp setRogueInfo(final RogueInfoOuterClass.RogueInfo value) {
      bitField0_ |= 0x00000002;
      rogueInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetRogueInfoScRsp copyFrom(final GetRogueInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        rogueInfo.copyFrom(other.rogueInfo);
      }
      return this;
    }

    @Override
    public GetRogueInfoScRsp mergeFrom(final GetRogueInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasRogueInfo()) {
        getMutableRogueInfo().mergeFrom(other.rogueInfo);
      }
      return this;
    }

    @Override
    public GetRogueInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      rogueInfo.clear();
      return this;
    }

    @Override
    public GetRogueInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetRogueInfoScRsp)) {
        return false;
      }
      GetRogueInfoScRsp other = (GetRogueInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasRogueInfo() || rogueInfo.equals(other.rogueInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(rogueInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetRogueInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // rogueInfo
            input.readMessage(rogueInfo);
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueInfo, rogueInfo);
      }
      output.endObject();
    }

    @Override
    public GetRogueInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 655808936:
          case -1124583437: {
            if (input.isAtField(FieldNames.rogueInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueInfo);
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
    public GetRogueInfoScRsp clone() {
      return new GetRogueInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetRogueInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetRogueInfoScRsp(), data).checkInitialized();
    }

    public static GetRogueInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRogueInfoScRsp(), input).checkInitialized();
    }

    public static GetRogueInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRogueInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetRogueInfoScRsp messages
     */
    public static MessageFactory<GetRogueInfoScRsp> getFactory() {
      return GetRogueInfoScRspFactory.INSTANCE;
    }

    private enum GetRogueInfoScRspFactory implements MessageFactory<GetRogueInfoScRsp> {
      INSTANCE;

      @Override
      public GetRogueInfoScRsp create() {
        return GetRogueInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName rogueInfo = FieldName.forField("rogueInfo", "rogue_info");
    }
  }
}
