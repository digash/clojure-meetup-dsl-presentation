(defmessage PacketHeader
  [SequenceNumber    8 :numeric
   "The sequence number of the first message in the packet.
    If the packet contains more than one message,
    subsequent message sequence numbers are derived implicitly."]
  [MessageCount      2 :numeric
   "The number of message blocks contained in the packet."]
  [SessionIdentifier 1 :alphanumeric
   "Number of the current daily session.
    This field will begin as 0 and increment thereafter
    if the feed is restarted during the trading day."])
