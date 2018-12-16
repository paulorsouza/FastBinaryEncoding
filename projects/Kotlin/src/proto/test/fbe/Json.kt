// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package test.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import test.*

import com.google.gson.*

// Fast Binary Encoding test JSON engine
object Json
{
    // Get the JSON engine
    val engine: Gson = register(GsonBuilder()).create()

    @Suppress("MemberVisibilityCanBePrivate")
    fun register(builder: GsonBuilder): GsonBuilder
    {
        fbe.Json.register(builder)
        proto.fbe.Json.register(builder)
        builder.registerTypeAdapter(EnumSimple::class.java, EnumSimpleJson())
        builder.registerTypeAdapter(EnumTyped::class.java, EnumTypedJson())
        builder.registerTypeAdapter(FlagsSimple::class.java, FlagsSimpleJson())
        builder.registerTypeAdapter(FlagsTyped::class.java, FlagsTypedJson())
        return builder
    }
}
