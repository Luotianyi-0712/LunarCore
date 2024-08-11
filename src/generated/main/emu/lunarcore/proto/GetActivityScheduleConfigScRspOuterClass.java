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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetActivityScheduleConfigScRspOuterClass {
  /**
   * Protobuf type {@code GetActivityScheduleConfigScRsp}
   */
  public static final class GetActivityScheduleConfigScRsp extends ProtoMessage<GetActivityScheduleConfigScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     */
    private final RepeatedMessage<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> activityScheduleList = RepeatedMessage.newEmptyInstance(ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getFactory());

    private GetActivityScheduleConfigScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetActivityScheduleConfigScRsp}
     */
    public static GetActivityScheduleConfigScRsp newInstance() {
      return new GetActivityScheduleConfigScRsp();
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
    public GetActivityScheduleConfigScRsp clearRetcode() {
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
    public GetActivityScheduleConfigScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     * @return whether the activityScheduleList field is set
     */
    public boolean hasActivityScheduleList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     * @return this
     */
    public GetActivityScheduleConfigScRsp clearActivityScheduleList() {
      bitField0_ &= ~0x00000002;
      activityScheduleList.clear();
      return this;
    }

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableActivityScheduleList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getActivityScheduleList(
        ) {
      return activityScheduleList;
    }

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getMutableActivityScheduleList(
        ) {
      bitField0_ |= 0x00000002;
      return activityScheduleList;
    }

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     * @param value the activityScheduleList to add
     * @return this
     */
    public GetActivityScheduleConfigScRsp addActivityScheduleList(
        final ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
      bitField0_ |= 0x00000002;
      activityScheduleList.add(value);
      return this;
    }

    /**
     * <code>repeated .ActivityScheduleInfo activity_schedule_list = 15;</code>
     * @param values the activityScheduleList to add
     * @return this
     */
    public GetActivityScheduleConfigScRsp addAllActivityScheduleList(
        final ActivityScheduleInfoOuterClass.ActivityScheduleInfo... values) {
      bitField0_ |= 0x00000002;
      activityScheduleList.addAll(values);
      return this;
    }

    @Override
    public GetActivityScheduleConfigScRsp copyFrom(final GetActivityScheduleConfigScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        activityScheduleList.copyFrom(other.activityScheduleList);
      }
      return this;
    }

    @Override
    public GetActivityScheduleConfigScRsp mergeFrom(final GetActivityScheduleConfigScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasActivityScheduleList()) {
        getMutableActivityScheduleList().addAll(other.activityScheduleList);
      }
      return this;
    }

    @Override
    public GetActivityScheduleConfigScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      activityScheduleList.clear();
      return this;
    }

    @Override
    public GetActivityScheduleConfigScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      activityScheduleList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetActivityScheduleConfigScRsp)) {
        return false;
      }
      GetActivityScheduleConfigScRsp other = (GetActivityScheduleConfigScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasActivityScheduleList() || activityScheduleList.equals(other.activityScheduleList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < activityScheduleList.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(activityScheduleList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * activityScheduleList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(activityScheduleList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetActivityScheduleConfigScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // activityScheduleList
            tag = input.readRepeatedMessage(activityScheduleList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeRepeatedMessage(FieldNames.activityScheduleList, activityScheduleList);
      }
      output.endObject();
    }

    @Override
    public GetActivityScheduleConfigScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1397638012:
          case -1123181546: {
            if (input.isAtField(FieldNames.activityScheduleList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(activityScheduleList);
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
    public GetActivityScheduleConfigScRsp clone() {
      return new GetActivityScheduleConfigScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetActivityScheduleConfigScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetActivityScheduleConfigScRsp(), data).checkInitialized();
    }

    public static GetActivityScheduleConfigScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetActivityScheduleConfigScRsp(), input).checkInitialized();
    }

    public static GetActivityScheduleConfigScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetActivityScheduleConfigScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetActivityScheduleConfigScRsp messages
     */
    public static MessageFactory<GetActivityScheduleConfigScRsp> getFactory() {
      return GetActivityScheduleConfigScRspFactory.INSTANCE;
    }

    private enum GetActivityScheduleConfigScRspFactory implements MessageFactory<GetActivityScheduleConfigScRsp> {
      INSTANCE;

      @Override
      public GetActivityScheduleConfigScRsp create() {
        return GetActivityScheduleConfigScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName activityScheduleList = FieldName.forField("activityScheduleList", "activity_schedule_list");
    }
  }
}
