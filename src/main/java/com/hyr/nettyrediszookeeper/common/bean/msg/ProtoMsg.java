
package com.hyr.nettyrediszookeeper.common.bean.msg;

public final class ProtoMsg {
    private ProtoMsg() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    /**
     * Protobuf enum {@code HeadType}
     */
    public enum HeadType implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>LOGIN_REQUEST = 0;</code>
         */
        LOGIN_REQUEST(0),
        /**
         * <code>LOGIN_RESPONSE = 1;</code>
         */
        LOGIN_RESPONSE(1),
        /**
         * <code>LOGOUT_REQUEST = 2;</code>
         */
        LOGOUT_REQUEST(2),
        /**
         * <code>LOGOUT_RESPONSE = 3;</code>
         */
        LOGOUT_RESPONSE(3),
        /**
         * <code>KEEPALIVE_REQUEST = 4;</code>
         */
        KEEPALIVE_REQUEST(4),
        /**
         * <code>KEEPALIVE_RESPONSE = 5;</code>
         */
        KEEPALIVE_RESPONSE(5),
        /**
         * <code>MESSAGE_REQUEST = 6;</code>
         */
        MESSAGE_REQUEST(6),
        /**
         * <code>MESSAGE_RESPONSE = 7;</code>
         */
        MESSAGE_RESPONSE(7),
        /**
         * <code>MESSAGE_NOTIFICATION = 8;</code>
         */
        MESSAGE_NOTIFICATION(8),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>LOGIN_REQUEST = 0;</code>
         */
        public static final int LOGIN_REQUEST_VALUE = 0;
        /**
         * <code>LOGIN_RESPONSE = 1;</code>
         */
        public static final int LOGIN_RESPONSE_VALUE = 1;
        /**
         * <code>LOGOUT_REQUEST = 2;</code>
         */
        public static final int LOGOUT_REQUEST_VALUE = 2;
        /**
         * <code>LOGOUT_RESPONSE = 3;</code>
         */
        public static final int LOGOUT_RESPONSE_VALUE = 3;
        /**
         * <code>KEEPALIVE_REQUEST = 4;</code>
         */
        public static final int KEEPALIVE_REQUEST_VALUE = 4;
        /**
         * <code>KEEPALIVE_RESPONSE = 5;</code>
         */
        public static final int KEEPALIVE_RESPONSE_VALUE = 5;
        /**
         * <code>MESSAGE_REQUEST = 6;</code>
         */
        public static final int MESSAGE_REQUEST_VALUE = 6;
        /**
         * <code>MESSAGE_RESPONSE = 7;</code>
         */
        public static final int MESSAGE_RESPONSE_VALUE = 7;
        /**
         * <code>MESSAGE_NOTIFICATION = 8;</code>
         */
        public static final int MESSAGE_NOTIFICATION_VALUE = 8;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static HeadType valueOf(int value) {
            return forNumber(value);
        }

        public static HeadType forNumber(int value) {
            switch (value) {
                case 0:
                    return LOGIN_REQUEST;
                case 1:
                    return LOGIN_RESPONSE;
                case 2:
                    return LOGOUT_REQUEST;
                case 3:
                    return LOGOUT_RESPONSE;
                case 4:
                    return KEEPALIVE_REQUEST;
                case 5:
                    return KEEPALIVE_RESPONSE;
                case 6:
                    return MESSAGE_REQUEST;
                case 7:
                    return MESSAGE_RESPONSE;
                case 8:
                    return MESSAGE_NOTIFICATION;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<HeadType>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                HeadType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<HeadType>() {
                    public HeadType findValueByNumber(int number) {
                        return HeadType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return ProtoMsg.getDescriptor().getEnumTypes().get(0);
        }

        private static final HeadType[] VALUES = values();

        public static HeadType valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private HeadType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:HeadType)
    }

    public interface LoginRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:LoginRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string uid = 1;</code>
         */
        String getUid();

        /**
         * <code>string uid = 1;</code>
         */
        com.google.protobuf.ByteString
        getUidBytes();

        /**
         * <code>string deviceId = 2;</code>
         */
        String getDeviceId();

        /**
         * <code>string deviceId = 2;</code>
         */
        com.google.protobuf.ByteString
        getDeviceIdBytes();

        /**
         * <code>string token = 3;</code>
         */
        String getToken();

        /**
         * <code>string token = 3;</code>
         */
        com.google.protobuf.ByteString
        getTokenBytes();

        /**
         * <code>uint32 platform = 4;</code>
         */
        int getPlatform();

        /**
         * <code>string app_version = 5;</code>
         */
        String getAppVersion();

        /**
         * <code>string app_version = 5;</code>
         */
        com.google.protobuf.ByteString
        getAppVersionBytes();
    }

