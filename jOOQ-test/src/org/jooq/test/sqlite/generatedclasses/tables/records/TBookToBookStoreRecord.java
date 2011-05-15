/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookToBookStoreRecord extends UpdatableRecordImpl<TBookToBookStoreRecord> {

	private static final long serialVersionUID = 699196481;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setBookStoreName(String value) {
		setValue(TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public String getBookStoreName() {
		return getValue(TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setBookId(Integer value) {
		setValue(TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getBookId() {
		return getValue(TBookToBookStore.BOOK_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStock(Integer value) {
		setValue(TBookToBookStore.STOCK, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getStock() {
		return getValue(TBookToBookStore.STOCK);
	}
	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create an attached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord(Configuration configuration) {
		super(TBookToBookStore.T_BOOK_TO_BOOK_STORE, configuration);
	}
}