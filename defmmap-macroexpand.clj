(do
 (definterface
     MarketDataMmapAccessable
     (^{:tag java.lang.Long} getTimestamp
             [^{:tag java.nio.ByteBuffer} buffer
             ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} getTimestamp
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Long} putTimestamp
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} putTimestamp
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value])
   (^{:tag java.lang.Integer} lengthTimestamp
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetTimestamp
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionTimestamp
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Long} getQuoteTime
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} getQuoteTime
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Long} putQuoteTime
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} putQuoteTime
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value])
   (^{:tag java.lang.Integer} lengthQuoteTime
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetQuoteTime
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionQuoteTime
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Long} getTradeTime
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} getTradeTime
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Long} putTradeTime
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} putTradeTime
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value])
   (^{:tag java.lang.Integer} lengthTradeTime
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetTradeTime
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionTradeTime
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Object} getQuoteCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} getQuoteCondition
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Object} putQuoteCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} putQuoteCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value])
   (^{:tag java.lang.Integer} lengthQuoteCondition
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetQuoteCondition
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionQuoteCondition
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Object} getTradeCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} getTradeCondition
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Object} putTradeCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} putTradeCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value])
   (^{:tag java.lang.Integer} lengthTradeCondition
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetTradeCondition
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionTradeCondition
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Float} getBid
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} getBid
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Float} putBid
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} putBid
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value])
   (^{:tag java.lang.Integer} lengthBid
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetBid
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionBid
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Float} getAsk
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} getAsk
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Float} putAsk
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} putAsk
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value])
   (^{:tag java.lang.Integer} lengthAsk
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetAsk
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionAsk
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Float} getLast
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} getLast
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Float} putLast
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} putLast
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value])
   (^{:tag java.lang.Integer} lengthLast
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetLast
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionLast
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Integer} getBidSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} getBidSize
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Integer} putBidSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} putBidSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value])
   (^{:tag java.lang.Integer} lengthBidSize
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetBidSize
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionBidSize
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Integer} getAskSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} getAskSize
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Integer} putAskSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} putAskSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value])
   (^{:tag java.lang.Integer} lengthAskSize
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetAskSize
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionAskSize
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Integer} getLastSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} getLastSize
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Integer} putLastSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} putLastSize
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value])
   (^{:tag java.lang.Integer} lengthLastSize
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetLastSize
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionLastSize
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Float} getVwap
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} getVwap
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Float} putVwap
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Float} putVwap
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Float} value])
   (^{:tag java.lang.Integer} lengthVwap
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetVwap
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionVwap
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Object} getCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} getCondition
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Object} putCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} putCondition
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value])
   (^{:tag java.lang.Integer} lengthCondition
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetCondition
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionCondition
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Long} getTotalAmount
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} getTotalAmount
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Long} putTotalAmount
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} putTotalAmount
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value])
   (^{:tag java.lang.Integer} lengthTotalAmount
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetTotalAmount
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionTotalAmount
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Integer} getVolume
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} getVolume
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Integer} putVolume
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Integer} putVolume
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} value])
   (^{:tag java.lang.Integer} lengthVolume
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetVolume
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionVolume
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Object} getCurrency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} getCurrency
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Object} putCurrency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Object} putCurrency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Object} value])
   (^{:tag java.lang.Integer} lengthCurrency
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetCurrency
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionCurrency
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Long} getLatency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} getLatency
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Long} putLatency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} putLatency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value])
   (^{:tag java.lang.Integer} lengthLatency
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetLatency
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionLatency
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.Long} getInternalLatency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} getInternalLatency
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.Long} putInternalLatency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.Long} putInternalLatency
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Long} value])
   (^{:tag java.lang.Integer} lengthInternalLatency
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetInternalLatency
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionInternalLatency
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer.")
   (^{:tag java.lang.String} getSymbol
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.String} getSymbol
           [^{:tag java.nio.ByteBuffer} buffer])
   (^{:tag java.lang.String} putSymbol
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.String} value
           ^{:tag java.lang.Integer} offset])
   (^{:tag java.lang.String} putSymbol
           [^{:tag java.nio.ByteBuffer} buffer
           ^{:tag java.lang.String} value])
   (^{:tag java.lang.Integer} lengthSymbol
           []
           "Lenght of field in the message in bytes.")
   (^{:tag java.lang.Integer} offsetSymbol
           []
           "Offset of field in the message.")
   (^{:tag java.lang.Integer} positionSymbol
           [^{:tag java.lang.Integer} offset]
           "Position of field in the buffer."))
 (defrecord
  MarketDataMmapAccessor
     []
   Sizable
   (length [this] 104)
   MarketDataMmapAccessable
   (getTimestamp
    [this buffer offset]
    (.position buffer (+ (int offset) (int 0)))
    (.getLong buffer))
   (getTimestamp [this buffer] (. this getTimestamp buffer 0))
   (putTimestamp
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 0)))
    (let [value value] (.putLong buffer value) value))
   (putTimestamp
    [this buffer value]
    (. this putTimestamp buffer value 0))
   (lengthTimestamp [this] 8)
   (offsetTimestamp [this] 0)
   (positionTimestamp [this offset] (+ offset 0))
   (getQuoteTime
    [this buffer offset]
    (.position buffer (+ (int offset) (int 8)))
    (.getLong buffer))
   (getQuoteTime [this buffer] (. this getQuoteTime buffer 0))
   (putQuoteTime
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 8)))
    (let [value value] (.putLong buffer value) value))
   (putQuoteTime
    [this buffer value]
    (. this putQuoteTime buffer value 0))
   (lengthQuoteTime [this] 8)
   (offsetQuoteTime [this] 8)
   (positionQuoteTime [this offset] (+ offset 8))
   (getTradeTime
    [this buffer offset]
    (.position buffer (+ (int offset) (int 16)))
    (.getLong buffer))
   (getTradeTime [this buffer] (. this getTradeTime buffer 0))
   (putTradeTime
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 16)))
    (let [value value] (.putLong buffer value) value))
   (putTradeTime
    [this buffer value]
    (. this putTradeTime buffer value 0))
   (lengthTradeTime [this] 8)
   (offsetTradeTime [this] 16)
   (positionTradeTime [this offset] (+ offset 16))
   (getQuoteCondition
    [this buffer offset]
    (.position buffer (+ (int offset) (int 24)))
    (let [a__2805__auto__ (byte-array 4)]
         (.get buffer a__2805__auto__)
         (java.lang.String. a__2805__auto__)))
   (getQuoteCondition
    [this buffer]
    (. this getQuoteCondition buffer 0))
   (putQuoteCondition
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 24)))
    (let [value value]
         (let [^{:tag java.lang.String} v__2809__auto__ value
              a__2810__auto__ (.getBytes v__2809__auto__ "ISO-8859-1")]
              (.put
               buffer
               a__2810__auto__
               0
               (min 4 (alength a__2810__auto__))))
         value))
   (putQuoteCondition
    [this buffer value]
    (. this putQuoteCondition buffer value 0))
   (lengthQuoteCondition [this] 4)
   (offsetQuoteCondition [this] 24)
   (positionQuoteCondition [this offset] (+ offset 24))
   (getTradeCondition
    [this buffer offset]
    (.position buffer (+ (int offset) (int 28)))
    (let [a__2805__auto__ (byte-array 4)]
         (.get buffer a__2805__auto__)
         (java.lang.String. a__2805__auto__)))
   (getTradeCondition
    [this buffer]
    (. this getTradeCondition buffer 0))
   (putTradeCondition
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 28)))
    (let [value value]
         (let [^{:tag java.lang.String} v__2809__auto__ value
              a__2810__auto__ (.getBytes v__2809__auto__ "ISO-8859-1")]
              (.put
               buffer
               a__2810__auto__
               0
               (min 4 (alength a__2810__auto__))))
         value))
   (putTradeCondition
    [this buffer value]
    (. this putTradeCondition buffer value 0))
   (lengthTradeCondition [this] 4)
   (offsetTradeCondition [this] 28)
   (positionTradeCondition [this offset] (+ offset 28))
   (getBid
    [this buffer offset]
    (.position buffer (+ (int offset) (int 32)))
    (.getFloat buffer))
   (getBid [this buffer] (. this getBid buffer 0))
   (putBid
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 32)))
    (let [value value] (.putFloat buffer value) value))
   (putBid [this buffer value] (. this putBid buffer value 0))
   (lengthBid [this] 4)
   (offsetBid [this] 32)
   (positionBid [this offset] (+ offset 32))
   (getAsk
    [this buffer offset]
    (.position buffer (+ (int offset) (int 36)))
    (.getFloat buffer))
   (getAsk [this buffer] (. this getAsk buffer 0))
   (putAsk
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 36)))
    (let [value value] (.putFloat buffer value) value))
   (putAsk [this buffer value] (. this putAsk buffer value 0))
   (lengthAsk [this] 4)
   (offsetAsk [this] 36)
   (positionAsk [this offset] (+ offset 36))
   (getLast
    [this buffer offset]
    (.position buffer (+ (int offset) (int 40)))
    (.getFloat buffer))
   (getLast [this buffer] (. this getLast buffer 0))
   (putLast
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 40)))
    (let [value value] (.putFloat buffer value) value))
   (putLast [this buffer value] (. this putLast buffer value 0))
   (lengthLast [this] 4)
   (offsetLast [this] 40)
   (positionLast [this offset] (+ offset 40))
   (getBidSize
    [this buffer offset]
    (.position buffer (+ (int offset) (int 44)))
    (.getInt buffer))
   (getBidSize [this buffer] (. this getBidSize buffer 0))
   (putBidSize
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 44)))
    (let [value value] (.putInt buffer value) value))
   (putBidSize [this buffer value] (. this putBidSize buffer value 0))
   (lengthBidSize [this] 4)
   (offsetBidSize [this] 44)
   (positionBidSize [this offset] (+ offset 44))
   (getAskSize
    [this buffer offset]
    (.position buffer (+ (int offset) (int 48)))
    (.getInt buffer))
   (getAskSize [this buffer] (. this getAskSize buffer 0))
   (putAskSize
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 48)))
    (let [value value] (.putInt buffer value) value))
   (putAskSize [this buffer value] (. this putAskSize buffer value 0))
   (lengthAskSize [this] 4)
   (offsetAskSize [this] 48)
   (positionAskSize [this offset] (+ offset 48))
   (getLastSize
    [this buffer offset]
    (.position buffer (+ (int offset) (int 52)))
    (.getInt buffer))
   (getLastSize [this buffer] (. this getLastSize buffer 0))
   (putLastSize
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 52)))
    (let [value value] (.putInt buffer value) value))
   (putLastSize
    [this buffer value]
    (. this putLastSize buffer value 0))
   (lengthLastSize [this] 4)
   (offsetLastSize [this] 52)
   (positionLastSize [this offset] (+ offset 52))
   (getVwap
    [this buffer offset]
    (.position buffer (+ (int offset) (int 56)))
    (.getFloat buffer))
   (getVwap [this buffer] (. this getVwap buffer 0))
   (putVwap
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 56)))
    (let [value value] (.putFloat buffer value) value))
   (putVwap [this buffer value] (. this putVwap buffer value 0))
   (lengthVwap [this] 4)
   (offsetVwap [this] 56)
   (positionVwap [this offset] (+ offset 56))
   (getCondition
    [this buffer offset]
    (.position buffer (+ (int offset) (int 60)))
    (let [a__2805__auto__ (byte-array 1)]
         (.get buffer a__2805__auto__)
         (java.lang.String. a__2805__auto__)))
   (getCondition [this buffer] (. this getCondition buffer 0))
   (putCondition
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 60)))
    (let [value value]
         (let [^{:tag java.lang.String} v__2809__auto__ value
              a__2810__auto__ (.getBytes v__2809__auto__ "ISO-8859-1")]
              (.put
               buffer
               a__2810__auto__
               0
               (min 1 (alength a__2810__auto__))))
         value))
   (putCondition
    [this buffer value]
    (. this putCondition buffer value 0))
   (lengthCondition [this] 1)
   (offsetCondition [this] 60)
   (positionCondition [this offset] (+ offset 60))
   (getTotalAmount
    [this buffer offset]
    (.position buffer (+ (int offset) (int 61)))
    (.getLong buffer))
   (getTotalAmount [this buffer] (. this getTotalAmount buffer 0))
   (putTotalAmount
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 61)))
    (let [value value] (.putLong buffer value) value))
   (putTotalAmount
    [this buffer value]
    (. this putTotalAmount buffer value 0))
   (lengthTotalAmount [this] 8)
   (offsetTotalAmount [this] 61)
   (positionTotalAmount [this offset] (+ offset 61))
   (getVolume
    [this buffer offset]
    (.position buffer (+ (int offset) (int 69)))
    (.getInt buffer))
   (getVolume [this buffer] (. this getVolume buffer 0))
   (putVolume
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 69)))
    (let [value value] (.putInt buffer value) value))
   (putVolume [this buffer value] (. this putVolume buffer value 0))
   (lengthVolume [this] 4)
   (offsetVolume [this] 69)
   (positionVolume [this offset] (+ offset 69))
   (getCurrency
    [this buffer offset]
    (.position buffer (+ (int offset) (int 73)))
    (let [a__2805__auto__ (byte-array 3)]
         (.get buffer a__2805__auto__)
         (java.lang.String. a__2805__auto__)))
   (getCurrency [this buffer] (. this getCurrency buffer 0))
   (putCurrency
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 73)))
    (let [value value]
         (let [^{:tag java.lang.String} v__2809__auto__ value
              a__2810__auto__ (.getBytes v__2809__auto__ "ISO-8859-1")]
              (.put
               buffer
               a__2810__auto__
               0
               (min 3 (alength a__2810__auto__))))
         value))
   (putCurrency
    [this buffer value]
    (. this putCurrency buffer value 0))
   (lengthCurrency [this] 3)
   (offsetCurrency [this] 73)
   (positionCurrency [this offset] (+ offset 73))
   (getLatency
    [this buffer offset]
    (.position buffer (+ (int offset) (int 76)))
    (.getLong buffer))
   (getLatency [this buffer] (. this getLatency buffer 0))
   (putLatency
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 76)))
    (let [value value] (.putLong buffer value) value))
   (putLatency [this buffer value] (. this putLatency buffer value 0))
   (lengthLatency [this] 8)
   (offsetLatency [this] 76)
   (positionLatency [this offset] (+ offset 76))
   (getInternalLatency
    [this buffer offset]
    (.position buffer (+ (int offset) (int 84)))
    (.getLong buffer))
   (getInternalLatency
    [this buffer]
    (. this getInternalLatency buffer 0))
   (putInternalLatency
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 84)))
    (let [value value] (.putLong buffer value) value))
   (putInternalLatency
    [this buffer value]
    (. this putInternalLatency buffer value 0))
   (lengthInternalLatency [this] 8)
   (offsetInternalLatency [this] 84)
   (positionInternalLatency [this offset] (+ offset 84))
   (getSymbol
    [this buffer offset]
    (.position buffer (+ (int offset) (int 92)))
    (let [b__2806__auto__ (take-while
                           (complement zero?)
                           (repeatedly 12 #(.get buffer)))]
                           (java.lang.String. (byte-array b__2806__auto__))))
   (getSymbol [this buffer] (. this getSymbol buffer 0))
   (putSymbol
    [this buffer value offset]
    (.position buffer (+ (int offset) (int 92)))
    (let [value value]
         (let [^{:tag java.lang.String} v__2811__auto__ value
              a__2812__auto__ (.getBytes v__2811__auto__ "ISO-8859-1")]
              (.put
               buffer
               a__2812__auto__
               0
               (min 11 (alength a__2812__auto__)))
              (.put buffer (byte 0)))
         value))
   (putSymbol [this buffer value] (. this putSymbol buffer value 0))
   (lengthSymbol [this] 12)
   (offsetSymbol [this] 92)
   (positionSymbol [this offset] (+ offset 92)))
  (def ^{:tag MarketDataMmapAccessor} MarketDataMmap (new MarketDataMmapAccessor))
  (.addMethod code-dispatch MarketDataMmapAccessor pprint-record)
  (.addMethod simple-dispatch MarketDataMmapAccessor pprint-record))