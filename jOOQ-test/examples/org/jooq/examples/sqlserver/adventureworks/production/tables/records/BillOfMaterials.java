/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "BillOfMaterials", schema = "Production")
public class BillOfMaterials extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillOfMaterials> {

	private static final long serialVersionUID = -1214710616;

	/**
	 * The table column <code>Production.BillOfMaterials.BillOfMaterialsID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setBillOfMaterialsID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BillOfMaterialsID, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.BillOfMaterialsID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "BillOfMaterialsID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getBillOfMaterialsID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BillOfMaterialsID);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.ProductAssemblyID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ProductAssemblyID
	 * FOREIGN KEY (ProductAssemblyID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductAssemblyID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ProductAssemblyID, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.ProductAssemblyID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ProductAssemblyID
	 * FOREIGN KEY (ProductAssemblyID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductAssemblyID", precision = 10)
	public java.lang.Integer getProductAssemblyID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ProductAssemblyID);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.ComponentID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ComponentID
	 * FOREIGN KEY (ComponentID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setComponentID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ComponentID, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.ComponentID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ComponentID
	 * FOREIGN KEY (ComponentID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ComponentID", nullable = false, precision = 10)
	public java.lang.Integer getComponentID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ComponentID);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.StartDate</code>
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.StartDate, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.StartDate</code>
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.StartDate);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.EndDate</code>
	 */
	public void setEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.EndDate, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.EndDate</code>
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.EndDate);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.UnitMeasureCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_UnitMeasure_UnitMeasureCode
	 * FOREIGN KEY (UnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	public void setUnitMeasureCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.UnitMeasureCode, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.UnitMeasureCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_UnitMeasure_UnitMeasureCode
	 * FOREIGN KEY (UnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "UnitMeasureCode", nullable = false, length = 3)
	public java.lang.String getUnitMeasureCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.UnitMeasureCode);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.BOMLevel</code>
	 */
	public void setBOMLevel(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BOMLevel, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.BOMLevel</code>
	 */
	@javax.persistence.Column(name = "BOMLevel", nullable = false, precision = 5)
	public java.lang.Short getBOMLevel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BOMLevel);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.PerAssemblyQty</code>
	 */
	public void setPerAssemblyQty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.PerAssemblyQty, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.PerAssemblyQty</code>
	 */
	@javax.persistence.Column(name = "PerAssemblyQty", nullable = false, precision = 8, scale = 2)
	public java.math.BigDecimal getPerAssemblyQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.PerAssemblyQty);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.BillOfMaterials.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ModifiedDate);
	}

	/**
	 * Create a detached BillOfMaterials
	 */
	public BillOfMaterials() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials);
	}
}
