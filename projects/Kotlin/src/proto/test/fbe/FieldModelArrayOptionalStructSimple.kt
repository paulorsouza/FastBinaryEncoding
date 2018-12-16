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

// Fast Binary Encoding OptionalStructSimple array field model
class FieldModelArrayOptionalStructSimple(buffer: Buffer, offset: Long, val size: Long) : FieldModel(buffer, offset)
{
    private val _model = FieldModelOptionalStructSimple(buffer, offset)

    // Field size
    override val fbeSize: Long = size * _model.fbeSize

    // Field extra size
    override val fbeExtra: Long = 0

    // Get the array offset
    val offset: Long get() = 0

    // Array index operator
    fun getItem(index: Long): FieldModelOptionalStructSimple
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        assert(index < size) { "Index is out of bounds!" }

        _model.fbeOffset = fbeOffset
        _model.fbeShift(index * _model.fbeSize)
        return _model
    }

    // Check if the array is valid
    override fun verify(): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return false

        _model.fbeOffset = fbeOffset
        var i = size
        while (i-- > 0)
        {
            if (!_model.verify())
                return false
            _model.fbeShift(_model.fbeSize)
        }

        return true
    }

    // Get the array
    fun get(): Array<StructSimple?>
    {
        val values = arrayOfNulls<StructSimple?>(size.toInt())

        val fbeModel = getItem(0)
        for (i in 0 until size)
        {
            values[i.toInt()] = fbeModel.get()
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
        return values
    }

    // Get the array
    fun get(values: Array<StructSimple?>)
    {
        val fbeModel = getItem(0)
        var i: Long = 0
        while ((i < values.size) && (i < size))
        {
            values[i.toInt()] = fbeModel.get()
            fbeModel.fbeShift(fbeModel.fbeSize)
            i++
        }
    }

    // Get the array as ArrayList
    fun get(values: ArrayList<StructSimple?>)
    {
        values.clear()
        values.ensureCapacity(size.toInt())

        val fbeModel = getItem(0)
        var i = size
        while (i-- > 0)
        {
            val value = fbeModel.get()
            values.add(value)
            fbeModel.fbeShift(fbeModel.fbeSize)
        }
    }

    // Set the array
    fun set(values: Array<StructSimple?>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = getItem(0)
        var i: Long = 0
        while ((i < values.size) && (i < size))
        {
            fbeModel.set(values[i.toInt()])
            fbeModel.fbeShift(fbeModel.fbeSize)
            i++
        }
    }

    // Set the array as List
    fun set(values: ArrayList<StructSimple?>)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        val fbeModel = getItem(0)
        var i: Long = 0
        while ((i < values.size) && (i < size))
        {
            fbeModel.set(values[i.toInt()])
            fbeModel.fbeShift(fbeModel.fbeSize)
            i++
        }
    }
}
