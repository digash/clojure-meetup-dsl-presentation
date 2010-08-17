(do
  (definterface
    PacketHeaderAccessor
    (^{:tag java.math.BigInteger} getSequenceNumber
     []
       "The sequence number of the first message in the packet.\n    If the packet contains more than one message,\n    subsequent message sequence numbers are derived implicitly.")
    (^{:tag java.lang.Integer} lengthSequenceNumber
     []
       "Lenght of field in the message in bytes.")
    (^{:tag java.lang.Integer} offsetSequenceNumber
     []
       "Offset of field in the message.")
    (^{:tag java.lang.Integer} positionSequenceNumber
     []
       "Position of field in the buffer.")
    (^{:tag java.lang.Integer} getMessageCount
     []
       "The number of message blocks contained in the packet.")
    (^{:tag java.lang.Integer} lengthMessageCount
     []
       "Lenght of field in the message in bytes.")
    (^{:tag java.lang.Integer} offsetMessageCount
     []
       "Offset of field in the message.")
    (^{:tag java.lang.Integer} positionMessageCount
     []
       "Position of field in the buffer.")
    (^{:tag java.lang.Long} getSessionIdentifier
     []
       "Number of the current daily session.\n    This field will begin as 0 and increment thereafter\n    if the feed is restarted during the trading day.")
    (^{:tag java.lang.Integer} lengthSessionIdentifier
     []
       "Lenght of field in the message in bytes.")
    (^{:tag java.lang.Integer} offsetSessionIdentifier
     []
       "Offset of field in the message.")
    (^{:tag java.lang.Integer} positionSessionIdentifier
     []
       "Position of field in the buffer.")
    (defrecord
      PacketHeader
      [buffer offset]
      Sizable
      (length [this] 16)
      PacketHeaderAccessor
      (getSequenceNumber
       [this]
       (parse-numeric buffer (+ (int offset) (int 0)) 8))
      (lengthSequenceNumber [this] 8)
      (offsetSequenceNumber [this] 0)
      (positionSequenceNumber [this] (+ offset 0))
      (getMessageCount
       [this]
       (parse-numeric buffer (+ (int offset) (int 8)) 2))
      (lengthMessageCount [this] 2)
      (offsetMessageCount [this] 8)
      (positionMessageCount [this] (+ offset 8))
      (getSessionIdentifier
       [this]
       (parse-alphanumeric buffer (+ (int offset) (int 10)) 1))
      (lengthSessionIdentifier [this] 1)
      (offsetSessionIdentifier [this] 10)
      (positionSessionIdentifier [this] (+ offset 10)))
    (deftype
      PacketHeaderParser
      []
      Parsable
      (parse [this buffer offset] (new PacketHeader buffer offset)))
    (.addMethod code-dispatch PacketHeader pprint-message)
    (.addMethod simple-dispatch PacketHeader pprint-message))