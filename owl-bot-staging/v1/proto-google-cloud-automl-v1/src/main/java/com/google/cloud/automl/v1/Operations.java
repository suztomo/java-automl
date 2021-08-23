// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/operations.proto

package com.google.cloud.automl.v1;

public final class Operations {
  private Operations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_DeleteOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_DeleteOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1/operations.prot" +
      "o\022\026google.cloud.automl.v1\032$google/cloud/" +
      "automl/v1/dataset.proto\032\037google/cloud/au" +
      "toml/v1/io.proto\032\037google/protobuf/timest" +
      "amp.proto\032\027google/rpc/status.proto\032\034goog" +
      "le/api/annotations.proto\"\311\007\n\021OperationMe" +
      "tadata\022I\n\016delete_details\030\010 \001(\0132/.google." +
      "cloud.automl.v1.DeleteOperationMetadataH" +
      "\000\022T\n\024deploy_model_details\030\030 \001(\01324.google" +
      ".cloud.automl.v1.DeployModelOperationMet" +
      "adataH\000\022X\n\026undeploy_model_details\030\031 \001(\0132" +
      "6.google.cloud.automl.v1.UndeployModelOp" +
      "erationMetadataH\000\022T\n\024create_model_detail" +
      "s\030\n \001(\01324.google.cloud.automl.v1.CreateM" +
      "odelOperationMetadataH\000\022X\n\026create_datase" +
      "t_details\030\036 \001(\01326.google.cloud.automl.v1" +
      ".CreateDatasetOperationMetadataH\000\022R\n\023imp" +
      "ort_data_details\030\017 \001(\01323.google.cloud.au" +
      "toml.v1.ImportDataOperationMetadataH\000\022V\n" +
      "\025batch_predict_details\030\020 \001(\01325.google.cl" +
      "oud.automl.v1.BatchPredictOperationMetad" +
      "ataH\000\022R\n\023export_data_details\030\025 \001(\01323.goo" +
      "gle.cloud.automl.v1.ExportDataOperationM" +
      "etadataH\000\022T\n\024export_model_details\030\026 \001(\0132" +
      "4.google.cloud.automl.v1.ExportModelOper" +
      "ationMetadataH\000\022\030\n\020progress_percent\030\r \001(" +
      "\005\022,\n\020partial_failures\030\002 \003(\0132\022.google.rpc" +
      ".Status\022/\n\013create_time\030\003 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022/\n\013update_time\030\004 \001(\0132\032." +
      "google.protobuf.TimestampB\t\n\007details\"\031\n\027" +
      "DeleteOperationMetadata\"\036\n\034DeployModelOp" +
      "erationMetadata\" \n\036UndeployModelOperatio" +
      "nMetadata\" \n\036CreateDatasetOperationMetad" +
      "ata\"\036\n\034CreateModelOperationMetadata\"\035\n\033I" +
      "mportDataOperationMetadata\"\307\001\n\033ExportDat" +
      "aOperationMetadata\022]\n\013output_info\030\001 \001(\0132" +
      "H.google.cloud.automl.v1.ExportDataOpera" +
      "tionMetadata.ExportDataOutputInfo\032I\n\024Exp" +
      "ortDataOutputInfo\022\036\n\024gcs_output_director" +
      "y\030\001 \001(\tH\000B\021\n\017output_location\"\226\002\n\035BatchPr" +
      "edictOperationMetadata\022E\n\014input_config\030\001" +
      " \001(\0132/.google.cloud.automl.v1.BatchPredi" +
      "ctInputConfig\022a\n\013output_info\030\002 \001(\0132L.goo" +
      "gle.cloud.automl.v1.BatchPredictOperatio" +
      "nMetadata.BatchPredictOutputInfo\032K\n\026Batc" +
      "hPredictOutputInfo\022\036\n\024gcs_output_directo" +
      "ry\030\001 \001(\tH\000B\021\n\017output_location\"\266\001\n\034Export" +
      "ModelOperationMetadata\022_\n\013output_info\030\002 " +
      "\001(\0132J.google.cloud.automl.v1.ExportModel" +
      "OperationMetadata.ExportModelOutputInfo\032" +
      "5\n\025ExportModelOutputInfo\022\034\n\024gcs_output_d" +
      "irectory\030\001 \001(\tB\252\001\n\032com.google.cloud.auto" +
      "ml.v1P\001Z<google.golang.org/genproto/goog" +
      "leapis/cloud/automl/v1;automl\252\002\026Google.C" +
      "loud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V1\352" +
      "\002\031Google::Cloud::AutoML::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1.DatasetOuterClass.getDescriptor(),
          com.google.cloud.automl.v1.Io.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "DeleteDetails", "DeployModelDetails", "UndeployModelDetails", "CreateModelDetails", "CreateDatasetDetails", "ImportDataDetails", "BatchPredictDetails", "ExportDataDetails", "ExportModelDetails", "ProgressPercent", "PartialFailures", "CreateTime", "UpdateTime", "Details", });
    internal_static_google_cloud_automl_v1_DeleteOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_DeleteOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_DeleteOperationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_DeployModelOperationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_UndeployModelOperationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_CreateDatasetOperationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_CreateModelOperationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ImportDataOperationMetadata_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor,
        new java.lang.String[] { "OutputInfo", });
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor =
      internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ExportDataOperationMetadata_ExportDataOutputInfo_descriptor,
        new java.lang.String[] { "GcsOutputDirectory", "OutputLocation", });
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor,
        new java.lang.String[] { "InputConfig", "OutputInfo", });
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor =
      internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_BatchPredictOperationMetadata_BatchPredictOutputInfo_descriptor,
        new java.lang.String[] { "GcsOutputDirectory", "OutputLocation", });
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor,
        new java.lang.String[] { "OutputInfo", });
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor =
      internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ExportModelOperationMetadata_ExportModelOutputInfo_descriptor,
        new java.lang.String[] { "GcsOutputDirectory", });
    com.google.cloud.automl.v1.DatasetOuterClass.getDescriptor();
    com.google.cloud.automl.v1.Io.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
