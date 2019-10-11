// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface LeaderboardRecordListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.LeaderboardRecordList)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of leaderboard records.
   * </pre>
   *
   * <code>repeated .nakama.api.LeaderboardRecord records = 1;</code>
   */
  java.util.List<com.heroiclabs.nakama.api.LeaderboardRecord> 
      getRecordsList();
  /**
   * <pre>
   * A list of leaderboard records.
   * </pre>
   *
   * <code>repeated .nakama.api.LeaderboardRecord records = 1;</code>
   */
  com.heroiclabs.nakama.api.LeaderboardRecord getRecords(int index);
  /**
   * <pre>
   * A list of leaderboard records.
   * </pre>
   *
   * <code>repeated .nakama.api.LeaderboardRecord records = 1;</code>
   */
  int getRecordsCount();

  /**
   * <pre>
   * A batched set of leaderboard records belonging to specified owners.
   * </pre>
   *
   * <code>repeated .nakama.api.LeaderboardRecord owner_records = 2;</code>
   */
  java.util.List<com.heroiclabs.nakama.api.LeaderboardRecord> 
      getOwnerRecordsList();
  /**
   * <pre>
   * A batched set of leaderboard records belonging to specified owners.
   * </pre>
   *
   * <code>repeated .nakama.api.LeaderboardRecord owner_records = 2;</code>
   */
  com.heroiclabs.nakama.api.LeaderboardRecord getOwnerRecords(int index);
  /**
   * <pre>
   * A batched set of leaderboard records belonging to specified owners.
   * </pre>
   *
   * <code>repeated .nakama.api.LeaderboardRecord owner_records = 2;</code>
   */
  int getOwnerRecordsCount();

  /**
   * <pre>
   * The cursor to send when retrieving the next page, if any.
   * </pre>
   *
   * <code>optional string next_cursor = 3;</code>
   */
  java.lang.String getNextCursor();
  /**
   * <pre>
   * The cursor to send when retrieving the next page, if any.
   * </pre>
   *
   * <code>optional string next_cursor = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextCursorBytes();

  /**
   * <pre>
   * The cursor to send when retrieving the previous page, if any.
   * </pre>
   *
   * <code>optional string prev_cursor = 4;</code>
   */
  java.lang.String getPrevCursor();
  /**
   * <pre>
   * The cursor to send when retrieving the previous page, if any.
   * </pre>
   *
   * <code>optional string prev_cursor = 4;</code>
   */
  com.google.protobuf.ByteString
      getPrevCursorBytes();
}
