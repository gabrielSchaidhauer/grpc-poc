// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: word_counter.proto

package com.whitepaper.wordcounter;

public final class WordCounter {
  private WordCounter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wordcounter_CountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wordcounter_CountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wordcounter_CountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wordcounter_CountResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022word_counter.proto\022\013wordcounter\"\037\n\014Cou" +
      "ntRequest\022\017\n\007message\030\001 \001(\t\"\036\n\rCountRespo" +
      "nse\022\r\n\005count\030\001 \001(\0052_\n\026WordCounterService" +
      "Base\022E\n\ncountWords\022\031.wordcounter.CountRe" +
      "quest\032\032.wordcounter.CountResponse\"\000B+\n\032c" +
      "om.whitepaper.wordcounterB\013WordCounterP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wordcounter_CountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wordcounter_CountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wordcounter_CountRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_wordcounter_CountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wordcounter_CountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wordcounter_CountResponse_descriptor,
        new java.lang.String[] { "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
