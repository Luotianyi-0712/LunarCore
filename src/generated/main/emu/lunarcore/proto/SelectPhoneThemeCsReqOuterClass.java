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

public final class SelectPhoneThemeCsReqOuterClass {
  /**
   * Protobuf type {@code SelectPhoneThemeCsReq}
   */
  public static final class SelectPhoneThemeCsReq extends ProtoMessage<SelectPhoneThemeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 theme_id = 8;</code>
     */
    private int themeId;

    private SelectPhoneThemeCsReq() {
    }

    /**
     * @return a new empty instance of {@code SelectPhoneThemeCsReq}
     */
    public static SelectPhoneThemeCsReq newInstance() {
      return new SelectPhoneThemeCsReq();
    }

    /**
     * <code>optional uint32 theme_id = 8;</code>
     * @return whether the themeId field is set
     */
    public boolean hasThemeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 theme_id = 8;</code>
     * @return this
     */
    public SelectPhoneThemeCsReq clearThemeId() {
      bitField0_ &= ~0x00000001;
      themeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 theme_id = 8;</code>
     * @return the themeId
     */
    public int getThemeId() {
      return themeId;
    }

    /**
     * <code>optional uint32 theme_id = 8;</code>
     * @param value the themeId to set
     * @return this
     */
    public SelectPhoneThemeCsReq setThemeId(final int value) {
      bitField0_ |= 0x00000001;
      themeId = value;
      return this;
    }

    @Override
    public SelectPhoneThemeCsReq copyFrom(final SelectPhoneThemeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        themeId = other.themeId;
      }
      return this;
    }

    @Override
    public SelectPhoneThemeCsReq mergeFrom(final SelectPhoneThemeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasThemeId()) {
        setThemeId(other.themeId);
      }
      return this;
    }

    @Override
    public SelectPhoneThemeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      themeId = 0;
      return this;
    }

    @Override
    public SelectPhoneThemeCsReq clearQuick() {
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
      if (!(o instanceof SelectPhoneThemeCsReq)) {
        return false;
      }
      SelectPhoneThemeCsReq other = (SelectPhoneThemeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasThemeId() || themeId == other.themeId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(themeId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(themeId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectPhoneThemeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // themeId
            themeId = input.readUInt32();
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
        output.writeUInt32(FieldNames.themeId, themeId);
      }
      output.endObject();
    }

    @Override
    public SelectPhoneThemeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1349701436:
          case 1108949841: {
            if (input.isAtField(FieldNames.themeId)) {
              if (!input.trySkipNullValue()) {
                themeId = input.readUInt32();
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
    public SelectPhoneThemeCsReq clone() {
      return new SelectPhoneThemeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectPhoneThemeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectPhoneThemeCsReq(), data).checkInitialized();
    }

    public static SelectPhoneThemeCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectPhoneThemeCsReq(), input).checkInitialized();
    }

    public static SelectPhoneThemeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectPhoneThemeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectPhoneThemeCsReq messages
     */
    public static MessageFactory<SelectPhoneThemeCsReq> getFactory() {
      return SelectPhoneThemeCsReqFactory.INSTANCE;
    }

    private enum SelectPhoneThemeCsReqFactory implements MessageFactory<SelectPhoneThemeCsReq> {
      INSTANCE;

      @Override
      public SelectPhoneThemeCsReq create() {
        return SelectPhoneThemeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName themeId = FieldName.forField("themeId", "theme_id");
    }
  }
}
