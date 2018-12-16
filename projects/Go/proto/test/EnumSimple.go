// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

package test

import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// EnumSimple enum key
type EnumSimpleKey int32

// Convert EnumSimple enum key to string
func (k EnumSimpleKey) String() string {
    return EnumSimple(k).String()
}

// EnumSimple enum
type EnumSimple int32

// EnumSimple enum values
//noinspection GoSnakeCaseUsage
const (
    EnumSimple_ENUM_VALUE_0 = EnumSimple(0 + 0)
    EnumSimple_ENUM_VALUE_1 = EnumSimple(1 + 0)
    EnumSimple_ENUM_VALUE_2 = EnumSimple(1 + 1)
    EnumSimple_ENUM_VALUE_3 = EnumSimple(3 + 0)
    EnumSimple_ENUM_VALUE_4 = EnumSimple(0x4 + 0)
    EnumSimple_ENUM_VALUE_5 = EnumSimple(EnumSimple_ENUM_VALUE_3)
)

// Create a new EnumSimple enum
func NewEnumSimple() *EnumSimple {
    return new(EnumSimple)
}

// Create a new EnumSimple enum from the given value
func NewEnumSimpleFromValue(value int32) *EnumSimple {
    result := EnumSimple(value)
    return &result
}

// Get the enum key
func (e EnumSimple) Key() EnumSimpleKey {
    return EnumSimpleKey(e)
}

// Convert enum to optional
func (e *EnumSimple) Optional() *EnumSimple {
    return e
}

// Convert enum to string
func (e EnumSimple) String() string {
    if e == EnumSimple_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumSimple_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumSimple_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumSimple_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumSimple_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumSimple_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumSimple) MarshalJSON() ([]byte, error) {
    value := int32(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumSimple) UnmarshalJSON(buffer []byte) error {
    var result int32
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumSimple(result)
    return nil
}
