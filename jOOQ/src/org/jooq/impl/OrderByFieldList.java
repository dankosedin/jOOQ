/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
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
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
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

package org.jooq.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Field;
import org.jooq.SQLDialect;
import org.jooq.SortOrder;

/**
 * @author Lukas Eder
 */
class OrderByFieldList extends FieldList {

    private static final long              serialVersionUID = -1825164005148183725L;

    private final Map<Field<?>, SortOrder> ordering;

    OrderByFieldList(SQLDialect dialect) {
        this(dialect, new ArrayList<Field<?>>());
    }

    OrderByFieldList(SQLDialect dialect, List<Field<?>> wrappedList) {
        super(dialect, wrappedList);

        this.ordering = new HashMap<Field<?>, SortOrder>();
    }

    void add(Field<?> field, SortOrder order) {
        add(field);

        if (order != null) {
            ordering.put(field, order);
        }
    }

    @Override
    protected String toSQLReference(Field<?> field, boolean inlineParameters) {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toSQLReference(field, inlineParameters));

        if (ordering.get(field) != null) {
            sb.append(" ");
            sb.append(ordering.get(field).toSQL());
        }

        return sb.toString();
    }
}