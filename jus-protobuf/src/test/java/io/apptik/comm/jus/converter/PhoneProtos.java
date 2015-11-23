/*
 * Copyright (C) 2015 AppTik Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/phone.proto

package io.apptik.comm.jus.converter;

import com.google.protobuf.AbstractMessage;

public final class PhoneProtos {
  private PhoneProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PhoneOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string number = 1;
    /**
     * <code>optional string number = 1;</code>
     */
    boolean hasNumber();
    /**
     * <code>optional string number = 1;</code>
     */
    String getNumber();
    /**
     * <code>optional string number = 1;</code>
     */
    com.google.protobuf.ByteString
        getNumberBytes();
  }
  /**
   * Protobuf type {@code retrofit.Phone}
   */
  public static final class Phone extends
      com.google.protobuf.GeneratedMessage
      implements PhoneOrBuilder {
    // Use Phone.newBuilder() to construct.
    private Phone(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Phone(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Phone defaultInstance;
    public static Phone getDefaultInstance() {
      return defaultInstance;
    }

    public Phone getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Phone(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              number_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PhoneProtos.internal_static_retrofit_Phone_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PhoneProtos.internal_static_retrofit_Phone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PhoneProtos.Phone.class, PhoneProtos.Phone.Builder.class);
    }

    public static com.google.protobuf.Parser<Phone> PARSER =
        new com.google.protobuf.AbstractParser<Phone>() {
      public Phone parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Phone(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<Phone> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string number = 1;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private Object number_;
    /**
     * <code>optional string number = 1;</code>
     */
    public boolean hasNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string number = 1;</code>
     */
    public String getNumber() {
      Object ref = number_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          number_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string number = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      number_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNumberBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNumberBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static PhoneProtos.Phone parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PhoneProtos.Phone parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PhoneProtos.Phone parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PhoneProtos.Phone parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PhoneProtos.Phone parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static PhoneProtos.Phone parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static PhoneProtos.Phone parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static PhoneProtos.Phone parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static PhoneProtos.Phone parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static PhoneProtos.Phone parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(PhoneProtos.Phone prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code retrofit.Phone}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements PhoneProtos.PhoneOrBuilder {
      public static com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PhoneProtos.internal_static_retrofit_Phone_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PhoneProtos.internal_static_retrofit_Phone_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PhoneProtos.Phone.class, PhoneProtos.Phone.Builder.class);
      }

      // Construct using retrofit.PhoneProtos.Phone.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        number_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PhoneProtos.internal_static_retrofit_Phone_descriptor;
      }

      public PhoneProtos.Phone getDefaultInstanceForType() {
        return PhoneProtos.Phone.getDefaultInstance();
      }

      public PhoneProtos.Phone build() {
        PhoneProtos.Phone result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public PhoneProtos.Phone buildPartial() {
        PhoneProtos.Phone result = new PhoneProtos.Phone(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.number_ = number_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PhoneProtos.Phone) {
          return mergeFrom((PhoneProtos.Phone)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PhoneProtos.Phone other) {
        if (other == PhoneProtos.Phone.getDefaultInstance()) return this;
        if (other.hasNumber()) {
          bitField0_ |= 0x00000001;
          number_ = other.number_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PhoneProtos.Phone parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PhoneProtos.Phone) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string number = 1;
      private Object number_ = "";
      /**
       * <code>optional string number = 1;</code>
       */
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public String getNumber() {
        Object ref = number_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          number_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNumberBytes() {
        Object ref = number_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          number_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public Builder setNumber(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        number_ = getDefaultInstance().getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional string number = 1;</code>
       */
      public Builder setNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:retrofit.Phone)
    }

    static {
      defaultInstance = new Phone(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:retrofit.Phone)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_retrofit_Phone_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_retrofit_Phone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022protos/phone.proto\022\010retrofit\"\027\n\005Phone\022" +
      "\016\n\006number\030\001 \001(\tB!\n\022retrofit.converterB\013P" +
      "honeProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_retrofit_Phone_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_retrofit_Phone_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_retrofit_Phone_descriptor,
              new String[] { "Number", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
