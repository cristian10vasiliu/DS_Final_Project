// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paymentService.proto

package paymentService;

/**
 * Protobuf type {@code paymentHistoryResponse}
 */
public  final class paymentHistoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:paymentHistoryResponse)
    paymentHistoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use paymentHistoryResponse.newBuilder() to construct.
  private paymentHistoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private paymentHistoryResponse() {
    paymentId_ = "";
    amount_ = 0D;
    paymentDate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private paymentHistoryResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            java.lang.String s = input.readStringRequireUtf8();

            paymentId_ = s;
            break;
          }
          case 17: {

            amount_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            paymentDate_ = s;
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
    return paymentService.paymentServiceImpl.internal_static_paymentHistoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return paymentService.paymentServiceImpl.internal_static_paymentHistoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            paymentService.paymentHistoryResponse.class, paymentService.paymentHistoryResponse.Builder.class);
  }

  public static final int PAYMENTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object paymentId_;
  /**
   * <code>string paymentId = 1;</code>
   */
  public java.lang.String getPaymentId() {
    java.lang.Object ref = paymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentId_ = s;
      return s;
    }
  }
  /**
   * <code>string paymentId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPaymentIdBytes() {
    java.lang.Object ref = paymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private double amount_;
  /**
   * <code>double amount = 2;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int PAYMENTDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object paymentDate_;
  /**
   * <code>string paymentDate = 3;</code>
   */
  public java.lang.String getPaymentDate() {
    java.lang.Object ref = paymentDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentDate_ = s;
      return s;
    }
  }
  /**
   * <code>string paymentDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPaymentDateBytes() {
    java.lang.Object ref = paymentDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentDate_ = b;
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
    if (!getPaymentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, paymentId_);
    }
    if (amount_ != 0D) {
      output.writeDouble(2, amount_);
    }
    if (!getPaymentDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, paymentDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPaymentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, paymentId_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amount_);
    }
    if (!getPaymentDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, paymentDate_);
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
    if (!(obj instanceof paymentService.paymentHistoryResponse)) {
      return super.equals(obj);
    }
    paymentService.paymentHistoryResponse other = (paymentService.paymentHistoryResponse) obj;

    boolean result = true;
    result = result && getPaymentId()
        .equals(other.getPaymentId());
    result = result && (
        java.lang.Double.doubleToLongBits(getAmount())
        == java.lang.Double.doubleToLongBits(
            other.getAmount()));
    result = result && getPaymentDate()
        .equals(other.getPaymentDate());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAYMENTID_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentId().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    hash = (37 * hash) + PAYMENTDATE_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static paymentService.paymentHistoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static paymentService.paymentHistoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static paymentService.paymentHistoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static paymentService.paymentHistoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static paymentService.paymentHistoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static paymentService.paymentHistoryResponse parseFrom(
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
  public static Builder newBuilder(paymentService.paymentHistoryResponse prototype) {
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
   * Protobuf type {@code paymentHistoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:paymentHistoryResponse)
      paymentService.paymentHistoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return paymentService.paymentServiceImpl.internal_static_paymentHistoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return paymentService.paymentServiceImpl.internal_static_paymentHistoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              paymentService.paymentHistoryResponse.class, paymentService.paymentHistoryResponse.Builder.class);
    }

    // Construct using paymentService.paymentHistoryResponse.newBuilder()
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
      paymentId_ = "";

      amount_ = 0D;

      paymentDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return paymentService.paymentServiceImpl.internal_static_paymentHistoryResponse_descriptor;
    }

    @java.lang.Override
    public paymentService.paymentHistoryResponse getDefaultInstanceForType() {
      return paymentService.paymentHistoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public paymentService.paymentHistoryResponse build() {
      paymentService.paymentHistoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public paymentService.paymentHistoryResponse buildPartial() {
      paymentService.paymentHistoryResponse result = new paymentService.paymentHistoryResponse(this);
      result.paymentId_ = paymentId_;
      result.amount_ = amount_;
      result.paymentDate_ = paymentDate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof paymentService.paymentHistoryResponse) {
        return mergeFrom((paymentService.paymentHistoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(paymentService.paymentHistoryResponse other) {
      if (other == paymentService.paymentHistoryResponse.getDefaultInstance()) return this;
      if (!other.getPaymentId().isEmpty()) {
        paymentId_ = other.paymentId_;
        onChanged();
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (!other.getPaymentDate().isEmpty()) {
        paymentDate_ = other.paymentDate_;
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
      paymentService.paymentHistoryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (paymentService.paymentHistoryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object paymentId_ = "";
    /**
     * <code>string paymentId = 1;</code>
     */
    public java.lang.String getPaymentId() {
      java.lang.Object ref = paymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string paymentId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPaymentIdBytes() {
      java.lang.Object ref = paymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string paymentId = 1;</code>
     */
    public Builder setPaymentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string paymentId = 1;</code>
     */
    public Builder clearPaymentId() {
      
      paymentId_ = getDefaultInstance().getPaymentId();
      onChanged();
      return this;
    }
    /**
     * <code>string paymentId = 1;</code>
     */
    public Builder setPaymentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentId_ = value;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <code>double amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>double amount = 2;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object paymentDate_ = "";
    /**
     * <code>string paymentDate = 3;</code>
     */
    public java.lang.String getPaymentDate() {
      java.lang.Object ref = paymentDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string paymentDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPaymentDateBytes() {
      java.lang.Object ref = paymentDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string paymentDate = 3;</code>
     */
    public Builder setPaymentDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string paymentDate = 3;</code>
     */
    public Builder clearPaymentDate() {
      
      paymentDate_ = getDefaultInstance().getPaymentDate();
      onChanged();
      return this;
    }
    /**
     * <code>string paymentDate = 3;</code>
     */
    public Builder setPaymentDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentDate_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:paymentHistoryResponse)
  }

  // @@protoc_insertion_point(class_scope:paymentHistoryResponse)
  private static final paymentService.paymentHistoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new paymentService.paymentHistoryResponse();
  }

  public static paymentService.paymentHistoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<paymentHistoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<paymentHistoryResponse>() {
    @java.lang.Override
    public paymentHistoryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new paymentHistoryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<paymentHistoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<paymentHistoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public paymentService.paymentHistoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

