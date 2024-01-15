/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Boolean
import java.lang.Class
import java.lang.Long
import java.lang.String
import java.time.LocalDateTime
import java.util.Arrays
import java.util.Collection
import java.util.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.Address.AddressPath
import org.jooq.demo.skala.db.tables.Payment.PaymentPath
import org.jooq.demo.skala.db.tables.PaymentP2007_01.PaymentP2007_01Path
import org.jooq.demo.skala.db.tables.PaymentP2007_02.PaymentP2007_02Path
import org.jooq.demo.skala.db.tables.PaymentP2007_03.PaymentP2007_03Path
import org.jooq.demo.skala.db.tables.PaymentP2007_04.PaymentP2007_04Path
import org.jooq.demo.skala.db.tables.PaymentP2007_05.PaymentP2007_05Path
import org.jooq.demo.skala.db.tables.PaymentP2007_06.PaymentP2007_06Path
import org.jooq.demo.skala.db.tables.Rental.RentalPath
import org.jooq.demo.skala.db.tables.Store.StorePath
import org.jooq.demo.skala.db.tables.records.StaffRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array
import scala.Byte


object Staff {

  /**
   * The reference instance of <code>public.staff</code>
   */
  val STAFF = new Staff

  /**
   * A subtype implementing {@link Path} for simplified path-based joins.
   */
  class StaffPath(path: Table[_ <: Record], childPath: ForeignKey[_ <: Record, StaffRecord], parentPath: InverseForeignKey[_ <: Record, StaffRecord]) extends Staff(path, childPath, parentPath) with Path[StaffRecord]
}

/**
 * This class is generated by jOOQ.
 */
