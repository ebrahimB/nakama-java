// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface UpdateAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.UpdateAccountRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The username of the user's account.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue username = 1;</code>
   */
  boolean hasUsername();
  /**
   * <pre>
   * The username of the user's account.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue username = 1;</code>
   */
  com.google.protobuf.StringValue getUsername();

  /**
   * <pre>
   * The display name of the user.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue display_name = 2;</code>
   */
  boolean hasDisplayName();
  /**
   * <pre>
   * The display name of the user.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue display_name = 2;</code>
   */
  com.google.protobuf.StringValue getDisplayName();

  /**
   * <pre>
   * A URL for an avatar image.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 3;</code>
   */
  boolean hasAvatarUrl();
  /**
   * <pre>
   * A URL for an avatar image.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue avatar_url = 3;</code>
   */
  com.google.protobuf.StringValue getAvatarUrl();

  /**
   * <pre>
   * The language expected to be a tag which follows the BCP-47 spec.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  boolean hasLangTag();
  /**
   * <pre>
   * The language expected to be a tag which follows the BCP-47 spec.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue lang_tag = 4;</code>
   */
  com.google.protobuf.StringValue getLangTag();

  /**
   * <pre>
   * The location set by the user.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue location = 5;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * The location set by the user.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue location = 5;</code>
   */
  com.google.protobuf.StringValue getLocation();

  /**
   * <pre>
   * The timezone set by the user.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue timezone = 6;</code>
   */
  boolean hasTimezone();
  /**
   * <pre>
   * The timezone set by the user.
   * </pre>
   *
   * <code>optional .google.protobuf.StringValue timezone = 6;</code>
   */
  com.google.protobuf.StringValue getTimezone();
}
