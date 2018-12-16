// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.2.0.0

package enums.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import enums.*;

// Fast Binary Encoding EnumUInt16 field model
public final class FieldModelEnumUInt16 extends FieldModel
{
    public FieldModelEnumUInt16(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 2; }

    // Get the value
    public EnumUInt16 get() { return get(new EnumUInt16()); }
    public EnumUInt16 get(EnumUInt16 defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new EnumUInt16(readInt16(fbeOffset()));
    }

    // Set the value
    public void set(EnumUInt16 value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
