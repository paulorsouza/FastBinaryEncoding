// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.2.0.0

/**
 * Universally unique identifier (UUID)
 * A universally unique identifier (UUID) is an identifier standard used
 * in software construction. This implementation generates the following
 * UUID types:
 * - Nil UUID0 (all bits set to zero)
 * - Sequential UUID1 (time based version)
 * - Random UUID4 (randomly or pseudo-randomly generated version)
 *
 * A UUID is simply a 128-bit value: "123e4567-e89b-12d3-a456-426655440000"
 *
 * https://en.wikipedia.org/wiki/Universally_unique_identifier
 * https://www.ietf.org/rfc/rfc4122.txt
 */
class UUID {
  /**
   * Initialize a new UUID instance from the provided source or create nil UUID if the source is not provided
   * @param {string|Uint8Array|UUID} value Source value
   * @constructor
   */
  constructor (value = undefined) {
    if (value == null) {
      this.data = new Uint8Array(16)
    } else if ((value instanceof Array) || (value instanceof Uint8Array)) {
      this.data = UUID.fromBytes(value).data.slice()
    } else if ((typeof value === 'string') || (value instanceof String)) {
      this.data = UUID.fromString(value).data.slice()
    } else if (value instanceof UUID) {
      this.data = value.data.slice()
    } else {
      throw new Error('Unsupported UUID base type ' + (typeof value))
    }
  }

  /**
   * Is the specified object UUID?
   * @param obj Object to check
   * @returns {!boolean}
   */
  static isUUID (obj) {
    return (obj && obj['__isUUID__']) === true
  }

  /**
   * Returns UUID from its bytes representation
   * @param {!Array.<number>|!Uint8Array} bytes Byte representation
   * @returns {!UUID} The corresponding UUID value
   */
  static fromBytes (bytes) {
    let result = new UUID()
    for (let i = 0; i < bytes.length; i++) {
      result.data[i] = bytes[i] & 0xFF
    }
    return result
  }

  /**
   * Returns UUID representing using its separate parts
   * @param {number} timeLow The low field of the timestamp (32-bit)
   * @param {number} timeMid The middle field of the timestamp (16-bit)
   * @param {number} timeHiAndVersion The high field of the timestamp multiplexed with the version number (16-bit)
   * @param {number} clockSeqHiAndReserved The high field of the clock sequence multiplexed with the variant (8-bit)
   * @param {number} clockSeqLow The low field of the clock sequence (8-bit)
   * @param {number} nodeLow The low field of the spatially unique node identifier (32-bit)
   * @param {number} nodeMid The middle field of the spatially unique node identifier (8-bit)
   * @param {number} nodeHi The high field of the spatially unique node identifier (8-bit)
   * @returns {!UUID} The corresponding UUID value
   */
  static fromParts (timeLow, timeMid, timeHiAndVersion, clockSeqHiAndReserved, clockSeqLow, nodeLow, nodeMid, nodeHi) {
    let result = new UUID()
    result.data[0] = (timeLow >>> 24)
    result.data[1] = (timeLow >>> 16)
    result.data[2] = (timeLow >>> 8)
    result.data[3] = (timeLow & 0xFF)
    result.data[4] = (timeMid >>> 8)
    result.data[5] = (timeMid & 0xFF)
    result.data[6] = (timeHiAndVersion >>> 8)
    result.data[7] = (timeHiAndVersion & 0xFF)
    result.data[8] = (clockSeqHiAndReserved & 0xFF)
    result.data[9] = (clockSeqLow & 0xFF)
    result.data[10] = (nodeLow >>> 24)
    result.data[11] = (nodeLow >>> 16)
    result.data[12] = (nodeLow >>> 8)
    result.data[13] = (nodeLow & 0xFF)
    result.data[14] = (nodeMid & 0xFF)
    result.data[15] = (nodeHi & 0xFF)
    return result
  }

  /**
   * Returns UUID representation of the given string
   * @param {string} str The textual representation of the UUID
   * @returns {!UUID} The corresponding UUID value
   */
  static fromString (str) {
    if (str.length === 0) {
      throw new Error('Empty string!')
    }
    let result = new UUID()
    str = str.replace(/[{}-]/g, '')
    for (let i = 0; i < str.length; i++) {
      result.data[i] = parseInt(str.substr(i * 2, 2), 16)
    }
    return result
  }

  /**
   * Generate nil UUID0 (all bits set to zero)
   * @returns {!UUID}
   */
  static nil () {
    return new UUID()
  }

