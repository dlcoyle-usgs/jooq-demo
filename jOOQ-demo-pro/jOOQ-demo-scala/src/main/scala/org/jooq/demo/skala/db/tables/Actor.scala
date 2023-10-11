/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables


import java.lang.Class
import java.lang.Long
import java.lang.String
import java.time.LocalDateTime
import java.util.Arrays
import java.util.List
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row4
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.skala.db.Indexes
import org.jooq.demo.skala.db.Keys
import org.jooq.demo.skala.db.Public
import org.jooq.demo.skala.db.tables.records.ActorRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import scala.Array


object Actor {

  /**
   * The reference instance of <code>public.actor</code>
   */
  val ACTOR = new Actor
}

/**
 * This class is generated by jOOQ.
 */
class Actor(
  alias: Name,
  child: Table[_ <: Record],
  path: ForeignKey[_ <: Record, ActorRecord],
  aliased: Table[ActorRecord],
  parameters: Array[ Field[_] ]
)
extends TableImpl[ActorRecord](
  alias,
  Public.PUBLIC,
  child,
  path,
  aliased,
  parameters,
  DSL.comment(""),
  TableOptions.table
) {

  /**
   * The class holding records for this type
   */
  override def getRecordType: Class[ActorRecord] = classOf[ActorRecord]

  /**
   * The column <code>public.actor.actor_id</code>.
   */
  val ACTOR_ID: TableField[ActorRecord, Long] = createField(DSL.name("actor_id"), SQLDataType.BIGINT.nullable(false).identity(true), "")

  /**
   * The column <code>public.actor.first_name</code>.
   */
  val FIRST_NAME: TableField[ActorRecord, String] = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), "")

  /**
   * The column <code>public.actor.last_name</code>.
   */
  val LAST_NAME: TableField[ActorRecord, String] = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), "")

  /**
   * The column <code>public.actor.last_update</code>.
   */
  val LAST_UPDATE: TableField[ActorRecord, LocalDateTime] = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).readonly(true).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), "")

  private def this(alias: Name, aliased: Table[ActorRecord]) = this(alias, null, null, aliased, null)

  /**
   * Create an aliased <code>public.actor</code> table reference
   */
  def this(alias: String) = this(DSL.name(alias), org.jooq.demo.skala.db.tables.Actor.ACTOR)

  /**
   * Create an aliased <code>public.actor</code> table reference
   */
  def this(alias: Name) = this(alias, org.jooq.demo.skala.db.tables.Actor.ACTOR)

  /**
   * Create a <code>public.actor</code> table reference
   */
  def this() = this(DSL.name("actor"), null)

  def this(child: Table[_ <: Record], key: ForeignKey[_ <: Record, ActorRecord]) = this(Internal.createPathAlias(child, key), child, key, org.jooq.demo.skala.db.tables.Actor.ACTOR, null)

  override def getSchema: Schema = if (aliased()) null else Public.PUBLIC

  override def getIndexes: List[Index] = Arrays.asList[ Index ](Indexes.IDX_ACTOR_LAST_NAME)

  override def getIdentity: Identity[ActorRecord, Long] = super.getIdentity.asInstanceOf[ Identity[ActorRecord, Long] ]

  override def getPrimaryKey: UniqueKey[ActorRecord] = Keys.ACTOR_PKEY
  override def as(alias: String): Actor = new Actor(DSL.name(alias), this)
  override def as(alias: Name): Actor = new Actor(alias, this)
  override def as(alias: Table[_]): Actor = new Actor(alias.getQualifiedName(), this)

  /**
   * Rename this table
   */
  override def rename(name: String): Actor = new Actor(DSL.name(name), null)

  /**
   * Rename this table
   */
  override def rename(name: Name): Actor = new Actor(name, null)

  /**
   * Rename this table
   */
  override def rename(name: Table[_]): Actor = new Actor(name.getQualifiedName(), null)

  // -------------------------------------------------------------------------
  // Row4 type methods
  // -------------------------------------------------------------------------
  override def fieldsRow: Row4[Long, String, String, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row4[Long, String, String, LocalDateTime] ]

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
   */
  def mapping[U](from: (Long, String, String, LocalDateTime) => U): SelectField[U] = convertFrom(r => from.apply(r.value1(), r.value2(), r.value3(), r.value4()))

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Class,
   * Function)}.
   */
  def mapping[U](toType: Class[U], from: (Long, String, String, LocalDateTime) => U): SelectField[U] = convertFrom(toType,r => from.apply(r.value1(), r.value2(), r.value3(), r.value4()))
}