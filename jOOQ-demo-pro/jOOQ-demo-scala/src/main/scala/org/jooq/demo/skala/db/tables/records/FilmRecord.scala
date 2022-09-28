/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Deprecated
import java.lang.Integer
import java.lang.Long
import java.lang.Object
import java.lang.Short
import java.lang.String
import java.math.BigDecimal
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record14
import org.jooq.Row14
import org.jooq.demo.skala.db.enums.MpaaRating
import org.jooq.demo.skala.db.tables.Film
import org.jooq.impl.UpdatableRecordImpl

import scala.Array


/**
 * This class is generated by jOOQ.
 */
class FilmRecord extends UpdatableRecordImpl[FilmRecord](Film.FILM) with Record14[Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, Array[String], Object] {

  /**
   * Setter for <code>public.film.film_id</code>.
   */
  def setFilmId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.film.film_id</code>.
   */
  def getFilmId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.film.title</code>.
   */
  def setTitle(value: String): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.film.title</code>.
   */
  def getTitle: String = get(1).asInstanceOf[String]

  /**
   * Setter for <code>public.film.description</code>.
   */
  def setDescription(value: String): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.film.description</code>.
   */
  def getDescription: String = get(2).asInstanceOf[String]

  /**
   * Setter for <code>public.film.release_year</code>.
   */
  def setReleaseYear(value: Integer): Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>public.film.release_year</code>.
   */
  def getReleaseYear: Integer = get(3).asInstanceOf[Integer]

  /**
   * Setter for <code>public.film.language_id</code>.
   */
  def setLanguageId(value: Long): Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>public.film.language_id</code>.
   */
  def getLanguageId: Long = get(4).asInstanceOf[Long]

  /**
   * Setter for <code>public.film.original_language_id</code>.
   */
  def setOriginalLanguageId(value: Long): Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>public.film.original_language_id</code>.
   */
  def getOriginalLanguageId: Long = get(5).asInstanceOf[Long]

  /**
   * Setter for <code>public.film.rental_duration</code>.
   */
  def setRentalDuration(value: Short): Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>public.film.rental_duration</code>.
   */
  def getRentalDuration: Short = get(6).asInstanceOf[Short]

  /**
   * Setter for <code>public.film.rental_rate</code>.
   */
  def setRentalRate(value: BigDecimal): Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>public.film.rental_rate</code>.
   */
  def getRentalRate: BigDecimal = get(7).asInstanceOf[BigDecimal]

  /**
   * Setter for <code>public.film.length</code>.
   */
  def setLength(value: Short): Unit = {
    set(8, value)
  }

  /**
   * Getter for <code>public.film.length</code>.
   */
  def getLength: Short = get(8).asInstanceOf[Short]

  /**
   * Setter for <code>public.film.replacement_cost</code>.
   */
  def setReplacementCost(value: BigDecimal): Unit = {
    set(9, value)
  }

  /**
   * Getter for <code>public.film.replacement_cost</code>.
   */
  def getReplacementCost: BigDecimal = get(9).asInstanceOf[BigDecimal]

  /**
   * Setter for <code>public.film.rating</code>.
   */
  def setRating(value: MpaaRating): Unit = {
    set(10, value)
  }

  /**
   * Getter for <code>public.film.rating</code>.
   */
  def getRating: MpaaRating = get(10).asInstanceOf[MpaaRating]

  /**
   * Setter for <code>public.film.last_update</code>.
   */
  def setLastUpdate(value: LocalDateTime): Unit = {
    set(11, value)
  }

  /**
   * Getter for <code>public.film.last_update</code>.
   */
  def getLastUpdate: LocalDateTime = get(11).asInstanceOf[LocalDateTime]

  /**
   * Setter for <code>public.film.special_features</code>.
   */
  def setSpecialFeatures(value: Array[String]): Unit = {
    set(12, value)
  }

