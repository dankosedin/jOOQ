/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in sakila
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public final class Routines {

	/**
	 * Invoke FILM_IN_STOCK
	 *
	 * @param pFilmId IN parameter
	 * @param pStoreId IN parameter
	 * @param pFilmCount OUT parameter
	 */
	public static java.lang.Integer filmInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.routines.FilmInStock p = new org.jooq.examples.mysql.sakila.routines.FilmInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Invoke FILM_NOT_IN_STOCK
	 *
	 * @param pFilmId IN parameter
	 * @param pStoreId IN parameter
	 * @param pFilmCount OUT parameter
	 */
	public static java.lang.Integer filmNotInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.routines.FilmNotInStock p = new org.jooq.examples.mysql.sakila.routines.FilmNotInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Invoke GET_CUSTOMER_BALANCE
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static java.math.BigDecimal getCustomerBalance(org.jooq.Configuration configuration, java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.routines.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get GET_CUSTOMER_BALANCE as a field
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Get GET_CUSTOMER_BALANCE as a field
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(org.jooq.Field<java.lang.Integer> pCustomerId, org.jooq.Field<java.sql.Timestamp> pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Invoke INVENTORY_HELD_BY_CUSTOMER
	 *
	 * @param pInventoryId
	 */
	public static java.lang.Integer inventoryHeldByCustomer(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get INVENTORY_HELD_BY_CUSTOMER as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get INVENTORY_HELD_BY_CUSTOMER as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Invoke INVENTORY_IN_STOCK
	 *
	 * @param pInventoryId
	 */
	public static java.lang.Byte inventoryInStock(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.routines.InventoryInStock f = new org.jooq.examples.mysql.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get INVENTORY_IN_STOCK as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryInStock f = new org.jooq.examples.mysql.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get INVENTORY_IN_STOCK as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryInStock f = new org.jooq.examples.mysql.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Invoke REWARDS_REPORT
	 *
	 * @param minMonthlyPurchases IN parameter
	 * @param minDollarAmountPurchased IN parameter
	 * @param countRewardees OUT parameter
	 */
	public static java.lang.Integer rewardsReport(org.jooq.Configuration configuration, java.lang.Byte minMonthlyPurchases, java.math.BigDecimal minDollarAmountPurchased) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.routines.RewardsReport p = new org.jooq.examples.mysql.sakila.routines.RewardsReport();
		p.setMinMonthlyPurchases(minMonthlyPurchases);
		p.setMinDollarAmountPurchased(minDollarAmountPurchased);

		p.execute(configuration);
		return p.getCountRewardees();
	}

	/**
	 * No instances
	 */
	private Routines() {}
}