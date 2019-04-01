// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Instructs the speech recognizer how to process the audio content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.InputAudioConfig}
 */
public final class InputAudioConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.InputAudioConfig)
    InputAudioConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InputAudioConfig.newBuilder() to construct.
  private InputAudioConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InputAudioConfig() {
    audioEncoding_ = 0;
    languageCode_ = "";
    phraseHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InputAudioConfig(
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
          case 8:
            {
              int rawValue = input.readEnum();

              audioEncoding_ = rawValue;
              break;
            }
          case 16:
            {
              sampleRateHertz_ = input.readInt32();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              languageCode_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                phraseHints_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              phraseHints_.add(s);
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
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        phraseHints_ = phraseHints_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.InputAudioConfig.class,
            com.google.cloud.dialogflow.v2.InputAudioConfig.Builder.class);
  }

  private int bitField0_;
  public static final int AUDIO_ENCODING_FIELD_NUMBER = 1;
  private int audioEncoding_;
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
   */
  public int getAudioEncodingValue() {
    return audioEncoding_;
  }
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
   */
  public com.google.cloud.dialogflow.v2.AudioEncoding getAudioEncoding() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.AudioEncoding result =
        com.google.cloud.dialogflow.v2.AudioEncoding.valueOf(audioEncoding_);
    return result == null ? com.google.cloud.dialogflow.v2.AudioEncoding.UNRECOGNIZED : result;
  }

  public static final int SAMPLE_RATE_HERTZ_FIELD_NUMBER = 2;
  private int sampleRateHertz_;
  /**
   *
   *
   * <pre>
   * Required. Sample rate (in Hertz) of the audio content sent in the query.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
   * more details.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  public int getSampleRateHertz() {
    return sampleRateHertz_;
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHRASE_HINTS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList phraseHints_;
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList getPhraseHintsList() {
    return phraseHints_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  public int getPhraseHintsCount() {
    return phraseHints_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  public java.lang.String getPhraseHints(int index) {
    return phraseHints_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  public com.google.protobuf.ByteString getPhraseHintsBytes(int index) {
    return phraseHints_.getByteString(index);
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
    if (audioEncoding_
        != com.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, audioEncoding_);
    }
    if (sampleRateHertz_ != 0) {
      output.writeInt32(2, sampleRateHertz_);
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    for (int i = 0; i < phraseHints_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, phraseHints_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioEncoding_
        != com.google.cloud.dialogflow.v2.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, audioEncoding_);
    }
    if (sampleRateHertz_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, sampleRateHertz_);
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < phraseHints_.size(); i++) {
        dataSize += computeStringSizeNoTag(phraseHints_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPhraseHintsList().size();
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.InputAudioConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.InputAudioConfig other =
        (com.google.cloud.dialogflow.v2.InputAudioConfig) obj;

    if (audioEncoding_ != other.audioEncoding_) return false;
    if (getSampleRateHertz() != other.getSampleRateHertz()) return false;
    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
    if (!getPhraseHintsList().equals(other.getPhraseHintsList())) return false;
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
    hash = (37 * hash) + AUDIO_ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + audioEncoding_;
    hash = (37 * hash) + SAMPLE_RATE_HERTZ_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRateHertz();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    if (getPhraseHintsCount() > 0) {
      hash = (37 * hash) + PHRASE_HINTS_FIELD_NUMBER;
      hash = (53 * hash) + getPhraseHintsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.InputAudioConfig prototype) {
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
   * Instructs the speech recognizer how to process the audio content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.InputAudioConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.InputAudioConfig)
      com.google.cloud.dialogflow.v2.InputAudioConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.InputAudioConfig.class,
              com.google.cloud.dialogflow.v2.InputAudioConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.InputAudioConfig.newBuilder()
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
      audioEncoding_ = 0;

      sampleRateHertz_ = 0;

      languageCode_ = "";

      phraseHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.InputAudioConfig getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.InputAudioConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.InputAudioConfig build() {
      com.google.cloud.dialogflow.v2.InputAudioConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.InputAudioConfig buildPartial() {
      com.google.cloud.dialogflow.v2.InputAudioConfig result =
          new com.google.cloud.dialogflow.v2.InputAudioConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.audioEncoding_ = audioEncoding_;
      result.sampleRateHertz_ = sampleRateHertz_;
      result.languageCode_ = languageCode_;
      if (((bitField0_ & 0x00000008) != 0)) {
        phraseHints_ = phraseHints_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.phraseHints_ = phraseHints_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.InputAudioConfig) {
        return mergeFrom((com.google.cloud.dialogflow.v2.InputAudioConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.InputAudioConfig other) {
      if (other == com.google.cloud.dialogflow.v2.InputAudioConfig.getDefaultInstance())
        return this;
      if (other.audioEncoding_ != 0) {
        setAudioEncodingValue(other.getAudioEncodingValue());
      }
      if (other.getSampleRateHertz() != 0) {
        setSampleRateHertz(other.getSampleRateHertz());
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
      }
      if (!other.phraseHints_.isEmpty()) {
        if (phraseHints_.isEmpty()) {
          phraseHints_ = other.phraseHints_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensurePhraseHintsIsMutable();
          phraseHints_.addAll(other.phraseHints_);
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
      com.google.cloud.dialogflow.v2.InputAudioConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.InputAudioConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int audioEncoding_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the audio content to process.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
     */
    public int getAudioEncodingValue() {
      return audioEncoding_;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the audio content to process.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
     */
    public Builder setAudioEncodingValue(int value) {
      audioEncoding_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the audio content to process.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.AudioEncoding getAudioEncoding() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.AudioEncoding result =
          com.google.cloud.dialogflow.v2.AudioEncoding.valueOf(audioEncoding_);
      return result == null ? com.google.cloud.dialogflow.v2.AudioEncoding.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the audio content to process.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
     */
    public Builder setAudioEncoding(com.google.cloud.dialogflow.v2.AudioEncoding value) {
      if (value == null) {
        throw new NullPointerException();
      }

      audioEncoding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the audio content to process.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
     */
    public Builder clearAudioEncoding() {

      audioEncoding_ = 0;
      onChanged();
      return this;
    }

    private int sampleRateHertz_;
    /**
     *
     *
     * <pre>
     * Required. Sample rate (in Hertz) of the audio content sent in the query.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
     * more details.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     */
    public int getSampleRateHertz() {
      return sampleRateHertz_;
    }
    /**
     *
     *
     * <pre>
     * Required. Sample rate (in Hertz) of the audio content sent in the query.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
     * more details.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     */
    public Builder setSampleRateHertz(int value) {

      sampleRateHertz_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Sample rate (in Hertz) of the audio content sent in the query.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
     * more details.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     */
    public Builder clearSampleRateHertz() {

      sampleRateHertz_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * Required. The language of the supplied audio. Dialogflow does not do
     * translations. See [Language
     * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * for a list of the currently supported language codes. Note that queries in
     * the same session do not necessarily need to specify the same language.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The language of the supplied audio. Dialogflow does not do
     * translations. See [Language
     * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * for a list of the currently supported language codes. Note that queries in
     * the same session do not necessarily need to specify the same language.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The language of the supplied audio. Dialogflow does not do
     * translations. See [Language
     * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * for a list of the currently supported language codes. Note that queries in
     * the same session do not necessarily need to specify the same language.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The language of the supplied audio. Dialogflow does not do
     * translations. See [Language
     * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * for a list of the currently supported language codes. Note that queries in
     * the same session do not necessarily need to specify the same language.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder clearLanguageCode() {

      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The language of the supplied audio. Dialogflow does not do
     * translations. See [Language
     * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
     * for a list of the currently supported language codes. Note that queries in
     * the same session do not necessarily need to specify the same language.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      languageCode_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList phraseHints_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensurePhraseHintsIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        phraseHints_ = new com.google.protobuf.LazyStringArrayList(phraseHints_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getPhraseHintsList() {
      return phraseHints_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public int getPhraseHintsCount() {
      return phraseHints_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public java.lang.String getPhraseHints(int index) {
      return phraseHints_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public com.google.protobuf.ByteString getPhraseHintsBytes(int index) {
      return phraseHints_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public Builder setPhraseHints(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhraseHintsIsMutable();
      phraseHints_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public Builder addPhraseHints(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePhraseHintsIsMutable();
      phraseHints_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public Builder addAllPhraseHints(java.lang.Iterable<java.lang.String> values) {
      ensurePhraseHintsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, phraseHints_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public Builder clearPhraseHints() {
      phraseHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of phrase hints which are used to boost accuracy
     * of speech recognition.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
     * for more details.
     * </pre>
     *
     * <code>repeated string phrase_hints = 4;</code>
     */
    public Builder addPhraseHintsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePhraseHintsIsMutable();
      phraseHints_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.InputAudioConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.InputAudioConfig)
  private static final com.google.cloud.dialogflow.v2.InputAudioConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.InputAudioConfig();
  }

  public static com.google.cloud.dialogflow.v2.InputAudioConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputAudioConfig> PARSER =
      new com.google.protobuf.AbstractParser<InputAudioConfig>() {
        @java.lang.Override
        public InputAudioConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InputAudioConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InputAudioConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputAudioConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.InputAudioConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
