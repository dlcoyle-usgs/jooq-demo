/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Result;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableLike;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.demo.db.Indexes;
import org.jooq.demo.db.Keys;
import org.jooq.demo.db.Public;
import org.jooq.demo.db.tables.records.AddressRecord;
import org.jooq.demo.db.tables.records.CityRecord;
import org.jooq.demo.db.tables.records.CustomerRecord;
import org.jooq.demo.db.tables.records.StaffRecord;
import org.jooq.demo.db.tables.records.StoreRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>public.address.address_id</code>.
     */
    public final TableField<AddressRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.address.address</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS_ = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.address.address2</code>.
     */
    public final TableField<AddressRecord, String> ADDRESS2 = createField(DSL.name("address2"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.address.district</code>.
     */
    public final TableField<AddressRecord, String> DISTRICT = createField(DSL.name("district"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.address.city_id</code>.
     */
    public final TableField<AddressRecord, Long> CITY_ID = createField(DSL.name("city_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.address.postal_code</code>.
     */
    public final TableField<AddressRecord, String> POSTAL_CODE = createField(DSL.name("postal_code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.address.phone</code>.
     */
    public final TableField<AddressRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.address.last_update</code>.
     */
    public final TableField<AddressRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now():::TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>public.address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    /**
     * Create a <code>public.address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    public <O extends Record> Address(Table<O> child, ForeignKey<O, AddressRecord> key) {
        super(child, key, ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ADDRESS_IDX_FK_CITY_ID);
    }

    @Override
    public Identity<AddressRecord, Long> getIdentity() {
        return (Identity<AddressRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AddressRecord> getPrimaryKey() {
        return Keys.ADDRESS__ADDRESS_PKEY;
    }

    @Override
    public List<ForeignKey<AddressRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ADDRESS__ADDRESS_CITY_ID_FKEY);
    }

    private transient City _city;

    /**
     * Get the implicit join path to the <code>public.city</code> table.
     */
    public City city() {
        if (_city == null)
            _city = new City(this, Keys.ADDRESS__ADDRESS_CITY_ID_FKEY);

        return _city;
    }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.address</code> to-one parent table.
     */
    public Field<CityRecord> cityRow() {
        return cityRow(Function.identity());
    }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.address</code> to-one parent table.
     */
    public <O extends Record> Field<O> cityRow(Function<? super City, ? extends TableLike<O>> subquery) {
        return toOneRow(Keys.ADDRESS__ADDRESS_CITY_ID_FKEY, t -> subquery.apply((City) t));
    }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.customer</code> one-to-many child table.
     */
    public Field<Result<CustomerRecord>> customerMultiset() {
        return customerMultiset(Function.identity());
    }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.customer</code> one-to-many child table.
     */
    public <O extends Record> Field<Result<O>> customerMultiset(Function<? super Customer, ? extends TableLike<O>> subquery) {
        return oneToManyMultiset(Keys.CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY, t -> subquery.apply((Customer) t));
    }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.staff</code> one-to-many child table.
     */
    public Field<Result<StaffRecord>> staffMultiset() {
        return staffMultiset(Function.identity());
    }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.staff</code> one-to-many child table.
     */
    public <O extends Record> Field<Result<O>> staffMultiset(Function<? super Staff, ? extends TableLike<O>> subquery) {
        return oneToManyMultiset(Keys.STAFF__STAFF_ADDRESS_ID_FKEY, t -> subquery.apply((Staff) t));
    }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.store</code> one-to-many child table.
     */
    public Field<Result<StoreRecord>> storeMultiset() {
        return storeMultiset(Function.identity());
    }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.store</code> one-to-many child table.
     */
    public <O extends Record> Field<Result<O>> storeMultiset(Function<? super Store, ? extends TableLike<O>> subquery) {
        return oneToManyMultiset(Keys.STORE__STORE_ADDRESS_ID_FKEY, t -> subquery.apply((Store) t));
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    @Override
    public Address as(Table<?> alias) {
        return new Address(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Table<?> name) {
        return new Address(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, Long, String, String, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super String, ? super String, ? super String, ? super Long, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super String, ? super String, ? super String, ? super Long, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}