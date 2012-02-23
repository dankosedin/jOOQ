/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_BOOLEANS extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS> {

	private static final long serialVersionUID = 1978954881;

	/**
	 * The singleton instance of TEST.T_BOOLEANS
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS T_BOOLEANS = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS> __RECORD_TYPE = org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.Integer> ONE_ZERO = createField("ONE_ZERO", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> TRUE_FALSE_LC = createField("TRUE_FALSE_LC", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> TRUE_FALSE_UC = createField("TRUE_FALSE_UC", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> YES_NO_LC = createField("YES_NO_LC", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> YES_NO_UC = createField("YES_NO_UC", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> Y_N_LC = createField("Y_N_LC", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> Y_N_UC = createField("Y_N_UC", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> VC_BOOLEAN = createField("VC_BOOLEAN", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.String> C_BOOLEAN = createField("C_BOOLEAN", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS, java.lang.Integer> N_BOOLEAN = createField("N_BOOLEAN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private T_BOOLEANS() {
		super("T_BOOLEANS", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_BOOLEANS(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOLEANS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOLEANS>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOLEANS);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS(alias);
	}
}