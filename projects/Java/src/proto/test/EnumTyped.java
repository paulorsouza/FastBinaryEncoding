// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

package test;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

public final class EnumTyped implements Comparable<EnumTyped>
{
    public static final EnumTyped ENUM_VALUE_0 = new EnumTyped(EnumTypedEnum.ENUM_VALUE_0);
    public static final EnumTyped ENUM_VALUE_1 = new EnumTyped(EnumTypedEnum.ENUM_VALUE_1);
    public static final EnumTyped ENUM_VALUE_2 = new EnumTyped(EnumTypedEnum.ENUM_VALUE_2);
    public static final EnumTyped ENUM_VALUE_3 = new EnumTyped(EnumTypedEnum.ENUM_VALUE_3);
    public static final EnumTyped ENUM_VALUE_4 = new EnumTyped(EnumTypedEnum.ENUM_VALUE_4);
    public static final EnumTyped ENUM_VALUE_5 = new EnumTyped(EnumTypedEnum.ENUM_VALUE_5);

    private EnumTypedEnum value = EnumTypedEnum.values()[0];

    public EnumTyped() {}
    public EnumTyped(byte value) { setEnum(value); }
    public EnumTyped(EnumTypedEnum value) { setEnum(value); }
    public EnumTyped(EnumTyped value) { setEnum(value); }

    public EnumTypedEnum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = EnumTypedEnum.mapValue(value); }
    public void setEnum(EnumTypedEnum value) { this.value = value; }
    public void setEnum(EnumTyped value) { this.value = value.value; }

    @Override
    public int compareTo(EnumTyped other)
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

        if (!EnumTyped.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumTyped enm = (EnumTyped)other;

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
