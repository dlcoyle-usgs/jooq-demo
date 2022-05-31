/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.daos


import java.lang.Long
import java.lang.String
import java.time.LocalDateTime
import java.util.List

import org.jooq.Configuration
import org.jooq.demo.skala.db.tables.Language
import org.jooq.demo.skala.db.tables.records.LanguageRecord
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
class LanguageDao(configuration: Configuration) extends DAOImpl[LanguageRecord, org.jooq.demo.skala.db.tables.pojos.Language, Long](Language.LANGUAGE, classOf[org.jooq.demo.skala.db.tables.pojos.Language], configuration) {

  /**
   * Create a new LanguageDao without any configuration
   */
  def this() = this(null)

  override def getId(o: org.jooq.demo.skala.db.tables.pojos.Language): Long = o.getLanguageId

  /**
   * Fetch records that have <code>language_id BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfLanguageId(lowerInclusive: Long, upperInclusive: Long): List[org.jooq.demo.skala.db.tables.pojos.Language] = fetchRange(Language.LANGUAGE.LANGUAGE_ID, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>language_id IN (values)</code>
   */
  def fetchByLanguageId(values: Long*): List[org.jooq.demo.skala.db.tables.pojos.Language] = fetch(Language.LANGUAGE.LANGUAGE_ID, values:_*)

  /**
   * Fetch a unique record that has <code>language_id = value</code>
   */
  def fetchOneByLanguageId(value: Long): org.jooq.demo.skala.db.tables.pojos.Language = fetchOne(Language.LANGUAGE.LANGUAGE_ID, value)

  /**
   * Fetch records that have <code>name BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfName(lowerInclusive: String, upperInclusive: String): List[org.jooq.demo.skala.db.tables.pojos.Language] = fetchRange(Language.LANGUAGE.NAME, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>name IN (values)</code>
   */
  def fetchByName(values: String*): List[org.jooq.demo.skala.db.tables.pojos.Language] = fetch(Language.LANGUAGE.NAME, values:_*)

  /**
   * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
   * upperInclusive</code>
   */
  def fetchRangeOfLastUpdate(lowerInclusive: LocalDateTime, upperInclusive: LocalDateTime): List[org.jooq.demo.skala.db.tables.pojos.Language] = fetchRange(Language.LANGUAGE.LAST_UPDATE, lowerInclusive, upperInclusive)

  /**
   * Fetch records that have <code>last_update IN (values)</code>
   */
  def fetchByLastUpdate(values: LocalDateTime*): List[org.jooq.demo.skala.db.tables.pojos.Language] = fetch(Language.LANGUAGE.LAST_UPDATE, values:_*)
}