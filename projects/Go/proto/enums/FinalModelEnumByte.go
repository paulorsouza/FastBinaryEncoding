// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumByte final model
type FinalModelEnumByte struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new final model
func NewFinalModelEnumByte(buffer *fbe.Buffer, offset int) *FinalModelEnumByte {
    return &FinalModelEnumByte{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelEnumByte) FBEAllocationSize(value *EnumByte) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelEnumByte) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelEnumByte) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelEnumByte) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelEnumByte) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelEnumByte) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelEnumByte) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelEnumByte) Get() (*EnumByte, int, error) {
    var value EnumByte
    size, err := fm.GetValueDefault(&value, EnumByte(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelEnumByte) GetDefault(defaults EnumByte) (*EnumByte, int, error) {
    var value EnumByte
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelEnumByte) GetValue(value *EnumByte) (int, error) {
    return fm.GetValueDefault(value, EnumByte(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelEnumByte) GetValueDefault(value *EnumByte, defaults EnumByte) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = EnumByte(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelEnumByte) Set(value *EnumByte) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelEnumByte) SetValue(value EnumByte) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return fm.FBESize(), nil
}
