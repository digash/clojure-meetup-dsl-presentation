(defmmap MarketDataMmap
  [Timestamp       8 :integer]
  [QuoteTime       8 :integer]
  [TradeTime       8 :integer]
  [QuoteCondition  4 :character]
  [TradeCondition  4 :character]
  [Bid             4 :decimal]
  [Ask             4 :decimal]
  [Last            4 :decimal]
  [BidSize         4 :integer]
  [AskSize         4 :integer]
  [LastSize        4 :integer]
  [Vwap            4 :decimal]
  [Condition       1 :character]
  [TotalAmount     8 :integer]
  [Volume          4 :integer]
  [Currency        3 :character]
  [Latency         8 :integer]
  [InternalLatency 8 :integer]
  [Symbol         12 :string])