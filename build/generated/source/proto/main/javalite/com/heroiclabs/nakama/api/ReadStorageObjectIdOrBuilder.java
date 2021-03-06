// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface ReadStorageObjectIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ReadStorageObjectId)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  java.lang.String getCollection();
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  com.google.protobuf.ByteString
      getCollectionBytes();

  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
