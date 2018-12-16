// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.2.0.0

package proto;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;

public final class State implements Comparable<State>
{
    public static final State unknown = new State(StateEnum.unknown);
    public static final State invalid = new State(StateEnum.invalid);
    public static final State initialized = new State(StateEnum.initialized);
    public static final State calculated = new State(StateEnum.calculated);
    public static final State broken = new State(StateEnum.broken);
    public static final State good = new State(StateEnum.good);
    public static final State bad = new State(StateEnum.bad);

    private StateEnum value = StateEnum.values()[0];
    private byte flags = value.getRaw();

    public State() {}
    public State(byte value) { setEnum(value); }
    public State(StateEnum value) { setEnum(value); }
    public State(EnumSet<StateEnum> value) { setEnum(value); }
    public State(State value) { setEnum(value); }

    public StateEnum getEnum() { return value; }
    public byte getRaw() { return flags; }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.flags = value; this.value = StateEnum.mapValue(value); }
    public void setEnum(StateEnum value) { this.value = value; this.flags = value.getRaw(); }
    public void setEnum(EnumSet<StateEnum> value) { setEnum(State.fromSet(value)); }
    public void setEnum(State value) { this.value = value.value; this.flags = value.flags; }

    public boolean hasFlags(byte flags) { return (((this.flags & flags) != 0) && ((this.flags & flags) == flags)); }
    public boolean hasFlags(StateEnum flags) { return hasFlags(flags.getRaw()); }
    public boolean hasFlags(State flags) { return hasFlags(flags.flags); }

    public State setFlags(byte flags) { setEnum((byte)(this.flags | flags)); return this; }
    public State setFlags(StateEnum flags) { setFlags(flags.getRaw()); return this; }
    public State setFlags(State flags) { setFlags(flags.flags); return this; }

    public State removeFlags(byte flags) { setEnum((byte)(this.flags & ~flags)); return this; }
    public State removeFlags(StateEnum flags) { removeFlags(flags.getRaw()); return this; }
    public State removeFlags(State flags) { removeFlags(flags.flags); return this; }

    public EnumSet<StateEnum> getAllSet() { return value.getAllSet(); }
    public EnumSet<StateEnum> getNoneSet() { return value.getNoneSet(); }
    public EnumSet<StateEnum> getCurrentSet() { return value.getCurrentSet(); }

    public static State fromSet(EnumSet<StateEnum> set)
    {
        byte result = 0;
        if (set.contains(unknown.getEnum()))
        {
            result |= unknown.flags;
        }
        if (set.contains(invalid.getEnum()))
        {
            result |= invalid.flags;
        }
        if (set.contains(initialized.getEnum()))
        {
            result |= initialized.flags;
        }
        if (set.contains(calculated.getEnum()))
        {
            result |= calculated.flags;
        }
        if (set.contains(broken.getEnum()))
        {
            result |= broken.flags;
        }
        if (set.contains(good.getEnum()))
        {
            result |= good.flags;
        }
        if (set.contains(bad.getEnum()))
        {
            result |= bad.flags;
        }
        return new State(result);
    }

    @Override
    public int compareTo(State other)
    {
        return (int)(flags - other.flags);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!State.class.isAssignableFrom(other.getClass()))
            return false;

        final State flg = (State)other;

        if (flags != flg.flags)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + (int)flags;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        if (hasFlags(unknown.flags))
        {
            sb.append(first ? "" : "|").append("unknown");
            first = false;
        }
        if (hasFlags(invalid.flags))
        {
            sb.append(first ? "" : "|").append("invalid");
            first = false;
        }
        if (hasFlags(initialized.flags))
        {
            sb.append(first ? "" : "|").append("initialized");
            first = false;
        }
        if (hasFlags(calculated.flags))
        {
            sb.append(first ? "" : "|").append("calculated");
            first = false;
        }
        if (hasFlags(broken.flags))
        {
            sb.append(first ? "" : "|").append("broken");
            first = false;
        }
        if (hasFlags(good.flags))
        {
            sb.append(first ? "" : "|").append("good");
            first = false;
        }
        if (hasFlags(bad.flags))
        {
            sb.append(first ? "" : "|").append("bad");
            first = false;
        }
        return sb.toString();
    }
}
