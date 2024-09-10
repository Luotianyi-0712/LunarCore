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

public final class RogueCommonDialogueOptionInfoOuterClass {
  /**
   * Protobuf type {@code RogueCommonDialogueOptionInfo}
   */
  public static final class RogueCommonDialogueOptionInfo extends ProtoMessage<RogueCommonDialogueOptionInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 arg_id = 6;</code>
     */
    private int argId;

    /**
     * <code>optional uint32 option_id = 9;</code>
     */
    private int optionId;

    /**
     * <code>optional bool is_valid = 5;</code>
     */
    private boolean isValid;

    /**
     * <code>optional bool confirm = 13;</code>
     */
    private boolean confirm;

    /**
     * <code>optional .RogueCommonDialogueOptionDisplayInfo display_value = 14;</code>
     */
    private final RogueCommonDialogueOptionDisplayInfoOuterClass.RogueCommonDialogueOptionDisplayInfo displayValue = RogueCommonDialogueOptionDisplayInfoOuterClass.RogueCommonDialogueOptionDisplayInfo.newInstance();

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     */
    private final RepeatedMessage<RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo> optionResultInfo = RepeatedMessage.newEmptyInstance(RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo.getFactory());

    private RogueCommonDialogueOptionInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonDialogueOptionInfo}
     */
    public static RogueCommonDialogueOptionInfo newInstance() {
      return new RogueCommonDialogueOptionInfo();
    }

    /**
     * <code>optional uint32 arg_id = 6;</code>
     * @return whether the argId field is set
     */
    public boolean hasArgId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 arg_id = 6;</code>
     * @return this
     */
    public RogueCommonDialogueOptionInfo clearArgId() {
      bitField0_ &= ~0x00000001;
      argId = 0;
      return this;
    }

    /**
     * <code>optional uint32 arg_id = 6;</code>
     * @return the argId
     */
    public int getArgId() {
      return argId;
    }

    /**
     * <code>optional uint32 arg_id = 6;</code>
     * @param value the argId to set
     * @return this
     */
    public RogueCommonDialogueOptionInfo setArgId(final int value) {
      bitField0_ |= 0x00000001;
      argId = value;
      return this;
    }

    /**
     * <code>optional uint32 option_id = 9;</code>
     * @return whether the optionId field is set
     */
    public boolean hasOptionId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 option_id = 9;</code>
     * @return this
     */
    public RogueCommonDialogueOptionInfo clearOptionId() {
      bitField0_ &= ~0x00000002;
      optionId = 0;
      return this;
    }

    /**
     * <code>optional uint32 option_id = 9;</code>
     * @return the optionId
     */
    public int getOptionId() {
      return optionId;
    }

    /**
     * <code>optional uint32 option_id = 9;</code>
     * @param value the optionId to set
     * @return this
     */
    public RogueCommonDialogueOptionInfo setOptionId(final int value) {
      bitField0_ |= 0x00000002;
      optionId = value;
      return this;
    }

    /**
     * <code>optional bool is_valid = 5;</code>
     * @return whether the isValid field is set
     */
    public boolean hasIsValid() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_valid = 5;</code>
     * @return this
     */
    public RogueCommonDialogueOptionInfo clearIsValid() {
      bitField0_ &= ~0x00000004;
      isValid = false;
      return this;
    }

    /**
     * <code>optional bool is_valid = 5;</code>
     * @return the isValid
     */
    public boolean getIsValid() {
      return isValid;
    }

    /**
     * <code>optional bool is_valid = 5;</code>
     * @param value the isValid to set
     * @return this
     */
    public RogueCommonDialogueOptionInfo setIsValid(final boolean value) {
      bitField0_ |= 0x00000004;
      isValid = value;
      return this;
    }

    /**
     * <code>optional bool confirm = 13;</code>
     * @return whether the confirm field is set
     */
    public boolean hasConfirm() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool confirm = 13;</code>
     * @return this
     */
    public RogueCommonDialogueOptionInfo clearConfirm() {
      bitField0_ &= ~0x00000008;
      confirm = false;
      return this;
    }

    /**
     * <code>optional bool confirm = 13;</code>
     * @return the confirm
     */
    public boolean getConfirm() {
      return confirm;
    }

    /**
     * <code>optional bool confirm = 13;</code>
     * @param value the confirm to set
     * @return this
     */
    public RogueCommonDialogueOptionInfo setConfirm(final boolean value) {
      bitField0_ |= 0x00000008;
      confirm = value;
      return this;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionDisplayInfo display_value = 14;</code>
     * @return whether the displayValue field is set
     */
    public boolean hasDisplayValue() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionDisplayInfo display_value = 14;</code>
     * @return this
     */
    public RogueCommonDialogueOptionInfo clearDisplayValue() {
      bitField0_ &= ~0x00000010;
      displayValue.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionDisplayInfo display_value = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDisplayValue()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonDialogueOptionDisplayInfoOuterClass.RogueCommonDialogueOptionDisplayInfo getDisplayValue(
        ) {
      return displayValue;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionDisplayInfo display_value = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonDialogueOptionDisplayInfoOuterClass.RogueCommonDialogueOptionDisplayInfo getMutableDisplayValue(
        ) {
      bitField0_ |= 0x00000010;
      return displayValue;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionDisplayInfo display_value = 14;</code>
     * @param value the displayValue to set
     * @return this
     */
    public RogueCommonDialogueOptionInfo setDisplayValue(
        final RogueCommonDialogueOptionDisplayInfoOuterClass.RogueCommonDialogueOptionDisplayInfo value) {
      bitField0_ |= 0x00000010;
      displayValue.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     * @return whether the optionResultInfo field is set
     */
    public boolean hasOptionResultInfo() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     * @return this
     */
    public RogueCommonDialogueOptionInfo clearOptionResultInfo() {
      bitField0_ &= ~0x00000020;
      optionResultInfo.clear();
      return this;
    }

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableOptionResultInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo> getOptionResultInfo(
        ) {
      return optionResultInfo;
    }

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo> getMutableOptionResultInfo(
        ) {
      bitField0_ |= 0x00000020;
      return optionResultInfo;
    }

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     * @param value the optionResultInfo to add
     * @return this
     */
    public RogueCommonDialogueOptionInfo addOptionResultInfo(
        final RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo value) {
      bitField0_ |= 0x00000020;
      optionResultInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueCommonDialogueOptionResultInfo option_result_info = 8;</code>
     * @param values the optionResultInfo to add
     * @return this
     */
    public RogueCommonDialogueOptionInfo addAllOptionResultInfo(
        final RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo... values) {
      bitField0_ |= 0x00000020;
      optionResultInfo.addAll(values);
      return this;
    }

    @Override
    public RogueCommonDialogueOptionInfo copyFrom(final RogueCommonDialogueOptionInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        argId = other.argId;
        optionId = other.optionId;
        isValid = other.isValid;
        confirm = other.confirm;
        displayValue.copyFrom(other.displayValue);
        optionResultInfo.copyFrom(other.optionResultInfo);
      }
      return this;
    }

    @Override
    public RogueCommonDialogueOptionInfo mergeFrom(final RogueCommonDialogueOptionInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasArgId()) {
        setArgId(other.argId);
      }
      if (other.hasOptionId()) {
        setOptionId(other.optionId);
      }
      if (other.hasIsValid()) {
        setIsValid(other.isValid);
      }
      if (other.hasConfirm()) {
        setConfirm(other.confirm);
      }
      if (other.hasDisplayValue()) {
        getMutableDisplayValue().mergeFrom(other.displayValue);
      }
      if (other.hasOptionResultInfo()) {
        getMutableOptionResultInfo().addAll(other.optionResultInfo);
      }
      return this;
    }

    @Override
    public RogueCommonDialogueOptionInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      argId = 0;
      optionId = 0;
      isValid = false;
      confirm = false;
      displayValue.clear();
      optionResultInfo.clear();
      return this;
    }

    @Override
    public RogueCommonDialogueOptionInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      displayValue.clearQuick();
      optionResultInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueCommonDialogueOptionInfo)) {
        return false;
      }
      RogueCommonDialogueOptionInfo other = (RogueCommonDialogueOptionInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasArgId() || argId == other.argId)
        && (!hasOptionId() || optionId == other.optionId)
        && (!hasIsValid() || isValid == other.isValid)
        && (!hasConfirm() || confirm == other.confirm)
        && (!hasDisplayValue() || displayValue.equals(other.displayValue))
        && (!hasOptionResultInfo() || optionResultInfo.equals(other.optionResultInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(argId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(optionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isValid);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(confirm);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(displayValue);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < optionResultInfo.length(); i++) {
          output.writeRawByte((byte) 66);
          output.writeMessageNoTag(optionResultInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(argId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(optionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(displayValue);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * optionResultInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(optionResultInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonDialogueOptionInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // argId
            argId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // optionId
            optionId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isValid
            isValid = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // confirm
            confirm = input.readBool();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // displayValue
            input.readMessage(displayValue);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // optionResultInfo
            tag = input.readRepeatedMessage(optionResultInfo, tag);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.argId, argId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.optionId, optionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isValid, isValid);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.confirm, confirm);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.displayValue, displayValue);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.optionResultInfo, optionResultInfo);
      }
      output.endObject();
    }

    @Override
    public RogueCommonDialogueOptionInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 93079057:
          case -1409495132: {
            if (input.isAtField(FieldNames.argId)) {
              if (!input.trySkipNullValue()) {
                argId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -79017872:
          case 1845434661: {
            if (input.isAtField(FieldNames.optionId)) {
              if (!input.trySkipNullValue()) {
                optionId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2073378034:
          case 126941351: {
            if (input.isAtField(FieldNames.isValid)) {
              if (!input.trySkipNullValue()) {
                isValid = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 951117504: {
            if (input.isAtField(FieldNames.confirm)) {
              if (!input.trySkipNullValue()) {
                confirm = input.readBool();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1606398415:
          case -1464536140: {
            if (input.isAtField(FieldNames.displayValue)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(displayValue);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -276995904:
          case -1123762490: {
            if (input.isAtField(FieldNames.optionResultInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(optionResultInfo);
                bitField0_ |= 0x00000020;
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
    public RogueCommonDialogueOptionInfo clone() {
      return new RogueCommonDialogueOptionInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonDialogueOptionInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionInfo(), data).checkInitialized();
    }

    public static RogueCommonDialogueOptionInfo parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionInfo(), input).checkInitialized();
    }

    public static RogueCommonDialogueOptionInfo parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonDialogueOptionInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonDialogueOptionInfo messages
     */
    public static MessageFactory<RogueCommonDialogueOptionInfo> getFactory() {
      return RogueCommonDialogueOptionInfoFactory.INSTANCE;
    }

    private enum RogueCommonDialogueOptionInfoFactory implements MessageFactory<RogueCommonDialogueOptionInfo> {
      INSTANCE;

      @Override
      public RogueCommonDialogueOptionInfo create() {
        return RogueCommonDialogueOptionInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName argId = FieldName.forField("argId", "arg_id");

      static final FieldName optionId = FieldName.forField("optionId", "option_id");

      static final FieldName isValid = FieldName.forField("isValid", "is_valid");

      static final FieldName confirm = FieldName.forField("confirm");

      static final FieldName displayValue = FieldName.forField("displayValue", "display_value");

      static final FieldName optionResultInfo = FieldName.forField("optionResultInfo", "option_result_info");
    }
  }
}
