/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db


import java.math.BigDecimal

import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Configuration
import org.jooq.Domain
import org.jooq.Field
import org.jooq.Result
import org.jooq.Table
import org.jooq.demo.kotlin.db.domains.YEAR
import org.jooq.demo.kotlin.db.tables.Actor
import org.jooq.demo.kotlin.db.tables.ActorInfo
import org.jooq.demo.kotlin.db.tables.Address
import org.jooq.demo.kotlin.db.tables.Category
import org.jooq.demo.kotlin.db.tables.City
import org.jooq.demo.kotlin.db.tables.Country
import org.jooq.demo.kotlin.db.tables.Customer
import org.jooq.demo.kotlin.db.tables.CustomerList
import org.jooq.demo.kotlin.db.tables.Film
import org.jooq.demo.kotlin.db.tables.FilmActor
import org.jooq.demo.kotlin.db.tables.FilmCategory
import org.jooq.demo.kotlin.db.tables.FilmInStock
import org.jooq.demo.kotlin.db.tables.FilmList
import org.jooq.demo.kotlin.db.tables.FilmNotInStock
import org.jooq.demo.kotlin.db.tables.Inventory
import org.jooq.demo.kotlin.db.tables.Language
import org.jooq.demo.kotlin.db.tables.NicerButSlowerFilmList
import org.jooq.demo.kotlin.db.tables.Payment
import org.jooq.demo.kotlin.db.tables.PaymentP2007_01
import org.jooq.demo.kotlin.db.tables.PaymentP2007_02
import org.jooq.demo.kotlin.db.tables.PaymentP2007_03
import org.jooq.demo.kotlin.db.tables.PaymentP2007_04
import org.jooq.demo.kotlin.db.tables.PaymentP2007_05
import org.jooq.demo.kotlin.db.tables.PaymentP2007_06
import org.jooq.demo.kotlin.db.tables.Rental
import org.jooq.demo.kotlin.db.tables.RewardsReport
import org.jooq.demo.kotlin.db.tables.SalesByFilmCategory
import org.jooq.demo.kotlin.db.tables.SalesByStore
import org.jooq.demo.kotlin.db.tables.Staff
import org.jooq.demo.kotlin.db.tables.StaffList
import org.jooq.demo.kotlin.db.tables.Store
import org.jooq.demo.kotlin.db.tables.records.CustomerRecord
import org.jooq.demo.kotlin.db.tables.records.FilmInStockRecord
import org.jooq.demo.kotlin.db.tables.records.FilmNotInStockRecord
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC: Public = Public()
    }

    /**
     * The table <code>public.actor</code>.
     */
    val ACTOR: Actor get() = Actor.ACTOR

    /**
     * The table <code>public.actor_info</code>.
     */
    val ACTOR_INFO: ActorInfo get() = ActorInfo.ACTOR_INFO

    /**
     * The table <code>public.address</code>.
     */
    val ADDRESS: Address get() = Address.ADDRESS

    /**
     * The table <code>public.category</code>.
     */
    val CATEGORY: Category get() = Category.CATEGORY

    /**
     * The table <code>public.city</code>.
     */
    val CITY: City get() = City.CITY

    /**
     * The table <code>public.country</code>.
     */
    val COUNTRY: Country get() = Country.COUNTRY

    /**
     * The table <code>public.customer</code>.
     */
    val CUSTOMER: Customer get() = Customer.CUSTOMER

    /**
     * The table <code>public.customer_list</code>.
     */
    val CUSTOMER_LIST: CustomerList get() = CustomerList.CUSTOMER_LIST

    /**
     * The table <code>public.film</code>.
     */
    val FILM: Film get() = Film.FILM

    /**
     * The table <code>public.film_actor</code>.
     */
    val FILM_ACTOR: FilmActor get() = FilmActor.FILM_ACTOR

    /**
     * The table <code>public.film_category</code>.
     */
    val FILM_CATEGORY: FilmCategory get() = FilmCategory.FILM_CATEGORY

    /**
     * The table <code>public.film_in_stock</code>.
     */
    val FILM_IN_STOCK: FilmInStock get() = FilmInStock.FILM_IN_STOCK

    /**
     * Call <code>public.film_in_stock</code>.
     */
    fun FILM_IN_STOCK(
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
    fun FILM_IN_STOCK(
          pFilmId: Long?
        , pStoreId: Long?
    ): FilmInStock = org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
        pFilmId,
        pStoreId
    )

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    fun FILM_IN_STOCK(
          pFilmId: Field<Long?>
        , pStoreId: Field<Long?>
    ): FilmInStock = org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
        pFilmId,
        pStoreId
    )

    /**
     * The table <code>public.film_list</code>.
     */
    val FILM_LIST: FilmList get() = FilmList.FILM_LIST

    /**
     * The table <code>public.film_not_in_stock</code>.
     */
    val FILM_NOT_IN_STOCK: FilmNotInStock get() = FilmNotInStock.FILM_NOT_IN_STOCK

    /**
     * Call <code>public.film_not_in_stock</code>.
     */
    fun FILM_NOT_IN_STOCK(
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
    fun FILM_NOT_IN_STOCK(
          pFilmId: Long?
        , pStoreId: Long?
    ): FilmNotInStock = org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
        pFilmId,
        pStoreId
    )

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    fun FILM_NOT_IN_STOCK(
          pFilmId: Field<Long?>
        , pStoreId: Field<Long?>
    ): FilmNotInStock = org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
        pFilmId,
        pStoreId
    )

    /**
     * The table <code>public.inventory</code>.
     */
    val INVENTORY: Inventory get() = Inventory.INVENTORY

    /**
     * The table <code>public.language</code>.
     */
    val LANGUAGE: Language get() = Language.LANGUAGE

    /**
     * The table <code>public.nicer_but_slower_film_list</code>.
     */
    val NICER_BUT_SLOWER_FILM_LIST: NicerButSlowerFilmList get() = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST

    /**
     * The table <code>public.payment</code>.
     */
    val PAYMENT: Payment get() = Payment.PAYMENT

    /**
     * The table <code>public.payment_p2007_01</code>.
     */
    val PAYMENT_P2007_01: PaymentP2007_01 get() = PaymentP2007_01.PAYMENT_P2007_01

    /**
     * The table <code>public.payment_p2007_02</code>.
     */
    val PAYMENT_P2007_02: PaymentP2007_02 get() = PaymentP2007_02.PAYMENT_P2007_02

    /**
     * The table <code>public.payment_p2007_03</code>.
     */
    val PAYMENT_P2007_03: PaymentP2007_03 get() = PaymentP2007_03.PAYMENT_P2007_03

    /**
     * The table <code>public.payment_p2007_04</code>.
     */
    val PAYMENT_P2007_04: PaymentP2007_04 get() = PaymentP2007_04.PAYMENT_P2007_04

    /**
     * The table <code>public.payment_p2007_05</code>.
     */
    val PAYMENT_P2007_05: PaymentP2007_05 get() = PaymentP2007_05.PAYMENT_P2007_05

    /**
     * The table <code>public.payment_p2007_06</code>.
     */
    val PAYMENT_P2007_06: PaymentP2007_06 get() = PaymentP2007_06.PAYMENT_P2007_06

    /**
     * The table <code>public.rental</code>.
     */
    val RENTAL: Rental get() = Rental.RENTAL

    /**
     * The table <code>public.rewards_report</code>.
     */
    val REWARDS_REPORT: RewardsReport get() = RewardsReport.REWARDS_REPORT

    /**
     * Call <code>public.rewards_report</code>.
     */
    fun REWARDS_REPORT(
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
    fun REWARDS_REPORT(
          minMonthlyPurchases: Int?
        , minDollarAmountPurchased: BigDecimal?
    ): RewardsReport = org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
        minMonthlyPurchases,
        minDollarAmountPurchased
    )

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    fun REWARDS_REPORT(
          minMonthlyPurchases: Field<Int?>
        , minDollarAmountPurchased: Field<BigDecimal?>
    ): RewardsReport = org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
        minMonthlyPurchases,
        minDollarAmountPurchased
    )

    /**
     * The table <code>public.sales_by_film_category</code>.
     */
    val SALES_BY_FILM_CATEGORY: SalesByFilmCategory get() = SalesByFilmCategory.SALES_BY_FILM_CATEGORY

    /**
     * The table <code>public.sales_by_store</code>.
     */
    val SALES_BY_STORE: SalesByStore get() = SalesByStore.SALES_BY_STORE

    /**
     * The table <code>public.staff</code>.
     */
    val STAFF: Staff get() = Staff.STAFF

    /**
     * The table <code>public.staff_list</code>.
     */
    val STAFF_LIST: StaffList get() = StaffList.STAFF_LIST

    /**
     * The table <code>public.store</code>.
     */
    val STORE: Store get() = Store.STORE

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getDomains(): List<Domain<*>> = listOf(
        YEAR
    )

    override fun getTables(): List<Table<*>> = listOf(
        Actor.ACTOR,
        ActorInfo.ACTOR_INFO,
        Address.ADDRESS,
        Category.CATEGORY,
        City.CITY,
        Country.COUNTRY,
        Customer.CUSTOMER,
        CustomerList.CUSTOMER_LIST,
        Film.FILM,
        FilmActor.FILM_ACTOR,
        FilmCategory.FILM_CATEGORY,
        FilmInStock.FILM_IN_STOCK,
        FilmList.FILM_LIST,
        FilmNotInStock.FILM_NOT_IN_STOCK,
        Inventory.INVENTORY,
        Language.LANGUAGE,
        NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST,
        Payment.PAYMENT,
        PaymentP2007_01.PAYMENT_P2007_01,
        PaymentP2007_02.PAYMENT_P2007_02,
        PaymentP2007_03.PAYMENT_P2007_03,
        PaymentP2007_04.PAYMENT_P2007_04,
        PaymentP2007_05.PAYMENT_P2007_05,
        PaymentP2007_06.PAYMENT_P2007_06,
        Rental.RENTAL,
        RewardsReport.REWARDS_REPORT,
        SalesByFilmCategory.SALES_BY_FILM_CATEGORY,
        SalesByStore.SALES_BY_STORE,
        Staff.STAFF,
        StaffList.STAFF_LIST,
        Store.STORE
    )
}