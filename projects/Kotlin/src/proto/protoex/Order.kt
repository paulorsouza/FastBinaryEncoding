// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package protoex

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class Order : Comparable<Any?>
{
    var uid: Int = 0
    var symbol: String = ""
    var side: OrderSide = OrderSide()
    var type: OrderType = OrderType()
    var price: Double = 0.0
    var volume: Double = 0.0
    var tp: Double = 10.0
    var sl: Double = -10.0

    constructor()

    constructor(uid: Int, symbol: String, side: OrderSide, type: OrderType, price: Double, volume: Double, tp: Double, sl: Double)
    {
        this.uid = uid
        this.symbol = symbol
        this.side = side
        this.type = type
        this.price = price
        this.volume = volume
        this.tp = tp
        this.sl = sl
    }

    constructor(other: Order)
    {
        this.uid = other.uid
        this.symbol = other.symbol
        this.side = other.side
        this.type = other.type
        this.price = other.price
        this.volume = other.volume
        this.tp = other.tp
        this.sl = other.sl
    }

    open fun clone(): Order
    {
        // Serialize the struct to the FBE stream
        val writer = protoex.fbe.OrderModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = protoex.fbe.OrderModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!Order::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Order? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = uid.compareTo(obj.uid)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!Order::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Order? ?: return false

        if (uid != obj.uid)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + uid.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("Order(")
        sb.append("uid="); sb.append(uid)
        sb.append(",symbol="); sb.append("\"").append(symbol).append("\"")
        sb.append(",side="); sb.append(side)
        sb.append(",type="); sb.append(type)
        sb.append(",price="); sb.append(price)
        sb.append(",volume="); sb.append(volume)
        sb.append(",tp="); sb.append(tp)
        sb.append(",sl="); sb.append(sl)
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = protoex.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): Order = protoex.fbe.Json.engine.fromJson(json, Order::class.java)
    }
}
