/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.records


import java.lang.Long
import java.math.BigDecimal
import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.demo.skala.db.tables.Payment
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
class PaymentRecord extends UpdatableRecordImpl[PaymentRecord](Payment.PAYMENT) with Record6[Long, Long, Long, Long, BigDecimal, LocalDateTime] {

  /**
   * Setter for <code>public.payment.payment_id</code>.
   */
  def setPaymentId(value: Long): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>public.payment.payment_id</code>.
   */
  def getPaymentId: Long = get(0).asInstanceOf[Long]

  /**
   * Setter for <code>public.payment.customer_id</code>.
   */
  def setCustomerId(value: Long): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>public.payment.customer_id</code>.
   */
  def getCustomerId: Long = get(1).asInstanceOf[Long]

  /**
   * Setter for <code>public.payment.staff_id</code>.
   */
  def setStaffId(value: Long): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>public.payment.staff_id</code>.
   */
  def getStaffId: Long = get(2).asInstanceOf[Long]

  /**
   * Setter for <code>public.payment.rental_id</code>.
   */
  def setRentalId(value: Long): Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>public.payment.rental_id</code>.
   */
  def getRentalId: Long = get(3).asInstanceOf[Long]

  /**
   * Setter for <code>public.payment.amount</code>.
   */
  def setAmount(value: BigDecimal): Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>public.payment.amount</code>.
   */
  def getAmount: BigDecimal = get(4).asInstanceOf[BigDecimal]

  /**
   * Setter for <code>public.payment.payment_date</code>.
   */
  def setPaymentDate(value: LocalDateTime): Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>public.payment.payment_date</code>.
   */
  def getPaymentDate: LocalDateTime = get(5).asInstanceOf[LocalDateTime]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Long] = super.key.asInstanceOf[ Record1[Long] ]

  // -------------------------------------------------------------------------
  // Record6 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row6[Long, Long, Long, Long, BigDecimal, LocalDateTime] = super.fieldsRow.asInstanceOf[ Row6[Long, Long, Long, Long, BigDecimal, LocalDateTime] ]

  override def valuesRow: Row6[Long, Long, Long, Long, BigDecimal, LocalDateTime] = super.valuesRow.asInstanceOf[ Row6[Long, Long, Long, Long, BigDecimal, LocalDateTime] ]
  override def field1: Field[Long] = Payment.PAYMENT.PAYMENT_ID
  override def field2: Field[Long] = Payment.PAYMENT.CUSTOMER_ID
  override def field3: Field[Long] = Payment.PAYMENT.STAFF_ID
  override def field4: Field[Long] = Payment.PAYMENT.RENTAL_ID
  override def field5: Field[BigDecimal] = Payment.PAYMENT.AMOUNT
  override def field6: Field[LocalDateTime] = Payment.PAYMENT.PAYMENT_DATE
  override def component1: Long = getPaymentId
  override def component2: Long = getCustomerId
  override def component3: Long = getStaffId
  override def component4: Long = getRentalId
  override def component5: BigDecimal = getAmount
  override def component6: LocalDateTime = getPaymentDate
  override def value1: Long = getPaymentId
  override def value2: Long = getCustomerId
  override def value3: Long = getStaffId
  override def value4: Long = getRentalId
  override def value5: BigDecimal = getAmount
  override def value6: LocalDateTime = getPaymentDate

  override def value1(value: Long): PaymentRecord = {
    setPaymentId(value)
    this
  }

  override def value2(value: Long): PaymentRecord = {
    setCustomerId(value)
    this
  }

  override def value3(value: Long): PaymentRecord = {
    setStaffId(value)
    this
  }

  override def value4(value: Long): PaymentRecord = {
    setRentalId(value)
    this
  }

  override def value5(value: BigDecimal): PaymentRecord = {
    setAmount(value)
    this
  }

  override def value6(value: LocalDateTime): PaymentRecord = {
    setPaymentDate(value)
    this
  }

  override def values(value1 : Long, value2 : Long, value3 : Long, value4 : Long, value5 : BigDecimal, value6 : LocalDateTime): PaymentRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this
  }

  /**
   * Create a detached, initialised PaymentRecord
   */
  def this(paymentId : Long, customerId : Long, staffId : Long, rentalId : Long, amount : BigDecimal, paymentDate : LocalDateTime) = {
    this()

    this.setPaymentId(paymentId)
    this.setCustomerId(customerId)
    this.setStaffId(staffId)
    this.setRentalId(rentalId)
    this.setAmount(amount)
    this.setPaymentDate(paymentDate)
    resetChangedOnNotNull()
  }

  /**
   * Create a detached, initialised PaymentRecord
   */
  def this(value: org.jooq.demo.skala.db.tables.pojos.Payment) = {
    this()

    if (value != null) {
      this.setPaymentId(value.getPaymentId)
      this.setCustomerId(value.getCustomerId)
      this.setStaffId(value.getStaffId)
      this.setRentalId(value.getRentalId)
      this.setAmount(value.getAmount)
      this.setPaymentDate(value.getPaymentDate)
      resetChangedOnNotNull()
    }
  }
}