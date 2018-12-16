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

public enum EnumSimpleEnum
{
    ENUM_VALUE_0((int)0 + 0)
    , ENUM_VALUE_1((int)1 + 0)
    , ENUM_VALUE_2((int)1 + 1)
    , ENUM_VALUE_3((int)3 + 0)
    , ENUM_VALUE_4((int)0x4 + 0)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private int value;

    EnumSimpleEnum(int value) { this.value = (int)value; }
    EnumSimpleEnum(EnumSimpleEnum value) { this.value = value.value; }

    public int getRaw() { return value; }

    public static EnumSimpleEnum mapValue(int value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final Map<Integer, EnumSimpleEnum> mapping = new HashMap<>();
    static
    {
        for (var value : EnumSimpleEnum.values())
            mapping.put(value.value, value);
    }
}
