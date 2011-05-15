/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;
import org.jooq.test.sqlserver.generatedclasses.Keys;
import org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord;
import org.jooq.util.sqlserver.SQLServerDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookStore extends UpdatableTableImpl<TBookStoreRecord> {

	private static final long serialVersionUID = -1323849381;

	/**
	 * The singleton instance of t_book_store
	 */
	public static final TBookStore T_BOOK_STORE = new TBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookStoreRecord> __RECORD_TYPE = TBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookStoreRecord, Integer> ID = new TableFieldImpl<TBookStoreRecord, Integer>(SQLDialect.SQLSERVER, "id", SQLServerDataType.INT, T_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookStoreRecord, String> NAME = new TableFieldImpl<TBookStoreRecord, String>(SQLDialect.SQLSERVER, "name", SQLServerDataType.VARCHAR, T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super(SQLDialect.SQLSERVER, "t_book_store", Dbo.DBO);
	}

	@Override
	public Identity<TBookStoreRecord, Integer> getIdentity() {
		return Keys.IDENTITY_t_book_store;
	}

	@Override
	public UniqueKey<TBookStoreRecord> getMainKey() {
		return Keys.uk_t_book_store_name;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookStoreRecord>>asList(Keys.uk_t_book_store_name);
	}
}