/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.daos


import java.lang.Long
import java.time.LocalDateTime
import java.util.List

import org.jooq.Configuration
import org.jooq.demo.skala.db.tables.Inventory
import org.jooq.demo.skala.db.tables.records.InventoryRecord
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
class InventoryDao(configuration: Configuration) extends DAOImpl[InventoryRecord, org.jooq.demo.skala.db.tables.pojos.Inventory, Long](Inventory.INVENTORY, classOf[org.jooq.demo.skala.db.tables.pojos.Inventory], configuration) {

  /**
   * Create a new InventoryDao without any configuration
   */
  def this() = this(null)

  override def getId(o: org.jooq.demo.skala.db.tables.pojos.Inventory): Long = o.getInventoryId

  /**
   * Fetch records that have <code>inventory_id BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfInventoryId(lowerInclusive: Long, upperInclusive: Long): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetchRange(Inventory.INVENTORY.INVENTORY_ID, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>inventory_id IN (values)</code>
   */
  def fetchByInventoryId(values: Long*): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetch(Inventory.INVENTORY.INVENTORY_ID, values:_*)

  /**
   * Fetch a unique record that has <code>inventory_id = value</code>
   */
  def fetchOneByInventoryId(value: Long): org.jooq.demo.skala.db.tables.pojos.Inventory = fetchOne(Inventory.INVENTORY.INVENTORY_ID, value)

  /**
   * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfFilmId(lowerInclusive: Long, upperInclusive: Long): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetchRange(Inventory.INVENTORY.FILM_ID, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>film_id IN (values)</code>
   */
  def fetchByFilmId(values: Long*): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetch(Inventory.INVENTORY.FILM_ID, values:_*)

  /**
   * Fetch records that have <code>store_id BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfStoreId(lowerInclusive: Long, upperInclusive: Long): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetchRange(Inventory.INVENTORY.STORE_ID, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>store_id IN (values)</code>
   */
  def fetchByStoreId(values: Long*): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetch(Inventory.INVENTORY.STORE_ID, values:_*)

  /**
   * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfLastUpdate(lowerInclusive: LocalDateTime, upperInclusive: LocalDateTime): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetchRange(Inventory.INVENTORY.LAST_UPDATE, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>last_update IN (values)</code>
   */
  def fetchByLastUpdate(values: LocalDateTime*): List[org.jooq.demo.skala.db.tables.pojos.Inventory] = fetch(Inventory.INVENTORY.LAST_UPDATE, values:_*)
}