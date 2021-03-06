/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST", schema = "TEST")
public interface T_725_LOB_TEST_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.T_725_LOB_TEST.LOB</code>
	 */
	public void setLOB(byte[] value);

	/**
	 * The table column <code>TEST.T_725_LOB_TEST.LOB</code>
	 */
	@javax.persistence.Column(name = "LOB")
	public byte[] getLOB();
}
