// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface ChannelMessageListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ChannelMessageList)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1;</code>
   */
  java.util.List<com.heroiclabs.nakama.api.ChannelMessage> 
      getMessagesList();
  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1;</code>
   */
  com.heroiclabs.nakama.api.ChannelMessage getMessages(int index);
  /**
   * <pre>
   * A list of messages.
   * </pre>
   *
   * <code>repeated .nakama.api.ChannelMessage messages = 1;</code>
   */
  int getMessagesCount();

  /**
   * <pre>
   * The cursor to send when retireving the next page, if any.
   * </pre>
   *
   * <code>optional string next_cursor = 2;</code>
   */
  java.lang.String getNextCursor();
  /**
   * <pre>
   * The cursor to send when retireving the next page, if any.
   * </pre>
   *
   * <code>optional string next_cursor = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextCursorBytes();

  /**
   * <pre>
   * The cursor to send when retrieving the previous page, if any.
   * </pre>
   *
   * <code>optional string prev_cursor = 3;</code>
   */
  java.lang.String getPrevCursor();
  /**
   * <pre>
   * The cursor to send when retrieving the previous page, if any.
   * </pre>
   *
   * <code>optional string prev_cursor = 3;</code>
   */
  com.google.protobuf.ByteString
      getPrevCursorBytes();
}
