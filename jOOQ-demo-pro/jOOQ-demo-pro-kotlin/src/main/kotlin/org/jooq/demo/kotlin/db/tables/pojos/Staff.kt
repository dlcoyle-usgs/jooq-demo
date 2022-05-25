/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Staff(
    var staffId: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var addressId: Long? = null,
    var email: String? = null,
    var storeId: Long? = null,
    var active: Boolean? = null,
    var username: String? = null,
    var password: String? = null,
    var lastUpdate: LocalDateTime? = null,
    var picture: ByteArray? = null
): Serializable {

}