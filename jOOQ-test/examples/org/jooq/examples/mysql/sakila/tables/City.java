/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class City extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CityRecord> {

	private static final long serialVersionUID = 1889779053;

	/**
	 * The singleton instance of sakila.city
	 */
	public static final org.jooq.examples.mysql.sakila.tables.City CITY = new org.jooq.examples.mysql.sakila.tables.City();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CityRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.CityRecord.class;
	}

	/**
	 * The table column <code>sakila.city.city_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.city.city</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.String> CITY_ = createField("city", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.city.country_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_city_country
	 * FOREIGN KEY (country_id)
	 * REFERENCES sakila.country (country_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.city.last_update</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public City() {
		super("city", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public City(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.City.CITY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_CITY;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_CITY_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_CITY_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_CITY_COUNTRY);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.City as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.City(alias);
	}
}
