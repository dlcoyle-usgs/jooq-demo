/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records


import org.jooq.Field
import org.jooq.Record1
import org.jooq.Row1
import org.jooq.demo.kotlin.db.tables.FilmInStock
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmInStockRecord() : TableRecordImpl<FilmInStockRecord>(FilmInStock.FILM_IN_STOCK), Record1<Int?> {

    open var pFilmCount: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row1<Int?> = super.fieldsRow() as Row1<Int?>
    override fun valuesRow(): Row1<Int?> = super.valuesRow() as Row1<Int?>
    override fun field1(): Field<Int?> = FilmInStock.FILM_IN_STOCK.P_FILM_COUNT
    override fun component1(): Int? = pFilmCount
    override fun value1(): Int? = pFilmCount

    override fun value1(value: Int?): FilmInStockRecord {
        set(0, value)
        return this
    }

    override fun values(value1: Int?): FilmInStockRecord {
        this.value1(value1)
        return this
    }

    /**
     * Create a detached, initialised FilmInStockRecord
     */
    constructor(pFilmCount: Int? = null): this() {
        this.pFilmCount = pFilmCount
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised FilmInStockRecord
     */
    constructor(value: org.jooq.demo.kotlin.db.tables.pojos.FilmInStock?): this() {
        if (value != null) {
            this.pFilmCount = value.pFilmCount
            resetChangedOnNotNull()
        }
    }
}