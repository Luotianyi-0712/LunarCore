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

public final class GetFarmStageGachaInfoCsReqOuterClass {
  /**
   * Protobuf type {@code GetFarmStageGachaInfoCsReq}
   */
  public static final class GetFarmStageGachaInfoCsReq extends ProtoMessage<GetFarmStageGachaInfoCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     */
    private final RepeatedInt farmStageGachaIdList = RepeatedInt.newEmptyInstance();

    private GetFarmStageGachaInfoCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetFarmStageGachaInfoCsReq}
     */
    public static GetFarmStageGachaInfoCsReq newInstance() {
      return new GetFarmStageGachaInfoCsReq();
    }

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     * @return whether the farmStageGachaIdList field is set
     */
    public boolean hasFarmStageGachaIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     * @return this
     */
    public GetFarmStageGachaInfoCsReq clearFarmStageGachaIdList() {
      bitField0_ &= ~0x00000001;
      farmStageGachaIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFarmStageGachaIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getFarmStageGachaIdList() {
      return farmStageGachaIdList;
    }

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableFarmStageGachaIdList() {
      bitField0_ |= 0x00000001;
      return farmStageGachaIdList;
    }

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     * @param value the farmStageGachaIdList to add
     * @return this
     */
    public GetFarmStageGachaInfoCsReq addFarmStageGachaIdList(final int value) {
      bitField0_ |= 0x00000001;
      farmStageGachaIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 farm_stage_gacha_id_list = 5;</code>
     * @param values the farmStageGachaIdList to add
     * @return this
     */
    public GetFarmStageGachaInfoCsReq addAllFarmStageGachaIdList(final int... values) {
      bitField0_ |= 0x00000001;
      farmStageGachaIdList.addAll(values);
      return this;
    }

    @Override
    public GetFarmStageGachaInfoCsReq copyFrom(final GetFarmStageGachaInfoCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        farmStageGachaIdList.copyFrom(other.farmStageGachaIdList);
      }
      return this;
    }

    @Override
    public GetFarmStageGachaInfoCsReq mergeFrom(final GetFarmStageGachaInfoCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFarmStageGachaIdList()) {
        getMutableFarmStageGachaIdList().addAll(other.farmStageGachaIdList);
      }
      return this;
    }

    @Override
    public GetFarmStageGachaInfoCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      farmStageGachaIdList.clear();
      return this;
    }

    @Override
    public GetFarmStageGachaInfoCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      farmStageGachaIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFarmStageGachaInfoCsReq)) {
        return false;
      }
      GetFarmStageGachaInfoCsReq other = (GetFarmStageGachaInfoCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasFarmStageGachaIdList() || farmStageGachaIdList.equals(other.farmStageGachaIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < farmStageGachaIdList.length(); i++) {
          output.writeRawByte((byte) 40);
          output.writeUInt32NoTag(farmStageGachaIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * farmStageGachaIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(farmStageGachaIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFarmStageGachaInfoCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 42: {
            // farmStageGachaIdList [packed=true]
            input.readPackedUInt32(farmStageGachaIdList, tag);
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
          case 40: {
            // farmStageGachaIdList [packed=false]
            tag = input.readRepeatedUInt32(farmStageGachaIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.farmStageGachaIdList, farmStageGachaIdList);
      }
      output.endObject();
    }

    @Override
    public GetFarmStageGachaInfoCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2055808755:
          case -1677519237: {
            if (input.isAtField(FieldNames.farmStageGachaIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(farmStageGachaIdList);
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
    public GetFarmStageGachaInfoCsReq clone() {
      return new GetFarmStageGachaInfoCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFarmStageGachaInfoCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFarmStageGachaInfoCsReq(), data).checkInitialized();
    }

    public static GetFarmStageGachaInfoCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFarmStageGachaInfoCsReq(), input).checkInitialized();
    }

    public static GetFarmStageGachaInfoCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFarmStageGachaInfoCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFarmStageGachaInfoCsReq messages
     */
    public static MessageFactory<GetFarmStageGachaInfoCsReq> getFactory() {
      return GetFarmStageGachaInfoCsReqFactory.INSTANCE;
    }

    private enum GetFarmStageGachaInfoCsReqFactory implements MessageFactory<GetFarmStageGachaInfoCsReq> {
      INSTANCE;

      @Override
      public GetFarmStageGachaInfoCsReq create() {
        return GetFarmStageGachaInfoCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName farmStageGachaIdList = FieldName.forField("farmStageGachaIdList", "farm_stage_gacha_id_list");
    }
  }
}
