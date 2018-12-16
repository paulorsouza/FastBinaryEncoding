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

// Fast Binary Encoding proto receiver
public class Receiver extends fbe.Receiver
{
    // Receiver values accessors
    private final proto.Order OrderValue;
    private final proto.Balance BalanceValue;
    private final proto.Account AccountValue;

    // Receiver models accessors
    private final OrderModel OrderModel;
    private final BalanceModel BalanceModel;
    private final AccountModel AccountModel;

    public Receiver()
    {
        super(false);
        OrderValue = new proto.Order();
        OrderModel = new OrderModel();
        BalanceValue = new proto.Balance();
        BalanceModel = new BalanceModel();
        AccountValue = new proto.Account();
        AccountModel = new AccountModel();
    }
    public Receiver(Buffer buffer)
    {
        super(buffer, false);
        OrderValue = new proto.Order();
        OrderModel = new OrderModel();
        BalanceValue = new proto.Balance();
        BalanceModel = new BalanceModel();
        AccountValue = new proto.Account();
        AccountModel = new AccountModel();
    }

    // Receive handlers
    protected void onReceive(proto.Order value) {}
    protected void onReceive(proto.Balance value) {}
    protected void onReceive(proto.Account value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)proto.fbe.OrderModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                OrderModel.attach(buffer, offset);
                assert OrderModel.verify() : "proto.Order validation failed!";
                long deserialized = OrderModel.deserialize(OrderValue);
                assert (deserialized > 0) : "proto.Order deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = OrderValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(OrderValue);
                return true;
            }
            case (int)proto.fbe.BalanceModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                BalanceModel.attach(buffer, offset);
                assert BalanceModel.verify() : "proto.Balance validation failed!";
                long deserialized = BalanceModel.deserialize(BalanceValue);
                assert (deserialized > 0) : "proto.Balance deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = BalanceValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(BalanceValue);
                return true;
            }
            case (int)proto.fbe.AccountModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                AccountModel.attach(buffer, offset);
                assert AccountModel.verify() : "proto.Account validation failed!";
                long deserialized = AccountModel.deserialize(AccountValue);
                assert (deserialized > 0) : "proto.Account deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = AccountValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(AccountValue);
                return true;
            }
        }

        return false;
    }
}
