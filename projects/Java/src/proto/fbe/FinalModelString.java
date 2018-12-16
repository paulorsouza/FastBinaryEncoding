// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.2.0.0

package fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

// Fast Binary Encoding string final model
public final class FinalModelString extends FinalModel
{
    public FinalModelString(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(String value) { return 4 + 3 * (value.length() + 1); }

    // Check if the string value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeStringSize = readInt32(fbeOffset());
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeStringSize) > _buffer.getSize())
            return Long.MAX_VALUE;

        return 4 + fbeStringSize;
    }

    // Get the string value
    public String get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
        {
            size.value = 0;
            return "";
        }

        int fbeStringSize = readInt32(fbeOffset());
        assert ((_buffer.getOffset() + fbeOffset() + 4 + fbeStringSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeStringSize) > _buffer.getSize())
        {
            size.value = 4;
            return "";
        }

        size.value = 4 + fbeStringSize;
        return readString(fbeOffset() + 4, fbeStringSize);
    }

    // Set the string value
    public long set(String value)
    {
        assert (value != null) : "Invalid string value!";
        if (value == null)
            throw new IllegalArgumentException("Invalid string value!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);

        int fbeStringSize = bytes.length;
        assert ((_buffer.getOffset() + fbeOffset() + 4 + fbeStringSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeStringSize) > _buffer.getSize())
            return 4;

        write(fbeOffset(), fbeStringSize);
        write(fbeOffset() + 4, bytes);
        return 4 + fbeStringSize;
    }
}
