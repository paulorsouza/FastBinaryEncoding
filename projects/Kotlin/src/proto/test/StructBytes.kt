// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package test

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
open class StructBytes : Comparable<Any?>
{
    var f1: ByteArray = ByteArray(0)
    var f2: ByteArray? = null
    var f3: ByteArray? = null

    constructor()

    constructor(f1: ByteArray, f2: ByteArray?, f3: ByteArray?)
    {
        this.f1 = f1
        this.f2 = f2
        this.f3 = f3
    }

    constructor(other: StructBytes)
    {
        this.f1 = other.f1
        this.f2 = other.f2
        this.f3 = other.f3
    }

    open fun clone(): StructBytes
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructBytesModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructBytesModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructBytes::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructBytes? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructBytes::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructBytes? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructBytes(")
        sb.append("f1="); sb.append("bytes[").append(f1.size).append("]")
        sb.append(",f2="); if (f2 != null) sb.append("bytes[").append(f2!!.size).append("]"); else sb.append("null")
        sb.append(",f3="); if (f3 != null) sb.append("bytes[").append(f3!!.size).append("]"); else sb.append("null")
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = test.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): StructBytes = test.fbe.Json.engine.fromJson(json, StructBytes::class.java)
    }
}
