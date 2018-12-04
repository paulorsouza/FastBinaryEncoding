// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.1.0.0

package proto

import "errors"
import "../fbe"

// Fast Binary Encoding State final model
type FinalModelState struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new final model
func NewFinalModelState(buffer *fbe.Buffer, offset int) *FinalModelState {
    return &FinalModelState{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelState) FBEAllocationSize(value *State) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelState) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelState) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelState) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelState) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelState) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelState) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelState) Get() (*State, int, error) {
    var value State
    size, err := fm.GetValueDefault(&value, State(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelState) GetDefault(defaults State) (*State, int, error) {
    var value State
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelState) GetValue(value *State) (int, error) {
    return fm.GetValueDefault(value, State(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelState) GetValueDefault(value *State, defaults State) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = State(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelState) Set(value *State) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelState) SetValue(value State) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return fm.FBESize(), nil
}
