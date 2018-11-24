// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test

import "strconv"
import "strings"
import "encoding/json"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// StructHashEx key
type StructHashExKey struct {
}

// Convert StructHashEx flags key to string
func (k StructHashExKey) String() string {
    var sb strings.Builder
    return sb.String()
}

// StructHashEx struct
type StructHashEx struct {
    F1 map[StructSimpleKey]StructNested
    F2 map[StructSimpleKey]*StructNested
}

// Create a new StructHashEx struct from JSON
func NewStructHashExFromJSON(buffer []byte) (*StructHashEx, error) {
    var result StructHashEx
    err := json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Get the struct key
func (s StructHashEx) Key() StructHashExKey {
    return StructHashExKey{
    }
}

// Convert struct to string
func (s StructHashEx) String() string {
    var sb strings.Builder
    return sb.String()
}

// Convert struct to JSON
func (s StructHashEx) JSON() ([]byte, error) {
    return json.Marshal(s)
}
