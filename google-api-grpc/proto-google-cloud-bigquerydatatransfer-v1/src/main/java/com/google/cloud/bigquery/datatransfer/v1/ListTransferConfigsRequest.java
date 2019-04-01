// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * A request to list data transfers configured for a BigQuery project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest}
 */
public final class ListTransferConfigsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
    ListTransferConfigsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTransferConfigsRequest.newBuilder() to construct.
  private ListTransferConfigsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTransferConfigsRequest() {
    parent_ = "";
    dataSourceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    pageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListTransferConfigsRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                dataSourceIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              dataSourceIds_.add(s);
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              pageToken_ = s;
              break;
            }
          case 32:
            {
              pageSize_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        dataSourceIds_ = dataSourceIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.class,
            com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * The BigQuery project id for which data sources
   * should be returned: `projects/{project_id}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The BigQuery project id for which data sources
   * should be returned: `projects/{project_id}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_SOURCE_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList dataSourceIds_;
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList getDataSourceIdsList() {
    return dataSourceIds_;
  }
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  public int getDataSourceIdsCount() {
    return dataSourceIds_.size();
  }
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  public java.lang.String getDataSourceIds(int index) {
    return dataSourceIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  public com.google.protobuf.ByteString getDataSourceIdsBytes(int index) {
    return dataSourceIds_.getByteString(index);
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   *
   *
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 4;
  private int pageSize_;
  /**
   *
   *
   * <pre>
   * Page size. The default page size is the maximum value of 1000 results.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  public int getPageSize() {
    return pageSize_;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < dataSourceIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataSourceIds_.getRaw(i));
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(4, pageSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dataSourceIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(dataSourceIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDataSourceIdsList().size();
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, pageSize_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest other =
        (com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getDataSourceIdsList().equals(other.getDataSourceIdsList())) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
    if (getPageSize() != other.getPageSize()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getDataSourceIdsCount() > 0) {
      hash = (37 * hash) + DATA_SOURCE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourceIdsList().hashCode();
    }
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest prototype) {
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
   * A request to list data transfers configured for a BigQuery project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.class,
              com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.newBuilder()
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
      parent_ = "";

      dataSourceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      pageToken_ = "";

      pageSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest result =
          new com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.parent_ = parent_;
      if (((bitField0_ & 0x00000002) != 0)) {
        dataSourceIds_ = dataSourceIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.dataSourceIds_ = dataSourceIds_;
      result.pageToken_ = pageToken_;
      result.pageSize_ = pageSize_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest other) {
      if (other
          == com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.dataSourceIds_.isEmpty()) {
        if (dataSourceIds_.isEmpty()) {
          dataSourceIds_ = other.dataSourceIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDataSourceIdsIsMutable();
          dataSourceIds_.addAll(other.dataSourceIds_);
        }
        onChanged();
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
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
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The BigQuery project id for which data sources
     * should be returned: `projects/{project_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery project id for which data sources
     * should be returned: `projects/{project_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery project id for which data sources
     * should be returned: `projects/{project_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery project id for which data sources
     * should be returned: `projects/{project_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery project id for which data sources
     * should be returned: `projects/{project_id}`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList dataSourceIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureDataSourceIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dataSourceIds_ = new com.google.protobuf.LazyStringArrayList(dataSourceIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getDataSourceIdsList() {
      return dataSourceIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public int getDataSourceIdsCount() {
      return dataSourceIds_.size();
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public java.lang.String getDataSourceIds(int index) {
      return dataSourceIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public com.google.protobuf.ByteString getDataSourceIdsBytes(int index) {
      return dataSourceIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public Builder setDataSourceIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public Builder addDataSourceIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public Builder addAllDataSourceIds(java.lang.Iterable<java.lang.String> values) {
      ensureDataSourceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataSourceIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public Builder clearDataSourceIds() {
      dataSourceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     */
    public Builder addDataSourceIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder clearPageToken() {

      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pageToken_ = value;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * Page size. The default page size is the maximum value of 1000 results.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * Page size. The default page size is the maximum value of 1000 results.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page size. The default page size is the maximum value of 1000 results.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     */
    public Builder clearPageSize() {

      pageSize_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferConfigsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListTransferConfigsRequest>() {
        @java.lang.Override
        public ListTransferConfigsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListTransferConfigsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListTransferConfigsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferConfigsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
