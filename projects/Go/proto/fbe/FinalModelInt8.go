// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.2.0.0

package fbe

import "errors"

// Fast Binary Encoding Int8 final model
type FinalModelInt8 struct {
    // Final model buffer
    buffer *Buffer
    // Final model buffer offset
    offset int
}

// Create a new Int8 final model
func NewFinalModelInt8(buffer *Buffer, offset int) *FinalModelInt8 {
    return &FinalModelInt8{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelInt8) FBEAllocationSize(value int8) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelInt8) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelInt8) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelInt8) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelInt8) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelInt8) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelInt8) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelInt8) Get() (int8, int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, 0, errors.New("model is broken")
    }

    return ReadInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()), fm.FBESize(), nil
}

// Set the value
func (fm *FinalModelInt8) Set(value int8) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    WriteInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), value)
    return fm.FBESize(), nil
}
