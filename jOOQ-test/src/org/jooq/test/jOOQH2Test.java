/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.test;

import java.sql.Date;

import org.jooq.ArrayRecord;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UDTRecord;
import org.jooq.UpdatableTable;
import org.jooq.impl.Factory;
import org.jooq.test.h2.generatedclasses.Functions;
import org.jooq.test.h2.generatedclasses.Procedures;
import org.jooq.test.h2.generatedclasses.PublicFactory;
import org.jooq.test.h2.generatedclasses.Sequences;
import org.jooq.test.h2.generatedclasses.tables.TArrays;
import org.jooq.test.h2.generatedclasses.tables.TAuthor;
import org.jooq.test.h2.generatedclasses.tables.TBook;
import org.jooq.test.h2.generatedclasses.tables.TBookStore;
import org.jooq.test.h2.generatedclasses.tables.VLibrary;
import org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord;
import org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.test.h2.generatedclasses.tables.records.TBookRecord;
import org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord;
import org.jooq.test.h2.generatedclasses.tables.records.VLibraryRecord;
import org.jooq.util.h2.H2DataType;

/**
 * Integration test for the H2 database
 *
 * @author Espen Stromsnes
 */
public class jOOQH2Test extends jOOQAbstractTest<
        TAuthorRecord,
        TBookRecord,
        TBookStoreRecord,
        VLibraryRecord,
        TArraysRecord> {

    @Override
    protected Factory create() {
        return new PublicFactory(getConnection());
    }

    @Override
    protected UpdatableTable<TAuthorRecord> TAuthor() {
        return TAuthor.T_AUTHOR;
    }

    @Override
    protected TableField<TAuthorRecord, String> TAuthor_LAST_NAME() {
        return TAuthor.LAST_NAME;
    }

    @Override
    protected TableField<TAuthorRecord, String> TAuthor_FIRST_NAME() {
        return TAuthor.FIRST_NAME;
    }

    @Override
    protected TableField<TAuthorRecord, Date> TAuthor_DATE_OF_BIRTH() {
        return TAuthor.DATE_OF_BIRTH;
    }

    @Override
    protected TableField<TAuthorRecord, Integer> TAuthor_YEAR_OF_BIRTH() {
        return TAuthor.YEAR_OF_BIRTH;
    }

    @Override
    protected TableField<TAuthorRecord, Integer> TAuthor_ID() {
        return TAuthor.ID;
    }

    @Override
    protected TableField<TAuthorRecord, ? extends UDTRecord<?>> TAuthor_ADDRESS() {
        return null;
    }

    @Override
    protected UpdatableTable<TBookRecord> TBook() {
        return TBook.T_BOOK;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_ID() {
        return TBook.ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_AUTHOR_ID() {
        return TBook.AUTHOR_ID;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_TITLE() {
        return TBook.TITLE;
    }

    @Override
    protected UpdatableTable<TBookStoreRecord> TBookStore() {
        return TBookStore.T_BOOK_STORE;
    }

    @Override
    protected TableField<TBookStoreRecord, String> TBookStore_NAME() {
        return TBookStore.NAME;
    }


    @Override
    protected Table<TArraysRecord> TArrays() {
        return TArrays.T_ARRAYS;
    }

    @Override
    protected TableField<TArraysRecord, Integer> TArrays_ID() {
        return TArrays.ID;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    protected TableField<TArraysRecord, String[]> TArrays_STRING() {
        return (TableField) TArrays.STRING_ARRAY;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    protected TableField<TArraysRecord, Integer[]> TArrays_NUMBER() {
        return (TableField) TArrays.NUMBER_ARRAY;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    protected TableField<TArraysRecord, Date[]> TArrays_DATE() {
        return (TableField) TArrays.DATE_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, ? extends UDTRecord<?>[]> TArrays_UDT() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<String>> TArrays_STRING_R() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<Integer>> TArrays_NUMBER_R() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<Date>> TArrays_DATE_R() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<Long>> TArrays_NUMBER_LONG_R() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_LANGUAGE_ID() {
        return TBook.LANGUAGE_ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_PUBLISHED_IN() {
        return TBook.PUBLISHED_IN;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_CONTENT_TEXT() {
        return TBook.CONTENT_TEXT;
    }

    @Override
    protected TableField<TBookRecord, byte[]> TBook_CONTENT_PDF() {
        return TBook.CONTENT_PDF;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_STATUS() {
        return null;
    }

    @Override
    protected Table<VLibraryRecord> VLibrary() {
        return VLibrary.V_LIBRARY;
    }

    @Override
    protected TableField<VLibraryRecord, String> VLibrary_TITLE() {
        return VLibrary.TITLE;
    }

    @Override
    protected TableField<VLibraryRecord, String> VLibrary_AUTHOR() {
        return VLibrary.AUTHOR;
    }

    @Override
    protected Field<? extends Number> FAuthorExistsField(String authorName) {
        return Functions.fAuthorExists(authorName);
    }

    @Override
    protected Field<? extends Number> FOneField() {
        return Functions.fOne();
    }

    @Override
    protected Field<? extends Number> FNumberField(Number n) {
        return Functions.fNumber((Integer) n);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Field<? extends Number> FNumberField(Field<? extends Number> n) {
        return Functions.fNumber((Field<Integer>) n);
    }

    @Override
    protected Field<? extends Number> F317Field(Number n1, Number n2, Number n3, Number n4) {
        return Functions.f317((Integer) n1, (Integer) n2, (Integer) n3, (Integer) n4);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Field<? extends Number> F317Field(Field<? extends Number> n1, Field<? extends Number> n2,
        Field<? extends Number> n3, Field<? extends Number> n4) {
        return Functions.f317((Field<Integer>) n1, (Field<Integer>) n2, (Field<Integer>) n3, (Field<Integer>) n4);
    }

    @Override
    protected Class<? extends UDTRecord<?>> UAddressType() {
        return null;
    }

    @Override
    protected Class<? extends UDTRecord<?>> UStreetType() {
        return null;
    }

    @Override
    protected Class<?> Procedures() {
        return Procedures.class;
    }

    @Override
    protected boolean supportsOUTParameters() {
        return false;
    }

    @Override
    protected boolean supportsReferences() {
        return true;
    }

    @Override
    protected Class<?> Functions() {
        return Functions.class;
    }

    @Override
    protected Class<?> Library() {
        return null;
    }

    @Override
    protected Class<?> Sequences() {
        return Sequences.class;
    }

    @Override
    protected DataType<?>[] getCastableDataTypes() {
        return new DataType<?>[] {
            H2DataType.BIGINT,
            H2DataType.BINARY,
            H2DataType.BIT,
            H2DataType.BLOB,
            H2DataType.BOOL,
            H2DataType.BOOLEAN,
            H2DataType.BYTEA,
            H2DataType.CHAR,
            H2DataType.CHARACTER,
            H2DataType.CLOB,
            H2DataType.DATE,
            H2DataType.DATETIME,
            H2DataType.DEC,
            H2DataType.DECIMAL,
            H2DataType.DOUBLE,
            H2DataType.FLOAT,
            H2DataType.FLOAT4,
            H2DataType.FLOAT8,
            H2DataType.IDENTITY,
            H2DataType.IMAGE,
            H2DataType.INT,
            H2DataType.INT2,
            H2DataType.INT4,
            H2DataType.INT8,
            H2DataType.INTEGER,
            H2DataType.LONGBLOB,
            H2DataType.LONGTEXT,
            H2DataType.LONGVARBINARY,
            H2DataType.LONGVARCHAR,
            H2DataType.MEDIUMBLOB,
            H2DataType.MEDIUMINT,
            H2DataType.MEDIUMTEXT,
            H2DataType.NCHAR,
            H2DataType.NCLOB,
            H2DataType.NTEXT,
            H2DataType.NUMBER,
            H2DataType.NUMERIC,
            H2DataType.NVARCHAR,
            H2DataType.NVARCHAR2,
            H2DataType.OID,
            H2DataType.OTHER,
            H2DataType.RAW,
            H2DataType.REAL,
            H2DataType.SIGNED,
            H2DataType.SMALLDATETIME,
            H2DataType.SMALLINT,
            H2DataType.TEXT,
            H2DataType.TIME,
            H2DataType.TIMESTAMP,
            H2DataType.TINYBLOB,
            H2DataType.TINYINT,
            H2DataType.TINYTEXT,
            H2DataType.UUID,
            H2DataType.VARBINARY,
            H2DataType.VARCHAR,
            H2DataType.VARCHAR2,
            H2DataType.VARCHAR_CASESENSITIVE,
            H2DataType.VARCHAR_IGNORECASE,
        };
    }
}