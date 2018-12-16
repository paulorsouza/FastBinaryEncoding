// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.2.0.0

package proto.fbe;

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

// Fast Binary Encoding proto sender
public class Sender extends fbe.Sender
{
    // Sender models accessors
    public final OrderModel OrderModel;
    public final BalanceModel BalanceModel;
    public final AccountModel AccountModel;

    public Sender()
    {
        super(false);
        OrderModel = new OrderModel(getBuffer());
        BalanceModel = new BalanceModel(getBuffer());
        AccountModel = new AccountModel(getBuffer());
    }
    public Sender(Buffer buffer)
    {
        super(buffer, false);
        OrderModel = new OrderModel(getBuffer());
        BalanceModel = new BalanceModel(getBuffer());
        AccountModel = new AccountModel(getBuffer());
    }

    public long send(proto.Order value)
    {
        // Serialize the value into the FBE stream
        long serialized = OrderModel.serialize(value);
        assert (serialized > 0) : "proto.Order serialization failed!";
        assert OrderModel.verify() : "proto.Order validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(proto.Balance value)
    {
        // Serialize the value into the FBE stream
        long serialized = BalanceModel.serialize(value);
        assert (serialized > 0) : "proto.Balance serialization failed!";
        assert BalanceModel.verify() : "proto.Balance validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(proto.Account value)
    {
        // Serialize the value into the FBE stream
        long serialized = AccountModel.serialize(value);
        assert (serialized > 0) : "proto.Account serialization failed!";
        assert AccountModel.verify() : "proto.Account validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("proto.fbe.Sender.onSend() not implemented!"); }
}
