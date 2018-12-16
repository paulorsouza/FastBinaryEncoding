// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.2.0.0

package protoex;

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

public class Order implements Comparable<Object>
{
    public int uid = 0;
    public String symbol = "";
    public OrderSide side = new OrderSide();
    public OrderType type = new OrderType();
    public double price = (double)0.0d;
    public double volume = (double)0.0d;
    public double tp = (double)10.0d;
    public double sl = (double)-10.0d;

    public Order() {}

    public Order(int uid, String symbol, OrderSide side, OrderType type, double price, double volume, double tp, double sl)
    {
        this.uid = uid;
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.tp = tp;
        this.sl = sl;
    }

    public Order(Order other)
    {
        this.uid = other.uid;
        this.symbol = other.symbol;
        this.side = other.side;
        this.type = other.type;
        this.price = other.price;
        this.volume = other.volume;
        this.tp = other.tp;
        this.sl = other.sl;
    }

    public Order clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new protoex.fbe.OrderModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new protoex.fbe.OrderModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!Order.class.isAssignableFrom(other.getClass()))
            return -1;

        final Order obj = (Order)other;

        int result = 0;
        result = Integer.compare(uid, obj.uid);
        if (result != 0)
            return result;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!Order.class.isAssignableFrom(other.getClass()))
            return false;

        final Order obj = (Order)other;

        if (uid != obj.uid)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + Integer.hashCode(uid);
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("Order(");
        sb.append("uid="); sb.append(uid);
        sb.append(",symbol="); if (symbol != null) sb.append("\"").append(symbol).append("\""); else sb.append("null");
        sb.append(",side="); sb.append(side);
        sb.append(",type="); sb.append(type);
        sb.append(",price="); sb.append(price);
        sb.append(",volume="); sb.append(volume);
        sb.append(",tp="); sb.append(tp);
        sb.append(",sl="); sb.append(sl);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return protoex.fbe.Json.getEngine().toJson(this); }
    public static Order fromJson(String json) { return protoex.fbe.Json.getEngine().fromJson(json, Order.class); }
}
