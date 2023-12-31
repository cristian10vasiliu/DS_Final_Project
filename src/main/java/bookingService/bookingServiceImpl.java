// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bookingService.proto

package bookingService;

public final class bookingServiceImpl {
  private bookingServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_loginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_loginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_loginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_loginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appointmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appointmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cancelAppointmentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cancelAppointmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cancelAppointmentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cancelAppointmentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024bookingService.proto\"2\n\014loginRequest\022\020" +
      "\n\010userName\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\">\n\rlo" +
      "ginResponse\022\027\n\017responseMessage\030\001 \001(\t\022\024\n\014" +
      "responseCode\030\002 \001(\005\"C\n\022appointmentRequest" +
      "\022\023\n\013patientName\030\001 \001(\t\022\030\n\020appointment_tim" +
      "e\030\002 \001(\t\"0\n\023appointmentResponse\022\031\n\021appoin" +
      "tmentNumber\030\001 \001(\t\"J\n\030cancelAppointmentRe" +
      "quest\022\023\n\013patientName\030\001 \001(\t\022\031\n\021appointmen" +
      "tNumber\030\002 \001(\t\"9\n\031cancelAppointmentRespon" +
      "se\022\034\n\024appointmentCancelled\030\001 \001(\0102\273\001\n\007boo" +
      "king\022&\n\005login\022\r.loginRequest\032\016.loginResp" +
      "onse\022<\n\017bookAppointment\022\023.appointmentReq" +
      "uest\032\024.appointmentResponse\022J\n\021cancelAppo" +
      "intment\022\031.cancelAppointmentRequest\032\032.can" +
      "celAppointmentResponseB&\n\016bookingService" +
      "B\022bookingServiceImplP\001b\006proto3"
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
    internal_static_loginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_loginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_loginRequest_descriptor,
        new java.lang.String[] { "UserName", "Password", });
    internal_static_loginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_loginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_loginResponse_descriptor,
        new java.lang.String[] { "ResponseMessage", "ResponseCode", });
    internal_static_appointmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appointmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointmentRequest_descriptor,
        new java.lang.String[] { "PatientName", "AppointmentTime", });
    internal_static_appointmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appointmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appointmentResponse_descriptor,
        new java.lang.String[] { "AppointmentNumber", });
    internal_static_cancelAppointmentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cancelAppointmentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cancelAppointmentRequest_descriptor,
        new java.lang.String[] { "PatientName", "AppointmentNumber", });
    internal_static_cancelAppointmentResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cancelAppointmentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cancelAppointmentResponse_descriptor,
        new java.lang.String[] { "AppointmentCancelled", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
