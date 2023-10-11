/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.routines.references


import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

import org.jooq.AggregateFunction
import org.jooq.Configuration
import org.jooq.Field
import org.jooq.Result
import org.jooq.demo.kotlin.db.routines.GetCustomerBalance
import org.jooq.demo.kotlin.db.routines.GroupConcat
import org.jooq.demo.kotlin.db.routines.InventoryHeldByCustomer
import org.jooq.demo.kotlin.db.routines.InventoryInStock
import org.jooq.demo.kotlin.db.routines.LastDay
import org.jooq.demo.kotlin.db.routines._GroupConcat
import org.jooq.demo.kotlin.db.tables.FilmInStock
import org.jooq.demo.kotlin.db.tables.FilmNotInStock
import org.jooq.demo.kotlin.db.tables.RewardsReport
import org.jooq.demo.kotlin.db.tables.records.CustomerRecord
import org.jooq.demo.kotlin.db.tables.records.FilmInStockRecord
import org.jooq.demo.kotlin.db.tables.records.FilmNotInStockRecord



/**
 * Call <code>public._group_concat</code>
 */
fun _GroupConcat(
      configuration: Configuration
    , __1: String?
    , __2: String?
): String? {
    val f = _GroupConcat()
    f.set__1(__1)
    f.set__2(__2)

    f.execute(configuration)
    return f.returnValue
}

/**
 * Get <code>public._group_concat</code> as a field.
 */
fun _GroupConcat(
      __1: String?
    , __2: String?
): Field<String?> {
    val f = _GroupConcat()
    f.set__1(__1)
    f.set__2(__2)

    return f.asField()
}

/**
 * Get <code>public._group_concat</code> as a field.
 */
fun _GroupConcat(
      __1: Field<String?>
    , __2: Field<String?>
): Field<String?> {
    val f = _GroupConcat()
    f.set__1(__1)
    f.set__2(__2)

    return f.asField()
}

/**
 * Call <code>public.get_customer_balance</code>
 */
fun getCustomerBalance(
      configuration: Configuration
    , pCustomerId: Long?
    , pEffectiveDate: LocalDateTime?
): BigDecimal? {
    val f = GetCustomerBalance()
    f.setPCustomerId(pCustomerId)
    f.setPEffectiveDate(pEffectiveDate)

    f.execute(configuration)
    return f.returnValue
}

/**
 * Get <code>public.get_customer_balance</code> as a field.
 */
fun getCustomerBalance(
      pCustomerId: Long?
    , pEffectiveDate: LocalDateTime?
): Field<BigDecimal?> {
    val f = GetCustomerBalance()
    f.setPCustomerId(pCustomerId)
    f.setPEffectiveDate(pEffectiveDate)

    return f.asField()
}

/**
 * Get <code>public.get_customer_balance</code> as a field.
 */
fun getCustomerBalance(
      pCustomerId: Field<Long?>
    , pEffectiveDate: Field<LocalDateTime?>
): Field<BigDecimal?> {
    val f = GetCustomerBalance()
    f.setPCustomerId(pCustomerId)
    f.setPEffectiveDate(pEffectiveDate)

    return f.asField()
}

/**
 * Get <code>public.group_concat</code> as a field.
 */
fun groupConcat(
      __1: String?
): AggregateFunction<String?> {
    val f = GroupConcat()
    f.set__1(__1)

    return f.asAggregateFunction()
}

/**
 * Get <code>public.group_concat</code> as a field.
 */
fun groupConcat(
      __1: Field<String?>
): AggregateFunction<String?> {
    val f = GroupConcat()
    f.set__1(__1)

    return f.asAggregateFunction()
}

/**
 * Call <code>public.inventory_held_by_customer</code>
 */
fun inventoryHeldByCustomer(
      configuration: Configuration
    , pInventoryId: Long?
): Int? {
    val f = InventoryHeldByCustomer()
    f.setPInventoryId(pInventoryId)

    f.execute(configuration)
    return f.returnValue
}

/**
 * Get <code>public.inventory_held_by_customer</code> as a field.
 */
fun inventoryHeldByCustomer(
      pInventoryId: Long?
): Field<Int?> {
    val f = InventoryHeldByCustomer()
    f.setPInventoryId(pInventoryId)

    return f.asField()
}

/**
 * Get <code>public.inventory_held_by_customer</code> as a field.
 */
