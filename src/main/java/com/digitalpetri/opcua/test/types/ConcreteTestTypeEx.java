package com.digitalpetri.opcua.test.types;

import java.util.StringJoiner;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.encoding.EncodingContext;
import org.eclipse.milo.opcua.stack.core.encoding.GenericDataTypeCodec;
import org.eclipse.milo.opcua.stack.core.encoding.UaDecoder;
import org.eclipse.milo.opcua.stack.core.encoding.UaEncoder;
import org.eclipse.milo.opcua.stack.core.types.UaStructuredType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.StructureType;
import org.eclipse.milo.opcua.stack.core.types.structured.StructureDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.StructureField;
import org.eclipse.milo.opcua.stack.core.util.codegen.EqualsBuilder;
import org.eclipse.milo.opcua.stack.core.util.codegen.HashCodeBuilder;
import org.jspecify.annotations.Nullable;

public class ConcreteTestTypeEx extends ConcreteTestType implements UaStructuredType {
  public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("nsu=https://github.com/digitalpetri/DataTypeTest;i=3009");

  public static final ExpandedNodeId BINARY_ENCODING_ID = ExpandedNodeId.parse("nsu=https://github.com/digitalpetri/DataTypeTest;i=5004");

  public static final ExpandedNodeId XML_ENCODING_ID = ExpandedNodeId.parse("nsu=https://github.com/digitalpetri/DataTypeTest;i=5005");

  public static final ExpandedNodeId JSON_ENCODING_ID = ExpandedNodeId.parse("nsu=https://github.com/digitalpetri/DataTypeTest;i=5006");

  private final UInteger uInt32Field;

  public ConcreteTestTypeEx(Short int16Field, Double doubleField, @Nullable String stringField,
      Boolean booleanField, UInteger uInt32Field) {
    super(int16Field, doubleField, stringField, booleanField);
    this.uInt32Field = uInt32Field;
  }

  @Override
  public ExpandedNodeId getTypeId() {
    return TYPE_ID;
  }

  @Override
  public ExpandedNodeId getBinaryEncodingId() {
    return BINARY_ENCODING_ID;
  }

  @Override
  public ExpandedNodeId getJsonEncodingId() {
    return JSON_ENCODING_ID;
  }

  @Override
  public ExpandedNodeId getXmlEncodingId() {
    return XML_ENCODING_ID;
  }

  public UInteger getUInt32Field() {
    return uInt32Field;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    } else if (object == null || getClass() != object.getClass()) {
      return false;
    }
    ConcreteTestTypeEx that = (ConcreteTestTypeEx) object;
    var eqb = new EqualsBuilder();
    eqb.appendSuper(super.equals(object));
    eqb.append(getUInt32Field(), that.getUInt32Field());
    return eqb.build();
  }

  @Override
  public int hashCode() {
    var hcb = new HashCodeBuilder();
    hcb.append(getUInt32Field());
    hcb.appendSuper(super.hashCode());
    return hcb.build();
  }

  @Override
  public String toString() {
    var joiner = new StringJoiner(", ", ConcreteTestTypeEx.class.getSimpleName() + "[", "]");
    joiner.add("uInt32Field=" + getUInt32Field());
    return joiner.toString();
  }

  public static StructureDefinition definition(NamespaceTable namespaceTable) {
    return new StructureDefinition(
      ExpandedNodeId.parse("nsu=https://github.com/digitalpetri/DataTypeTest;i=5004").toNodeId(namespaceTable).orElseThrow(),
      ExpandedNodeId.parse("nsu=https://github.com/digitalpetri/DataTypeTest;i=3006").toNodeId(namespaceTable).orElseThrow(),
      StructureType.Structure,
      new StructureField[]{
    		new StructureField("Int16Field", LocalizedText.NULL_VALUE, new NodeId(0, 4), -1, null, UInteger.valueOf(0), false), 
    		new StructureField("DoubleField", LocalizedText.NULL_VALUE, new NodeId(0, 11), -1, null, UInteger.valueOf(0), false), 
    		new StructureField("StringField", LocalizedText.NULL_VALUE, new NodeId(0, 12), -1, null, UInteger.valueOf(0), false), 
    		new StructureField("BooleanField", LocalizedText.NULL_VALUE, new NodeId(0, 1), -1, null, UInteger.valueOf(0), false), 
    		new StructureField("UInt32Field", LocalizedText.NULL_VALUE, new NodeId(0, 7), -1, null, UInteger.valueOf(0), false)
    	}
    );
  }

  public static final class Codec extends GenericDataTypeCodec<ConcreteTestTypeEx> {
    @Override
    public Class<ConcreteTestTypeEx> getType() {
      return ConcreteTestTypeEx.class;
    }

    @Override
    public ConcreteTestTypeEx decodeType(EncodingContext context, UaDecoder decoder) {
      final Short int16Field;
      final Double doubleField;
      final String stringField;
      final Boolean booleanField;
      final UInteger uInt32Field;
      int16Field = decoder.decodeInt16("Int16Field");
      doubleField = decoder.decodeDouble("DoubleField");
      stringField = decoder.decodeString("StringField");
      booleanField = decoder.decodeBoolean("BooleanField");
      uInt32Field = decoder.decodeUInt32("UInt32Field");
      return new ConcreteTestTypeEx(int16Field, doubleField, stringField, booleanField, uInt32Field);
    }

    @Override
    public void encodeType(EncodingContext context, UaEncoder encoder, ConcreteTestTypeEx value) {
      encoder.encodeInt16("Int16Field", value.getInt16Field());
      encoder.encodeDouble("DoubleField", value.getDoubleField());
      encoder.encodeString("StringField", value.getStringField());
      encoder.encodeBoolean("BooleanField", value.getBooleanField());
      encoder.encodeUInt32("UInt32Field", value.getUInt32Field());
    }
  }
}
