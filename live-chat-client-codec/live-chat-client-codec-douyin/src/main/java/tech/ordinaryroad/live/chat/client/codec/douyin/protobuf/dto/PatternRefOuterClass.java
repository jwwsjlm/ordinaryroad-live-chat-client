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
// source: PatternRef.proto

package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto;

public final class PatternRefOuterClass {
  private PatternRefOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PatternRefOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PatternRef)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    java.lang.String getKey();
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    com.google.protobuf.ByteString
        getKeyBytes();

    /**
     * <code>string default_pattern = 2;</code>
     * @return The defaultPattern.
     */
    java.lang.String getDefaultPattern();
    /**
     * <code>string default_pattern = 2;</code>
     * @return The bytes for defaultPattern.
     */
    com.google.protobuf.ByteString
        getDefaultPatternBytes();
  }
  /**
   * Protobuf type {@code PatternRef}
   */
  public static final class PatternRef extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PatternRef)
      PatternRefOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PatternRef.newBuilder() to construct.
    private PatternRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PatternRef() {
      key_ = "";
      defaultPattern_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PatternRef();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PatternRef(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              key_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              defaultPattern_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.internal_static_PatternRef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.internal_static_PatternRef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.class, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private volatile java.lang.Object key_;
    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEFAULT_PATTERN_FIELD_NUMBER = 2;
    private volatile java.lang.Object defaultPattern_;
    /**
     * <code>string default_pattern = 2;</code>
     * @return The defaultPattern.
     */
    @java.lang.Override
    public java.lang.String getDefaultPattern() {
      java.lang.Object ref = defaultPattern_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultPattern_ = s;
        return s;
      }
    }
    /**
     * <code>string default_pattern = 2;</code>
     * @return The bytes for defaultPattern.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDefaultPatternBytes() {
      java.lang.Object ref = defaultPattern_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultPattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultPattern_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultPattern_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultPattern_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultPattern_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef other = (tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
      if (!getDefaultPattern()
          .equals(other.getDefaultPattern())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (37 * hash) + DEFAULT_PATTERN_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultPattern().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PatternRef}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PatternRef)
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.internal_static_PatternRef_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.internal_static_PatternRef_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.class, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        key_ = "";

        defaultPattern_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.internal_static_PatternRef_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef build() {
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef result = new tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef(this);
        result.key_ = key_;
        result.defaultPattern_ = defaultPattern_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef.getDefaultInstance()) return this;
        if (!other.getKey().isEmpty()) {
          key_ = other.key_;
          onChanged();
        }
        if (!other.getDefaultPattern().isEmpty()) {
          defaultPattern_ = other.defaultPattern_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object key_ = "";
      /**
       * <code>string key = 1;</code>
       * @return The key.
       */
      public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string key = 1;</code>
       * @return The bytes for key.
       */
      public com.google.protobuf.ByteString
          getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          key_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string key = 1;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      /**
       * <code>string key = 1;</code>
       * @param value The bytes for key to set.
       * @return This builder for chaining.
       */
      public Builder setKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        key_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object defaultPattern_ = "";
      /**
       * <code>string default_pattern = 2;</code>
       * @return The defaultPattern.
       */
      public java.lang.String getDefaultPattern() {
        java.lang.Object ref = defaultPattern_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          defaultPattern_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string default_pattern = 2;</code>
       * @return The bytes for defaultPattern.
       */
      public com.google.protobuf.ByteString
          getDefaultPatternBytes() {
        java.lang.Object ref = defaultPattern_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          defaultPattern_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string default_pattern = 2;</code>
       * @param value The defaultPattern to set.
       * @return This builder for chaining.
       */
      public Builder setDefaultPattern(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        defaultPattern_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string default_pattern = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDefaultPattern() {
        
        defaultPattern_ = getDefaultInstance().getDefaultPattern();
        onChanged();
        return this;
      }
      /**
       * <code>string default_pattern = 2;</code>
       * @param value The bytes for defaultPattern to set.
       * @return This builder for chaining.
       */
      public Builder setDefaultPatternBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        defaultPattern_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PatternRef)
    }

    // @@protoc_insertion_point(class_scope:PatternRef)
    private static final tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef();
    }

    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PatternRef>
        PARSER = new com.google.protobuf.AbstractParser<PatternRef>() {
      @java.lang.Override
      public PatternRef parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PatternRef(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PatternRef> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PatternRef> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.PatternRefOuterClass.PatternRef getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatternRef_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatternRef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020PatternRef.proto\"2\n\nPatternRef\022\013\n\003key\030" +
      "\001 \001(\t\022\027\n\017default_pattern\030\002 \001(\tB>\n<tech.o" +
      "rdinaryroad.live.chat.client.codec.douyi" +
      "n.protobuf.dtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PatternRef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PatternRef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatternRef_descriptor,
        new java.lang.String[] { "Key", "DefaultPattern", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
