/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_959Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.T_959Record> {

	private static final long serialVersionUID = 900761625;

	/**
	 * The table column <code>test.t_959.java_keywords</code>
	 */
	public void setJavaKeywords(org.jooq.test.mysql.generatedclasses.enums.T_959JavaKeywords value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.T_959.JAVA_KEYWORDS, value);
	}

	/**
	 * The table column <code>test.t_959.java_keywords</code>
	 */
	public org.jooq.test.mysql.generatedclasses.enums.T_959JavaKeywords getJavaKeywords() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.T_959.JAVA_KEYWORDS);
	}

	/**
	 * Create a detached T_959Record
	 */
	public T_959Record() {
		super(org.jooq.test.mysql.generatedclasses.tables.T_959.T_959);
	}
}
