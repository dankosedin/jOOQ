/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDatesDao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.TDatesRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TDates, java.lang.Integer> {

	/**
	 * Create a new TDatesDao without any factory
	 */
	public TDatesDao() {
		super(org.jooq.test.mysql.generatedclasses.tables.TDates.T_DATES, org.jooq.test.mysql.generatedclasses.tables.pojos.TDates.class);
	}

	/**
	 * Create a new TDatesDao with an attached factory
	 */
	public TDatesDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.TDates.T_DATES, org.jooq.test.mysql.generatedclasses.tables.pojos.TDates.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TDates object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TDates> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TDates.ID, values);
	}

	/**
	 * Fetch a unique that has <code>id = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.TDates fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mysql.generatedclasses.tables.TDates.ID, value);
	}

	/**
	 * Fetch records that have <code>d IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TDates> fetchByD(java.sql.Date... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TDates.D, values);
	}

	/**
	 * Fetch records that have <code>t IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TDates> fetchByT(java.sql.Time... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TDates.T, values);
	}

	/**
	 * Fetch records that have <code>ts IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TDates> fetchByTs(java.sql.Timestamp... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TDates.TS, values);
	}

	/**
	 * Fetch records that have <code>d_int IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TDates> fetchByDInt(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TDates.D_INT, values);
	}

	/**
	 * Fetch records that have <code>ts_bigint IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TDates> fetchByTsBigint(java.lang.Long... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TDates.TS_BIGINT, values);
	}
}
