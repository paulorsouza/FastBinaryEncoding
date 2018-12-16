// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import com.google.gson.*

internal class BytesJson : JsonSerializer<ByteArray>, JsonDeserializer<ByteArray>
{
    override fun serialize(src: ByteArray, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(Base64.getEncoder().encodeToString(src))
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): ByteArray
    {
        return Base64.getDecoder().decode(json.asString)
    }
}

internal class CharacterJson : JsonSerializer<Char>, JsonDeserializer<Char>
{
    override fun serialize(src: Char, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(src.toLong())
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): Char
    {
        return json.asLong.toChar()
    }
}

internal class InstantJson : JsonSerializer<Instant>, JsonDeserializer<Instant>
{
    override fun serialize(src: Instant, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        val nanoseconds = src.epochSecond * 1000000000 + src.nano
        return JsonPrimitive(nanoseconds)
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): Instant
    {
        val nanoseconds = json.asJsonPrimitive.asLong
        return Instant.ofEpochSecond(nanoseconds / 1000000000, nanoseconds % 1000000000)
    }
}

internal class BigDecimalJson : JsonSerializer<BigDecimal>, JsonDeserializer<BigDecimal>
{
    override fun serialize(src: BigDecimal, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(src.toPlainString())
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): BigDecimal
    {
        return BigDecimal(json.asJsonPrimitive.asString)
    }
}

internal class UUIDJson : JsonSerializer<UUID>, JsonDeserializer<UUID>
{
    override fun serialize(src: UUID, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(src.toString())
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): UUID {
        return UUID.fromString(json.asJsonPrimitive.asString)
    }
}

// Fast Binary Encoding base JSON engine
@Suppress("MemberVisibilityCanBePrivate")
object Json
{
    // Get the JSON engine
    val engine: Gson = register(GsonBuilder()).create()

    fun register(builder: GsonBuilder): GsonBuilder
    {
        builder.serializeNulls()
        builder.registerTypeAdapter(ByteArray::class.java, BytesJson())
        builder.registerTypeAdapter(Char::class.java, CharacterJson())
        builder.registerTypeAdapter(Character::class.java, CharacterJson())
        builder.registerTypeAdapter(Instant::class.java, InstantJson())
        builder.registerTypeAdapter(BigDecimal::class.java, BigDecimalJson())
        builder.registerTypeAdapter(UUID::class.java, UUIDJson())
        return builder
    }
}