  /**
   * Getter for <code>public.film.special_features</code>.
   */
  def getSpecialFeatures: Array[String] = get(12).asInstanceOf[Array[String]]

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  def setFulltext(value: Object): Unit = {
    set(13, value)
  }

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  def getFulltext: Object = get(13).asInstanceOf[Object]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Long] = super.key.asInstanceOf[ Record1[Long] ]

  // -------------------------------------------------------------------------
  // Record14 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row14[Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, Array[String], Object] = super.fieldsRow.asInstanceOf[ Row14[Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, Array[String], Object] ]

  override def valuesRow: Row14[Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, Array[String], Object] = super.valuesRow.asInstanceOf[ Row14[Long, String, String, Integer, Long, Long, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, Array[String], Object] ]
  override def field1: Field[Long] = Film.FILM.FILM_ID
  override def field2: Field[String] = Film.FILM.TITLE
  override def field3: Field[String] = Film.FILM.DESCRIPTION
  override def field4: Field[Integer] = Film.FILM.RELEASE_YEAR
  override def field5: Field[Long] = Film.FILM.LANGUAGE_ID
  override def field6: Field[Long] = Film.FILM.ORIGINAL_LANGUAGE_ID
  override def field7: Field[Short] = Film.FILM.RENTAL_DURATION
  override def field8: Field[BigDecimal] = Film.FILM.RENTAL_RATE
  override def field9: Field[Short] = Film.FILM.LENGTH
  override def field10: Field[BigDecimal] = Film.FILM.REPLACEMENT_COST
  override def field11: Field[MpaaRating] = Film.FILM.RATING
  override def field12: Field[LocalDateTime] = Film.FILM.LAST_UPDATE
  override def field13: Field[Array[String]] = Film.FILM.SPECIAL_FEATURES

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  override def field14: Field[Object] = Film.FILM.FULLTEXT
  override def component1: Long = getFilmId
  override def component2: String = getTitle
  override def component3: String = getDescription
  override def component4: Integer = getReleaseYear
  override def component5: Long = getLanguageId
  override def component6: Long = getOriginalLanguageId
  override def component7: Short = getRentalDuration
  override def component8: BigDecimal = getRentalRate
  override def component9: Short = getLength
  override def component10: BigDecimal = getReplacementCost
  override def component11: MpaaRating = getRating
  override def component12: LocalDateTime = getLastUpdate
  override def component13: Array[String] = getSpecialFeatures

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  override def component14: Object = getFulltext
  override def value1: Long = getFilmId
  override def value2: String = getTitle
  override def value3: String = getDescription
  override def value4: Integer = getReleaseYear
  override def value5: Long = getLanguageId
  override def value6: Long = getOriginalLanguageId
  override def value7: Short = getRentalDuration
  override def value8: BigDecimal = getRentalRate
  override def value9: Short = getLength
  override def value10: BigDecimal = getReplacementCost
  override def value11: MpaaRating = getRating
  override def value12: LocalDateTime = getLastUpdate
  override def value13: Array[String] = getSpecialFeatures

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  override def value14: Object = getFulltext

  override def value1(value: Long): FilmRecord = {
    setFilmId(value)
    this
  }

  override def value2(value: String): FilmRecord = {
    setTitle(value)
    this
  }

  override def value3(value: String): FilmRecord = {
    setDescription(value)
    this
  }

  override def value4(value: Integer): FilmRecord = {
    setReleaseYear(value)
    this
  }

  override def value5(value: Long): FilmRecord = {
    setLanguageId(value)
    this
  }

  override def value6(value: Long): FilmRecord = {
    setOriginalLanguageId(value)
    this
  }

  override def value7(value: Short): FilmRecord = {
    setRentalDuration(value)
    this
  }

  override def value8(value: BigDecimal): FilmRecord = {
    setRentalRate(value)
    this
  }

  override def value9(value: Short): FilmRecord = {
    setLength(value)
    this
  }

  override def value10(value: BigDecimal): FilmRecord = {
    setReplacementCost(value)
    this
  }

  override def value11(value: MpaaRating): FilmRecord = {
    setRating(value)
    this
  }

  override def value12(value: LocalDateTime): FilmRecord = {
    setLastUpdate(value)
    this
  }

  override def value13(value: Array[String]): FilmRecord = {
    setSpecialFeatures(value)
    this
  }


  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type,
   * it may have been excluded from code generation. If this is a built-in type,
   * you can define an explicit {@link org.jooq.Binding} to specify how this
   * type should be handled. Deprecation can be turned off using {@literal
   * <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  override def value14(value: Object): FilmRecord = {
    setFulltext(value)
    this
  }

  override def values(value1 : Long, value2 : String, value3 : String, value4 : Integer, value5 : Long, value6 : Long, value7 : Short, value8 : BigDecimal, value9 : Short, value10 : BigDecimal, value11 : MpaaRating, value12 : LocalDateTime, value13 : Array[String], value14 : Object): FilmRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this.value8(value8)
    this.value9(value9)
    this.value10(value10)
    this.value11(value11)
    this.value12(value12)
    this.value13(value13)
    this.value14(value14)
    this
  }

  /**
   * Create a detached, initialised FilmRecord
   */
  def this(filmId : Long, title : String, description : String, releaseYear : Integer, languageId : Long, originalLanguageId : Long, rentalDuration : Short, rentalRate : BigDecimal, length : Short, replacementCost : BigDecimal, rating : MpaaRating, lastUpdate : LocalDateTime, specialFeatures : Array[String], fulltext : Object) = {
    this()

    this.setFilmId(filmId)
    this.setTitle(title)
    this.setDescription(description)
    this.setReleaseYear(releaseYear)
    this.setLanguageId(languageId)
    this.setOriginalLanguageId(originalLanguageId)
    this.setRentalDuration(rentalDuration)
    this.setRentalRate(rentalRate)
    this.setLength(length)
    this.setReplacementCost(replacementCost)
    this.setRating(rating)
    this.setLastUpdate(lastUpdate)
    this.setSpecialFeatures(specialFeatures)
    this.setFulltext(fulltext)
  }

  /**
   * Create a detached, initialised FilmRecord
   */
  def this(filmId : Long, title : String, description : String, releaseYear : Integer, languageId : Long, originalLanguageId : Long, rentalDuration : Short, rentalRate : BigDecimal, length : Short, replacementCost : BigDecimal, rating : MpaaRating, specialFeatures : Array[String], fulltext : Object) = {
    this()

    this.setFilmId(filmId)
    this.setTitle(title)
    this.setDescription(description)
    this.setReleaseYear(releaseYear)
    this.setLanguageId(languageId)
    this.setOriginalLanguageId(originalLanguageId)
    this.setRentalDuration(rentalDuration)
    this.setRentalRate(rentalRate)
    this.setLength(length)
    this.setReplacementCost(replacementCost)
    this.setRating(rating)
    this.setSpecialFeatures(specialFeatures)
    this.setFulltext(fulltext)
  }

  /**
   * Create a detached, initialised FilmRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.Film) = {
    this()

    if (value != null) {
      this.setFilmId(value.getFilmId)
      this.setTitle(value.getTitle)
      this.setDescription(value.getDescription)
      this.setReleaseYear(value.getReleaseYear)
      this.setLanguageId(value.getLanguageId)
      this.setOriginalLanguageId(value.getOriginalLanguageId)
      this.setRentalDuration(value.getRentalDuration)
      this.setRentalRate(value.getRentalRate)
      this.setLength(value.getLength)
      this.setReplacementCost(value.getReplacementCost)
      this.setRating(value.getRating)
      this.setLastUpdate(value.getLastUpdate)
      this.setSpecialFeatures(value.getSpecialFeatures)
      this.setFulltext(value.getFulltext)
    }
  }
}