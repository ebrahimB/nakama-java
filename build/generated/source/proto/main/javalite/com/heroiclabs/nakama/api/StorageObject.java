// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * An object within the storage engine.
 * </pre>
 *
 * Protobuf type {@code nakama.api.StorageObject}
 */
public  final class StorageObject extends
    com.google.protobuf.GeneratedMessageLite<
        StorageObject, StorageObject.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.StorageObject)
    StorageObjectOrBuilder {
  private StorageObject() {
    collection_ = "";
    key_ = "";
    userId_ = "";
    value_ = "";
    version_ = "";
  }
  public static final int COLLECTION_FIELD_NUMBER = 1;
  private java.lang.String collection_;
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  public java.lang.String getCollection() {
    return collection_;
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCollectionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(collection_);
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  private void setCollection(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    collection_ = value;
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  private void clearCollection() {
    
    collection_ = getDefaultInstance().getCollection();
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  private void setCollectionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    collection_ = value.toStringUtf8();
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private java.lang.String key_;
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  public java.lang.String getKey() {
    return key_;
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(key_);
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  private void setKey(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    key_ = value;
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  private void clearKey() {
    
    key_ = getDefaultInstance().getKey();
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  private void setKeyBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    key_ = value.toStringUtf8();
  }

  public static final int USER_ID_FIELD_NUMBER = 3;
  private java.lang.String userId_;
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  private void setUserId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    userId_ = value;
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    userId_ = value.toStringUtf8();
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private java.lang.String value_;
  /**
   * <pre>
   * The value of the object.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   */
  public java.lang.String getValue() {
    return value_;
  }
  /**
   * <pre>
   * The value of the object.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(value_);
  }
  /**
   * <pre>
   * The value of the object.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   */
  private void setValue(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    value_ = value;
  }
  /**
   * <pre>
   * The value of the object.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   */
  private void clearValue() {
    
    value_ = getDefaultInstance().getValue();
  }
  /**
   * <pre>
   * The value of the object.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   */
  private void setValueBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    value_ = value.toStringUtf8();
  }

  public static final int VERSION_FIELD_NUMBER = 5;
  private java.lang.String version_;
  /**
   * <pre>
   * The version hash of the object.
   * </pre>
   *
   * <code>optional string version = 5;</code>
   */
  public java.lang.String getVersion() {
    return version_;
  }
  /**
   * <pre>
   * The version hash of the object.
   * </pre>
   *
   * <code>optional string version = 5;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(version_);
  }
  /**
   * <pre>
   * The version hash of the object.
   * </pre>
   *
   * <code>optional string version = 5;</code>
   */
  private void setVersion(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    version_ = value;
  }
  /**
   * <pre>
   * The version hash of the object.
   * </pre>
   *
   * <code>optional string version = 5;</code>
   */
  private void clearVersion() {
    
    version_ = getDefaultInstance().getVersion();
  }
  /**
   * <pre>
   * The version hash of the object.
   * </pre>
   *
   * <code>optional string version = 5;</code>
   */
  private void setVersionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    version_ = value.toStringUtf8();
  }

  public static final int PERMISSION_READ_FIELD_NUMBER = 6;
  private int permissionRead_;
  /**
   * <pre>
   * The read access permissions for the object.
   * </pre>
   *
   * <code>optional int32 permission_read = 6;</code>
   */
  public int getPermissionRead() {
    return permissionRead_;
  }
  /**
   * <pre>
   * The read access permissions for the object.
   * </pre>
   *
   * <code>optional int32 permission_read = 6;</code>
   */
  private void setPermissionRead(int value) {
    
    permissionRead_ = value;
  }
  /**
   * <pre>
   * The read access permissions for the object.
   * </pre>
   *
   * <code>optional int32 permission_read = 6;</code>
   */
  private void clearPermissionRead() {
    
    permissionRead_ = 0;
  }

  public static final int PERMISSION_WRITE_FIELD_NUMBER = 7;
  private int permissionWrite_;
  /**
   * <pre>
   * The write access permissions for the object.
   * </pre>
   *
   * <code>optional int32 permission_write = 7;</code>
   */
  public int getPermissionWrite() {
    return permissionWrite_;
  }
  /**
   * <pre>
   * The write access permissions for the object.
   * </pre>
   *
   * <code>optional int32 permission_write = 7;</code>
   */
  private void setPermissionWrite(int value) {
    
    permissionWrite_ = value;
  }
  /**
   * <pre>
   * The write access permissions for the object.
   * </pre>
   *
   * <code>optional int32 permission_write = 7;</code>
   */
  private void clearPermissionWrite() {
    
    permissionWrite_ = 0;
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 8;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * The UNIX time when the object was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
   */
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * The UNIX time when the object was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
   */
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * The UNIX time when the object was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
   */
  private void setCreateTime(com.google.protobuf.Timestamp value) {
    if (value == null) {
      throw new NullPointerException();
    }
    createTime_ = value;
    
    }
  /**
   * <pre>
   * The UNIX time when the object was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
   */
  private void setCreateTime(
      com.google.protobuf.Timestamp.Builder builderForValue) {
    createTime_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The UNIX time when the object was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
   */
  private void mergeCreateTime(com.google.protobuf.Timestamp value) {
    if (createTime_ != null &&
        createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      createTime_ =
        com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
    } else {
      createTime_ = value;
    }
    
  }
  /**
   * <pre>
   * The UNIX time when the object was created.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
   */
  private void clearCreateTime() {  createTime_ = null;
    
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 9;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * The UNIX time when the object was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
   */
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   * <pre>
   * The UNIX time when the object was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
   */
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * The UNIX time when the object was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
   */
  private void setUpdateTime(com.google.protobuf.Timestamp value) {
    if (value == null) {
      throw new NullPointerException();
    }
    updateTime_ = value;
    
    }
  /**
   * <pre>
   * The UNIX time when the object was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
   */
  private void setUpdateTime(
      com.google.protobuf.Timestamp.Builder builderForValue) {
    updateTime_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The UNIX time when the object was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
   */
  private void mergeUpdateTime(com.google.protobuf.Timestamp value) {
    if (updateTime_ != null &&
        updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      updateTime_ =
        com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
    } else {
      updateTime_ = value;
    }
    
  }
  /**
   * <pre>
   * The UNIX time when the object was last updated.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
   */
  private void clearUpdateTime() {  updateTime_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!collection_.isEmpty()) {
      output.writeString(1, getCollection());
    }
    if (!key_.isEmpty()) {
      output.writeString(2, getKey());
    }
    if (!userId_.isEmpty()) {
      output.writeString(3, getUserId());
    }
    if (!value_.isEmpty()) {
      output.writeString(4, getValue());
    }
    if (!version_.isEmpty()) {
      output.writeString(5, getVersion());
    }
    if (permissionRead_ != 0) {
      output.writeInt32(6, permissionRead_);
    }
    if (permissionWrite_ != 0) {
      output.writeInt32(7, permissionWrite_);
    }
    if (createTime_ != null) {
      output.writeMessage(8, getCreateTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(9, getUpdateTime());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!collection_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getCollection());
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getKey());
    }
    if (!userId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUserId());
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getValue());
    }
    if (!version_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getVersion());
    }
    if (permissionRead_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, permissionRead_);
    }
    if (permissionWrite_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, permissionWrite_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getCreateTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getUpdateTime());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.StorageObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.StorageObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.StorageObject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * An object within the storage engine.
   * </pre>
   *
   * Protobuf type {@code nakama.api.StorageObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.StorageObject, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.StorageObject)
      com.heroiclabs.nakama.api.StorageObjectOrBuilder {
    // Construct using com.heroiclabs.nakama.api.StorageObject.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public java.lang.String getCollection() {
      return instance.getCollection();
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCollectionBytes() {
      return instance.getCollectionBytes();
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public Builder setCollection(
        java.lang.String value) {
      copyOnWrite();
      instance.setCollection(value);
      return this;
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public Builder clearCollection() {
      copyOnWrite();
      instance.clearCollection();
      return this;
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public Builder setCollectionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCollectionBytes(value);
      return this;
    }

    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public java.lang.String getKey() {
      return instance.getKey();
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      return instance.getKeyBytes();
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setKey(value);
      return this;
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder clearKey() {
      copyOnWrite();
      instance.clearKey();
      return this;
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setKeyBytes(value);
      return this;
    }

    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      copyOnWrite();
      instance.setUserId(value);
      return this;
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The value of the object.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     */
    public java.lang.String getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The value of the object.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      return instance.getValueBytes();
    }
    /**
     * <pre>
     * The value of the object.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <pre>
     * The value of the object.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }
    /**
     * <pre>
     * The value of the object.
     * </pre>
     *
     * <code>optional string value = 4;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValueBytes(value);
      return this;
    }

    /**
     * <pre>
     * The version hash of the object.
     * </pre>
     *
     * <code>optional string version = 5;</code>
     */
    public java.lang.String getVersion() {
      return instance.getVersion();
    }
    /**
     * <pre>
     * The version hash of the object.
     * </pre>
     *
     * <code>optional string version = 5;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      return instance.getVersionBytes();
    }
    /**
     * <pre>
     * The version hash of the object.
     * </pre>
     *
     * <code>optional string version = 5;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <pre>
     * The version hash of the object.
     * </pre>
     *
     * <code>optional string version = 5;</code>
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }
    /**
     * <pre>
     * The version hash of the object.
     * </pre>
     *
     * <code>optional string version = 5;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setVersionBytes(value);
      return this;
    }

    /**
     * <pre>
     * The read access permissions for the object.
     * </pre>
     *
     * <code>optional int32 permission_read = 6;</code>
     */
    public int getPermissionRead() {
      return instance.getPermissionRead();
    }
    /**
     * <pre>
     * The read access permissions for the object.
     * </pre>
     *
     * <code>optional int32 permission_read = 6;</code>
     */
    public Builder setPermissionRead(int value) {
      copyOnWrite();
      instance.setPermissionRead(value);
      return this;
    }
    /**
     * <pre>
     * The read access permissions for the object.
     * </pre>
     *
     * <code>optional int32 permission_read = 6;</code>
     */
    public Builder clearPermissionRead() {
      copyOnWrite();
      instance.clearPermissionRead();
      return this;
    }

    /**
     * <pre>
     * The write access permissions for the object.
     * </pre>
     *
     * <code>optional int32 permission_write = 7;</code>
     */
    public int getPermissionWrite() {
      return instance.getPermissionWrite();
    }
    /**
     * <pre>
     * The write access permissions for the object.
     * </pre>
     *
     * <code>optional int32 permission_write = 7;</code>
     */
    public Builder setPermissionWrite(int value) {
      copyOnWrite();
      instance.setPermissionWrite(value);
      return this;
    }
    /**
     * <pre>
     * The write access permissions for the object.
     * </pre>
     *
     * <code>optional int32 permission_write = 7;</code>
     */
    public Builder clearPermissionWrite() {
      copyOnWrite();
      instance.clearPermissionWrite();
      return this;
    }

    /**
     * <pre>
     * The UNIX time when the object was created.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
     */
    public boolean hasCreateTime() {
      return instance.hasCreateTime();
    }
    /**
     * <pre>
     * The UNIX time when the object was created.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      return instance.getCreateTime();
    }
    /**
     * <pre>
     * The UNIX time when the object was created.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setCreateTime(value);
      return this;
      }
    /**
     * <pre>
     * The UNIX time when the object was created.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setCreateTime(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The UNIX time when the object was created.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeCreateTime(value);
      return this;
    }
    /**
     * <pre>
     * The UNIX time when the object was created.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp create_time = 8;</code>
     */
    public Builder clearCreateTime() {  copyOnWrite();
      instance.clearCreateTime();
      return this;
    }

    /**
     * <pre>
     * The UNIX time when the object was last updated.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
     */
    public boolean hasUpdateTime() {
      return instance.hasUpdateTime();
    }
    /**
     * <pre>
     * The UNIX time when the object was last updated.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      return instance.getUpdateTime();
    }
    /**
     * <pre>
     * The UNIX time when the object was last updated.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setUpdateTime(value);
      return this;
      }
    /**
     * <pre>
     * The UNIX time when the object was last updated.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setUpdateTime(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The UNIX time when the object was last updated.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeUpdateTime(value);
      return this;
    }
    /**
     * <pre>
     * The UNIX time when the object was last updated.
     * </pre>
     *
     * <code>optional .google.protobuf.Timestamp update_time = 9;</code>
     */
    public Builder clearUpdateTime() {  copyOnWrite();
      instance.clearUpdateTime();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.StorageObject)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.StorageObject();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.StorageObject other = (com.heroiclabs.nakama.api.StorageObject) arg1;
        collection_ = visitor.visitString(!collection_.isEmpty(), collection_,
            !other.collection_.isEmpty(), other.collection_);
        key_ = visitor.visitString(!key_.isEmpty(), key_,
            !other.key_.isEmpty(), other.key_);
        userId_ = visitor.visitString(!userId_.isEmpty(), userId_,
            !other.userId_.isEmpty(), other.userId_);
        value_ = visitor.visitString(!value_.isEmpty(), value_,
            !other.value_.isEmpty(), other.value_);
        version_ = visitor.visitString(!version_.isEmpty(), version_,
            !other.version_.isEmpty(), other.version_);
        permissionRead_ = visitor.visitInt(permissionRead_ != 0, permissionRead_,
            other.permissionRead_ != 0, other.permissionRead_);
        permissionWrite_ = visitor.visitInt(permissionWrite_ != 0, permissionWrite_,
            other.permissionWrite_ != 0, other.permissionWrite_);
        createTime_ = visitor.visitMessage(createTime_, other.createTime_);
        updateTime_ = visitor.visitMessage(updateTime_, other.updateTime_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                collection_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                key_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                userId_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                value_ = s;
                break;
              }
              case 42: {
                String s = input.readStringRequireUtf8();

                version_ = s;
                break;
              }
              case 48: {

                permissionRead_ = input.readInt32();
                break;
              }
              case 56: {

                permissionWrite_ = input.readInt32();
                break;
              }
              case 66: {
                com.google.protobuf.Timestamp.Builder subBuilder = null;
                if (createTime_ != null) {
                  subBuilder = createTime_.toBuilder();
                }
                createTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(createTime_);
                  createTime_ = subBuilder.buildPartial();
                }

                break;
              }
              case 74: {
                com.google.protobuf.Timestamp.Builder subBuilder = null;
                if (updateTime_ != null) {
                  subBuilder = updateTime_.toBuilder();
                }
                updateTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(updateTime_);
                  updateTime_ = subBuilder.buildPartial();
                }

                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.StorageObject.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:nakama.api.StorageObject)
  private static final com.heroiclabs.nakama.api.StorageObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StorageObject();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.StorageObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StorageObject> PARSER;

  public static com.google.protobuf.Parser<StorageObject> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

