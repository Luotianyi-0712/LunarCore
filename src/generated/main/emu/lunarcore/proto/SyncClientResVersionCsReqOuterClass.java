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

public final class SyncClientResVersionCsReqOuterClass {
  /**
   * Protobuf type {@code SyncClientResVersionCsReq}
   */
  public static final class SyncClientResVersionCsReq extends ProtoMessage<SyncClientResVersionCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 client_res_version = 14;</code>
     */
    private int clientResVersion;

    private SyncClientResVersionCsReq() {
    }

    /**
     * @return a new empty instance of {@code SyncClientResVersionCsReq}
     */
    public static SyncClientResVersionCsReq newInstance() {
      return new SyncClientResVersionCsReq();
    }

    /**
     * <code>optional uint32 client_res_version = 14;</code>
     * @return whether the clientResVersion field is set
     */
    public boolean hasClientResVersion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 client_res_version = 14;</code>
     * @return this
     */
    public SyncClientResVersionCsReq clearClientResVersion() {
      bitField0_ &= ~0x00000001;
      clientResVersion = 0;
      return this;
    }

    /**
     * <code>optional uint32 client_res_version = 14;</code>
     * @return the clientResVersion
     */
    public int getClientResVersion() {
      return clientResVersion;
    }

    /**
     * <code>optional uint32 client_res_version = 14;</code>
     * @param value the clientResVersion to set
     * @return this
     */
    public SyncClientResVersionCsReq setClientResVersion(final int value) {
      bitField0_ |= 0x00000001;
      clientResVersion = value;
      return this;
    }

    @Override
    public SyncClientResVersionCsReq copyFrom(final SyncClientResVersionCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        clientResVersion = other.clientResVersion;
      }
      return this;
    }

    @Override
    public SyncClientResVersionCsReq mergeFrom(final SyncClientResVersionCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasClientResVersion()) {
        setClientResVersion(other.clientResVersion);
      }
      return this;
    }

    @Override
    public SyncClientResVersionCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      clientResVersion = 0;
      return this;
    }

    @Override
    public SyncClientResVersionCsReq clearQuick() {
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
      if (!(o instanceof SyncClientResVersionCsReq)) {
        return false;
      }
      SyncClientResVersionCsReq other = (SyncClientResVersionCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasClientResVersion() || clientResVersion == other.clientResVersion);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(clientResVersion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(clientResVersion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncClientResVersionCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // clientResVersion
            clientResVersion = input.readUInt32();
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
        output.writeUInt32(FieldNames.clientResVersion, clientResVersion);
      }
      output.endObject();
    }

    @Override
    public SyncClientResVersionCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2005674429:
          case -349907515: {
            if (input.isAtField(FieldNames.clientResVersion)) {
              if (!input.trySkipNullValue()) {
                clientResVersion = input.readUInt32();
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
    public SyncClientResVersionCsReq clone() {
      return new SyncClientResVersionCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncClientResVersionCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncClientResVersionCsReq(), data).checkInitialized();
    }

    public static SyncClientResVersionCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncClientResVersionCsReq(), input).checkInitialized();
    }

    public static SyncClientResVersionCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncClientResVersionCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncClientResVersionCsReq messages
     */
    public static MessageFactory<SyncClientResVersionCsReq> getFactory() {
      return SyncClientResVersionCsReqFactory.INSTANCE;
    }

    private enum SyncClientResVersionCsReqFactory implements MessageFactory<SyncClientResVersionCsReq> {
      INSTANCE;

      @Override
      public SyncClientResVersionCsReq create() {
        return SyncClientResVersionCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName clientResVersion = FieldName.forField("clientResVersion", "client_res_version");
    }
  }
}
