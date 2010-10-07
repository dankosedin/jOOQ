/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.information_schema.InformationSchema;
import org.jooq.util.postgres.information_schema.tables.records.KeyColumnUsageRecord;


/**
 * This class is generated by jOOQ.
 */
public class KeyColumnUsage extends TableImpl<KeyColumnUsageRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of key_column_usage
	 */
	public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

	/**
	 * The class holding records for this table
	 */
	private static final Class<KeyColumnUsageRecord> RECORD_TYPE = KeyColumnUsageRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<KeyColumnUsageRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<KeyColumnUsageRecord, String>("constraint_catalog", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<KeyColumnUsageRecord, String>("constraint_schema", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> CONSTRAINT_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>("constraint_name", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> TABLE_CATALOG = new TableFieldImpl<KeyColumnUsageRecord, String>("table_catalog", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> TABLE_SCHEMA = new TableFieldImpl<KeyColumnUsageRecord, String>("table_schema", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> TABLE_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>("table_name", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> COLUMN_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>("column_name", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, Integer> ORDINAL_POSITION = new TableFieldImpl<KeyColumnUsageRecord, Integer>("ordinal_position", Integer.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, Integer> POSITION_IN_UNIQUE_CONSTRAINT = new TableFieldImpl<KeyColumnUsageRecord, Integer>("position_in_unique_constraint", Integer.class, KEY_COLUMN_USAGE);

	/**
	 * No further instances allowed
	 */
	private KeyColumnUsage() {
		super("key_column_usage", InformationSchema.INFORMATION_SCHEMA);
	}

}