  /**
   * Generate sequential UUID1 (time based version)
   * @returns {!UUID}
   */
  static sequential () {
    let now = new Date().getTime()
    let sequence = Math.floor(Math.random() * TWO_POW_14)
    let nodeHi = Math.floor(Math.random() * TWO_POW_8)
    let nodeMid = Math.floor(Math.random() * TWO_POW_8)
    let nodeLow = Math.floor(Math.random() * TWO_POW_32)
    let tick = Math.floor(Math.random() * TWO_POW_4)
    let timestamp = 0
    let timestampRatio = 1 / 4

    if (now !== timestamp) {
      if (now < timestamp) {
        sequence++
      }
      timestamp = now
      tick = Math.floor(Math.random() * TWO_POW_4)
    } else if ((Math.random() < timestampRatio) && (tick < 9984)) {
      tick += 1 + Math.floor(Math.random() * TWO_POW_4)
    } else {
      sequence++
    }

    let ts = timestamp - Date.UTC(1582, 9, 15)
    let hm = ((ts / 0x100000000) * 10000) & 0xFFFFFFF
    let tl = ((ts & 0xFFFFFFF) * 10000) % 0x100000000 + tick
    let thav = (hm >>> 16 & 0xFFF) | 0x1000

    sequence &= 0x3FFF
    let cshar = (sequence >>> 8) | 0x80
    let csl = sequence & 0xFF

    return UUID.fromParts(tl, hm & 0xFFFF, thav, cshar, csl, nodeLow, nodeMid, nodeHi)
  }

  /**
   * Generate random UUID4 (randomly or pseudo-randomly generated version)
   * @returns {!UUID}
   */
  static random () {
    return UUID.fromParts(
      Math.floor(Math.random() * TWO_POW_32),
      Math.floor(Math.random() * TWO_POW_16),
      0x4000 | Math.floor(Math.random() * TWO_POW_12),
      0x80 | Math.floor(Math.random() * TWO_POW_6),
      Math.floor(Math.random() * TWO_POW_8),
      Math.floor(Math.random() * TWO_POW_32),
      Math.floor(Math.random() * TWO_POW_8),
      Math.floor(Math.random() * TWO_POW_8)
    )
  }

  /**
   * Converts the UUID to its bytes representation
   * @this {!UUID}
   * @returns {!Array.<number>} Bytes representation
   */
  toBytes () {
    let result = []
    for (let i = 0; i < this.data.length; i++) {
      result.push(this.data[i])
    }
    return result
  }

  /**
   * Converts the UUID to string representation in format 'XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX'
   * @this {!UUID}
   * @returns {string} Result string
   */
  toString () {
    let result = ''
    for (let i = 0; i < this.data.length; i++) {
      result += (this.data[i] >>> 4).toString(16)
      result += (this.data[i] & 0xF).toString(16)
      if ((i === 3) || (i === 5) || (i === 7) || (i === 9)) {
        result += '-'
      }
    }
    return result
  }

  /**
   * Is this value equal to other one?
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {boolean} Equal result
   */
  eq (other) {
    if (!UUID.isUUID(other)) {
      return false
    }
    for (let i = 0; i < this.data.length; i++) {
      if (this.data[i] !== other.data[i]) {
        return false
      }
    }
    return true
  }

  /**
   * Is this value not equal to other one?
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {boolean} Not equal result
   */
  ne (other) {
    return !this.eq(other)
  }

  /**
   * Is this value less than other one?
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {boolean} Less than result
   */
  lt (other) {
    return this.cmp(other) < 0
  }

  /**
   * Is this value less than or equal other one?
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {boolean} Less than or equal result
   */
  lte (other) {
    return this.cmp(other) <= 0
  }

  /**
   * Is this value greater than other one?
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {boolean} Greater than result
   */
  gt (other) {
    return this.cmp(other) > 0
  }

  /**
   * Is this value greater than or equal other one?
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {boolean} Greater than or equal result
   */
  gte (other) {
    return this.cmp(other) >= 0
  }

  /**
   * Compare this value to other one
   * @this {UUID}
   * @param {UUID} other Other value
   * @returns {number} 0 if they are the same, 1 if the this is greater and -1 if the given one is greater
   */
  cmp (other) {
    if (!UUID.isUUID(other)) {
      return 1
    }
    for (let i = 0; i < this.data.length; i++) {
      let diff = this.data[i] - other.data[i]
      if (diff !== 0) {
        return diff
      }
    }
    return 0
  }
}

Object.defineProperty(UUID.prototype, '__isUUID__', { value: true })

// UUID internal constants
const TWO_POW_32 = 4294967296
const TWO_POW_16 = 65536
const TWO_POW_14 = 16384
const TWO_POW_12 = 4096
const TWO_POW_8 = 256
const TWO_POW_6 = 64
const TWO_POW_4 = 16

exports.UUID = UUID
