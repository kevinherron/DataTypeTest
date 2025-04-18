package com.digitalpetri.opcua.test;

import com.digitalpetri.opcua.test.types.ConcreteTestType;
import com.digitalpetri.opcua.test.types.ConcreteTestTypeEx;
import com.digitalpetri.opcua.test.types.StructWithAbstractArrayFields;
import com.digitalpetri.opcua.test.types.StructWithAbstractMatrixFields;
import com.digitalpetri.opcua.test.types.StructWithAbstractScalarFields;
import com.digitalpetri.opcua.test.types.StructWithBuiltinArrayFields;
import com.digitalpetri.opcua.test.types.StructWithBuiltinArrayFieldsEx;
import com.digitalpetri.opcua.test.types.StructWithBuiltinMatrixFields;
import com.digitalpetri.opcua.test.types.StructWithBuiltinMatrixFieldsEx;
import com.digitalpetri.opcua.test.types.StructWithBuiltinScalarFields;
import com.digitalpetri.opcua.test.types.StructWithBuiltinScalarFieldsEx;
import com.digitalpetri.opcua.test.types.StructWithOptionalArrayFields;
import com.digitalpetri.opcua.test.types.StructWithOptionalMatrixFields;
import com.digitalpetri.opcua.test.types.StructWithOptionalScalarFields;
import com.digitalpetri.opcua.test.types.StructWithStructureArrayFields;
import com.digitalpetri.opcua.test.types.StructWithStructureMatrixFields;
import com.digitalpetri.opcua.test.types.StructWithStructureScalarFields;
import com.digitalpetri.opcua.test.types.UnionOfArray;
import com.digitalpetri.opcua.test.types.UnionOfMatrix;
import com.digitalpetri.opcua.test.types.UnionOfScalar;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.DataTypeManager;

public class DataTypeInitializer {
  public void initialize(NamespaceTable namespaceTable, DataTypeManager dataTypeManager) {
    try {
      registerStructCodecs(namespaceTable, dataTypeManager);
    } catch (Exception e) {
      throw new RuntimeException("DataType initialization failed", e);
    }
  }

  private void registerStructCodecs(NamespaceTable namespaceTable, DataTypeManager dataTypeManager)
      throws Exception {
    dataTypeManager.registerType(
          UnionOfArray.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new UnionOfArray.Codec(),
          UnionOfArray.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          UnionOfArray.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          UnionOfArray.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          UnionOfMatrix.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new UnionOfMatrix.Codec(),
          UnionOfMatrix.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          UnionOfMatrix.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          UnionOfMatrix.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          UnionOfScalar.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new UnionOfScalar.Codec(),
          UnionOfScalar.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          UnionOfScalar.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          UnionOfScalar.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          ConcreteTestType.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new ConcreteTestType.Codec(),
          ConcreteTestType.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          ConcreteTestType.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          ConcreteTestType.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          ConcreteTestTypeEx.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new ConcreteTestTypeEx.Codec(),
          ConcreteTestTypeEx.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          ConcreteTestTypeEx.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          ConcreteTestTypeEx.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithAbstractArrayFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithAbstractArrayFields.Codec(),
          StructWithAbstractArrayFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithAbstractArrayFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithAbstractArrayFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithAbstractMatrixFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithAbstractMatrixFields.Codec(),
          StructWithAbstractMatrixFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithAbstractMatrixFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithAbstractMatrixFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithAbstractScalarFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithAbstractScalarFields.Codec(),
          StructWithAbstractScalarFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithAbstractScalarFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithAbstractScalarFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithBuiltinArrayFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithBuiltinArrayFields.Codec(),
          StructWithBuiltinArrayFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinArrayFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinArrayFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithBuiltinArrayFieldsEx.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithBuiltinArrayFieldsEx.Codec(),
          StructWithBuiltinArrayFieldsEx.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinArrayFieldsEx.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinArrayFieldsEx.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithBuiltinMatrixFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithBuiltinMatrixFields.Codec(),
          StructWithBuiltinMatrixFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinMatrixFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinMatrixFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithBuiltinMatrixFieldsEx.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithBuiltinMatrixFieldsEx.Codec(),
          StructWithBuiltinMatrixFieldsEx.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinMatrixFieldsEx.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinMatrixFieldsEx.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithBuiltinScalarFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithBuiltinScalarFields.Codec(),
          StructWithBuiltinScalarFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinScalarFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinScalarFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithBuiltinScalarFieldsEx.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithBuiltinScalarFieldsEx.Codec(),
          StructWithBuiltinScalarFieldsEx.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinScalarFieldsEx.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithBuiltinScalarFieldsEx.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithOptionalArrayFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithOptionalArrayFields.Codec(),
          StructWithOptionalArrayFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithOptionalArrayFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithOptionalArrayFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithOptionalMatrixFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithOptionalMatrixFields.Codec(),
          StructWithOptionalMatrixFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithOptionalMatrixFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithOptionalMatrixFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithOptionalScalarFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithOptionalScalarFields.Codec(),
          StructWithOptionalScalarFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithOptionalScalarFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithOptionalScalarFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithStructureArrayFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithStructureArrayFields.Codec(),
          StructWithStructureArrayFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithStructureArrayFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithStructureArrayFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithStructureMatrixFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithStructureMatrixFields.Codec(),
          StructWithStructureMatrixFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithStructureMatrixFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithStructureMatrixFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
    dataTypeManager.registerType(
          StructWithStructureScalarFields.TYPE_ID.toNodeIdOrThrow(namespaceTable),
          new StructWithStructureScalarFields.Codec(),
          StructWithStructureScalarFields.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithStructureScalarFields.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
          StructWithStructureScalarFields.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable)
        );
  }
}
