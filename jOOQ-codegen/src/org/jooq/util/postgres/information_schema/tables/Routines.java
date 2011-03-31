/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.PostgresDataType;
import org.jooq.util.postgres.information_schema.InformationSchema;
import org.jooq.util.postgres.information_schema.tables.records.RoutinesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Routines extends TableImpl<RoutinesRecord> {

	private static final long serialVersionUID = -995756727;

	/**
	 * The singleton instance of routines
	 */
	public static final Routines ROUTINES = new Routines();

	/**
	 * The class holding records for this type
	 */
	private static final Class<RoutinesRecord> __RECORD_TYPE = RoutinesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RoutinesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SPECIFIC_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "specific_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SPECIFIC_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "specific_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SPECIFIC_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "specific_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "routine_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "routine_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "routine_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_TYPE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "routine_type", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> MODULE_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "module_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> MODULE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "module_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> MODULE_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "module_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> UDT_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "udt_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> UDT_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "udt_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> UDT_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "udt_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> DATA_TYPE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "data_type", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "character_maximum_length", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> CHARACTER_OCTET_LENGTH = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "character_octet_length", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> CHARACTER_SET_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "character_set_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> CHARACTER_SET_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "character_set_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> CHARACTER_SET_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "character_set_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> COLLATION_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "collation_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> COLLATION_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "collation_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> COLLATION_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "collation_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "numeric_precision", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION_RADIX = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "numeric_precision_radix", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> NUMERIC_SCALE = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "numeric_scale", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> DATETIME_PRECISION = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "datetime_precision", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> INTERVAL_TYPE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "interval_type", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> INTERVAL_PRECISION = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "interval_precision", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TYPE_UDT_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "type_udt_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TYPE_UDT_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "type_udt_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TYPE_UDT_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "type_udt_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCOPE_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "scope_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCOPE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "scope_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCOPE_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "scope_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> MAXIMUM_CARDINALITY = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "maximum_cardinality", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> DTD_IDENTIFIER = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "dtd_identifier", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_BODY = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "routine_body", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> ROUTINE_DEFINITION = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "routine_definition", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> EXTERNAL_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "external_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> EXTERNAL_LANGUAGE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "external_language", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> PARAMETER_STYLE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "parameter_style", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_DETERMINISTIC = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "is_deterministic", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SQL_DATA_ACCESS = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "sql_data_access", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_NULL_CALL = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "is_null_call", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SQL_PATH = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "sql_path", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SCHEMA_LEVEL_ROUTINE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "schema_level_routine", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> MAX_DYNAMIC_RESULT_SETS = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "max_dynamic_result_sets", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_USER_DEFINED_CAST = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "is_user_defined_cast", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_IMPLICITLY_INVOCABLE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "is_implicitly_invocable", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> SECURITY_TYPE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "security_type", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "to_sql_specific_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "to_sql_specific_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "to_sql_specific_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> AS_LOCATOR = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "as_locator", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Timestamp> CREATED = new TableFieldImpl<RoutinesRecord, Timestamp>(SQLDialect.POSTGRES, "created", PostgresDataType.TIMESTAMPWITHTIMEZONE, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Timestamp> LAST_ALTERED = new TableFieldImpl<RoutinesRecord, Timestamp>(SQLDialect.POSTGRES, "last_altered", PostgresDataType.TIMESTAMPWITHTIMEZONE, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> NEW_SAVEPOINT_LEVEL = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "new_savepoint_level", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> IS_UDT_DEPENDENT = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "is_udt_dependent", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_FROM_DATA_TYPE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_from_data_type", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_AS_LOCATOR = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_as_locator", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_MAX_LENGTH = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_char_max_length", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_OCTET_LENGTH = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_char_octet_length", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_char_set_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_char_set_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_CHARACTER_SET_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_character_set_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_collation_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_collation_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_collation_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_numeric_precision", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION_RADIX = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_numeric_precision_radix", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_SCALE = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_numeric_scale", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_DATETIME_PRECISION = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_datetime_precision", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_INTERVAL_TYPE = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_interval_type", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_INTERVAL_PRECISION = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_interval_precision", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_type_udt_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_type_udt_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_type_udt_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_CATALOG = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_scope_catalog", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_SCHEMA = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_scope_schema", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_NAME = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_scope_name", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, Integer> RESULT_CAST_MAXIMUM_CARDINALITY = new TableFieldImpl<RoutinesRecord, Integer>(SQLDialect.POSTGRES, "result_cast_maximum_cardinality", PostgresDataType.INTEGER, ROUTINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<RoutinesRecord, String> RESULT_CAST_DTD_IDENTIFIER = new TableFieldImpl<RoutinesRecord, String>(SQLDialect.POSTGRES, "result_cast_dtd_identifier", PostgresDataType.CHARACTERVARYING, ROUTINES);

	/**
	 * No further instances allowed
	 */
	private Routines() {
		super(SQLDialect.POSTGRES, "routines", InformationSchema.INFORMATION_SCHEMA);
	}
}