/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class FNumber extends org.jooq.impl.StoredFunctionImpl<java.lang.Integer> {

	private static final long serialVersionUID = -241354413;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> N = new org.jooq.impl.ParameterImpl<java.lang.Integer>("N", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new function call instance
	 */
	public FNumber() {
		super(org.jooq.SQLDialect.HSQLDB, "F_NUMBER", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		addInParameter(N);
	}

	/**
	 * Set the <code>N</code> parameter to the function
	 */
	public void setN(java.lang.Integer value) {
		setValue(N, value);
	}

	/**
	 * Set the <code>N</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setN(org.jooq.Field<java.lang.Integer> field) {
		setField(N, field);
	}
}