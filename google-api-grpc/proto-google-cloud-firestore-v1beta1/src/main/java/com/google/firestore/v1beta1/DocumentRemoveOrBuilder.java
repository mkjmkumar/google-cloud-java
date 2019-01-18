// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/write.proto

package com.google.firestore.v1beta1;

public interface DocumentRemoveOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.DocumentRemove)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the [Document][google.firestore.v1beta1.Document] that has gone out of view.
   * </pre>
   *
   * <code>string document = 1;</code>
   */
  java.lang.String getDocument();
  /**
   *
   *
   * <pre>
   * The resource name of the [Document][google.firestore.v1beta1.Document] that has gone out of view.
   * </pre>
   *
   * <code>string document = 1;</code>
   */
  com.google.protobuf.ByteString getDocumentBytes();

  /**
   *
   *
   * <pre>
   * A set of target IDs for targets that previously matched this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 2;</code>
   */
  java.util.List<java.lang.Integer> getRemovedTargetIdsList();
  /**
   *
   *
   * <pre>
   * A set of target IDs for targets that previously matched this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 2;</code>
   */
  int getRemovedTargetIdsCount();
  /**
   *
   *
   * <pre>
   * A set of target IDs for targets that previously matched this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 2;</code>
   */
  int getRemovedTargetIds(int index);

  /**
   *
   *
   * <pre>
   * The read timestamp at which the remove was observed.
   * Greater or equal to the `commit_time` of the change/delete/remove.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * The read timestamp at which the remove was observed.
   * Greater or equal to the `commit_time` of the change/delete/remove.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * The read timestamp at which the remove was observed.
   * Greater or equal to the `commit_time` of the change/delete/remove.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();
}