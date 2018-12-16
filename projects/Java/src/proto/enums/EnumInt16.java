// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.2.0.0

package enums;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;

public final class EnumInt16 implements Comparable<EnumInt16>
{
    public static final EnumInt16 ENUM_VALUE_0 = new EnumInt16(EnumInt16Enum.ENUM_VALUE_0);
    public static final EnumInt16 ENUM_VALUE_1 = new EnumInt16(EnumInt16Enum.ENUM_VALUE_1);
    public static final EnumInt16 ENUM_VALUE_2 = new EnumInt16(EnumInt16Enum.ENUM_VALUE_2);
    public static final EnumInt16 ENUM_VALUE_3 = new EnumInt16(EnumInt16Enum.ENUM_VALUE_3);
    public static final EnumInt16 ENUM_VALUE_4 = new EnumInt16(EnumInt16Enum.ENUM_VALUE_4);
    public static final EnumInt16 ENUM_VALUE_5 = new EnumInt16(EnumInt16Enum.ENUM_VALUE_5);

    private EnumInt16Enum value = EnumInt16Enum.values()[0];

    public EnumInt16() {}
    public EnumInt16(short value) { setEnum(value); }
    public EnumInt16(EnumInt16Enum value) { setEnum(value); }
    public EnumInt16(EnumInt16 value) { setEnum(value); }

    public EnumInt16Enum getEnum() { return value; }
    public short getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((short)0); }

    public void setEnum(short value) { this.value = EnumInt16Enum.mapValue(value); }
    public void setEnum(EnumInt16Enum value) { this.value = value; }
    public void setEnum(EnumInt16 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumInt16 other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!EnumInt16.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumInt16 enm = (EnumInt16)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
