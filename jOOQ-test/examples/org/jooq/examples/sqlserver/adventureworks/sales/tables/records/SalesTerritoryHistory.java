/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTerritoryHistory", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesPersonID", "StartDate", "TerritoryID"})
})
public class SalesTerritoryHistory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritoryHistory> {

	private static final long serialVersionUID = -1043543940;

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.SalesPersonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesTerritoryHistory_SalesPerson_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES Sales.SalesPerson (SalesPersonID)
	 * </pre></code>
	 */
	public void setSalesPersonID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID, value);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.SalesPersonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesTerritoryHistory_SalesPerson_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES Sales.SalesPerson (SalesPersonID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesPersonID", nullable = false, precision = 10)
	public java.lang.Integer getSalesPersonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.TerritoryID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesTerritoryHistory_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	public void setTerritoryID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID, value);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.TerritoryID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesTerritoryHistory_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TerritoryID", nullable = false, precision = 10)
	public java.lang.Integer getTerritoryID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.StartDate</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.StartDate, value);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.StartDate</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.StartDate);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.EndDate</code>
	 */
	public void setEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.EndDate, value);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.EndDate</code>
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.EndDate);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.rowguid, value);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.rowguid);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.SalesTerritoryHistory.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.ModifiedDate);
	}

	/**
	 * Create a detached SalesTerritoryHistory
	 */
	public SalesTerritoryHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory);
	}
}