class Staff(
  alias: Name,
  path: Table[_ <: Record],
  childPath: ForeignKey[_ <: Record, StaffRecord],
  parentPath: InverseForeignKey[_ <: Record, StaffRecord],
  aliased: Table[StaffRecord],
  parameters: Array[ Field[_] ],
  where: Condition
)
extends TableImpl[StaffRecord](
  alias,
  Public.PUBLIC,
  path,
  childPath,
  parentPath,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.table,
  where
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[StaffRecord] = classOf[StaffRecord]

  /**
   * The column <code>public.staff.staff_id</code>.
   */
  val STAFF_ID: TableField[StaffRecord, Long] = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.staff.first_name</code>.
   */
  val FIRST_NAME: TableField[StaffRecord, String] = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), "")

  /**
   * The column <code>public.staff.last_name</code>.
   */
  val LAST_NAME: TableField[StaffRecord, String] = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), "")

  /**
   * The column <code>public.staff.address_id</code>.
   */
  val ADDRESS_ID: TableField[StaffRecord, Long] = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.staff.email</code>.
   */
  val EMAIL: TableField[StaffRecord, String] = createField(DSL.name("email"), SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>public.staff.store_id</code>.
   */
  val STORE_ID: TableField[StaffRecord, Long] = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false), "")

  /**
   * The column <code>public.staff.active</code>.
   */
  val ACTIVE: TableField[StaffRecord, Boolean] = createField(DSL.name("active"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), "")

  /**
   * The column <code>public.staff.username</code>.
   */
  val USERNAME: TableField[StaffRecord, String] = createField(DSL.name("username"), SQLDataType.VARCHAR(16).nullable(false), "")

  /**
   * The column <code>public.staff.password</code>.
   */
  val PASSWORD: TableField[StaffRecord, String] = createField(DSL.name("password"), SQLDataType.VARCHAR(40), "")

  /**
   * The column <code>public.staff.last_update</code>.
   */
  val LAST_UPDATE: TableField[StaffRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).readonly(true).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  /**
   * The column <code>public.staff.picture</code>.
   */
  val PICTURE: TableField[StaffRecord, Array[Byte]] = createField(DSL.name("picture"), SQLDataType.BLOB, "")

  /**
   * The column <code>public.staff.full_address</code>.
   */
  val FULL_ADDRESS: TableField[StaffRecord, String] = createField(DSL.name("full_address"), SQLDataType.CLOB, "")

  /**
   * The column <code>public.staff.full_name</code>.
   */
  val FULL_NAME: TableField[StaffRecord, String] = createField(DSL.name("full_name"), SQLDataType.CLOB, "")

  private def this(alias: Name, aliased: Table[StaffRecord]) = this(alias, null, null, null, aliased, null, null)
  private def this(alias: Name, aliased: Table[StaffRecord], where: Condition) = this(alias, null, null, null, aliased, null, where)

  /**
   * Create an aliased <code>public.staff</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.Staff.STAFF)

  /**
   * Create an aliased <code>public.staff</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.Staff.STAFF)

  /**
   * Create a <code>public.staff</code> table reference
   */
  def this() = this(DSL.name("staff"), null)

  def this(path: Table[_ <: Record], childPath: ForeignKey[_ <: Record, StaffRecord], parentPath: InverseForeignKey[_ <: Record, StaffRecord]) = this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, org.jooq.demo.skala.db.tables.Staff.STAFF, null, null)

  override def getSchema: Schema = if (super.aliased()) null else Public.PUBLIC

  override def getIdentity: Identity[StaffRecord, Long] = super.getIdentity.asInstanceOf[ Identity[StaffRecord, Long] ]

  override def getPrimaryKey: UniqueKey[StaffRecord] = Keys.STAFF_PKEY

  override def getReferences: List[ ForeignKey[StaffRecord, _] ] = Arrays.asList[ ForeignKey[StaffRecord, _] ](Keys.STAFF__STAFF_ADDRESS_ID_FKEY, Keys.STAFF__STAFF_STORE_ID_FKEY)

  /**
   * Get the implicit join path to the <code>public.address</code> table.
   */
  lazy val address: AddressPath = { new AddressPath(this, Keys.STAFF__STAFF_ADDRESS_ID_FKEY, null) }

  /**
   * Get the implicit join path to the <code>public.store</code> table.
   */
  lazy val store: StorePath = { new StorePath(this, Keys.STAFF__STAFF_STORE_ID_FKEY, null) }

  /**
   * Get the implicit to-many join path to the <code>public.payment</code> table
   */
  lazy val payment: PaymentPath = { new PaymentPath(this, null, Keys.PAYMENT__PAYMENT_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the
   * <code>public.payment_p2007_01</code> table
   */
  lazy val paymentP2007_01: PaymentP2007_01Path = { new PaymentP2007_01Path(this, null, Keys.PAYMENT_P2007_01__PAYMENT_P2007_01_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the
   * <code>public.payment_p2007_02</code> table
   */
  lazy val paymentP2007_02: PaymentP2007_02Path = { new PaymentP2007_02Path(this, null, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the
   * <code>public.payment_p2007_03</code> table
   */
  lazy val paymentP2007_03: PaymentP2007_03Path = { new PaymentP2007_03Path(this, null, Keys.PAYMENT_P2007_03__PAYMENT_P2007_03_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the
   * <code>public.payment_p2007_04</code> table
   */
  lazy val paymentP2007_04: PaymentP2007_04Path = { new PaymentP2007_04Path(this, null, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the
   * <code>public.payment_p2007_05</code> table
   */
  lazy val paymentP2007_05: PaymentP2007_05Path = { new PaymentP2007_05Path(this, null, Keys.PAYMENT_P2007_05__PAYMENT_P2007_05_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the
   * <code>public.payment_p2007_06</code> table
   */
  lazy val paymentP2007_06: PaymentP2007_06Path = { new PaymentP2007_06Path(this, null, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_STAFF_ID_FKEY.getInverseKey()) }

  /**
   * Get the implicit to-many join path to the <code>public.rental</code> table
   */
  lazy val rental: RentalPath = { new RentalPath(this, null, Keys.RENTAL__RENTAL_STAFF_ID_FKEY.getInverseKey()) }
  override def as(alias: String): Staff = new Staff(DSL.name(alias), this)
  override def as(alias: Name): Staff = new Staff(alias, this)
  override def as(alias: Table[_]): Staff = new Staff(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Staff = new Staff(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Staff = new Staff(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Staff = new Staff(name.getQualifiedName(), null)

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Condition): Staff = new Staff(getQualifiedName(), if (super.aliased()) this else null, condition)

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Collection[_ <: Condition]): Staff = where(DSL.and(conditions))

  /**
   * Create an inline derived table from this table
   */
  override def where(conditions: Condition*): Staff = where(DSL.and(conditions:_*))

  /**
   * Create an inline derived table from this table
   */
  override def where(condition: Field[Boolean]): Staff = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(condition: SQL): Staff = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String): Staff = where(DSL.condition(condition))

  /**
   * Create an inline derived table from this table
   */
  @PlainSQL override def where(@Stringly.SQL condition: String, binds: AnyRef*): Staff = where(DSL.condition(condition, binds:_*))

  /**
   * Create an inline derived table from this table
   */
  override def whereExists(select: Select[_]): Staff = where(DSL.exists(select))

  /**
   * Create an inline derived table from this table
   */
  override def whereNotExists(select: Select[_]): Staff = where(DSL.notExists(select))
}
