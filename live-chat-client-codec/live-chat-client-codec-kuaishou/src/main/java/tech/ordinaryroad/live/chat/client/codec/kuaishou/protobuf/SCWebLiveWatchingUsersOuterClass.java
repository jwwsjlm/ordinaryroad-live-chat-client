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
// source: SCWebLiveWatchingUsers.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf;

public final class SCWebLiveWatchingUsersOuterClass {
  private SCWebLiveWatchingUsersOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SCWebLiveWatchingUsersOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SCWebLiveWatchingUsers)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    java.util.List<WebWatchingUserInfoOuterClass.WebWatchingUserInfo>
        getWatchingUserList();
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    WebWatchingUserInfoOuterClass.WebWatchingUserInfo getWatchingUser(int index);
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    int getWatchingUserCount();
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    java.util.List<? extends WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder>
        getWatchingUserOrBuilderList();
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder getWatchingUserOrBuilder(
        int index);

    /**
     * <code>string displayWatchingCount = 2;</code>
     * @return The displayWatchingCount.
     */
    String getDisplayWatchingCount();
    /**
     * <code>string displayWatchingCount = 2;</code>
     * @return The bytes for displayWatchingCount.
     */
    com.google.protobuf.ByteString
        getDisplayWatchingCountBytes();

    /**
     * <code>uint64 pendingDuration = 3;</code>
     * @return The pendingDuration.
     */
    long getPendingDuration();
  }
  /**
   * Protobuf type {@code SCWebLiveWatchingUsers}
   */
  public static final class SCWebLiveWatchingUsers extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SCWebLiveWatchingUsers)
      SCWebLiveWatchingUsersOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SCWebLiveWatchingUsers.newBuilder() to construct.
    private SCWebLiveWatchingUsers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SCWebLiveWatchingUsers() {
      watchingUser_ = java.util.Collections.emptyList();
      displayWatchingCount_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new SCWebLiveWatchingUsers();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SCWebLiveWatchingUsersOuterClass.internal_static_SCWebLiveWatchingUsers_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SCWebLiveWatchingUsersOuterClass.internal_static_SCWebLiveWatchingUsers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SCWebLiveWatchingUsers.class, Builder.class);
    }

    public static final int WATCHINGUSER_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<WebWatchingUserInfoOuterClass.WebWatchingUserInfo> watchingUser_;
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    @Override
    public java.util.List<WebWatchingUserInfoOuterClass.WebWatchingUserInfo> getWatchingUserList() {
      return watchingUser_;
    }
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    @Override
    public java.util.List<? extends WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder>
        getWatchingUserOrBuilderList() {
      return watchingUser_;
    }
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    @Override
    public int getWatchingUserCount() {
      return watchingUser_.size();
    }
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    @Override
    public WebWatchingUserInfoOuterClass.WebWatchingUserInfo getWatchingUser(int index) {
      return watchingUser_.get(index);
    }
    /**
     * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
     */
    @Override
    public WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder getWatchingUserOrBuilder(
        int index) {
      return watchingUser_.get(index);
    }

    public static final int DISPLAYWATCHINGCOUNT_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object displayWatchingCount_ = "";
    /**
     * <code>string displayWatchingCount = 2;</code>
     * @return The displayWatchingCount.
     */
    @Override
    public String getDisplayWatchingCount() {
      Object ref = displayWatchingCount_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        displayWatchingCount_ = s;
        return s;
      }
    }
    /**
     * <code>string displayWatchingCount = 2;</code>
     * @return The bytes for displayWatchingCount.
     */
    @Override
    public com.google.protobuf.ByteString
        getDisplayWatchingCountBytes() {
      Object ref = displayWatchingCount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        displayWatchingCount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PENDINGDURATION_FIELD_NUMBER = 3;
    private long pendingDuration_ = 0L;
    /**
     * <code>uint64 pendingDuration = 3;</code>
     * @return The pendingDuration.
     */
    @Override
    public long getPendingDuration() {
      return pendingDuration_;
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
      for (int i = 0; i < watchingUser_.size(); i++) {
        output.writeMessage(1, watchingUser_.get(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayWatchingCount_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayWatchingCount_);
      }
      if (pendingDuration_ != 0L) {
        output.writeUInt64(3, pendingDuration_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < watchingUser_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, watchingUser_.get(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayWatchingCount_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayWatchingCount_);
      }
      if (pendingDuration_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, pendingDuration_);
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
      if (!(obj instanceof SCWebLiveWatchingUsers)) {
        return super.equals(obj);
      }
      SCWebLiveWatchingUsers other = (SCWebLiveWatchingUsers) obj;

      if (!getWatchingUserList()
          .equals(other.getWatchingUserList())) return false;
      if (!getDisplayWatchingCount()
          .equals(other.getDisplayWatchingCount())) return false;
      if (getPendingDuration()
          != other.getPendingDuration()) return false;
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
      if (getWatchingUserCount() > 0) {
        hash = (37 * hash) + WATCHINGUSER_FIELD_NUMBER;
        hash = (53 * hash) + getWatchingUserList().hashCode();
      }
      hash = (37 * hash) + DISPLAYWATCHINGCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayWatchingCount().hashCode();
      hash = (37 * hash) + PENDINGDURATION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPendingDuration());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SCWebLiveWatchingUsers parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SCWebLiveWatchingUsers parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SCWebLiveWatchingUsers parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SCWebLiveWatchingUsers parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SCWebLiveWatchingUsers parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SCWebLiveWatchingUsers parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SCWebLiveWatchingUsers parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SCWebLiveWatchingUsers parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SCWebLiveWatchingUsers parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SCWebLiveWatchingUsers parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SCWebLiveWatchingUsers parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SCWebLiveWatchingUsers parseFrom(
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
    public static Builder newBuilder(SCWebLiveWatchingUsers prototype) {
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
     * Protobuf type {@code SCWebLiveWatchingUsers}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SCWebLiveWatchingUsers)
        SCWebLiveWatchingUsersOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SCWebLiveWatchingUsersOuterClass.internal_static_SCWebLiveWatchingUsers_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SCWebLiveWatchingUsersOuterClass.internal_static_SCWebLiveWatchingUsers_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SCWebLiveWatchingUsers.class, Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.kuaishou.protobuf.SCWebLiveWatchingUsersOuterClass.SCWebLiveWatchingUsers.newBuilder()
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
        if (watchingUserBuilder_ == null) {
          watchingUser_ = java.util.Collections.emptyList();
        } else {
          watchingUser_ = null;
          watchingUserBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        displayWatchingCount_ = "";
        pendingDuration_ = 0L;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SCWebLiveWatchingUsersOuterClass.internal_static_SCWebLiveWatchingUsers_descriptor;
      }

      @Override
      public SCWebLiveWatchingUsers getDefaultInstanceForType() {
        return SCWebLiveWatchingUsers.getDefaultInstance();
      }

      @Override
      public SCWebLiveWatchingUsers build() {
        SCWebLiveWatchingUsers result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SCWebLiveWatchingUsers buildPartial() {
        SCWebLiveWatchingUsers result = new SCWebLiveWatchingUsers(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(SCWebLiveWatchingUsers result) {
        if (watchingUserBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            watchingUser_ = java.util.Collections.unmodifiableList(watchingUser_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.watchingUser_ = watchingUser_;
        } else {
          result.watchingUser_ = watchingUserBuilder_.build();
        }
      }

      private void buildPartial0(SCWebLiveWatchingUsers result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.displayWatchingCount_ = displayWatchingCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.pendingDuration_ = pendingDuration_;
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
        if (other instanceof SCWebLiveWatchingUsers) {
          return mergeFrom((SCWebLiveWatchingUsers)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SCWebLiveWatchingUsers other) {
        if (other == SCWebLiveWatchingUsers.getDefaultInstance()) return this;
        if (watchingUserBuilder_ == null) {
          if (!other.watchingUser_.isEmpty()) {
            if (watchingUser_.isEmpty()) {
              watchingUser_ = other.watchingUser_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWatchingUserIsMutable();
              watchingUser_.addAll(other.watchingUser_);
            }
            onChanged();
          }
        } else {
          if (!other.watchingUser_.isEmpty()) {
            if (watchingUserBuilder_.isEmpty()) {
              watchingUserBuilder_.dispose();
              watchingUserBuilder_ = null;
              watchingUser_ = other.watchingUser_;
              bitField0_ = (bitField0_ & ~0x00000001);
              watchingUserBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWatchingUserFieldBuilder() : null;
            } else {
              watchingUserBuilder_.addAllMessages(other.watchingUser_);
            }
          }
        }
        if (!other.getDisplayWatchingCount().isEmpty()) {
          displayWatchingCount_ = other.displayWatchingCount_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getPendingDuration() != 0L) {
          setPendingDuration(other.getPendingDuration());
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
                WebWatchingUserInfoOuterClass.WebWatchingUserInfo m =
                    input.readMessage(
                        WebWatchingUserInfoOuterClass.WebWatchingUserInfo.parser(),
                        extensionRegistry);
                if (watchingUserBuilder_ == null) {
                  ensureWatchingUserIsMutable();
                  watchingUser_.add(m);
                } else {
                  watchingUserBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 18: {
                displayWatchingCount_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                pendingDuration_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private java.util.List<WebWatchingUserInfoOuterClass.WebWatchingUserInfo> watchingUser_ =
        java.util.Collections.emptyList();
      private void ensureWatchingUserIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          watchingUser_ = new java.util.ArrayList<WebWatchingUserInfoOuterClass.WebWatchingUserInfo>(watchingUser_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WebWatchingUserInfoOuterClass.WebWatchingUserInfo, WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder, WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder> watchingUserBuilder_;

      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public java.util.List<WebWatchingUserInfoOuterClass.WebWatchingUserInfo> getWatchingUserList() {
        if (watchingUserBuilder_ == null) {
          return java.util.Collections.unmodifiableList(watchingUser_);
        } else {
          return watchingUserBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public int getWatchingUserCount() {
        if (watchingUserBuilder_ == null) {
          return watchingUser_.size();
        } else {
          return watchingUserBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public WebWatchingUserInfoOuterClass.WebWatchingUserInfo getWatchingUser(int index) {
        if (watchingUserBuilder_ == null) {
          return watchingUser_.get(index);
        } else {
          return watchingUserBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder setWatchingUser(
          int index, WebWatchingUserInfoOuterClass.WebWatchingUserInfo value) {
        if (watchingUserBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWatchingUserIsMutable();
          watchingUser_.set(index, value);
          onChanged();
        } else {
          watchingUserBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder setWatchingUser(
          int index, WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder builderForValue) {
        if (watchingUserBuilder_ == null) {
          ensureWatchingUserIsMutable();
          watchingUser_.set(index, builderForValue.build());
          onChanged();
        } else {
          watchingUserBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder addWatchingUser(WebWatchingUserInfoOuterClass.WebWatchingUserInfo value) {
        if (watchingUserBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWatchingUserIsMutable();
          watchingUser_.add(value);
          onChanged();
        } else {
          watchingUserBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder addWatchingUser(
          int index, WebWatchingUserInfoOuterClass.WebWatchingUserInfo value) {
        if (watchingUserBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWatchingUserIsMutable();
          watchingUser_.add(index, value);
          onChanged();
        } else {
          watchingUserBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder addWatchingUser(
          WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder builderForValue) {
        if (watchingUserBuilder_ == null) {
          ensureWatchingUserIsMutable();
          watchingUser_.add(builderForValue.build());
          onChanged();
        } else {
          watchingUserBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder addWatchingUser(
          int index, WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder builderForValue) {
        if (watchingUserBuilder_ == null) {
          ensureWatchingUserIsMutable();
          watchingUser_.add(index, builderForValue.build());
          onChanged();
        } else {
          watchingUserBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder addAllWatchingUser(
          Iterable<? extends WebWatchingUserInfoOuterClass.WebWatchingUserInfo> values) {
        if (watchingUserBuilder_ == null) {
          ensureWatchingUserIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, watchingUser_);
          onChanged();
        } else {
          watchingUserBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder clearWatchingUser() {
        if (watchingUserBuilder_ == null) {
          watchingUser_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          watchingUserBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public Builder removeWatchingUser(int index) {
        if (watchingUserBuilder_ == null) {
          ensureWatchingUserIsMutable();
          watchingUser_.remove(index);
          onChanged();
        } else {
          watchingUserBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder getWatchingUserBuilder(
          int index) {
        return getWatchingUserFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder getWatchingUserOrBuilder(
          int index) {
        if (watchingUserBuilder_ == null) {
          return watchingUser_.get(index);  } else {
          return watchingUserBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public java.util.List<? extends WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder>
           getWatchingUserOrBuilderList() {
        if (watchingUserBuilder_ != null) {
          return watchingUserBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(watchingUser_);
        }
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder addWatchingUserBuilder() {
        return getWatchingUserFieldBuilder().addBuilder(
            WebWatchingUserInfoOuterClass.WebWatchingUserInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder addWatchingUserBuilder(
          int index) {
        return getWatchingUserFieldBuilder().addBuilder(
            index, WebWatchingUserInfoOuterClass.WebWatchingUserInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WebWatchingUserInfo watchingUser = 1;</code>
       */
      public java.util.List<WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder>
           getWatchingUserBuilderList() {
        return getWatchingUserFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WebWatchingUserInfoOuterClass.WebWatchingUserInfo, WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder, WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder>
          getWatchingUserFieldBuilder() {
        if (watchingUserBuilder_ == null) {
          watchingUserBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WebWatchingUserInfoOuterClass.WebWatchingUserInfo, WebWatchingUserInfoOuterClass.WebWatchingUserInfo.Builder, WebWatchingUserInfoOuterClass.WebWatchingUserInfoOrBuilder>(
                  watchingUser_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          watchingUser_ = null;
        }
        return watchingUserBuilder_;
      }

      private Object displayWatchingCount_ = "";
      /**
       * <code>string displayWatchingCount = 2;</code>
       * @return The displayWatchingCount.
       */
      public String getDisplayWatchingCount() {
        Object ref = displayWatchingCount_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          displayWatchingCount_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string displayWatchingCount = 2;</code>
       * @return The bytes for displayWatchingCount.
       */
      public com.google.protobuf.ByteString
          getDisplayWatchingCountBytes() {
        Object ref = displayWatchingCount_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          displayWatchingCount_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string displayWatchingCount = 2;</code>
       * @param value The displayWatchingCount to set.
       * @return This builder for chaining.
       */
      public Builder setDisplayWatchingCount(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        displayWatchingCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string displayWatchingCount = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDisplayWatchingCount() {
        displayWatchingCount_ = getDefaultInstance().getDisplayWatchingCount();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string displayWatchingCount = 2;</code>
       * @param value The bytes for displayWatchingCount to set.
       * @return This builder for chaining.
       */
      public Builder setDisplayWatchingCountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        displayWatchingCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private long pendingDuration_ ;
      /**
       * <code>uint64 pendingDuration = 3;</code>
       * @return The pendingDuration.
       */
      @Override
      public long getPendingDuration() {
        return pendingDuration_;
      }
      /**
       * <code>uint64 pendingDuration = 3;</code>
       * @param value The pendingDuration to set.
       * @return This builder for chaining.
       */
      public Builder setPendingDuration(long value) {

        pendingDuration_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 pendingDuration = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPendingDuration() {
        bitField0_ = (bitField0_ & ~0x00000004);
        pendingDuration_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SCWebLiveWatchingUsers)
    }

    // @@protoc_insertion_point(class_scope:SCWebLiveWatchingUsers)
    private static final SCWebLiveWatchingUsers DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SCWebLiveWatchingUsers();
    }

    public static SCWebLiveWatchingUsers getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SCWebLiveWatchingUsers>
        PARSER = new com.google.protobuf.AbstractParser<SCWebLiveWatchingUsers>() {
      @Override
      public SCWebLiveWatchingUsers parsePartialFrom(
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

    public static com.google.protobuf.Parser<SCWebLiveWatchingUsers> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SCWebLiveWatchingUsers> getParserForType() {
      return PARSER;
    }

    @Override
    public SCWebLiveWatchingUsers getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SCWebLiveWatchingUsers_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SCWebLiveWatchingUsers_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034SCWebLiveWatchingUsers.proto\032\031WebWatch" +
      "ingUserInfo.proto\"{\n\026SCWebLiveWatchingUs" +
      "ers\022*\n\014watchingUser\030\001 \003(\0132\024.WebWatchingU" +
      "serInfo\022\034\n\024displayWatchingCount\030\002 \001(\t\022\027\n" +
      "\017pendingDuration\030\003 \001(\004B<\n:tech.ordinaryr" +
      "oad.live.chat.client.codec.kuaishou.prot" +
      "obufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          WebWatchingUserInfoOuterClass.getDescriptor(),
        });
    internal_static_SCWebLiveWatchingUsers_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SCWebLiveWatchingUsers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SCWebLiveWatchingUsers_descriptor,
        new String[] { "WatchingUser", "DisplayWatchingCount", "PendingDuration", });
    WebWatchingUserInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
