/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Description of all procedures available to the user
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class AllProceduresRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllProceduresRecord> {

	private static final long serialVersionUID = -1217211397;

	/**
	 * An uncommented item
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.OWNER);
	}

	/**
	 * Name of the object : top level function/procedure/package name
	 */
	public void setObjectName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.OBJECT_NAME, value);
	}

	/**
	 * Name of the object : top level function/procedure/package name
	 */
	public java.lang.String getObjectName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.OBJECT_NAME);
	}

	/**
	 * Name of the procedure
	 */
	public void setProcedureName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.PROCEDURE_NAME, value);
	}

	/**
	 * Name of the procedure
	 */
	public java.lang.String getProcedureName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.PROCEDURE_NAME);
	}

	/**
	 * Is it an aggregate function ?
	 */
	public void setAggregate(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.AGGREGATE, value);
	}

	/**
	 * Is it an aggregate function ?
	 */
	public java.lang.String getAggregate() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.AGGREGATE);
	}

	/**
	 * Is it a pipelined table function ?
	 */
	public void setPipelined(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.PIPELINED, value);
	}

	/**
	 * Is it a pipelined table function ?
	 */
	public java.lang.String getPipelined() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.PIPELINED);
	}

	/**
	 * Name of the owner of the implementation type (if any)
	 */
	public void setImpltypeowner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.IMPLTYPEOWNER, value);
	}

	/**
	 * Name of the owner of the implementation type (if any)
	 */
	public java.lang.String getImpltypeowner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.IMPLTYPEOWNER);
	}

	/**
	 * Name of the implementation type (if any)
	 */
	public void setImpltypename(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.IMPLTYPENAME, value);
	}

	/**
	 * Name of the implementation type (if any)
	 */
	public java.lang.String getImpltypename() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.IMPLTYPENAME);
	}

	/**
	 * Is the procedure parallel enabled ?
	 */
	public void setParallel(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.PARALLEL, value);
	}

	/**
	 * Is the procedure parallel enabled ?
	 */
	public java.lang.String getParallel() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.PARALLEL);
	}

	/**
	 * An uncommented item
	 */
	public void setInterface(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.INTERFACE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getInterface() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.INTERFACE);
	}

	/**
	 * An uncommented item
	 */
	public void setDeterministic(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.DETERMINISTIC, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDeterministic() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.DETERMINISTIC);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthid(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllProcedures.AUTHID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAuthid() {
		return getValue(org.jooq.util.oracle.sys.tables.AllProcedures.AUTHID);
	}

	/**
	 * Create a detached AllProceduresRecord
	 */
	public AllProceduresRecord() {
		super(org.jooq.util.oracle.sys.tables.AllProcedures.ALL_PROCEDURES);
	}
}