/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SCWebRideChanged.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class SCWebRideChangedOuterClass {
  private SCWebRideChangedOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCWebRideChangedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCWebRideChanged)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string rideId = 1;</code>
     * @return The rideId.
     */
    String getRideId();
    /**
     * <code>string rideId = 1;</code>
     * @return The bytes for rideId.
     */
    com.google.protobuf.ByteString
        getRideIdBytes();

    /**
     * <code>uint32 requestMaxDelayMillis = 2;</code>
     * @return The requestMaxDelayMillis.
     */
    int getRequestMaxDelayMillis();
  }
  /**
   * Protobuf type {@code SCWebRideChanged}
   */
  public static final class SCWebRideChanged extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCWebRideChanged)
      SCWebRideChangedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCWebRideChanged.newBuilder() to construct.
    private SCWebRideChanged(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCWebRideChanged() {
      rideId_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCWebRideChanged();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SCWebRideChangedOuterClass.internal_static_SCWebRideChanged_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SCWebRideChangedOuterClass.internal_static_SCWebRideChanged_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SCWebRideChanged.class, Builder.class);
    }

    public static final int RIDEID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object rideId_ = "";
    /**
     * <code>string rideId = 1;</code>
     * @return The rideId.
     */
    @Override
    public String getRideId() {
      Object ref = rideId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        rideId_ = s;
        return s;
      }
    }
    /**
     * <code>string rideId = 1;</code>
     * @return The bytes for rideId.
     */
    @Override
    public com.google.protobuf.ByteString
        getRideIdBytes() {
      Object ref = rideId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        rideId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REQUESTMAXDELAYMILLIS_FIELD_NUMBER = 2;
    private int requestMaxDelayMillis_ = 0;
    /**
     * <code>uint32 requestMaxDelayMillis = 2;</code>
     * @return The requestMaxDelayMillis.
     */
    @Override
    public int getRequestMaxDelayMillis() {
      return requestMaxDelayMillis_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rideId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rideId_);
      }
      if (requestMaxDelayMillis_ != 0) {
        output.writeUInt32(2, requestMaxDelayMillis_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rideId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rideId_);
      }
      if (requestMaxDelayMillis_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, requestMaxDelayMillis_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SCWebRideChanged)) {
        return super.equals(obj);
      }
      SCWebRideChanged other = (SCWebRideChanged) obj;

      if (!getRideId()
          .equals(other.getRideId())) return false;
      if (getRequestMaxDelayMillis()
          != other.getRequestMaxDelayMillis()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RIDEID_FIELD_NUMBER;
      hash = (53 * hash) + getRideId().hashCode();
      hash = (37 * hash) + REQUESTMAXDELAYMILLIS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestMaxDelayMillis();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SCWebRideChanged parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SCWebRideChanged parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SCWebRideChanged parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SCWebRideChanged parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SCWebRideChanged parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SCWebRideChanged parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SCWebRideChanged parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SCWebRideChanged parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SCWebRideChanged parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SCWebRideChanged parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SCWebRideChanged parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SCWebRideChanged parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SCWebRideChanged prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SCWebRideChanged}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCWebRideChanged)
        SCWebRideChangedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SCWebRideChangedOuterClass.internal_static_SCWebRideChanged_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SCWebRideChangedOuterClass.internal_static_SCWebRideChanged_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SCWebRideChanged.class, Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebRideChangedOuterClass.SCWebRideChanged.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        rideId_ = "";
        requestMaxDelayMillis_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SCWebRideChangedOuterClass.internal_static_SCWebRideChanged_descriptor;
      }

      @Override
      public SCWebRideChanged getDefaultInstanceForType() {
        return SCWebRideChanged.getDefaultInstance();
      }

      @Override
      public SCWebRideChanged build() {
        SCWebRideChanged result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SCWebRideChanged buildPartial() {
        SCWebRideChanged result = new SCWebRideChanged(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SCWebRideChanged result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.rideId_ = rideId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.requestMaxDelayMillis_ = requestMaxDelayMillis_;
        }
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SCWebRideChanged) {
          return mergeFrom((SCWebRideChanged)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SCWebRideChanged other) {
        if (other == SCWebRideChanged.getDefaultInstance()) return this;
        if (!other.getRideId().isEmpty()) {
          rideId_ = other.rideId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getRequestMaxDelayMillis() != 0) {
          setRequestMaxDelayMillis(other.getRequestMaxDelayMillis());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                rideId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                requestMaxDelayMillis_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private Object rideId_ = "";
      /**
       * <code>string rideId = 1;</code>
       * @return The rideId.
       */
      public String getRideId() {
        Object ref = rideId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          rideId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string rideId = 1;</code>
       * @return The bytes for rideId.
       */
      public com.google.protobuf.ByteString
          getRideIdBytes() {
        Object ref = rideId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          rideId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string rideId = 1;</code>
       * @param value The rideId to set.
       * @return This builder for chaining.
       */
      public Builder setRideId(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        rideId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string rideId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRideId() {
        rideId_ = getDefaultInstance().getRideId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string rideId = 1;</code>
       * @param value The bytes for rideId to set.
       * @return This builder for chaining.
       */
      public Builder setRideIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        rideId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int requestMaxDelayMillis_ ;
      /**
       * <code>uint32 requestMaxDelayMillis = 2;</code>
       * @return The requestMaxDelayMillis.
       */
      @Override
      public int getRequestMaxDelayMillis() {
        return requestMaxDelayMillis_;
      }
      /**
       * <code>uint32 requestMaxDelayMillis = 2;</code>
       * @param value The requestMaxDelayMillis to set.
       * @return This builder for chaining.
       */
      public Builder setRequestMaxDelayMillis(int value) {

        requestMaxDelayMillis_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 requestMaxDelayMillis = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestMaxDelayMillis() {
        bitField0_ = (bitField0_ & ~0x00000002);
        requestMaxDelayMillis_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SCWebRideChanged)
    }

    // @@protoc_insertion_point(class_scope:SCWebRideChanged)
    private static final SCWebRideChanged DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SCWebRideChanged();
    }

    public static SCWebRideChanged getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCWebRideChanged>
        PARSER = new com.google.protobuf.AbstractParser<SCWebRideChanged>() {
      @Override
      public SCWebRideChanged parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SCWebRideChanged> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SCWebRideChanged> getParserForType() {
      return PARSER;
    }

    @Override
    public SCWebRideChanged getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCWebRideChanged_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCWebRideChanged_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026SCWebRideChanged.proto\"A\n\020SCWebRideCha" +
      "nged\022\016\n\006rideId\030\001 \001(\t\022\035\n\025requestMaxDelayM" +
      "illis\030\002 \001(\rB<\n:tech.ordinaryroad.live.ch" +
      "at.client.codec.kuaishou.protobufb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SCWebRideChanged_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCWebRideChanged_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCWebRideChanged_descriptor,
        new String[] { "RideId", "RequestMaxDelayMillis", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
