/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_959 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> {

	private static final long serialVersionUID = 124350888;

	/**
	 * The singleton instance of public.t_959
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_959 T_959 = new org.jooq.test.postgres.generatedclasses.tables.T_959();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_959Record.class;
	}

	/**
	 * The table column <code>public.t_959.java_keywords</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record, org.jooq.test.postgres.generatedclasses.enums.U_959> JAVA_KEYWORDS = createField("java_keywords", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.U_959.class), this);

	public T_959() {
		super("t_959", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public T_959(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_959.T_959);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_959 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_959(alias);
	}
}
