// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.2.0.0

package enums.fbe;;

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

import com.google.gson.*;

public final class EnumUInt16Json implements JsonSerializer<EnumUInt16>, JsonDeserializer<EnumUInt16>
{
    @Override
    public JsonElement serialize(EnumUInt16 src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public EnumUInt16 deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new EnumUInt16(json.getAsJsonPrimitive().getAsShort());
    }
}
