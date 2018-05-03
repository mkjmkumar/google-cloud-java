// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface ReadModifyWriteRowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ReadModifyWriteRowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the table to which the read/modify/write rules should be
   * applied.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * The unique name of the table to which the read/modify/write rules should be
   * applied.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * This is a private alpha release of Cloud Bigtable replication. This feature
   * is not currently available to most Cloud Bigtable customers. This feature
   * might be changed in backward-incompatible ways and is not recommended for
   * production use. It is not subject to any SLA or deprecation policy.
   * This value specifies routing for replication. If not specified, the
   * "default" application profile will be used.
   * </pre>
   *
   * <code>string app_profile_id = 4;</code>
   */
  java.lang.String getAppProfileId();
  /**
   * <pre>
   * This is a private alpha release of Cloud Bigtable replication. This feature
   * is not currently available to most Cloud Bigtable customers. This feature
   * might be changed in backward-incompatible ways and is not recommended for
   * production use. It is not subject to any SLA or deprecation policy.
   * This value specifies routing for replication. If not specified, the
   * "default" application profile will be used.
   * </pre>
   *
   * <code>string app_profile_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getAppProfileIdBytes();

  /**
   * <pre>
   * The key of the row to which the read/modify/write rules should be applied.
   * </pre>
   *
   * <code>bytes row_key = 2;</code>
   */
  com.google.protobuf.ByteString getRowKey();

  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  java.util.List<com.google.bigtable.v2.ReadModifyWriteRule> 
      getRulesList();
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  com.google.bigtable.v2.ReadModifyWriteRule getRules(int index);
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  java.util.List<? extends com.google.bigtable.v2.ReadModifyWriteRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  com.google.bigtable.v2.ReadModifyWriteRuleOrBuilder getRulesOrBuilder(
      int index);
}