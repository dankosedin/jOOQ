/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 161481918;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_ID)))
			.and(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord getXUnused() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.ingres.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_ID)))
			.and(org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	/**
	 * Create an attached XTestCase_85Record
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public XTestCase_85Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, configuration);
	}
}