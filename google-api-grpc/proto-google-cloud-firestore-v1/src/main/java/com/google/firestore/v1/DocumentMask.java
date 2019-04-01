// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/common.proto

package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * A set of field paths on a document.
 * Used to restrict a get or update operation on a document to a subset of its
 * fields.
 * This is different from standard field masks, as this is always scoped to a
 * [Document][google.firestore.v1.Document], and takes in account the dynamic nature of [Value][google.firestore.v1.Value].
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.DocumentMask}
 */
public final class DocumentMask extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.DocumentMask)
    DocumentMaskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DocumentMask.newBuilder() to construct.
  private DocumentMask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DocumentMask() {
    fieldPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DocumentMask(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fieldPaths_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              fieldPaths_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fieldPaths_ = fieldPaths_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.CommonProto
        .internal_static_google_firestore_v1_DocumentMask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.CommonProto
        .internal_static_google_firestore_v1_DocumentMask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.DocumentMask.class,
            com.google.firestore.v1.DocumentMask.Builder.class);
  }

  public static final int FIELD_PATHS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList fieldPaths_;
  /**
   *
   *
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList getFieldPathsList() {
    return fieldPaths_;
  }
  /**
   *
   *
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  public int getFieldPathsCount() {
    return fieldPaths_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  public java.lang.String getFieldPaths(int index) {
    return fieldPaths_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
   * path syntax reference.
   * </pre>
   *
   * <code>repeated string field_paths = 1;</code>
   */
  public com.google.protobuf.ByteString getFieldPathsBytes(int index) {
    return fieldPaths_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < fieldPaths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldPaths_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < fieldPaths_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldPaths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldPathsList().size();
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
    if (!(obj instanceof com.google.firestore.v1.DocumentMask)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.DocumentMask other = (com.google.firestore.v1.DocumentMask) obj;

    if (!getFieldPathsList().equals(other.getFieldPathsList())) return false;
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
    if (getFieldPathsCount() > 0) {
      hash = (37 * hash) + FIELD_PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldPathsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentMask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentMask parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentMask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.v1.DocumentMask prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A set of field paths on a document.
   * Used to restrict a get or update operation on a document to a subset of its
   * fields.
   * This is different from standard field masks, as this is always scoped to a
   * [Document][google.firestore.v1.Document], and takes in account the dynamic nature of [Value][google.firestore.v1.Value].
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.DocumentMask}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.DocumentMask)
      com.google.firestore.v1.DocumentMaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.CommonProto
          .internal_static_google_firestore_v1_DocumentMask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.CommonProto
          .internal_static_google_firestore_v1_DocumentMask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.DocumentMask.class,
              com.google.firestore.v1.DocumentMask.Builder.class);
    }

    // Construct using com.google.firestore.v1.DocumentMask.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      fieldPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.CommonProto
          .internal_static_google_firestore_v1_DocumentMask_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentMask getDefaultInstanceForType() {
      return com.google.firestore.v1.DocumentMask.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentMask build() {
      com.google.firestore.v1.DocumentMask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentMask buildPartial() {
      com.google.firestore.v1.DocumentMask result = new com.google.firestore.v1.DocumentMask(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fieldPaths_ = fieldPaths_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fieldPaths_ = fieldPaths_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.v1.DocumentMask) {
        return mergeFrom((com.google.firestore.v1.DocumentMask) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.DocumentMask other) {
      if (other == com.google.firestore.v1.DocumentMask.getDefaultInstance()) return this;
      if (!other.fieldPaths_.isEmpty()) {
        if (fieldPaths_.isEmpty()) {
          fieldPaths_ = other.fieldPaths_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldPathsIsMutable();
          fieldPaths_.addAll(other.fieldPaths_);
        }
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
      com.google.firestore.v1.DocumentMask parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.v1.DocumentMask) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList fieldPaths_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureFieldPathsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fieldPaths_ = new com.google.protobuf.LazyStringArrayList(fieldPaths_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getFieldPathsList() {
      return fieldPaths_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public int getFieldPathsCount() {
      return fieldPaths_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public java.lang.String getFieldPaths(int index) {
      return fieldPaths_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public com.google.protobuf.ByteString getFieldPathsBytes(int index) {
      return fieldPaths_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public Builder setFieldPaths(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldPathsIsMutable();
      fieldPaths_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public Builder addFieldPaths(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldPathsIsMutable();
      fieldPaths_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public Builder addAllFieldPaths(java.lang.Iterable<java.lang.String> values) {
      ensureFieldPathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, fieldPaths_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public Builder clearFieldPaths() {
      fieldPaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of field paths in the mask. See [Document.fields][google.firestore.v1.Document.fields] for a field
     * path syntax reference.
     * </pre>
     *
     * <code>repeated string field_paths = 1;</code>
     */
    public Builder addFieldPathsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureFieldPathsIsMutable();
      fieldPaths_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.DocumentMask)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.DocumentMask)
  private static final com.google.firestore.v1.DocumentMask DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.DocumentMask();
  }

  public static com.google.firestore.v1.DocumentMask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentMask> PARSER =
      new com.google.protobuf.AbstractParser<DocumentMask>() {
        @java.lang.Override
        public DocumentMask parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DocumentMask(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DocumentMask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentMask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.DocumentMask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
