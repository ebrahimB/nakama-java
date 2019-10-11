// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface AuthenticateEmailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AuthenticateEmailRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  boolean hasAccount();
  /**
   * <pre>
   * The email account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountEmail account = 1;</code>
   */
  com.heroiclabs.nakama.api.AccountEmail getAccount();

  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  com.google.protobuf.BoolValue getCreate();

  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();
}
