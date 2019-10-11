// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Write objects to the storage engine.
 * </pre>
 *
 * Protobuf type {@code nakama.api.WriteStorageObjectsRequest}
 */
public  final class WriteStorageObjectsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        WriteStorageObjectsRequest, WriteStorageObjectsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.WriteStorageObjectsRequest)
    WriteStorageObjectsRequestOrBuilder {
  private WriteStorageObjectsRequest() {
    objects_ = emptyProtobufList();
  }
  public static final int OBJECTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.heroiclabs.nakama.api.WriteStorageObject> objects_;
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  public java.util.List<com.heroiclabs.nakama.api.WriteStorageObject> getObjectsList() {
    return objects_;
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  public java.util.List<? extends com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder> 
      getObjectsOrBuilderList() {
    return objects_;
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  public int getObjectsCount() {
    return objects_.size();
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  public com.heroiclabs.nakama.api.WriteStorageObject getObjects(int index) {
    return objects_.get(index);
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  public com.heroiclabs.nakama.api.WriteStorageObjectOrBuilder getObjectsOrBuilder(
      int index) {
    return objects_.get(index);
  }
  private void ensureObjectsIsMutable() {
    if (!objects_.isModifiable()) {
      objects_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(objects_);
     }
  }

  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void setObjects(
      int index, com.heroiclabs.nakama.api.WriteStorageObject value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureObjectsIsMutable();
    objects_.set(index, value);
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void setObjects(
      int index, com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
    ensureObjectsIsMutable();
    objects_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void addObjects(com.heroiclabs.nakama.api.WriteStorageObject value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureObjectsIsMutable();
    objects_.add(value);
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void addObjects(
      int index, com.heroiclabs.nakama.api.WriteStorageObject value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureObjectsIsMutable();
    objects_.add(index, value);
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void addObjects(
      com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
    ensureObjectsIsMutable();
    objects_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void addObjects(
      int index, com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
    ensureObjectsIsMutable();
    objects_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void addAllObjects(
      java.lang.Iterable<? extends com.heroiclabs.nakama.api.WriteStorageObject> values) {
    ensureObjectsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, objects_);
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void clearObjects() {
    objects_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The objects to store on the server.
   * </pre>
   *
   * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
   */
  private void removeObjects(int index) {
    ensureObjectsIsMutable();
    objects_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < objects_.size(); i++) {
      output.writeMessage(1, objects_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < objects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, objects_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.WriteStorageObjectsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Write objects to the storage engine.
   * </pre>
   *
   * Protobuf type {@code nakama.api.WriteStorageObjectsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.WriteStorageObjectsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.WriteStorageObjectsRequest)
      com.heroiclabs.nakama.api.WriteStorageObjectsRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.WriteStorageObjectsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.WriteStorageObject> getObjectsList() {
      return java.util.Collections.unmodifiableList(
          instance.getObjectsList());
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public int getObjectsCount() {
      return instance.getObjectsCount();
    }/**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public com.heroiclabs.nakama.api.WriteStorageObject getObjects(int index) {
      return instance.getObjects(index);
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder setObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject value) {
      copyOnWrite();
      instance.setObjects(index, value);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder setObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
      copyOnWrite();
      instance.setObjects(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder addObjects(com.heroiclabs.nakama.api.WriteStorageObject value) {
      copyOnWrite();
      instance.addObjects(value);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder addObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject value) {
      copyOnWrite();
      instance.addObjects(index, value);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder addObjects(
        com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
      copyOnWrite();
      instance.addObjects(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder addObjects(
        int index, com.heroiclabs.nakama.api.WriteStorageObject.Builder builderForValue) {
      copyOnWrite();
      instance.addObjects(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder addAllObjects(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.WriteStorageObject> values) {
      copyOnWrite();
      instance.addAllObjects(values);
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder clearObjects() {
      copyOnWrite();
      instance.clearObjects();
      return this;
    }
    /**
     * <pre>
     * The objects to store on the server.
     * </pre>
     *
     * <code>repeated .nakama.api.WriteStorageObject objects = 1;</code>
     */
    public Builder removeObjects(int index) {
      copyOnWrite();
      instance.removeObjects(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.WriteStorageObjectsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.WriteStorageObjectsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        objects_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.WriteStorageObjectsRequest other = (com.heroiclabs.nakama.api.WriteStorageObjectsRequest) arg1;
        objects_= visitor.visitList(objects_, other.objects_);
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
                if (!objects_.isModifiable()) {
                  objects_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(objects_);
                }
                objects_.add(
                    input.readMessage(com.heroiclabs.nakama.api.WriteStorageObject.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.WriteStorageObjectsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.WriteStorageObjectsRequest)
  private static final com.heroiclabs.nakama.api.WriteStorageObjectsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new WriteStorageObjectsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.WriteStorageObjectsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WriteStorageObjectsRequest> PARSER;

  public static com.google.protobuf.Parser<WriteStorageObjectsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

