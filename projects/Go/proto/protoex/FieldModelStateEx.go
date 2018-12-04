// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

package protoex

import "errors"
import "../fbe"

// Fast Binary Encoding StateEx field model
type FieldModelStateEx struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int
}

// Create a new field model
func NewFieldModelStateEx(buffer *fbe.Buffer, offset int) *FieldModelStateEx {
    return &FieldModelStateEx{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelStateEx) FBESize() int { return 1 }
// Get the field extra size
func (fm *FieldModelStateEx) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelStateEx) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelStateEx) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelStateEx) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelStateEx) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelStateEx) Verify() bool { return true }

// Get the value
func (fm *FieldModelStateEx) Get() (*StateEx, error) {
    var value StateEx
    return &value, fm.GetValueDefault(&value, StateEx(0))
}

// Get the value with provided default value
func (fm *FieldModelStateEx) GetDefault(defaults StateEx) (*StateEx, error) {
    var value StateEx
    err := fm.GetValueDefault(&value, defaults)
    return &value, err
}

// Get the value by the given pointer
func (fm *FieldModelStateEx) GetValue(value *StateEx) error {
    return fm.GetValueDefault(value, StateEx(0))
}

// Get the value by the given pointer with provided default value
func (fm *FieldModelStateEx) GetValueDefault(value *StateEx, defaults StateEx) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return nil
    }

    *value = StateEx(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return nil
}

// Set the value by the given pointer
func (fm *FieldModelStateEx) Set(value *StateEx) error {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FieldModelStateEx) SetValue(value StateEx) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return nil
}
