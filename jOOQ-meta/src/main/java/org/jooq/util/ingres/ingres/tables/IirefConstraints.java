/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class IirefConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1717541779;

	/**
	 * The singleton instance of $ingres.iiref_constraints
	 */
	public static final org.jooq.util.ingres.ingres.tables.IirefConstraints IIREF_CONSTRAINTS = new org.jooq.util.ingres.ingres.tables.IirefConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REF_CONSTRAINT_NAME = createField("ref_constraint_name", org.jooq.impl.SQLDataType.CHAR, IIREF_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REF_SCHEMA_NAME = createField("ref_schema_name", org.jooq.impl.SQLDataType.CHAR, IIREF_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REF_TABLE_NAME = createField("ref_table_name", org.jooq.impl.SQLDataType.CHAR, IIREF_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_CONSTRAINT_NAME = createField("unique_constraint_name", org.jooq.impl.SQLDataType.CHAR, IIREF_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_SCHEMA_NAME = createField("unique_schema_name", org.jooq.impl.SQLDataType.CHAR, IIREF_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_TABLE_NAME = createField("unique_table_name", org.jooq.impl.SQLDataType.CHAR, IIREF_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private IirefConstraints() {
		super("iiref_constraints", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
