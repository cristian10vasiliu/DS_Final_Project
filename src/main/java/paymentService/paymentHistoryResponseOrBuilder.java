// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: paymentService.proto

package paymentService;

public interface paymentHistoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:paymentHistoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string paymentId = 1;</code>
   */
  java.lang.String getPaymentId();
  /**
   * <code>string paymentId = 1;</code>
   */
  com.google.protobuf.ByteString
      getPaymentIdBytes();

  /**
   * <code>double amount = 2;</code>
   */
  double getAmount();

  /**
   * <code>string paymentDate = 3;</code>
   */
  java.lang.String getPaymentDate();
  /**
   * <code>string paymentDate = 3;</code>
   */
  com.google.protobuf.ByteString
      getPaymentDateBytes();
}