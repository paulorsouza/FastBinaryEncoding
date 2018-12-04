// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test

import "fmt"
import "strconv"
import "strings"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// StructVector key
type StructVectorKey struct {
}

// Convert StructVector flags key to string
func (k *StructVectorKey) String() string {
    var sb strings.Builder
    sb.WriteString("StructVectorKey(")
    sb.WriteString(")")
    return sb.String()
}

// StructVector struct
type StructVector struct {
    F1 []byte `json:"f1"`
    F2 []*byte `json:"f2"`
    F3 [][]byte `json:"f3"`
    F4 []*[]byte `json:"f4"`
    F5 []EnumSimple `json:"f5"`
    F6 []*EnumSimple `json:"f6"`
    F7 []FlagsSimple `json:"f7"`
    F8 []*FlagsSimple `json:"f8"`
    F9 []StructSimple `json:"f9"`
    F10 []*StructSimple `json:"f10"`
}

// Create a new StructVector struct
func NewStructVector() *StructVector {
    return &StructVector{
        F1: make([]byte, 0),
        F2: make([]*byte, 0),
        F3: make([][]byte, 0),
        F4: make([]*[]byte, 0),
        F5: make([]EnumSimple, 0),
        F6: make([]*EnumSimple, 0),
        F7: make([]FlagsSimple, 0),
        F8: make([]*FlagsSimple, 0),
        F9: make([]StructSimple, 0),
        F10: make([]*StructSimple, 0),
    }
}

// Create a new StructVector struct from JSON
func NewStructVectorFromJSON(buffer []byte) (*StructVector, error) {
    result := *NewStructVector()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *StructVector) Copy() *StructVector {
    var result = *s
    return &result
}

// Struct deep clone
func (s *StructVector) Clone() *StructVector {
    // Serialize the struct to the FBE stream
    writer := NewStructVectorModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewStructVectorModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *StructVector) Key() StructVectorKey {
    return StructVectorKey{
    }
}

// Convert struct to optional
func (s *StructVector) Optional() *StructVector {
    return s
}

// Convert struct to string
func (s *StructVector) String() string {
    var sb strings.Builder
    sb.WriteString("StructVector(")
    sb.WriteString("f1=")
    if s.F1 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F1)), 10) + "][")
        for _, v := range s.F1 {
            if first { sb.WriteString("") } else { sb.WriteString(",") }
            sb.WriteString(strconv.FormatUint(uint64(v), 10))
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString("f1=[0][]")
    }
    sb.WriteString(",f2=")
    if s.F2 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F2)), 10) + "][")
        for _, v := range s.F2 {
            if v != nil { 
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString(strconv.FormatUint(uint64(*v), 10))
            } else {
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("null")
            }
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f2=[0][]")
    }
    sb.WriteString(",f3=")
    if s.F3 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F3)), 10) + "][")
        for _, v := range s.F3 {
            if v != nil { 
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("bytes[" + strconv.FormatInt(int64(len(v)), 10) + "]")
            } else {
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("null")
            }
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f3=[0][]")
    }
    sb.WriteString(",f4=")
    if s.F4 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F4)), 10) + "][")
        for _, v := range s.F4 {
            if v != nil { 
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("bytes[" + strconv.FormatInt(int64(len(*v)), 10) + "]")
            } else {
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("null")
            }
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f4=[0][]")
    }
    sb.WriteString(",f5=")
    if s.F5 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F5)), 10) + "][")
        for _, v := range s.F5 {
            if first { sb.WriteString("") } else { sb.WriteString(",") }
            sb.WriteString(v.String())
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f5=[0][]")
    }
    sb.WriteString(",f6=")
    if s.F6 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F6)), 10) + "][")
        for _, v := range s.F6 {
            if v != nil { 
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString(v.String())
            } else {
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("null")
            }
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f6=[0][]")
    }
    sb.WriteString(",f7=")
    if s.F7 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F7)), 10) + "][")
        for _, v := range s.F7 {
            if first { sb.WriteString("") } else { sb.WriteString(",") }
            sb.WriteString(v.String())
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f7=[0][]")
    }
    sb.WriteString(",f8=")
    if s.F8 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F8)), 10) + "][")
        for _, v := range s.F8 {
            if v != nil { 
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString(v.String())
            } else {
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("null")
            }
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f8=[0][]")
    }
    sb.WriteString(",f9=")
    if s.F9 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F9)), 10) + "][")
        for _, v := range s.F9 {
            if first { sb.WriteString("") } else { sb.WriteString(",") }
            sb.WriteString(v.String())
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f9=[0][]")
    }
    sb.WriteString(",f10=")
    if s.F10 != nil {
        first := true
        sb.WriteString("[" + strconv.FormatInt(int64(len(s.F10)), 10) + "][")
        for _, v := range s.F10 {
            if v != nil { 
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString(v.String())
            } else {
                if first { sb.WriteString("") } else { sb.WriteString(",") }
                sb.WriteString("null")
            }
            first = false
        }
        sb.WriteString("]")
    } else {
        sb.WriteString(",f10=[0][]")
    }
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *StructVector) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
