// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package protoex.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import protoex.*

// Fast Binary Encoding Balance model
class BalanceModel : Model
{
    val model: FieldModelBalance

    constructor() { model = FieldModelBalance(buffer, 4) }
    constructor(buffer: Buffer) : super(buffer) { model = FieldModelBalance(buffer, 4) }

    // Model size
    fun fbeSize(): Long = model.fbeSize + model.fbeExtra
    // Model type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = FieldModelBalance.fbeTypeConst
    }

    // Check if the struct value is valid
    fun verify(): Boolean
    {
        if ((buffer.offset + model.fbeOffset - 4) > buffer.size)
            return false

        val fbeFullSize = readUInt32(model.fbeOffset - 4).toLong()
        if (fbeFullSize < model.fbeSize)
            return false

        return model.verify()
    }

    // Create a new model (begin phase)
    fun createBegin(): Long
    {
        return buffer.allocate(4 + model.fbeSize)
    }

    // Create a new model (end phase)
    fun createEnd(fbeBegin: Long): Long
    {
        val fbeEnd = buffer.size
        val fbeFullSize = fbeEnd - fbeBegin
        write(model.fbeOffset - 4, fbeFullSize.toUInt())
        return fbeFullSize
    }

    // Serialize the struct value
    fun serialize(value: Balance): Long
    {
        val fbeBegin = createBegin()
        model.set(value)
        return createEnd(fbeBegin)
    }

    // Deserialize the struct value
    fun deserialize(): Balance { val value = Balance(); deserialize(value); return value }
    @Suppress("UNUSED_VALUE")
    fun deserialize(value: Balance): Long
    {
        var valueRef = value

        if ((buffer.offset + model.fbeOffset - 4) > buffer.size)
        {
            valueRef = Balance()
            return 0
        }

        val fbeFullSize = readUInt32(model.fbeOffset - 4).toLong()
        assert(fbeFullSize >= model.fbeSize) { "Model is broken!" }
        if (fbeFullSize < model.fbeSize)
        {
            valueRef = Balance()
            return 0
        }

        valueRef = model.get(valueRef)
        return fbeFullSize
    }

    // Move to the next struct value
    fun next(prev: Long)
    {
        model.fbeShift(prev)
    }
}
