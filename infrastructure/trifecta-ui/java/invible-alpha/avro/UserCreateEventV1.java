/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package invible-alpha.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserCreateEventV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7632127883583006896L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserCreateEventV1\",\"namespace\":\"invible-alpha.avro\",\"fields\":[{\"name\":\"event\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserCreateEventV1> ENCODER =
      new BinaryMessageEncoder<UserCreateEventV1>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserCreateEventV1> DECODER =
      new BinaryMessageDecoder<UserCreateEventV1>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserCreateEventV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserCreateEventV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserCreateEventV1>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserCreateEventV1 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserCreateEventV1 from a ByteBuffer. */
  public static UserCreateEventV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence event;
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserCreateEventV1() {}

  /**
   * All-args constructor.
   * @param event The new value for event
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   */
  public UserCreateEventV1(java.lang.CharSequence event, java.lang.CharSequence firstName, java.lang.CharSequence lastName) {
    this.event = event;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return event;
    case 1: return firstName;
    case 2: return lastName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: event = (java.lang.CharSequence)value$; break;
    case 1: firstName = (java.lang.CharSequence)value$; break;
    case 2: lastName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'event' field.
   * @return The value of the 'event' field.
   */
  public java.lang.CharSequence getEvent() {
    return event;
  }

  /**
   * Sets the value of the 'event' field.
   * @param value the value to set.
   */
  public void setEvent(java.lang.CharSequence value) {
    this.event = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Creates a new UserCreateEventV1 RecordBuilder.
   * @return A new UserCreateEventV1 RecordBuilder
   */
  public static invible-alpha.avro.UserCreateEventV1.Builder newBuilder() {
    return new invible-alpha.avro.UserCreateEventV1.Builder();
  }

  /**
   * Creates a new UserCreateEventV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserCreateEventV1 RecordBuilder
   */
  public static invible-alpha.avro.UserCreateEventV1.Builder newBuilder(invible-alpha.avro.UserCreateEventV1.Builder other) {
    return new invible-alpha.avro.UserCreateEventV1.Builder(other);
  }

  /**
   * Creates a new UserCreateEventV1 RecordBuilder by copying an existing UserCreateEventV1 instance.
   * @param other The existing instance to copy.
   * @return A new UserCreateEventV1 RecordBuilder
   */
  public static invible-alpha.avro.UserCreateEventV1.Builder newBuilder(invible-alpha.avro.UserCreateEventV1 other) {
    return new invible-alpha.avro.UserCreateEventV1.Builder(other);
  }

  /**
   * RecordBuilder for UserCreateEventV1 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserCreateEventV1>
    implements org.apache.avro.data.RecordBuilder<UserCreateEventV1> {

    private java.lang.CharSequence event;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(invible-alpha.avro.UserCreateEventV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.event)) {
        this.event = data().deepCopy(fields()[0].schema(), other.event);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserCreateEventV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(invible-alpha.avro.UserCreateEventV1 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.event)) {
        this.event = data().deepCopy(fields()[0].schema(), other.event);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'event' field.
      * @return The value.
      */
    public java.lang.CharSequence getEvent() {
      return event;
    }

    /**
      * Sets the value of the 'event' field.
      * @param value The value of 'event'.
      * @return This builder.
      */
    public invible-alpha.avro.UserCreateEventV1.Builder setEvent(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.event = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'event' field has been set.
      * @return True if the 'event' field has been set, false otherwise.
      */
    public boolean hasEvent() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'event' field.
      * @return This builder.
      */
    public invible-alpha.avro.UserCreateEventV1.Builder clearEvent() {
      event = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public invible-alpha.avro.UserCreateEventV1.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.firstName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public invible-alpha.avro.UserCreateEventV1.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public invible-alpha.avro.UserCreateEventV1.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public invible-alpha.avro.UserCreateEventV1.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserCreateEventV1 build() {
      try {
        UserCreateEventV1 record = new UserCreateEventV1();
        record.event = fieldSetFlags()[0] ? this.event : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.firstName = fieldSetFlags()[1] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserCreateEventV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserCreateEventV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserCreateEventV1>
    READER$ = (org.apache.avro.io.DatumReader<UserCreateEventV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
