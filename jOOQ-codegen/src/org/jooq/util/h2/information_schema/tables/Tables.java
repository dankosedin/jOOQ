/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.h2.H2DataType;
import org.jooq.util.h2.information_schema.InformationSchema;
import org.jooq.util.h2.information_schema.tables.records.TablesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Tables extends TableImpl<TablesRecord> {

	private static final long serialVersionUID = 766995426;

	/**
	 * The singleton instance of TABLES
	 */
	public static final Tables TABLES = new Tables();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TablesRecord> __RECORD_TYPE = TablesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TablesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_CATALOG = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_CATALOG", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_SCHEMA = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_SCHEMA", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_NAME = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_NAME", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_TYPE = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_TYPE", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> STORAGE_TYPE = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "STORAGE_TYPE", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> SQL = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "SQL", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> REMARKS = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "REMARKS", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Long> LAST_MODIFICATION = new TableFieldImpl<TablesRecord, Long>(SQLDialect.H2, "LAST_MODIFICATION", H2DataType.BIGINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> ID = new TableFieldImpl<TablesRecord, Integer>(SQLDialect.H2, "ID", H2DataType.INTEGER, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TYPE_NAME = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TYPE_NAME", H2DataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_CLASS = new TableFieldImpl<TablesRecord, String>(SQLDialect.H2, "TABLE_CLASS", H2DataType.VARCHAR, TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super(SQLDialect.H2, "TABLES", InformationSchema.INFORMATION_SCHEMA);
	}
}