/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.util.mysql.information_schema.tables.CharacterSets;


/**
 * This class is generated by jOOQ.
 */
public class CharacterSetsRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setCharacterSetName(String value) {
		setValue(CharacterSets.CHARACTER_SET_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCharacterSetName() {
		return getValue(CharacterSets.CHARACTER_SET_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDefaultCollateName(String value) {
		setValue(CharacterSets.DEFAULT_COLLATE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDefaultCollateName() {
		return getValue(CharacterSets.DEFAULT_COLLATE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(String value) {
		setValue(CharacterSets.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDescription() {
		return getValue(CharacterSets.DESCRIPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setMaxlen(Integer value) {
		setValue(CharacterSets.MAXLEN, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getMaxlen() {
		return getValue(CharacterSets.MAXLEN);
	}

	public CharacterSetsRecord(Result result) {
		super(result);
	}
}