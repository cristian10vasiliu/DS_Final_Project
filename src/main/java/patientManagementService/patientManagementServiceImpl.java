// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: managementService.proto

package patientManagementService;

public final class patientManagementServiceImpl {
  private patientManagementServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_addRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_addRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_addResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_addResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_updateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_updateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_updateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_updateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteRecordResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027managementService.proto\"?\n\naddRequest\022" +
      "\023\n\013patientName\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\017\n\007add" +
      "ress\030\003 \001(\t\"#\n\013addResponse\022\024\n\014isSuccessfu" +
      "l\030\001 \001(\010\"5\n\rupdateRequest\022\023\n\013patientName\030" +
      "\001 \001(\t\022\017\n\007address\030\002 \001(\t\"&\n\016updateResponse" +
      "\022\024\n\014isSuccessful\030\001 \001(\010\"*\n\023deleteRecordRe" +
      "quest\022\023\n\013patientName\030\001 \001(\t\"0\n\024deleteReco" +
      "rdResponse\022\030\n\020deleteSuccessful\030\001 \001(\0102\260\001\n" +
      "\021patientManagement\022)\n\naddRecords\022\013.addRe" +
      "quest\032\014.addResponse(\001\0223\n\014updateRecord\022\016." +
      "updateRequest\032\017.updateResponse(\0010\001\022;\n\014de" +
      "leteRecord\022\024.deleteRecordRequest\032\025.delet" +
      "eRecordResponseB:\n\030patientManagementServ" +
      "iceB\034patientManagementServiceImplP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_addRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_addRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_addRequest_descriptor,
        new java.lang.String[] { "PatientName", "Age", "Address", });
    internal_static_addResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_addResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_addResponse_descriptor,
        new java.lang.String[] { "IsSuccessful", });
    internal_static_updateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_updateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_updateRequest_descriptor,
        new java.lang.String[] { "PatientName", "Address", });
    internal_static_updateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_updateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_updateResponse_descriptor,
        new java.lang.String[] { "IsSuccessful", });
    internal_static_deleteRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_deleteRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteRecordRequest_descriptor,
        new java.lang.String[] { "PatientName", });
    internal_static_deleteRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_deleteRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteRecordResponse_descriptor,
        new java.lang.String[] { "DeleteSuccessful", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