fun inventoryHeldByCustomer(
      pInventoryId: Field<Long?>
): Field<Int?> {
    val f = InventoryHeldByCustomer()
    f.setPInventoryId(pInventoryId)

    return f.asField()
}

/**
 * Call <code>public.inventory_in_stock</code>
 */
fun inventoryInStock(
      configuration: Configuration
    , pInventoryId: Long?
): Boolean? {
    val f = InventoryInStock()
    f.setPInventoryId(pInventoryId)

    f.execute(configuration)
    return f.returnValue
}

/**
 * Get <code>public.inventory_in_stock</code> as a field.
 */
fun inventoryInStock(
      pInventoryId: Long?
): Field<Boolean?> {
    val f = InventoryInStock()
    f.setPInventoryId(pInventoryId)

    return f.asField()
}

/**
 * Get <code>public.inventory_in_stock</code> as a field.
 */
fun inventoryInStock(
      pInventoryId: Field<Long?>
): Field<Boolean?> {
    val f = InventoryInStock()
    f.setPInventoryId(pInventoryId)

    return f.asField()
}

/**
 * Call <code>public.last_day</code>
 */
fun lastDay(
      configuration: Configuration
    , __1: LocalDateTime?
): LocalDate? {
    val f = LastDay()
    f.set__1(__1)

    f.execute(configuration)
    return f.returnValue
}

/**
 * Get <code>public.last_day</code> as a field.
 */
fun lastDay(
      __1: LocalDateTime?
): Field<LocalDate?> {
    val f = LastDay()
    f.set__1(__1)

    return f.asField()
}

/**
 * Get <code>public.last_day</code> as a field.
 */
fun lastDay(
      __1: Field<LocalDateTime?>
): Field<LocalDate?> {
    val f = LastDay()
    f.set__1(__1)

    return f.asField()
}

/**
 * Call <code>public.film_in_stock</code>.
 */
fun filmInStock(
      configuration: Configuration
    , pFilmId: Long?
    , pStoreId: Long?
): Result<FilmInStockRecord> = configuration.dsl().selectFrom(org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
      pFilmId
    , pStoreId
)).fetch()

/**
 * Get <code>public.film_in_stock</code> as a table.
 */
fun filmInStock(
      pFilmId: Long?
    , pStoreId: Long?
): FilmInStock = org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
    pFilmId,
    pStoreId
)

/**
 * Get <code>public.film_in_stock</code> as a table.
 */
fun filmInStock(
      pFilmId: Field<Long?>
    , pStoreId: Field<Long?>
): FilmInStock = org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
    pFilmId,
    pStoreId
)

/**
 * Call <code>public.film_not_in_stock</code>.
 */
fun filmNotInStock(
      configuration: Configuration
    , pFilmId: Long?
    , pStoreId: Long?
): Result<FilmNotInStockRecord> = configuration.dsl().selectFrom(org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
      pFilmId
    , pStoreId
)).fetch()

/**
 * Get <code>public.film_not_in_stock</code> as a table.
 */
fun filmNotInStock(
      pFilmId: Long?
    , pStoreId: Long?
): FilmNotInStock = org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
    pFilmId,
    pStoreId
)

/**
 * Get <code>public.film_not_in_stock</code> as a table.
 */
fun filmNotInStock(
      pFilmId: Field<Long?>
    , pStoreId: Field<Long?>
): FilmNotInStock = org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
    pFilmId,
    pStoreId
)

/**
 * Call <code>public.rewards_report</code>.
 */
fun rewardsReport(
      configuration: Configuration
    , minMonthlyPurchases: Int?
    , minDollarAmountPurchased: BigDecimal?
): Result<CustomerRecord> = configuration.dsl().selectFrom(org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
      minMonthlyPurchases
    , minDollarAmountPurchased
)).fetch()

/**
 * Get <code>public.rewards_report</code> as a table.
 */
fun rewardsReport(
      minMonthlyPurchases: Int?
    , minDollarAmountPurchased: BigDecimal?
): RewardsReport = org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
    minMonthlyPurchases,
    minDollarAmountPurchased
)

/**
 * Get <code>public.rewards_report</code> as a table.
 */
fun rewardsReport(
      minMonthlyPurchases: Field<Int?>
    , minDollarAmountPurchased: Field<BigDecimal?>
): RewardsReport = org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
    minMonthlyPurchases,
    minDollarAmountPurchased
)