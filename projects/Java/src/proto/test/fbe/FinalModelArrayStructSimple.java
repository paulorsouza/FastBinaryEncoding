// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding StructSimple array final model
public final class FinalModelArrayStructSimple extends FinalModel
{
    private final FinalModelStructSimple _model;
    private final long _size;

    public FinalModelArrayStructSimple(Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new FinalModelStructSimple(buffer, offset);
        _size = size;
    }

    // Get the allocation size
    public long fbeAllocationSize(StructSimple[] values)
    {
        long size = 0;
        for (long i = 0; (i < values.length) && (i < _size); i++)
            size += _model.fbeAllocationSize(values[(int)i]);
        return size;
    }
    public long fbeAllocationSize(ArrayList<StructSimple> values)
    {
        long size = 0;
        for (long i = 0; (i < values.size()) && (i < _size); i++)
            size += _model.fbeAllocationSize(values.get((int)i));
        return size;
    }

    // Check if the array is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return Long.MAX_VALUE;

        long size = 0;
        _model.fbeOffset(fbeOffset());
        for (long i = _size; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the array
    public StructSimple[] get(Size size)
    {
        var values = new StructSimple[(int)_size];

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
        {
            size.value = 0;
            return values;
        }

        size.value = 0;
        var offset = new Size();
        _model.fbeOffset(fbeOffset());
        for (long i = 0; i < _size; i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.fbeShift(offset.value);
            size.value += offset.value;
        }
        return values;
    }

    // Get the array
    public long get(StructSimple[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        var offset = new Size();
        _model.fbeOffset(fbeOffset());
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the array as ArrayList
    public long get(ArrayList<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        values.ensureCapacity((int)_size);

        long size = 0;
        var offset = new Size();
        _model.fbeOffset(fbeOffset());
        for (long i = _size; i-- > 0;)
        {
            offset.value = 0;
            StructSimple value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the array
    public long set(StructSimple[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        _model.fbeOffset(fbeOffset());
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            long offset = _model.set(values[(int)i]);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the array as List
    public long set(ArrayList<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        _model.fbeOffset(fbeOffset());
        for (long i = 0; (i < values.size()) && (i < _size); i++)
        {
            long offset = _model.set(values.get((int)i));
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }
}
