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

public final class GetArchiveDataScRspOuterClass {
  /**
   * Protobuf type {@code GetArchiveDataScRsp}
   */
  public static final class GetArchiveDataScRsp extends ProtoMessage<GetArchiveDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional .ArchiveData archive_data = 9;</code>
     */
    private final ArchiveDataOuterClass.ArchiveData archiveData = ArchiveDataOuterClass.ArchiveData.newInstance();

    private GetArchiveDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetArchiveDataScRsp}
     */
    public static GetArchiveDataScRsp newInstance() {
      return new GetArchiveDataScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public GetArchiveDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetArchiveDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ArchiveData archive_data = 9;</code>
     * @return whether the archiveData field is set
     */
    public boolean hasArchiveData() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ArchiveData archive_data = 9;</code>
     * @return this
     */
    public GetArchiveDataScRsp clearArchiveData() {
      bitField0_ &= ~0x00000002;
      archiveData.clear();
      return this;
    }

    /**
     * <code>optional .ArchiveData archive_data = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableArchiveData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ArchiveDataOuterClass.ArchiveData getArchiveData() {
      return archiveData;
    }

    /**
     * <code>optional .ArchiveData archive_data = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ArchiveDataOuterClass.ArchiveData getMutableArchiveData() {
      bitField0_ |= 0x00000002;
      return archiveData;
    }

    /**
     * <code>optional .ArchiveData archive_data = 9;</code>
     * @param value the archiveData to set
     * @return this
     */
    public GetArchiveDataScRsp setArchiveData(final ArchiveDataOuterClass.ArchiveData value) {
      bitField0_ |= 0x00000002;
      archiveData.copyFrom(value);
      return this;
    }

    @Override
    public GetArchiveDataScRsp copyFrom(final GetArchiveDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        archiveData.copyFrom(other.archiveData);
      }
      return this;
    }

    @Override
    public GetArchiveDataScRsp mergeFrom(final GetArchiveDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasArchiveData()) {
        getMutableArchiveData().mergeFrom(other.archiveData);
      }
      return this;
    }

    @Override
    public GetArchiveDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      archiveData.clear();
      return this;
    }

    @Override
    public GetArchiveDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      archiveData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetArchiveDataScRsp)) {
        return false;
      }
      GetArchiveDataScRsp other = (GetArchiveDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasArchiveData() || archiveData.equals(other.archiveData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(archiveData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(archiveData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetArchiveDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // archiveData
            input.readMessage(archiveData);
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
        output.writeMessage(FieldNames.archiveData, archiveData);
      }
      output.endObject();
    }

    @Override
    public GetArchiveDataScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1053234060:
          case -1684475641: {
            if (input.isAtField(FieldNames.archiveData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(archiveData);
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
    public GetArchiveDataScRsp clone() {
      return new GetArchiveDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetArchiveDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetArchiveDataScRsp(), data).checkInitialized();
    }

    public static GetArchiveDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetArchiveDataScRsp(), input).checkInitialized();
    }

    public static GetArchiveDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetArchiveDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetArchiveDataScRsp messages
     */
    public static MessageFactory<GetArchiveDataScRsp> getFactory() {
      return GetArchiveDataScRspFactory.INSTANCE;
    }

    private enum GetArchiveDataScRspFactory implements MessageFactory<GetArchiveDataScRsp> {
      INSTANCE;

      @Override
      public GetArchiveDataScRsp create() {
        return GetArchiveDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName archiveData = FieldName.forField("archiveData", "archive_data");
    }
  }
}