    /**
     * Protobuf type {@code LoginRequest}
     */
    public static final class LoginRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:LoginRequest)
            LoginRequestOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use LoginRequest.newBuilder() to construct.
        private LoginRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private LoginRequest() {
            uid_ = "";
            deviceId_ = "";
            token_ = "";
            platform_ = 0;
            appVersion_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private LoginRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            uid_ = s;
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            deviceId_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            token_ = s;
                            break;
                        }
                        case 32: {

                            platform_ = input.readUInt32();
                            break;
                        }
                        case 42: {
                            String s = input.readStringRequireUtf8();

                            appVersion_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownFieldProto3(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
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
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProtoMsg.LoginRequest.class, ProtoMsg.LoginRequest.Builder.class);
        }

        public static final int UID_FIELD_NUMBER = 1;
        private volatile Object uid_;

        /**
         * <code>string uid = 1;</code>
         */
        public String getUid() {
            Object ref = uid_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                uid_ = s;
                return s;
            }
        }

        /**
         * <code>string uid = 1;</code>
         */
        public com.google.protobuf.ByteString
        getUidBytes() {
            Object ref = uid_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                uid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DEVICEID_FIELD_NUMBER = 2;
        private volatile Object deviceId_;

        /**
         * <code>string deviceId = 2;</code>
         */
        public String getDeviceId() {
            Object ref = deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                deviceId_ = s;
                return s;
            }
        }

        /**
         * <code>string deviceId = 2;</code>
         */
        public com.google.protobuf.ByteString
        getDeviceIdBytes() {
            Object ref = deviceId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                deviceId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TOKEN_FIELD_NUMBER = 3;
        private volatile Object token_;

        /**
         * <code>string token = 3;</code>
         */
        public String getToken() {
            Object ref = token_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                token_ = s;
                return s;
            }
        }

        /**
         * <code>string token = 3;</code>
         */
        public com.google.protobuf.ByteString
        getTokenBytes() {
            Object ref = token_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                token_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PLATFORM_FIELD_NUMBER = 4;
        private int platform_;

        /**
         * <code>uint32 platform = 4;</code>
         */
        public int getPlatform() {
            return platform_;
        }

        public static final int APP_VERSION_FIELD_NUMBER = 5;
        private volatile Object appVersion_;

        /**
         * <code>string app_version = 5;</code>
         */
        public String getAppVersion() {
            Object ref = appVersion_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                appVersion_ = s;
                return s;
            }
        }

        /**
         * <code>string app_version = 5;</code>
         */
        public com.google.protobuf.ByteString
        getAppVersionBytes() {
            Object ref = appVersion_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                appVersion_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (!getUidBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uid_);
            }
            if (!getDeviceIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceId_);
            }
            if (!getTokenBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, token_);
            }
            if (platform_ != 0) {
                output.writeUInt32(4, platform_);
            }
            if (!getAppVersionBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, appVersion_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getUidBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
            }
            if (!getDeviceIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceId_);
            }
            if (!getTokenBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, token_);
            }
            if (platform_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, platform_);
            }
            if (!getAppVersionBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, appVersion_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtoMsg.LoginRequest)) {
                return super.equals(obj);
            }
            ProtoMsg.LoginRequest other = (ProtoMsg.LoginRequest) obj;

            boolean result = true;
            result = result && getUid()
                    .equals(other.getUid());
            result = result && getDeviceId()
                    .equals(other.getDeviceId());
            result = result && getToken()
                    .equals(other.getToken());
            result = result && (getPlatform()
                    == other.getPlatform());
            result = result && getAppVersion()
                    .equals(other.getAppVersion());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + UID_FIELD_NUMBER;
            hash = (53 * hash) + getUid().hashCode();
            hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
            hash = (53 * hash) + getDeviceId().hashCode();
            hash = (37 * hash) + TOKEN_FIELD_NUMBER;
            hash = (53 * hash) + getToken().hashCode();
            hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
            hash = (53 * hash) + getPlatform();
            hash = (37 * hash) + APP_VERSION_FIELD_NUMBER;
            hash = (53 * hash) + getAppVersion().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ProtoMsg.LoginRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.LoginRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.LoginRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.LoginRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ProtoMsg.LoginRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.LoginRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ProtoMsg.LoginRequest prototype) {
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
         * Protobuf type {@code LoginRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:LoginRequest)
                ProtoMsg.LoginRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ProtoMsg.LoginRequest.class, ProtoMsg.LoginRequest.Builder.class);
            }

            // Construct using ProtoMsg.LoginRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                uid_ = "";

                deviceId_ = "";

                token_ = "";

                platform_ = 0;

                appVersion_ = "";

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_descriptor;
            }

            @Override
            public ProtoMsg.LoginRequest getDefaultInstanceForType() {
                return ProtoMsg.LoginRequest.getDefaultInstance();
            }

            @Override
            public ProtoMsg.LoginRequest build() {
                ProtoMsg.LoginRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public ProtoMsg.LoginRequest buildPartial() {
                ProtoMsg.LoginRequest result = new ProtoMsg.LoginRequest(this);
                result.uid_ = uid_;
                result.deviceId_ = deviceId_;
                result.token_ = token_;
                result.platform_ = platform_;
                result.appVersion_ = appVersion_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ProtoMsg.LoginRequest) {
                    return mergeFrom((ProtoMsg.LoginRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ProtoMsg.LoginRequest other) {
                if (other == ProtoMsg.LoginRequest.getDefaultInstance()) return this;
                if (!other.getUid().isEmpty()) {
                    uid_ = other.uid_;
                    onChanged();
                }
                if (!other.getDeviceId().isEmpty()) {
                    deviceId_ = other.deviceId_;
                    onChanged();
                }
                if (!other.getToken().isEmpty()) {
                    token_ = other.token_;
                    onChanged();
                }
                if (other.getPlatform() != 0) {
                    setPlatform(other.getPlatform());
                }
                if (!other.getAppVersion().isEmpty()) {
                    appVersion_ = other.appVersion_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
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
                ProtoMsg.LoginRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ProtoMsg.LoginRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object uid_ = "";

            /**
             * <code>string uid = 1;</code>
             */
            public String getUid() {
                Object ref = uid_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    uid_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string uid = 1;</code>
             */
            public com.google.protobuf.ByteString
            getUidBytes() {
                Object ref = uid_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    uid_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string uid = 1;</code>
             */
            public Builder setUid(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                uid_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string uid = 1;</code>
             */
            public Builder clearUid() {

                uid_ = getDefaultInstance().getUid();
                onChanged();
                return this;
            }

            /**
             * <code>string uid = 1;</code>
             */
            public Builder setUidBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                uid_ = value;
                onChanged();
                return this;
            }

            private Object deviceId_ = "";

            /**
             * <code>string deviceId = 2;</code>
             */
            public String getDeviceId() {
                Object ref = deviceId_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    deviceId_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string deviceId = 2;</code>
             */
            public com.google.protobuf.ByteString
            getDeviceIdBytes() {
                Object ref = deviceId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    deviceId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string deviceId = 2;</code>
             */
            public Builder setDeviceId(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                deviceId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string deviceId = 2;</code>
             */
            public Builder clearDeviceId() {

                deviceId_ = getDefaultInstance().getDeviceId();
                onChanged();
                return this;
            }

            /**
             * <code>string deviceId = 2;</code>
             */
            public Builder setDeviceIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                deviceId_ = value;
                onChanged();
                return this;
            }

            private Object token_ = "";

            /**
             * <code>string token = 3;</code>
             */
            public String getToken() {
                Object ref = token_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    token_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string token = 3;</code>
             */
            public com.google.protobuf.ByteString
            getTokenBytes() {
                Object ref = token_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    token_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string token = 3;</code>
             */
            public Builder setToken(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 3;</code>
             */
            public Builder clearToken() {

                token_ = getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            /**
             * <code>string token = 3;</code>
             */
            public Builder setTokenBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                token_ = value;
                onChanged();
                return this;
            }

            private int platform_;

            /**
             * <code>uint32 platform = 4;</code>
             */
            public int getPlatform() {
                return platform_;
            }

            /**
             * <code>uint32 platform = 4;</code>
             */
            public Builder setPlatform(int value) {

                platform_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 platform = 4;</code>
             */
            public Builder clearPlatform() {

                platform_ = 0;
                onChanged();
                return this;
            }

            private Object appVersion_ = "";

            /**
             * <code>string app_version = 5;</code>
             */
            public String getAppVersion() {
                Object ref = appVersion_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    appVersion_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string app_version = 5;</code>
             */
            public com.google.protobuf.ByteString
            getAppVersionBytes() {
                Object ref = appVersion_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    appVersion_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string app_version = 5;</code>
             */
            public Builder setAppVersion(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                appVersion_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string app_version = 5;</code>
             */
            public Builder clearAppVersion() {

                appVersion_ = getDefaultInstance().getAppVersion();
                onChanged();
                return this;
            }

            /**
             * <code>string app_version = 5;</code>
             */
            public Builder setAppVersionBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                appVersion_ = value;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:LoginRequest)
        }

        // @@protoc_insertion_point(class_scope:LoginRequest)
        private static final ProtoMsg.LoginRequest DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ProtoMsg.LoginRequest();
        }

        public static ProtoMsg.LoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LoginRequest>
                PARSER = new com.google.protobuf.AbstractParser<LoginRequest>() {
            @Override
            public LoginRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LoginRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LoginRequest> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LoginRequest> getParserForType() {
            return PARSER;
        }

        @Override
        public ProtoMsg.LoginRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LoginResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:LoginResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool result = 1;</code>
         */
        boolean getResult();

        /**
         * <code>uint32 code = 2;</code>
         */
        int getCode();

        /**
         * <code>string debug = 3;</code>
         */
        String getInfo();

        /**
         * <code>string debug = 3;</code>
         */
        com.google.protobuf.ByteString
        getInfoBytes();

        /**
         * <code>uint32 expose = 4;</code>
         */
        int getExpose();
    }

    /**
     * Protobuf type {@code LoginResponse}
     */
    public static final class LoginResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:LoginResponse)
            LoginResponseOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use LoginResponse.newBuilder() to construct.
        private LoginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private LoginResponse() {
            result_ = false;
            code_ = 0;
            info_ = "";
            expose_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private LoginResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 8: {

                            result_ = input.readBool();
                            break;
                        }
                        case 16: {

                            code_ = input.readUInt32();
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            info_ = s;
                            break;
                        }
                        case 32: {

                            expose_ = input.readUInt32();
                            break;
                        }
                        default: {
                            if (!parseUnknownFieldProto3(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
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
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProtoMsg.LoginResponse.class, ProtoMsg.LoginResponse.Builder.class);
        }

        public static final int RESULT_FIELD_NUMBER = 1;
        private boolean result_;

        /**
         * <code>bool result = 1;</code>
         */
        public boolean getResult() {
            return result_;
        }

        public static final int CODE_FIELD_NUMBER = 2;
        private int code_;

        /**
         * <code>uint32 code = 2;</code>
         */
        public int getCode() {
            return code_;
        }

        public static final int INFO_FIELD_NUMBER = 3;
        private volatile Object info_;

        /**
         * <code>string debug = 3;</code>
         */
        public String getInfo() {
            Object ref = info_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                info_ = s;
                return s;
            }
        }

        /**
         * <code>string debug = 3;</code>
         */
        public com.google.protobuf.ByteString
        getInfoBytes() {
            Object ref = info_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                info_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int EXPOSE_FIELD_NUMBER = 4;
        private int expose_;

        /**
         * <code>uint32 expose = 4;</code>
         */
        public int getExpose() {
            return expose_;
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
            if (result_ != false) {
                output.writeBool(1, result_);
            }
            if (code_ != 0) {
                output.writeUInt32(2, code_);
            }
            if (!getInfoBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, info_);
            }
            if (expose_ != 0) {
                output.writeUInt32(4, expose_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (result_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(1, result_);
            }
            if (code_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, code_);
            }
            if (!getInfoBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, info_);
            }
            if (expose_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, expose_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtoMsg.LoginResponse)) {
                return super.equals(obj);
            }
            ProtoMsg.LoginResponse other = (ProtoMsg.LoginResponse) obj;

            boolean result = true;
            result = result && (getResult()
                    == other.getResult());
            result = result && (getCode()
                    == other.getCode());
            result = result && getInfo()
                    .equals(other.getInfo());
            result = result && (getExpose()
                    == other.getExpose());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RESULT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getResult());
            hash = (37 * hash) + CODE_FIELD_NUMBER;
            hash = (53 * hash) + getCode();
            hash = (37 * hash) + INFO_FIELD_NUMBER;
            hash = (53 * hash) + getInfo().hashCode();
            hash = (37 * hash) + EXPOSE_FIELD_NUMBER;
            hash = (53 * hash) + getExpose();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ProtoMsg.LoginResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.LoginResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.LoginResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.LoginResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ProtoMsg.LoginResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.LoginResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ProtoMsg.LoginResponse prototype) {
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
         * Protobuf type {@code LoginResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:LoginResponse)
                ProtoMsg.LoginResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ProtoMsg.LoginResponse.class, ProtoMsg.LoginResponse.Builder.class);
            }

            // Construct using ProtoMsg.LoginResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                result_ = false;

                code_ = 0;

                info_ = "";

                expose_ = 0;

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_descriptor;
            }

            @Override
            public ProtoMsg.LoginResponse getDefaultInstanceForType() {
                return ProtoMsg.LoginResponse.getDefaultInstance();
            }

            @Override
            public ProtoMsg.LoginResponse build() {
                ProtoMsg.LoginResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public ProtoMsg.LoginResponse buildPartial() {
                ProtoMsg.LoginResponse result = new ProtoMsg.LoginResponse(this);
                result.result_ = result_;
                result.code_ = code_;
                result.info_ = info_;
                result.expose_ = expose_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ProtoMsg.LoginResponse) {
                    return mergeFrom((ProtoMsg.LoginResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ProtoMsg.LoginResponse other) {
                if (other == ProtoMsg.LoginResponse.getDefaultInstance()) return this;
                if (other.getResult() != false) {
                    setResult(other.getResult());
                }
                if (other.getCode() != 0) {
                    setCode(other.getCode());
                }
                if (!other.getInfo().isEmpty()) {
                    info_ = other.info_;
                    onChanged();
                }
                if (other.getExpose() != 0) {
                    setExpose(other.getExpose());
                }
                this.mergeUnknownFields(other.unknownFields);
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
                ProtoMsg.LoginResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ProtoMsg.LoginResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean result_;

            /**
             * <code>bool result = 1;</code>
             */
            public boolean getResult() {
                return result_;
            }

            /**
             * <code>bool result = 1;</code>
             */
            public Builder setResult(boolean value) {

                result_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool result = 1;</code>
             */
            public Builder clearResult() {

                result_ = false;
                onChanged();
                return this;
            }

            private int code_;

            /**
             * <code>uint32 code = 2;</code>
             */
            public int getCode() {
                return code_;
            }

            /**
             * <code>uint32 code = 2;</code>
             */
            public Builder setCode(int value) {

                code_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 code = 2;</code>
             */
            public Builder clearCode() {

                code_ = 0;
                onChanged();
                return this;
            }

            private Object info_ = "";

            /**
             * <code>string debug = 3;</code>
             */
            public String getInfo() {
                Object ref = info_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    info_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string debug = 3;</code>
             */
            public com.google.protobuf.ByteString
            getInfoBytes() {
                Object ref = info_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    info_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string debug = 3;</code>
             */
            public Builder setInfo(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                info_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string debug = 3;</code>
             */
            public Builder clearInfo() {

                info_ = getDefaultInstance().getInfo();
                onChanged();
                return this;
            }

            /**
             * <code>string debug = 3;</code>
             */
            public Builder setInfoBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                info_ = value;
                onChanged();
                return this;
            }

            private int expose_;

            /**
             * <code>uint32 expose = 4;</code>
             */
            public int getExpose() {
                return expose_;
            }

            /**
             * <code>uint32 expose = 4;</code>
             */
            public Builder setExpose(int value) {

                expose_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 expose = 4;</code>
             */
            public Builder clearExpose() {

                expose_ = 0;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:LoginResponse)
        }

        // @@protoc_insertion_point(class_scope:LoginResponse)
        private static final ProtoMsg.LoginResponse DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ProtoMsg.LoginResponse();
        }

        public static ProtoMsg.LoginResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LoginResponse>
                PARSER = new com.google.protobuf.AbstractParser<LoginResponse>() {
            @Override
            public LoginResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LoginResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LoginResponse> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LoginResponse> getParserForType() {
            return PARSER;
        }

        @Override
        public ProtoMsg.LoginResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MessageRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:MessageRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 msg_id = 1;</code>
         */
        long getMsgId();

        /**
         * <code>string from = 2;</code>
         */
        String getFrom();

        /**
         * <code>string from = 2;</code>
         */
        com.google.protobuf.ByteString
        getFromBytes();

        /**
         * <code>string to = 3;</code>
         */
        String getTo();

        /**
         * <code>string to = 3;</code>
         */
        com.google.protobuf.ByteString
        getToBytes();

        /**
         * <code>uint64 time = 4;</code>
         */
        long getTime();

        /**
         * <code>uint32 msg_type = 5;</code>
         */
        int getMsgType();

        /**
         * <code>string content = 6;</code>
         */
        String getContent();

        /**
         * <code>string content = 6;</code>
         */
        com.google.protobuf.ByteString
        getContentBytes();

        /**
         * <code>string url = 8;</code>
         */
        String getUrl();

        /**
         * <code>string url = 8;</code>
         */
        com.google.protobuf.ByteString
        getUrlBytes();

        /**
         * <code>string property = 9;</code>
         */
        String getProperty();

        /**
         * <code>string property = 9;</code>
         */
        com.google.protobuf.ByteString
        getPropertyBytes();

        /**
         * <code>string from_nick = 10;</code>
         */
        String getFromNick();

        /**
         * <code>string from_nick = 10;</code>
         */
        com.google.protobuf.ByteString
        getFromNickBytes();

        /**
         * <code>string json = 11;</code>
         */
        String getJson();

        /**
         * <code>string json = 11;</code>
         */
        com.google.protobuf.ByteString
        getJsonBytes();
    }

    /**
     * Protobuf type {@code MessageRequest}
     */
    public static final class MessageRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:MessageRequest)
            MessageRequestOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use MessageRequest.newBuilder() to construct.
        private MessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MessageRequest() {
            msgId_ = 0L;
            from_ = "";
            to_ = "";
            time_ = 0L;
            msgType_ = 0;
            content_ = "";
            url_ = "";
            property_ = "";
            fromNick_ = "";
            json_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private MessageRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 8: {

                            msgId_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            from_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            to_ = s;
                            break;
                        }
                        case 32: {

                            time_ = input.readUInt64();
                            break;
                        }
                        case 40: {

                            msgType_ = input.readUInt32();
                            break;
                        }
                        case 50: {
                            String s = input.readStringRequireUtf8();

                            content_ = s;
                            break;
                        }
                        case 66: {
                            String s = input.readStringRequireUtf8();

                            url_ = s;
                            break;
                        }
                        case 74: {
                            String s = input.readStringRequireUtf8();

                            property_ = s;
                            break;
                        }
                        case 82: {
                            String s = input.readStringRequireUtf8();

                            fromNick_ = s;
                            break;
                        }
                        case 90: {
                            String s = input.readStringRequireUtf8();

                            json_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownFieldProto3(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
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
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProtoMsg.MessageRequest.class, ProtoMsg.MessageRequest.Builder.class);
        }

        public static final int MSG_ID_FIELD_NUMBER = 1;
        private long msgId_;

        /**
         * <code>uint64 msg_id = 1;</code>
         */
        public long getMsgId() {
            return msgId_;
        }

        public static final int FROM_FIELD_NUMBER = 2;
        private volatile Object from_;

        /**
         * <code>string from = 2;</code>
         */
        public String getFrom() {
            Object ref = from_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                from_ = s;
                return s;
            }
        }

        /**
         * <code>string from = 2;</code>
         */
        public com.google.protobuf.ByteString
        getFromBytes() {
            Object ref = from_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                from_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TO_FIELD_NUMBER = 3;
        private volatile Object to_;

        /**
         * <code>string to = 3;</code>
         */
        public String getTo() {
            Object ref = to_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                to_ = s;
                return s;
            }
        }

        /**
         * <code>string to = 3;</code>
         */
        public com.google.protobuf.ByteString
        getToBytes() {
            Object ref = to_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                to_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TIME_FIELD_NUMBER = 4;
        private long time_;

        /**
         * <code>uint64 time = 4;</code>
         */
        public long getTime() {
            return time_;
        }

        public static final int MSG_TYPE_FIELD_NUMBER = 5;
        private int msgType_;

        /**
         * <code>uint32 msg_type = 5;</code>
         */
        public int getMsgType() {
            return msgType_;
        }

        public static final int CONTENT_FIELD_NUMBER = 6;
        private volatile Object content_;

        /**
         * <code>string content = 6;</code>
         */
        public String getContent() {
            Object ref = content_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                content_ = s;
                return s;
            }
        }

        /**
         * <code>string content = 6;</code>
         */
        public com.google.protobuf.ByteString
        getContentBytes() {
            Object ref = content_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                content_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int URL_FIELD_NUMBER = 8;
        private volatile Object url_;

        /**
         * <code>string url = 8;</code>
         */
        public String getUrl() {
            Object ref = url_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                url_ = s;
                return s;
            }
        }

        /**
         * <code>string url = 8;</code>
         */
        public com.google.protobuf.ByteString
        getUrlBytes() {
            Object ref = url_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                url_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PROPERTY_FIELD_NUMBER = 9;
        private volatile Object property_;

        /**
         * <code>string property = 9;</code>
         */
        public String getProperty() {
            Object ref = property_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                property_ = s;
                return s;
            }
        }

        /**
         * <code>string property = 9;</code>
         */
        public com.google.protobuf.ByteString
        getPropertyBytes() {
            Object ref = property_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                property_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FROM_NICK_FIELD_NUMBER = 10;
        private volatile Object fromNick_;

        /**
         * <code>string from_nick = 10;</code>
         */
        public String getFromNick() {
            Object ref = fromNick_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                fromNick_ = s;
                return s;
            }
        }

        /**
         * <code>string from_nick = 10;</code>
         */
        public com.google.protobuf.ByteString
        getFromNickBytes() {
            Object ref = fromNick_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                fromNick_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int JSON_FIELD_NUMBER = 11;
        private volatile Object json_;

        /**
         * <code>string json = 11;</code>
         */
        public String getJson() {
            Object ref = json_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                json_ = s;
                return s;
            }
        }

        /**
         * <code>string json = 11;</code>
         */
        public com.google.protobuf.ByteString
        getJsonBytes() {
            Object ref = json_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                json_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (msgId_ != 0L) {
                output.writeUInt64(1, msgId_);
            }
            if (!getFromBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, from_);
            }
            if (!getToBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, to_);
            }
            if (time_ != 0L) {
                output.writeUInt64(4, time_);
            }
            if (msgType_ != 0) {
                output.writeUInt32(5, msgType_);
            }
            if (!getContentBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, content_);
            }
            if (!getUrlBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 8, url_);
            }
            if (!getPropertyBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 9, property_);
            }
            if (!getFromNickBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 10, fromNick_);
            }
            if (!getJsonBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 11, json_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (msgId_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, msgId_);
            }
            if (!getFromBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, from_);
            }
            if (!getToBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, to_);
            }
            if (time_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(4, time_);
            }
            if (msgType_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(5, msgType_);
            }
            if (!getContentBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, content_);
            }
            if (!getUrlBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, url_);
            }
            if (!getPropertyBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, property_);
            }
            if (!getFromNickBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, fromNick_);
            }
            if (!getJsonBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, json_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtoMsg.MessageRequest)) {
                return super.equals(obj);
            }
            ProtoMsg.MessageRequest other = (ProtoMsg.MessageRequest) obj;

            boolean result = true;
            result = result && (getMsgId()
                    == other.getMsgId());
            result = result && getFrom()
                    .equals(other.getFrom());
            result = result && getTo()
                    .equals(other.getTo());
            result = result && (getTime()
                    == other.getTime());
            result = result && (getMsgType()
                    == other.getMsgType());
            result = result && getContent()
                    .equals(other.getContent());
            result = result && getUrl()
                    .equals(other.getUrl());
            result = result && getProperty()
                    .equals(other.getProperty());
            result = result && getFromNick()
                    .equals(other.getFromNick());
            result = result && getJson()
                    .equals(other.getJson());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MSG_ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getMsgId());
            hash = (37 * hash) + FROM_FIELD_NUMBER;
            hash = (53 * hash) + getFrom().hashCode();
            hash = (37 * hash) + TO_FIELD_NUMBER;
            hash = (53 * hash) + getTo().hashCode();
            hash = (37 * hash) + TIME_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getTime());
            hash = (37 * hash) + MSG_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getMsgType();
            hash = (37 * hash) + CONTENT_FIELD_NUMBER;
            hash = (53 * hash) + getContent().hashCode();
            hash = (37 * hash) + URL_FIELD_NUMBER;
            hash = (53 * hash) + getUrl().hashCode();
            hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
            hash = (53 * hash) + getProperty().hashCode();
            hash = (37 * hash) + FROM_NICK_FIELD_NUMBER;
            hash = (53 * hash) + getFromNick().hashCode();
            hash = (37 * hash) + JSON_FIELD_NUMBER;
            hash = (53 * hash) + getJson().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ProtoMsg.MessageRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.MessageRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ProtoMsg.MessageRequest prototype) {
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
         * Protobuf type {@code MessageRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:MessageRequest)
                ProtoMsg.MessageRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ProtoMsg.MessageRequest.class, ProtoMsg.MessageRequest.Builder.class);
            }

            // Construct using ProtoMsg.MessageRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                msgId_ = 0L;

                from_ = "";

                to_ = "";

                time_ = 0L;

                msgType_ = 0;

                content_ = "";

                url_ = "";

                property_ = "";

                fromNick_ = "";

                json_ = "";

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_descriptor;
            }

            @Override
            public ProtoMsg.MessageRequest getDefaultInstanceForType() {
                return ProtoMsg.MessageRequest.getDefaultInstance();
            }

            @Override
            public ProtoMsg.MessageRequest build() {
                ProtoMsg.MessageRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public ProtoMsg.MessageRequest buildPartial() {
                ProtoMsg.MessageRequest result = new ProtoMsg.MessageRequest(this);
                result.msgId_ = msgId_;
                result.from_ = from_;
                result.to_ = to_;
                result.time_ = time_;
                result.msgType_ = msgType_;
                result.content_ = content_;
                result.url_ = url_;
                result.property_ = property_;
                result.fromNick_ = fromNick_;
                result.json_ = json_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ProtoMsg.MessageRequest) {
                    return mergeFrom((ProtoMsg.MessageRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ProtoMsg.MessageRequest other) {
                if (other == ProtoMsg.MessageRequest.getDefaultInstance()) return this;
                if (other.getMsgId() != 0L) {
                    setMsgId(other.getMsgId());
                }
                if (!other.getFrom().isEmpty()) {
                    from_ = other.from_;
                    onChanged();
                }
                if (!other.getTo().isEmpty()) {
                    to_ = other.to_;
                    onChanged();
                }
                if (other.getTime() != 0L) {
                    setTime(other.getTime());
                }
                if (other.getMsgType() != 0) {
                    setMsgType(other.getMsgType());
                }
                if (!other.getContent().isEmpty()) {
                    content_ = other.content_;
                    onChanged();
                }
                if (!other.getUrl().isEmpty()) {
                    url_ = other.url_;
                    onChanged();
                }
                if (!other.getProperty().isEmpty()) {
                    property_ = other.property_;
                    onChanged();
                }
                if (!other.getFromNick().isEmpty()) {
                    fromNick_ = other.fromNick_;
                    onChanged();
                }
                if (!other.getJson().isEmpty()) {
                    json_ = other.json_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
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
                ProtoMsg.MessageRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ProtoMsg.MessageRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long msgId_;

            /**
             * <code>uint64 msg_id = 1;</code>
             */
            public long getMsgId() {
                return msgId_;
            }

            /**
             * <code>uint64 msg_id = 1;</code>
             */
            public Builder setMsgId(long value) {

                msgId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 msg_id = 1;</code>
             */
            public Builder clearMsgId() {

                msgId_ = 0L;
                onChanged();
                return this;
            }

            private Object from_ = "";

            /**
             * <code>string from = 2;</code>
             */
            public String getFrom() {
                Object ref = from_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    from_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string from = 2;</code>
             */
            public com.google.protobuf.ByteString
            getFromBytes() {
                Object ref = from_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    from_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string from = 2;</code>
             */
            public Builder setFrom(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                from_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string from = 2;</code>
             */
            public Builder clearFrom() {

                from_ = getDefaultInstance().getFrom();
                onChanged();
                return this;
            }

            /**
             * <code>string from = 2;</code>
             */
            public Builder setFromBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                from_ = value;
                onChanged();
                return this;
            }

            private Object to_ = "";

            /**
             * <code>string to = 3;</code>
             */
            public String getTo() {
                Object ref = to_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    to_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string to = 3;</code>
             */
            public com.google.protobuf.ByteString
            getToBytes() {
                Object ref = to_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    to_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string to = 3;</code>
             */
            public Builder setTo(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                to_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string to = 3;</code>
             */
            public Builder clearTo() {

                to_ = getDefaultInstance().getTo();
                onChanged();
                return this;
            }

            /**
             * <code>string to = 3;</code>
             */
            public Builder setToBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                to_ = value;
                onChanged();
                return this;
            }

            private long time_;

            /**
             * <code>uint64 time = 4;</code>
             */
            public long getTime() {
                return time_;
            }

            /**
             * <code>uint64 time = 4;</code>
             */
            public Builder setTime(long value) {

                time_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 time = 4;</code>
             */
            public Builder clearTime() {

                time_ = 0L;
                onChanged();
                return this;
            }

            private int msgType_;

            /**
             * <code>uint32 msg_type = 5;</code>
             */
            public int getMsgType() {
                return msgType_;
            }

            /**
             * <code>uint32 msg_type = 5;</code>
             */
            public Builder setMsgType(int value) {

                msgType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 msg_type = 5;</code>
             */
            public Builder clearMsgType() {

                msgType_ = 0;
                onChanged();
                return this;
            }

            private Object content_ = "";

            /**
             * <code>string content = 6;</code>
             */
            public String getContent() {
                Object ref = content_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    content_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string content = 6;</code>
             */
            public com.google.protobuf.ByteString
            getContentBytes() {
                Object ref = content_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    content_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string content = 6;</code>
             */
            public Builder setContent(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                content_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string content = 6;</code>
             */
            public Builder clearContent() {

                content_ = getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            /**
             * <code>string content = 6;</code>
             */
            public Builder setContentBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                content_ = value;
                onChanged();
                return this;
            }

            private Object url_ = "";

            /**
             * <code>string url = 8;</code>
             */
            public String getUrl() {
                Object ref = url_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    url_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string url = 8;</code>
             */
            public com.google.protobuf.ByteString
            getUrlBytes() {
                Object ref = url_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    url_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string url = 8;</code>
             */
            public Builder setUrl(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                url_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string url = 8;</code>
             */
            public Builder clearUrl() {

                url_ = getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            /**
             * <code>string url = 8;</code>
             */
            public Builder setUrlBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                url_ = value;
                onChanged();
                return this;
            }

            private Object property_ = "";

            /**
             * <code>string property = 9;</code>
             */
            public String getProperty() {
                Object ref = property_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    property_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string property = 9;</code>
             */
            public com.google.protobuf.ByteString
            getPropertyBytes() {
                Object ref = property_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    property_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string property = 9;</code>
             */
            public Builder setProperty(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                property_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string property = 9;</code>
             */
            public Builder clearProperty() {

                property_ = getDefaultInstance().getProperty();
                onChanged();
                return this;
            }

            /**
             * <code>string property = 9;</code>
             */
            public Builder setPropertyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                property_ = value;
                onChanged();
                return this;
            }

            private Object fromNick_ = "";

            /**
             * <code>string from_nick = 10;</code>
             */
            public String getFromNick() {
                Object ref = fromNick_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    fromNick_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string from_nick = 10;</code>
             */
            public com.google.protobuf.ByteString
            getFromNickBytes() {
                Object ref = fromNick_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    fromNick_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string from_nick = 10;</code>
             */
            public Builder setFromNick(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                fromNick_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string from_nick = 10;</code>
             */
            public Builder clearFromNick() {

                fromNick_ = getDefaultInstance().getFromNick();
                onChanged();
                return this;
            }

            /**
             * <code>string from_nick = 10;</code>
             */
            public Builder setFromNickBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                fromNick_ = value;
                onChanged();
                return this;
            }

            private Object json_ = "";

            /**
             * <code>string json = 11;</code>
             */
            public String getJson() {
                Object ref = json_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    json_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string json = 11;</code>
             */
            public com.google.protobuf.ByteString
            getJsonBytes() {
                Object ref = json_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    json_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string json = 11;</code>
             */
            public Builder setJson(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                json_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string json = 11;</code>
             */
            public Builder clearJson() {

                json_ = getDefaultInstance().getJson();
                onChanged();
                return this;
            }

            /**
             * <code>string json = 11;</code>
             */
            public Builder setJsonBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                json_ = value;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:MessageRequest)
        }

        // @@protoc_insertion_point(class_scope:MessageRequest)
        private static final ProtoMsg.MessageRequest DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ProtoMsg.MessageRequest();
        }

        public static ProtoMsg.MessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MessageRequest>
                PARSER = new com.google.protobuf.AbstractParser<MessageRequest>() {
            @Override
            public MessageRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new MessageRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<MessageRequest> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<MessageRequest> getParserForType() {
            return PARSER;
        }

        @Override
        public ProtoMsg.MessageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MessageResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:MessageResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool result = 1;</code>
         */
        boolean getResult();

        /**
         * <code>uint32 code = 2;</code>
         */
        int getCode();

        /**
         * <code>string debug = 3;</code>
         */
        String getInfo();

        /**
         * <code>string debug = 3;</code>
         */
        com.google.protobuf.ByteString
        getInfoBytes();

        /**
         * <code>uint32 expose = 4;</code>
         */
        int getExpose();

        /**
         * <code>bool last_block = 5;</code>
         */
        boolean getLastBlock();

        /**
         * <code>fixed32 block_index = 6;</code>
         */
        int getBlockIndex();
    }

    /**
     * Protobuf type {@code MessageResponse}
     */
    public static final class MessageResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:MessageResponse)
            MessageResponseOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use MessageResponse.newBuilder() to construct.
        private MessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MessageResponse() {
            result_ = false;
            code_ = 0;
            info_ = "";
            expose_ = 0;
            lastBlock_ = false;
            blockIndex_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private MessageResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 8: {

                            result_ = input.readBool();
                            break;
                        }
                        case 16: {

                            code_ = input.readUInt32();
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            info_ = s;
                            break;
                        }
                        case 32: {

                            expose_ = input.readUInt32();
                            break;
                        }
                        case 40: {

                            lastBlock_ = input.readBool();
                            break;
                        }
                        case 53: {

                            blockIndex_ = input.readFixed32();
                            break;
                        }
                        default: {
                            if (!parseUnknownFieldProto3(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
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
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProtoMsg.MessageResponse.class, ProtoMsg.MessageResponse.Builder.class);
        }

        public static final int RESULT_FIELD_NUMBER = 1;
        private boolean result_;

        /**
         * <code>bool result = 1;</code>
         */
        public boolean getResult() {
            return result_;
        }

        public static final int CODE_FIELD_NUMBER = 2;
        private int code_;

        /**
         * <code>uint32 code = 2;</code>
         */
        public int getCode() {
            return code_;
        }

        public static final int INFO_FIELD_NUMBER = 3;
        private volatile Object info_;

        /**
         * <code>string debug = 3;</code>
         */
        public String getInfo() {
            Object ref = info_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                info_ = s;
                return s;
            }
        }

        /**
         * <code>string debug = 3;</code>
         */
        public com.google.protobuf.ByteString
        getInfoBytes() {
            Object ref = info_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                info_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int EXPOSE_FIELD_NUMBER = 4;
        private int expose_;

        /**
         * <code>uint32 expose = 4;</code>
         */
        public int getExpose() {
            return expose_;
        }

        public static final int LAST_BLOCK_FIELD_NUMBER = 5;
        private boolean lastBlock_;

        /**
         * <code>bool last_block = 5;</code>
         */
        public boolean getLastBlock() {
            return lastBlock_;
        }

        public static final int BLOCK_INDEX_FIELD_NUMBER = 6;
        private int blockIndex_;

        /**
         * <code>fixed32 block_index = 6;</code>
         */
        public int getBlockIndex() {
            return blockIndex_;
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
            if (result_ != false) {
                output.writeBool(1, result_);
            }
            if (code_ != 0) {
                output.writeUInt32(2, code_);
            }
            if (!getInfoBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, info_);
            }
            if (expose_ != 0) {
                output.writeUInt32(4, expose_);
            }
            if (lastBlock_ != false) {
                output.writeBool(5, lastBlock_);
            }
            if (blockIndex_ != 0) {
                output.writeFixed32(6, blockIndex_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (result_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(1, result_);
            }
            if (code_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, code_);
            }
            if (!getInfoBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, info_);
            }
            if (expose_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, expose_);
            }
            if (lastBlock_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(5, lastBlock_);
            }
            if (blockIndex_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFixed32Size(6, blockIndex_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtoMsg.MessageResponse)) {
                return super.equals(obj);
            }
            ProtoMsg.MessageResponse other = (ProtoMsg.MessageResponse) obj;

            boolean result = true;
            result = result && (getResult()
                    == other.getResult());
            result = result && (getCode()
                    == other.getCode());
            result = result && getInfo()
                    .equals(other.getInfo());
            result = result && (getExpose()
                    == other.getExpose());
            result = result && (getLastBlock()
                    == other.getLastBlock());
            result = result && (getBlockIndex()
                    == other.getBlockIndex());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RESULT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getResult());
            hash = (37 * hash) + CODE_FIELD_NUMBER;
            hash = (53 * hash) + getCode();
            hash = (37 * hash) + INFO_FIELD_NUMBER;
            hash = (53 * hash) + getInfo().hashCode();
            hash = (37 * hash) + EXPOSE_FIELD_NUMBER;
            hash = (53 * hash) + getExpose();
            hash = (37 * hash) + LAST_BLOCK_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getLastBlock());
            hash = (37 * hash) + BLOCK_INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getBlockIndex();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ProtoMsg.MessageResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.MessageResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ProtoMsg.MessageResponse prototype) {
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
         * Protobuf type {@code MessageResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:MessageResponse)
                ProtoMsg.MessageResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ProtoMsg.MessageResponse.class, ProtoMsg.MessageResponse.Builder.class);
            }

            // Construct using ProtoMsg.MessageResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                result_ = false;

                code_ = 0;

                info_ = "";

                expose_ = 0;

                lastBlock_ = false;

                blockIndex_ = 0;

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_descriptor;
            }

            @Override
            public ProtoMsg.MessageResponse getDefaultInstanceForType() {
                return ProtoMsg.MessageResponse.getDefaultInstance();
            }

            @Override
            public ProtoMsg.MessageResponse build() {
                ProtoMsg.MessageResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public ProtoMsg.MessageResponse buildPartial() {
                ProtoMsg.MessageResponse result = new ProtoMsg.MessageResponse(this);
                result.result_ = result_;
                result.code_ = code_;
                result.info_ = info_;
                result.expose_ = expose_;
                result.lastBlock_ = lastBlock_;
                result.blockIndex_ = blockIndex_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ProtoMsg.MessageResponse) {
                    return mergeFrom((ProtoMsg.MessageResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ProtoMsg.MessageResponse other) {
                if (other == ProtoMsg.MessageResponse.getDefaultInstance()) return this;
                if (other.getResult() != false) {
                    setResult(other.getResult());
                }
                if (other.getCode() != 0) {
                    setCode(other.getCode());
                }
                if (!other.getInfo().isEmpty()) {
                    info_ = other.info_;
                    onChanged();
                }
                if (other.getExpose() != 0) {
                    setExpose(other.getExpose());
                }
                if (other.getLastBlock() != false) {
                    setLastBlock(other.getLastBlock());
                }
                if (other.getBlockIndex() != 0) {
                    setBlockIndex(other.getBlockIndex());
                }
                this.mergeUnknownFields(other.unknownFields);
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
                ProtoMsg.MessageResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ProtoMsg.MessageResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean result_;

            /**
             * <code>bool result = 1;</code>
             */
            public boolean getResult() {
                return result_;
            }

            /**
             * <code>bool result = 1;</code>
             */
            public Builder setResult(boolean value) {

                result_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool result = 1;</code>
             */
            public Builder clearResult() {

                result_ = false;
                onChanged();
                return this;
            }

            private int code_;

            /**
             * <code>uint32 code = 2;</code>
             */
            public int getCode() {
                return code_;
            }

            /**
             * <code>uint32 code = 2;</code>
             */
            public Builder setCode(int value) {

                code_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 code = 2;</code>
             */
            public Builder clearCode() {

                code_ = 0;
                onChanged();
                return this;
            }

            private Object info_ = "";

            /**
             * <code>string debug = 3;</code>
             */
            public String getInfo() {
                Object ref = info_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    info_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string debug = 3;</code>
             */
            public com.google.protobuf.ByteString
            getInfoBytes() {
                Object ref = info_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    info_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string debug = 3;</code>
             */
            public Builder setInfo(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                info_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string debug = 3;</code>
             */
            public Builder clearInfo() {

                info_ = getDefaultInstance().getInfo();
                onChanged();
                return this;
            }

            /**
             * <code>string debug = 3;</code>
             */
            public Builder setInfoBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                info_ = value;
                onChanged();
                return this;
            }

            private int expose_;

            /**
             * <code>uint32 expose = 4;</code>
             */
            public int getExpose() {
                return expose_;
            }

            /**
             * <code>uint32 expose = 4;</code>
             */
            public Builder setExpose(int value) {

                expose_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 expose = 4;</code>
             */
            public Builder clearExpose() {

                expose_ = 0;
                onChanged();
                return this;
            }

            private boolean lastBlock_;

            /**
             * <code>bool last_block = 5;</code>
             */
            public boolean getLastBlock() {
                return lastBlock_;
            }

            /**
             * <code>bool last_block = 5;</code>
             */
            public Builder setLastBlock(boolean value) {

                lastBlock_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool last_block = 5;</code>
             */
            public Builder clearLastBlock() {

                lastBlock_ = false;
                onChanged();
                return this;
            }

            private int blockIndex_;

            /**
             * <code>fixed32 block_index = 6;</code>
             */
            public int getBlockIndex() {
                return blockIndex_;
            }

            /**
             * <code>fixed32 block_index = 6;</code>
             */
            public Builder setBlockIndex(int value) {

                blockIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>fixed32 block_index = 6;</code>
             */
            public Builder clearBlockIndex() {

                blockIndex_ = 0;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:MessageResponse)
        }

        // @@protoc_insertion_point(class_scope:MessageResponse)
        private static final ProtoMsg.MessageResponse DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ProtoMsg.MessageResponse();
        }

        public static ProtoMsg.MessageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MessageResponse>
                PARSER = new com.google.protobuf.AbstractParser<MessageResponse>() {
            @Override
            public MessageResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new MessageResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<MessageResponse> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<MessageResponse> getParserForType() {
            return PARSER;
        }

        @Override
        public ProtoMsg.MessageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MessageNotificationOrBuilder extends
            // @@protoc_insertion_point(interface_extends:MessageNotification)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 msg_type = 1;</code>
         */
        int getMsgType();

        /**
         * <code>bytes sender = 2;</code>
         */
        com.google.protobuf.ByteString getSender();

        /**
         * <code>string json = 3;</code>
         */
        String getJson();

        /**
         * <code>string json = 3;</code>
         */
        com.google.protobuf.ByteString
        getJsonBytes();

        /**
         * <code>string timestamp = 4;</code>
         */
        String getTimestamp();

        /**
         * <code>string timestamp = 4;</code>
         */
        com.google.protobuf.ByteString
        getTimestampBytes();
    }

    /**
     * Protobuf type {@code MessageNotification}
     */
    public static final class MessageNotification extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:MessageNotification)
            MessageNotificationOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use MessageNotification.newBuilder() to construct.
        private MessageNotification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MessageNotification() {
            msgType_ = 0;
            sender_ = com.google.protobuf.ByteString.EMPTY;
            json_ = "";
            timestamp_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private MessageNotification(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 8: {

                            msgType_ = input.readUInt32();
                            break;
                        }
                        case 18: {

                            sender_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            json_ = s;
                            break;
                        }
                        case 34: {
                            String s = input.readStringRequireUtf8();

                            timestamp_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownFieldProto3(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
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
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProtoMsg.MessageNotification.class, ProtoMsg.MessageNotification.Builder.class);
        }

        public static final int MSG_TYPE_FIELD_NUMBER = 1;
        private int msgType_;

        /**
         * <code>uint32 msg_type = 1;</code>
         */
        public int getMsgType() {
            return msgType_;
        }

        public static final int SENDER_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString sender_;

        /**
         * <code>bytes sender = 2;</code>
         */
        public com.google.protobuf.ByteString getSender() {
            return sender_;
        }

        public static final int JSON_FIELD_NUMBER = 3;
        private volatile Object json_;

        /**
         * <code>string json = 3;</code>
         */
        public String getJson() {
            Object ref = json_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                json_ = s;
                return s;
            }
        }

        /**
         * <code>string json = 3;</code>
         */
        public com.google.protobuf.ByteString
        getJsonBytes() {
            Object ref = json_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                json_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private volatile Object timestamp_;

        /**
         * <code>string timestamp = 4;</code>
         */
        public String getTimestamp() {
            Object ref = timestamp_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                timestamp_ = s;
                return s;
            }
        }

        /**
         * <code>string timestamp = 4;</code>
         */
        public com.google.protobuf.ByteString
        getTimestampBytes() {
            Object ref = timestamp_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                timestamp_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (msgType_ != 0) {
                output.writeUInt32(1, msgType_);
            }
            if (!sender_.isEmpty()) {
                output.writeBytes(2, sender_);
            }
            if (!getJsonBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, json_);
            }
            if (!getTimestampBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, timestamp_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (msgType_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, msgType_);
            }
            if (!sender_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, sender_);
            }
            if (!getJsonBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, json_);
            }
            if (!getTimestampBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, timestamp_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtoMsg.MessageNotification)) {
                return super.equals(obj);
            }
            ProtoMsg.MessageNotification other = (ProtoMsg.MessageNotification) obj;

            boolean result = true;
            result = result && (getMsgType()
                    == other.getMsgType());
            result = result && getSender()
                    .equals(other.getSender());
            result = result && getJson()
                    .equals(other.getJson());
            result = result && getTimestamp()
                    .equals(other.getTimestamp());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MSG_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + getMsgType();
            hash = (37 * hash) + SENDER_FIELD_NUMBER;
            hash = (53 * hash) + getSender().hashCode();
            hash = (37 * hash) + JSON_FIELD_NUMBER;
            hash = (53 * hash) + getJson().hashCode();
            hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
            hash = (53 * hash) + getTimestamp().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ProtoMsg.MessageNotification parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageNotification parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.MessageNotification parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.MessageNotification parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageNotification parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.MessageNotification parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ProtoMsg.MessageNotification prototype) {
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
         * Protobuf type {@code MessageNotification}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:MessageNotification)
                ProtoMsg.MessageNotificationOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ProtoMsg.MessageNotification.class, ProtoMsg.MessageNotification.Builder.class);
            }

            // Construct using ProtoMsg.MessageNotification.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                msgType_ = 0;

                sender_ = com.google.protobuf.ByteString.EMPTY;

                json_ = "";

                timestamp_ = "";

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_descriptor;
            }

            @Override
            public ProtoMsg.MessageNotification getDefaultInstanceForType() {
                return ProtoMsg.MessageNotification.getDefaultInstance();
            }

            @Override
            public ProtoMsg.MessageNotification build() {
                ProtoMsg.MessageNotification result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public ProtoMsg.MessageNotification buildPartial() {
                ProtoMsg.MessageNotification result = new ProtoMsg.MessageNotification(this);
                result.msgType_ = msgType_;
                result.sender_ = sender_;
                result.json_ = json_;
                result.timestamp_ = timestamp_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ProtoMsg.MessageNotification) {
                    return mergeFrom((ProtoMsg.MessageNotification) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ProtoMsg.MessageNotification other) {
                if (other == ProtoMsg.MessageNotification.getDefaultInstance()) return this;
                if (other.getMsgType() != 0) {
                    setMsgType(other.getMsgType());
                }
                if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
                    setSender(other.getSender());
                }
                if (!other.getJson().isEmpty()) {
                    json_ = other.json_;
                    onChanged();
                }
                if (!other.getTimestamp().isEmpty()) {
                    timestamp_ = other.timestamp_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
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
                ProtoMsg.MessageNotification parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ProtoMsg.MessageNotification) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int msgType_;

            /**
             * <code>uint32 msg_type = 1;</code>
             */
            public int getMsgType() {
                return msgType_;
            }

            /**
             * <code>uint32 msg_type = 1;</code>
             */
            public Builder setMsgType(int value) {

                msgType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 msg_type = 1;</code>
             */
            public Builder clearMsgType() {

                msgType_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <code>bytes sender = 2;</code>
             */
            public com.google.protobuf.ByteString getSender() {
                return sender_;
            }

            /**
             * <code>bytes sender = 2;</code>
             */
            public Builder setSender(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sender_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bytes sender = 2;</code>
             */
            public Builder clearSender() {

                sender_ = getDefaultInstance().getSender();
                onChanged();
                return this;
            }

            private Object json_ = "";

            /**
             * <code>string json = 3;</code>
             */
            public String getJson() {
                Object ref = json_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    json_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string json = 3;</code>
             */
            public com.google.protobuf.ByteString
            getJsonBytes() {
                Object ref = json_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    json_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string json = 3;</code>
             */
            public Builder setJson(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                json_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string json = 3;</code>
             */
            public Builder clearJson() {

                json_ = getDefaultInstance().getJson();
                onChanged();
                return this;
            }

            /**
             * <code>string json = 3;</code>
             */
            public Builder setJsonBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                json_ = value;
                onChanged();
                return this;
            }

            private Object timestamp_ = "";

            /**
             * <code>string timestamp = 4;</code>
             */
            public String getTimestamp() {
                Object ref = timestamp_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    timestamp_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string timestamp = 4;</code>
             */
            public com.google.protobuf.ByteString
            getTimestampBytes() {
                Object ref = timestamp_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    timestamp_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string timestamp = 4;</code>
             */
            public Builder setTimestamp(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                timestamp_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string timestamp = 4;</code>
             */
            public Builder clearTimestamp() {

                timestamp_ = getDefaultInstance().getTimestamp();
                onChanged();
                return this;
            }

            /**
             * <code>string timestamp = 4;</code>
             */
            public Builder setTimestampBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                timestamp_ = value;
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:MessageNotification)
        }

        // @@protoc_insertion_point(class_scope:MessageNotification)
        private static final ProtoMsg.MessageNotification DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ProtoMsg.MessageNotification();
        }

        public static ProtoMsg.MessageNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MessageNotification>
                PARSER = new com.google.protobuf.AbstractParser<MessageNotification>() {
            @Override
            public MessageNotification parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new MessageNotification(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<MessageNotification> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<MessageNotification> getParserForType() {
            return PARSER;
        }

        @Override
        public ProtoMsg.MessageNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MessageOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Message)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.HeadType type = 1;</code>
         */
        int getTypeValue();

        /**
         * <code>.HeadType type = 1;</code>
         */
        ProtoMsg.HeadType getType();

        /**
         * <code>uint64 sequence = 2;</code>
         */
        long getSequence();

        /**
         * <code>string session_id = 3;</code>
         */
        String getSessionId();

        /**
         * <code>string session_id = 3;</code>
         */
        com.google.protobuf.ByteString
        getSessionIdBytes();

        /**
         * <code>.LoginRequest loginRequest = 4;</code>
         */
        boolean hasLoginRequest();

        /**
         * <code>.LoginRequest loginRequest = 4;</code>
         */
        ProtoMsg.LoginRequest getLoginRequest();

        /**
         * <code>.LoginRequest loginRequest = 4;</code>
         */
        ProtoMsg.LoginRequestOrBuilder getLoginRequestOrBuilder();

        /**
         * <code>.LoginResponse loginResponse = 5;</code>
         */
        boolean hasLoginResponse();

        /**
         * <code>.LoginResponse loginResponse = 5;</code>
         */
        ProtoMsg.LoginResponse getLoginResponse();

        /**
         * <code>.LoginResponse loginResponse = 5;</code>
         */
        ProtoMsg.LoginResponseOrBuilder getLoginResponseOrBuilder();

        /**
         * <code>.MessageRequest messageRequest = 6;</code>
         */
        boolean hasMessageRequest();

        /**
         * <code>.MessageRequest messageRequest = 6;</code>
         */
        ProtoMsg.MessageRequest getMessageRequest();

        /**
         * <code>.MessageRequest messageRequest = 6;</code>
         */
        ProtoMsg.MessageRequestOrBuilder getMessageRequestOrBuilder();

        /**
         * <code>.MessageResponse messageResponse = 7;</code>
         */
        boolean hasMessageResponse();

        /**
         * <code>.MessageResponse messageResponse = 7;</code>
         */
        ProtoMsg.MessageResponse getMessageResponse();

        /**
         * <code>.MessageResponse messageResponse = 7;</code>
         */
        ProtoMsg.MessageResponseOrBuilder getMessageResponseOrBuilder();

        /**
         * <code>.MessageNotification notification = 8;</code>
         */
        boolean hasNotification();

        /**
         * <code>.MessageNotification notification = 8;</code>
         */
        ProtoMsg.MessageNotification getNotification();

        /**
         * <code>.MessageNotification notification = 8;</code>
         */
        ProtoMsg.MessageNotificationOrBuilder getNotificationOrBuilder();
    }

    /**
     * Protobuf type {@code Message}
     */
    public static final class Message extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Message)
            MessageOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use Message.newBuilder() to construct.
        private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Message() {
            type_ = 0;
            sequence_ = 0L;
            sessionId_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Message(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 8: {
                            int rawValue = input.readEnum();

                            type_ = rawValue;
                            break;
                        }
                        case 16: {

                            sequence_ = input.readUInt64();
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            sessionId_ = s;
                            break;
                        }
                        case 34: {
                            ProtoMsg.LoginRequest.Builder subBuilder = null;
                            if (loginRequest_ != null) {
                                subBuilder = loginRequest_.toBuilder();
                            }
                            loginRequest_ = input.readMessage(ProtoMsg.LoginRequest.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(loginRequest_);
                                loginRequest_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 42: {
                            ProtoMsg.LoginResponse.Builder subBuilder = null;
                            if (loginResponse_ != null) {
                                subBuilder = loginResponse_.toBuilder();
                            }
                            loginResponse_ = input.readMessage(ProtoMsg.LoginResponse.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(loginResponse_);
                                loginResponse_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 50: {
                            ProtoMsg.MessageRequest.Builder subBuilder = null;
                            if (messageRequest_ != null) {
                                subBuilder = messageRequest_.toBuilder();
                            }
                            messageRequest_ = input.readMessage(ProtoMsg.MessageRequest.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(messageRequest_);
                                messageRequest_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 58: {
                            ProtoMsg.MessageResponse.Builder subBuilder = null;
                            if (messageResponse_ != null) {
                                subBuilder = messageResponse_.toBuilder();
                            }
                            messageResponse_ = input.readMessage(ProtoMsg.MessageResponse.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(messageResponse_);
                                messageResponse_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 66: {
                            ProtoMsg.MessageNotification.Builder subBuilder = null;
                            if (notification_ != null) {
                                subBuilder = notification_.toBuilder();
                            }
                            notification_ = input.readMessage(ProtoMsg.MessageNotification.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(notification_);
                                notification_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownFieldProto3(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
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
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_Message_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_Message_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProtoMsg.Message.class, ProtoMsg.Message.Builder.class);
        }

        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        /**
         * <code>.HeadType type = 1;</code>
         */
        public int getTypeValue() {
            return type_;
        }

        /**
         * <code>.HeadType type = 1;</code>
         */
        public ProtoMsg.HeadType getType() {
            @SuppressWarnings("deprecation")
            ProtoMsg.HeadType result = ProtoMsg.HeadType.valueOf(type_);
            return result == null ? ProtoMsg.HeadType.UNRECOGNIZED : result;
        }

        public static final int SEQUENCE_FIELD_NUMBER = 2;
        private long sequence_;

        /**
         * <code>uint64 sequence = 2;</code>
         */
        public long getSequence() {
            return sequence_;
        }

        public static final int SESSION_ID_FIELD_NUMBER = 3;
        private volatile Object sessionId_;

        /**
         * <code>string session_id = 3;</code>
         */
        public String getSessionId() {
            Object ref = sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                sessionId_ = s;
                return s;
            }
        }

        /**
         * <code>string session_id = 3;</code>
         */
        public com.google.protobuf.ByteString
        getSessionIdBytes() {
            Object ref = sessionId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                sessionId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LOGINREQUEST_FIELD_NUMBER = 4;
        private ProtoMsg.LoginRequest loginRequest_;

        /**
         * <code>.LoginRequest loginRequest = 4;</code>
         */
        public boolean hasLoginRequest() {
            return loginRequest_ != null;
        }

        /**
         * <code>.LoginRequest loginRequest = 4;</code>
         */
        public ProtoMsg.LoginRequest getLoginRequest() {
            return loginRequest_ == null ? ProtoMsg.LoginRequest.getDefaultInstance() : loginRequest_;
        }

        /**
         * <code>.LoginRequest loginRequest = 4;</code>
         */
        public ProtoMsg.LoginRequestOrBuilder getLoginRequestOrBuilder() {
            return getLoginRequest();
        }

        public static final int LOGINRESPONSE_FIELD_NUMBER = 5;
        private ProtoMsg.LoginResponse loginResponse_;

        /**
         * <code>.LoginResponse loginResponse = 5;</code>
         */
        public boolean hasLoginResponse() {
            return loginResponse_ != null;
        }

        /**
         * <code>.LoginResponse loginResponse = 5;</code>
         */
        public ProtoMsg.LoginResponse getLoginResponse() {
            return loginResponse_ == null ? ProtoMsg.LoginResponse.getDefaultInstance() : loginResponse_;
        }

        /**
         * <code>.LoginResponse loginResponse = 5;</code>
         */
        public ProtoMsg.LoginResponseOrBuilder getLoginResponseOrBuilder() {
            return getLoginResponse();
        }

        public static final int MESSAGEREQUEST_FIELD_NUMBER = 6;
        private ProtoMsg.MessageRequest messageRequest_;

        /**
         * <code>.MessageRequest messageRequest = 6;</code>
         */
        public boolean hasMessageRequest() {
            return messageRequest_ != null;
        }

        /**
         * <code>.MessageRequest messageRequest = 6;</code>
         */
        public ProtoMsg.MessageRequest getMessageRequest() {
            return messageRequest_ == null ? ProtoMsg.MessageRequest.getDefaultInstance() : messageRequest_;
        }

        /**
         * <code>.MessageRequest messageRequest = 6;</code>
         */
        public ProtoMsg.MessageRequestOrBuilder getMessageRequestOrBuilder() {
            return getMessageRequest();
        }

        public static final int MESSAGERESPONSE_FIELD_NUMBER = 7;
        private ProtoMsg.MessageResponse messageResponse_;

        /**
         * <code>.MessageResponse messageResponse = 7;</code>
         */
        public boolean hasMessageResponse() {
            return messageResponse_ != null;
        }

        /**
         * <code>.MessageResponse messageResponse = 7;</code>
         */
        public ProtoMsg.MessageResponse getMessageResponse() {
            return messageResponse_ == null ? ProtoMsg.MessageResponse.getDefaultInstance() : messageResponse_;
        }

        /**
         * <code>.MessageResponse messageResponse = 7;</code>
         */
        public ProtoMsg.MessageResponseOrBuilder getMessageResponseOrBuilder() {
            return getMessageResponse();
        }

        public static final int NOTIFICATION_FIELD_NUMBER = 8;
        private ProtoMsg.MessageNotification notification_;

        /**
         * <code>.MessageNotification notification = 8;</code>
         */
        public boolean hasNotification() {
            return notification_ != null;
        }

        /**
         * <code>.MessageNotification notification = 8;</code>
         */
        public ProtoMsg.MessageNotification getNotification() {
            return notification_ == null ? ProtoMsg.MessageNotification.getDefaultInstance() : notification_;
        }

        /**
         * <code>.MessageNotification notification = 8;</code>
         */
        public ProtoMsg.MessageNotificationOrBuilder getNotificationOrBuilder() {
            return getNotification();
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
            if (type_ != ProtoMsg.HeadType.LOGIN_REQUEST.getNumber()) {
                output.writeEnum(1, type_);
            }
            if (sequence_ != 0L) {
                output.writeUInt64(2, sequence_);
            }
            if (!getSessionIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sessionId_);
            }
            if (loginRequest_ != null) {
                output.writeMessage(4, getLoginRequest());
            }
            if (loginResponse_ != null) {
                output.writeMessage(5, getLoginResponse());
            }
            if (messageRequest_ != null) {
                output.writeMessage(6, getMessageRequest());
            }
            if (messageResponse_ != null) {
                output.writeMessage(7, getMessageResponse());
            }
            if (notification_ != null) {
                output.writeMessage(8, getNotification());
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (type_ != ProtoMsg.HeadType.LOGIN_REQUEST.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, type_);
            }
            if (sequence_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, sequence_);
            }
            if (!getSessionIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sessionId_);
            }
            if (loginRequest_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, getLoginRequest());
            }
            if (loginResponse_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, getLoginResponse());
            }
            if (messageRequest_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, getMessageRequest());
            }
            if (messageResponse_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, getMessageResponse());
            }
            if (notification_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(8, getNotification());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtoMsg.Message)) {
                return super.equals(obj);
            }
            ProtoMsg.Message other = (ProtoMsg.Message) obj;

            boolean result = true;
            result = result && type_ == other.type_;
            result = result && (getSequence()
                    == other.getSequence());
            result = result && getSessionId()
                    .equals(other.getSessionId());
            result = result && (hasLoginRequest() == other.hasLoginRequest());
            if (hasLoginRequest()) {
                result = result && getLoginRequest()
                        .equals(other.getLoginRequest());
            }
            result = result && (hasLoginResponse() == other.hasLoginResponse());
            if (hasLoginResponse()) {
                result = result && getLoginResponse()
                        .equals(other.getLoginResponse());
            }
            result = result && (hasMessageRequest() == other.hasMessageRequest());
            if (hasMessageRequest()) {
                result = result && getMessageRequest()
                        .equals(other.getMessageRequest());
            }
            result = result && (hasMessageResponse() == other.hasMessageResponse());
            if (hasMessageResponse()) {
                result = result && getMessageResponse()
                        .equals(other.getMessageResponse());
            }
            result = result && (hasNotification() == other.hasNotification());
            if (hasNotification()) {
                result = result && getNotification()
                        .equals(other.getNotification());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getSequence());
            hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSessionId().hashCode();
            if (hasLoginRequest()) {
                hash = (37 * hash) + LOGINREQUEST_FIELD_NUMBER;
                hash = (53 * hash) + getLoginRequest().hashCode();
            }
            if (hasLoginResponse()) {
                hash = (37 * hash) + LOGINRESPONSE_FIELD_NUMBER;
                hash = (53 * hash) + getLoginResponse().hashCode();
            }
            if (hasMessageRequest()) {
                hash = (37 * hash) + MESSAGEREQUEST_FIELD_NUMBER;
                hash = (53 * hash) + getMessageRequest().hashCode();
            }
            if (hasMessageResponse()) {
                hash = (37 * hash) + MESSAGERESPONSE_FIELD_NUMBER;
                hash = (53 * hash) + getMessageResponse().hashCode();
            }
            if (hasNotification()) {
                hash = (37 * hash) + NOTIFICATION_FIELD_NUMBER;
                hash = (53 * hash) + getNotification().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ProtoMsg.Message parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.Message parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.Message parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.Message parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.Message parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ProtoMsg.Message parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ProtoMsg.Message parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.Message parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.Message parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ProtoMsg.Message parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ProtoMsg.Message parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ProtoMsg.Message parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ProtoMsg.Message prototype) {
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
         * Protobuf type {@code Message}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Message)
                ProtoMsg.MessageOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_Message_descriptor;
            }

            @Override
            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_Message_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ProtoMsg.Message.class, ProtoMsg.Message.Builder.class);
            }

            // Construct using ProtoMsg.Message.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                type_ = 0;

                sequence_ = 0L;

                sessionId_ = "";

                if (loginRequestBuilder_ == null) {
                    loginRequest_ = null;
                } else {
                    loginRequest_ = null;
                    loginRequestBuilder_ = null;
                }
                if (loginResponseBuilder_ == null) {
                    loginResponse_ = null;
                } else {
                    loginResponse_ = null;
                    loginResponseBuilder_ = null;
                }
                if (messageRequestBuilder_ == null) {
                    messageRequest_ = null;
                } else {
                    messageRequest_ = null;
                    messageRequestBuilder_ = null;
                }
                if (messageResponseBuilder_ == null) {
                    messageResponse_ = null;
                } else {
                    messageResponse_ = null;
                    messageResponseBuilder_ = null;
                }
                if (notificationBuilder_ == null) {
                    notification_ = null;
                } else {
                    notification_ = null;
                    notificationBuilder_ = null;
                }
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtoMsg.internal_static_com_crazymakercircle_im_common_bean_msg_Message_descriptor;
            }

            @Override
            public ProtoMsg.Message getDefaultInstanceForType() {
                return ProtoMsg.Message.getDefaultInstance();
            }

            @Override
            public ProtoMsg.Message build() {
                ProtoMsg.Message result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public ProtoMsg.Message buildPartial() {
                ProtoMsg.Message result = new ProtoMsg.Message(this);
                result.type_ = type_;
                result.sequence_ = sequence_;
                result.sessionId_ = sessionId_;
                if (loginRequestBuilder_ == null) {
                    result.loginRequest_ = loginRequest_;
                } else {
                    result.loginRequest_ = loginRequestBuilder_.build();
                }
                if (loginResponseBuilder_ == null) {
                    result.loginResponse_ = loginResponse_;
                } else {
                    result.loginResponse_ = loginResponseBuilder_.build();
                }
                if (messageRequestBuilder_ == null) {
                    result.messageRequest_ = messageRequest_;
                } else {
                    result.messageRequest_ = messageRequestBuilder_.build();
                }
                if (messageResponseBuilder_ == null) {
                    result.messageResponse_ = messageResponse_;
                } else {
                    result.messageResponse_ = messageResponseBuilder_.build();
                }
                if (notificationBuilder_ == null) {
                    result.notification_ = notification_;
                } else {
                    result.notification_ = notificationBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ProtoMsg.Message) {
                    return mergeFrom((ProtoMsg.Message) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ProtoMsg.Message other) {
                if (other == ProtoMsg.Message.getDefaultInstance()) return this;
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                if (other.getSequence() != 0L) {
                    setSequence(other.getSequence());
                }
                if (!other.getSessionId().isEmpty()) {
                    sessionId_ = other.sessionId_;
                    onChanged();
                }
                if (other.hasLoginRequest()) {
                    mergeLoginRequest(other.getLoginRequest());
                }
                if (other.hasLoginResponse()) {
                    mergeLoginResponse(other.getLoginResponse());
                }
                if (other.hasMessageRequest()) {
                    mergeMessageRequest(other.getMessageRequest());
                }
                if (other.hasMessageResponse()) {
                    mergeMessageResponse(other.getMessageResponse());
                }
                if (other.hasNotification()) {
                    mergeNotification(other.getNotification());
                }
                this.mergeUnknownFields(other.unknownFields);
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
                ProtoMsg.Message parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ProtoMsg.Message) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int type_ = 0;

            /**
             * <code>.HeadType type = 1;</code>
             */
            public int getTypeValue() {
                return type_;
            }

            /**
             * <code>.HeadType type = 1;</code>
             */
            public Builder setTypeValue(int value) {
                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.HeadType type = 1;</code>
             */
            public ProtoMsg.HeadType getType() {
                @SuppressWarnings("deprecation")
                ProtoMsg.HeadType result = ProtoMsg.HeadType.valueOf(type_);
                return result == null ? ProtoMsg.HeadType.UNRECOGNIZED : result;
            }

            /**
             * <code>.HeadType type = 1;</code>
             */
            public Builder setType(ProtoMsg.HeadType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.HeadType type = 1;</code>
             */
            public Builder clearType() {

                type_ = 0;
                onChanged();
                return this;
            }

            private long sequence_;

            /**
             * <code>uint64 sequence = 2;</code>
             */
            public long getSequence() {
                return sequence_;
            }

            /**
             * <code>uint64 sequence = 2;</code>
             */
            public Builder setSequence(long value) {

                sequence_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 sequence = 2;</code>
             */
            public Builder clearSequence() {

                sequence_ = 0L;
                onChanged();
                return this;
            }

            private Object sessionId_ = "";

            /**
             * <code>string session_id = 3;</code>
             */
            public String getSessionId() {
                Object ref = sessionId_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    sessionId_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string session_id = 3;</code>
             */
            public com.google.protobuf.ByteString
            getSessionIdBytes() {
                Object ref = sessionId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    sessionId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string session_id = 3;</code>
             */
            public Builder setSessionId(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sessionId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string session_id = 3;</code>
             */
            public Builder clearSessionId() {

                sessionId_ = getDefaultInstance().getSessionId();
                onChanged();
                return this;
            }

            /**
             * <code>string session_id = 3;</code>
             */
            public Builder setSessionIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sessionId_ = value;
                onChanged();
                return this;
            }

            private ProtoMsg.LoginRequest loginRequest_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.LoginRequest, ProtoMsg.LoginRequest.Builder, ProtoMsg.LoginRequestOrBuilder> loginRequestBuilder_;

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public boolean hasLoginRequest() {
                return loginRequestBuilder_ != null || loginRequest_ != null;
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public ProtoMsg.LoginRequest getLoginRequest() {
                if (loginRequestBuilder_ == null) {
                    return loginRequest_ == null ? ProtoMsg.LoginRequest.getDefaultInstance() : loginRequest_;
                } else {
                    return loginRequestBuilder_.getMessage();
                }
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public Builder setLoginRequest(ProtoMsg.LoginRequest value) {
                if (loginRequestBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    loginRequest_ = value;
                    onChanged();
                } else {
                    loginRequestBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public Builder setLoginRequest(
                    ProtoMsg.LoginRequest.Builder builderForValue) {
                if (loginRequestBuilder_ == null) {
                    loginRequest_ = builderForValue.build();
                    onChanged();
                } else {
                    loginRequestBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public Builder mergeLoginRequest(ProtoMsg.LoginRequest value) {
                if (loginRequestBuilder_ == null) {
                    if (loginRequest_ != null) {
                        loginRequest_ =
                                ProtoMsg.LoginRequest.newBuilder(loginRequest_).mergeFrom(value).buildPartial();
                    } else {
                        loginRequest_ = value;
                    }
                    onChanged();
                } else {
                    loginRequestBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public Builder clearLoginRequest() {
                if (loginRequestBuilder_ == null) {
                    loginRequest_ = null;
                    onChanged();
                } else {
                    loginRequest_ = null;
                    loginRequestBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public ProtoMsg.LoginRequest.Builder getLoginRequestBuilder() {

                onChanged();
                return getLoginRequestFieldBuilder().getBuilder();
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            public ProtoMsg.LoginRequestOrBuilder getLoginRequestOrBuilder() {
                if (loginRequestBuilder_ != null) {
                    return loginRequestBuilder_.getMessageOrBuilder();
                } else {
                    return loginRequest_ == null ?
                            ProtoMsg.LoginRequest.getDefaultInstance() : loginRequest_;
                }
            }

            /**
             * <code>.LoginRequest loginRequest = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.LoginRequest, ProtoMsg.LoginRequest.Builder, ProtoMsg.LoginRequestOrBuilder>
            getLoginRequestFieldBuilder() {
                if (loginRequestBuilder_ == null) {
                    loginRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            ProtoMsg.LoginRequest, ProtoMsg.LoginRequest.Builder, ProtoMsg.LoginRequestOrBuilder>(
                            getLoginRequest(),
                            getParentForChildren(),
                            isClean());
                    loginRequest_ = null;
                }
                return loginRequestBuilder_;
            }

            private ProtoMsg.LoginResponse loginResponse_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.LoginResponse, ProtoMsg.LoginResponse.Builder, ProtoMsg.LoginResponseOrBuilder> loginResponseBuilder_;

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public boolean hasLoginResponse() {
                return loginResponseBuilder_ != null || loginResponse_ != null;
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public ProtoMsg.LoginResponse getLoginResponse() {
                if (loginResponseBuilder_ == null) {
                    return loginResponse_ == null ? ProtoMsg.LoginResponse.getDefaultInstance() : loginResponse_;
                } else {
                    return loginResponseBuilder_.getMessage();
                }
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public Builder setLoginResponse(ProtoMsg.LoginResponse value) {
                if (loginResponseBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    loginResponse_ = value;
                    onChanged();
                } else {
                    loginResponseBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public Builder setLoginResponse(
                    ProtoMsg.LoginResponse.Builder builderForValue) {
                if (loginResponseBuilder_ == null) {
                    loginResponse_ = builderForValue.build();
                    onChanged();
                } else {
                    loginResponseBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public Builder mergeLoginResponse(ProtoMsg.LoginResponse value) {
                if (loginResponseBuilder_ == null) {
                    if (loginResponse_ != null) {
                        loginResponse_ =
                                ProtoMsg.LoginResponse.newBuilder(loginResponse_).mergeFrom(value).buildPartial();
                    } else {
                        loginResponse_ = value;
                    }
                    onChanged();
                } else {
                    loginResponseBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public Builder clearLoginResponse() {
                if (loginResponseBuilder_ == null) {
                    loginResponse_ = null;
                    onChanged();
                } else {
                    loginResponse_ = null;
                    loginResponseBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public ProtoMsg.LoginResponse.Builder getLoginResponseBuilder() {

                onChanged();
                return getLoginResponseFieldBuilder().getBuilder();
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            public ProtoMsg.LoginResponseOrBuilder getLoginResponseOrBuilder() {
                if (loginResponseBuilder_ != null) {
                    return loginResponseBuilder_.getMessageOrBuilder();
                } else {
                    return loginResponse_ == null ?
                            ProtoMsg.LoginResponse.getDefaultInstance() : loginResponse_;
                }
            }

            /**
             * <code>.LoginResponse loginResponse = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.LoginResponse, ProtoMsg.LoginResponse.Builder, ProtoMsg.LoginResponseOrBuilder>
            getLoginResponseFieldBuilder() {
                if (loginResponseBuilder_ == null) {
                    loginResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            ProtoMsg.LoginResponse, ProtoMsg.LoginResponse.Builder, ProtoMsg.LoginResponseOrBuilder>(
                            getLoginResponse(),
                            getParentForChildren(),
                            isClean());
                    loginResponse_ = null;
                }
                return loginResponseBuilder_;
            }

            private ProtoMsg.MessageRequest messageRequest_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.MessageRequest, ProtoMsg.MessageRequest.Builder, ProtoMsg.MessageRequestOrBuilder> messageRequestBuilder_;

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public boolean hasMessageRequest() {
                return messageRequestBuilder_ != null || messageRequest_ != null;
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public ProtoMsg.MessageRequest getMessageRequest() {
                if (messageRequestBuilder_ == null) {
                    return messageRequest_ == null ? ProtoMsg.MessageRequest.getDefaultInstance() : messageRequest_;
                } else {
                    return messageRequestBuilder_.getMessage();
                }
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public Builder setMessageRequest(ProtoMsg.MessageRequest value) {
                if (messageRequestBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    messageRequest_ = value;
                    onChanged();
                } else {
                    messageRequestBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public Builder setMessageRequest(
                    ProtoMsg.MessageRequest.Builder builderForValue) {
                if (messageRequestBuilder_ == null) {
                    messageRequest_ = builderForValue.build();
                    onChanged();
                } else {
                    messageRequestBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public Builder mergeMessageRequest(ProtoMsg.MessageRequest value) {
                if (messageRequestBuilder_ == null) {
                    if (messageRequest_ != null) {
                        messageRequest_ =
                                ProtoMsg.MessageRequest.newBuilder(messageRequest_).mergeFrom(value).buildPartial();
                    } else {
                        messageRequest_ = value;
                    }
                    onChanged();
                } else {
                    messageRequestBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public Builder clearMessageRequest() {
                if (messageRequestBuilder_ == null) {
                    messageRequest_ = null;
                    onChanged();
                } else {
                    messageRequest_ = null;
                    messageRequestBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public ProtoMsg.MessageRequest.Builder getMessageRequestBuilder() {

                onChanged();
                return getMessageRequestFieldBuilder().getBuilder();
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            public ProtoMsg.MessageRequestOrBuilder getMessageRequestOrBuilder() {
                if (messageRequestBuilder_ != null) {
                    return messageRequestBuilder_.getMessageOrBuilder();
                } else {
                    return messageRequest_ == null ?
                            ProtoMsg.MessageRequest.getDefaultInstance() : messageRequest_;
                }
            }

            /**
             * <code>.MessageRequest messageRequest = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.MessageRequest, ProtoMsg.MessageRequest.Builder, ProtoMsg.MessageRequestOrBuilder>
            getMessageRequestFieldBuilder() {
                if (messageRequestBuilder_ == null) {
                    messageRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            ProtoMsg.MessageRequest, ProtoMsg.MessageRequest.Builder, ProtoMsg.MessageRequestOrBuilder>(
                            getMessageRequest(),
                            getParentForChildren(),
                            isClean());
                    messageRequest_ = null;
                }
                return messageRequestBuilder_;
            }

            private ProtoMsg.MessageResponse messageResponse_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.MessageResponse, ProtoMsg.MessageResponse.Builder, ProtoMsg.MessageResponseOrBuilder> messageResponseBuilder_;

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public boolean hasMessageResponse() {
                return messageResponseBuilder_ != null || messageResponse_ != null;
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public ProtoMsg.MessageResponse getMessageResponse() {
                if (messageResponseBuilder_ == null) {
                    return messageResponse_ == null ? ProtoMsg.MessageResponse.getDefaultInstance() : messageResponse_;
                } else {
                    return messageResponseBuilder_.getMessage();
                }
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public Builder setMessageResponse(ProtoMsg.MessageResponse value) {
                if (messageResponseBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    messageResponse_ = value;
                    onChanged();
                } else {
                    messageResponseBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public Builder setMessageResponse(
                    ProtoMsg.MessageResponse.Builder builderForValue) {
                if (messageResponseBuilder_ == null) {
                    messageResponse_ = builderForValue.build();
                    onChanged();
                } else {
                    messageResponseBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public Builder mergeMessageResponse(ProtoMsg.MessageResponse value) {
                if (messageResponseBuilder_ == null) {
                    if (messageResponse_ != null) {
                        messageResponse_ =
                                ProtoMsg.MessageResponse.newBuilder(messageResponse_).mergeFrom(value).buildPartial();
                    } else {
                        messageResponse_ = value;
                    }
                    onChanged();
                } else {
                    messageResponseBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public Builder clearMessageResponse() {
                if (messageResponseBuilder_ == null) {
                    messageResponse_ = null;
                    onChanged();
                } else {
                    messageResponse_ = null;
                    messageResponseBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public ProtoMsg.MessageResponse.Builder getMessageResponseBuilder() {

                onChanged();
                return getMessageResponseFieldBuilder().getBuilder();
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            public ProtoMsg.MessageResponseOrBuilder getMessageResponseOrBuilder() {
                if (messageResponseBuilder_ != null) {
                    return messageResponseBuilder_.getMessageOrBuilder();
                } else {
                    return messageResponse_ == null ?
                            ProtoMsg.MessageResponse.getDefaultInstance() : messageResponse_;
                }
            }

            /**
             * <code>.MessageResponse messageResponse = 7;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.MessageResponse, ProtoMsg.MessageResponse.Builder, ProtoMsg.MessageResponseOrBuilder>
            getMessageResponseFieldBuilder() {
                if (messageResponseBuilder_ == null) {
                    messageResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            ProtoMsg.MessageResponse, ProtoMsg.MessageResponse.Builder, ProtoMsg.MessageResponseOrBuilder>(
                            getMessageResponse(),
                            getParentForChildren(),
                            isClean());
                    messageResponse_ = null;
                }
                return messageResponseBuilder_;
            }

            private ProtoMsg.MessageNotification notification_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.MessageNotification, ProtoMsg.MessageNotification.Builder, ProtoMsg.MessageNotificationOrBuilder> notificationBuilder_;

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public boolean hasNotification() {
                return notificationBuilder_ != null || notification_ != null;
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public ProtoMsg.MessageNotification getNotification() {
                if (notificationBuilder_ == null) {
                    return notification_ == null ? ProtoMsg.MessageNotification.getDefaultInstance() : notification_;
                } else {
                    return notificationBuilder_.getMessage();
                }
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public Builder setNotification(ProtoMsg.MessageNotification value) {
                if (notificationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    notification_ = value;
                    onChanged();
                } else {
                    notificationBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public Builder setNotification(
                    ProtoMsg.MessageNotification.Builder builderForValue) {
                if (notificationBuilder_ == null) {
                    notification_ = builderForValue.build();
                    onChanged();
                } else {
                    notificationBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public Builder mergeNotification(ProtoMsg.MessageNotification value) {
                if (notificationBuilder_ == null) {
                    if (notification_ != null) {
                        notification_ =
                                ProtoMsg.MessageNotification.newBuilder(notification_).mergeFrom(value).buildPartial();
                    } else {
                        notification_ = value;
                    }
                    onChanged();
                } else {
                    notificationBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public Builder clearNotification() {
                if (notificationBuilder_ == null) {
                    notification_ = null;
                    onChanged();
                } else {
                    notification_ = null;
                    notificationBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public ProtoMsg.MessageNotification.Builder getNotificationBuilder() {

                onChanged();
                return getNotificationFieldBuilder().getBuilder();
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            public ProtoMsg.MessageNotificationOrBuilder getNotificationOrBuilder() {
                if (notificationBuilder_ != null) {
                    return notificationBuilder_.getMessageOrBuilder();
                } else {
                    return notification_ == null ?
                            ProtoMsg.MessageNotification.getDefaultInstance() : notification_;
                }
            }

            /**
             * <code>.MessageNotification notification = 8;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    ProtoMsg.MessageNotification, ProtoMsg.MessageNotification.Builder, ProtoMsg.MessageNotificationOrBuilder>
            getNotificationFieldBuilder() {
                if (notificationBuilder_ == null) {
                    notificationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            ProtoMsg.MessageNotification, ProtoMsg.MessageNotification.Builder, ProtoMsg.MessageNotificationOrBuilder>(
                            getNotification(),
                            getParentForChildren(),
                            isClean());
                    notification_ = null;
                }
                return notificationBuilder_;
            }

            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:Message)
        }

        // @@protoc_insertion_point(class_scope:Message)
        private static final ProtoMsg.Message DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ProtoMsg.Message();
        }

        public static ProtoMsg.Message getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Message>
                PARSER = new com.google.protobuf.AbstractParser<Message>() {
            @Override
            public Message parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Message(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Message> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Message> getParserForType() {
            return PARSER;
        }

        @Override
        public ProtoMsg.Message getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_crazymakercircle_im_common_bean_msg_Message_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_crazymakercircle_im_common_bean_msg_Message_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\016ProtoMsg.proto\022\'com.crazymakercircle.i" +
                        "m.common.bean.msg\"c\n\014LoginRequest\022\013\n\003uid" +
                        "\030\001 \001(\t\022\020\n\010deviceId\030\002 \001(\t\022\r\n\005token\030\003 \001(\t\022" +
                        "\020\n\010platform\030\004 \001(\r\022\023\n\013app_version\030\005 \001(\t\"K" +
                        "\n\rLoginResponse\022\016\n\006result\030\001 \001(\010\022\014\n\004code\030" +
                        "\002 \001(\r\022\014\n\004info\030\003 \001(\t\022\016\n\006expose\030\004 \001(\r\"\253\001\n\016" +
                        "MessageRequest\022\016\n\006msg_id\030\001 \001(\004\022\014\n\004from\030\002" +
                        " \001(\t\022\n\n\002to\030\003 \001(\t\022\014\n\004time\030\004 \001(\004\022\020\n\010msg_ty" +
                        "pe\030\005 \001(\r\022\017\n\007content\030\006 \001(\t\022\013\n\003url\030\010 \001(\t\022\020" +
                        "\n\010property\030\t \001(\t\022\021\n\tfrom_nick\030\n \001(\t\022\014\n\004j" +
                        "son\030\013 \001(\t\"v\n\017MessageResponse\022\016\n\006result\030\001" +
                        " \001(\010\022\014\n\004code\030\002 \001(\r\022\014\n\004info\030\003 \001(\t\022\016\n\006expo" +
                        "se\030\004 \001(\r\022\022\n\nlast_block\030\005 \001(\010\022\023\n\013block_in" +
                        "dex\030\006 \001(\007\"X\n\023MessageNotification\022\020\n\010msg_" +
                        "type\030\001 \001(\r\022\016\n\006sender\030\002 \001(\014\022\014\n\004json\030\003 \001(\t" +
                        "\022\021\n\ttimestamp\030\004 \001(\t\"\204\004\n\007Message\022?\n\004type\030" +
                        "\001 \001(\01621.com.crazymakercircle.im.common.b" +
                        "ean.msg.HeadType\022\020\n\010sequence\030\002 \001(\004\022\022\n\nse" +
                        "ssion_id\030\003 \001(\t\022K\n\014loginRequest\030\004 \001(\01325.c" +
                        "om.crazymakercircle.im.common.bean.msg.L" +
                        "oginRequest\022M\n\rloginResponse\030\005 \001(\01326.com" +
                        ".crazymakercircle.im.common.bean.msg.Log" +
                        "inResponse\022O\n\016messageRequest\030\006 \001(\01327.com" +
                        ".crazymakercircle.im.common.bean.msg.Mes" +
                        "sageRequest\022Q\n\017messageResponse\030\007 \001(\01328.c" +
                        "om.crazymakercircle.im.common.bean.msg.M" +
                        "essageResponse\022R\n\014notification\030\010 \001(\0132<.c" +
                        "om.crazymakercircle.im.common.bean.msg.M" +
                        "essageNotification*\316\001\n\010HeadType\022\021\n\rLOGIN" +
                        "_REQUEST\020\000\022\022\n\016LOGIN_RESPONSE\020\001\022\022\n\016LOGOUT" +
                        "_REQUEST\020\002\022\023\n\017LOGOUT_RESPONSE\020\003\022\025\n\021KEEPA" +
                        "LIVE_REQUEST\020\004\022\026\n\022KEEPALIVE_RESPONSE\020\005\022\023" +
                        "\n\017MESSAGE_REQUEST\020\006\022\024\n\020MESSAGE_RESPONSE\020" +
                        "\007\022\030\n\024MESSAGE_NOTIFICATION\020\010b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_crazymakercircle_im_common_bean_msg_LoginRequest_descriptor,
                new String[]{"Uid", "DeviceId", "Token", "Platform", "AppVersion",});
        internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_crazymakercircle_im_common_bean_msg_LoginResponse_descriptor,
                new String[]{"Result", "Code", "Info", "Expose",});
        internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_crazymakercircle_im_common_bean_msg_MessageRequest_descriptor,
                new String[]{"MsgId", "From", "To", "Time", "MsgType", "Content", "Url", "Property", "FromNick", "Json",});
        internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_crazymakercircle_im_common_bean_msg_MessageResponse_descriptor,
                new String[]{"Result", "Code", "Info", "Expose", "LastBlock", "BlockIndex",});
        internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_crazymakercircle_im_common_bean_msg_MessageNotification_descriptor,
                new String[]{"MsgType", "Sender", "Json", "Timestamp",});
        internal_static_com_crazymakercircle_im_common_bean_msg_Message_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_com_crazymakercircle_im_common_bean_msg_Message_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_crazymakercircle_im_common_bean_msg_Message_descriptor,
                new String[]{"Type", "Sequence", "SessionId", "LoginRequest", "LoginResponse", "MessageRequest", "MessageResponse", "Notification",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
