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

// Fast Binary Encoding Int32->Bytes map final model
public final class FinalModelMapInt32Bytes extends FinalModel
{
    private final FinalModelInt32 _modelKey;
    private final FinalModelBytes _modelValue;

    public FinalModelMapInt32Bytes(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _modelKey = new FinalModelInt32(buffer, offset);
        _modelValue = new FinalModelBytes(buffer, offset);
    }

    // Get the allocation size
    public long fbeAllocationSize(TreeMap<Integer, ByteBuffer> values)
    {
        long size = 4;
        for (var value : values.entrySet())
        {
            size += _modelKey.fbeAllocationSize(value.getKey());
            size += _modelValue.fbeAllocationSize(value.getValue());
        }
        return size;
    }
    public long fbeAllocationSize(HashMap<Integer, ByteBuffer> values)
    {
        long size = 4;
        for (var value : values.entrySet())
        {
            size += _modelKey.fbeAllocationSize(value.getKey());
            size += _modelValue.fbeAllocationSize(value.getValue());
        }
        return size;
    }

    // Check if the map is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeMapSize = readInt32(fbeOffset());

        long size = 4;
        _modelKey.fbeOffset(fbeOffset() + 4);
        _modelValue.fbeOffset(fbeOffset() + 4);
        for (int i = fbeMapSize; i-- > 0;)
        {
            long offsetKey = _modelKey.verify();
            if (offsetKey == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _modelKey.fbeShift(offsetKey);
            _modelValue.fbeShift(offsetKey);
            size += offsetKey;
            long offsetValue = _modelValue.verify();
            if (offsetValue == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _modelKey.fbeShift(offsetValue);
            _modelValue.fbeShift(offsetValue);
            size += offsetValue;
        }
        return size;
    }

    // Get the map as TreeMap
    public long get(TreeMap<Integer, ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeMapSize = readInt32(fbeOffset());
        if (fbeMapSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _modelKey.fbeOffset(fbeOffset() + 4);
        _modelValue.fbeOffset(fbeOffset() + 4);
        for (long i = fbeMapSize; i-- > 0;)
        {
            offset.value = 0;
            Integer key = _modelKey.get(offset);
            _modelKey.fbeShift(offset.value);
            _modelValue.fbeShift(offset.value);
            size += offset.value;
            offset.value = 0;
            ByteBuffer value = _modelValue.get(offset);
            _modelKey.fbeShift(offset.value);
            _modelValue.fbeShift(offset.value);
            size += offset.value;
            values.put(key, value);
        }
        return size;
    }

    // Get the map as HashMap
    public long get(HashMap<Integer, ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeMapSize = readInt32(fbeOffset());
        if (fbeMapSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _modelKey.fbeOffset(fbeOffset() + 4);
        _modelValue.fbeOffset(fbeOffset() + 4);
        for (long i = fbeMapSize; i-- > 0;)
        {
            offset.value = 0;
            Integer key = _modelKey.get(offset);
            _modelKey.fbeShift(offset.value);
            _modelValue.fbeShift(offset.value);
            size += offset.value;
            offset.value = 0;
            ByteBuffer value = _modelValue.get(offset);
            _modelKey.fbeShift(offset.value);
            _modelValue.fbeShift(offset.value);
            size += offset.value;

            values.put(key, value);
        }
        return size;
    }

    // Set the map as TreeMap
    public long set(TreeMap<Integer, ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _modelKey.fbeOffset(fbeOffset() + 4);
        _modelValue.fbeOffset(fbeOffset() + 4);
        for (var value : values.entrySet())
        {
            long offsetKey = _modelKey.set(value.getKey());
            _modelKey.fbeShift(offsetKey);
            _modelValue.fbeShift(offsetKey);
            long offsetValue = _modelValue.set(value.getValue());
            _modelKey.fbeShift(offsetValue);
            _modelValue.fbeShift(offsetValue);
            size += offsetKey + offsetValue;
        }
        return size;
    }

    // Set the map as HashMap
    public long set(HashMap<Integer, ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _modelKey.fbeOffset(fbeOffset() + 4);
        _modelValue.fbeOffset(fbeOffset() + 4);
        for (var value : values.entrySet())
        {
            long offsetKey = _modelKey.set(value.getKey());
            _modelKey.fbeShift(offsetKey);
            _modelValue.fbeShift(offsetKey);
            long offsetValue = _modelValue.set(value.getValue());
            _modelKey.fbeShift(offsetValue);
            _modelValue.fbeShift(offsetValue);
            size += offsetKey + offsetValue;
        }
        return size;
    }
}
