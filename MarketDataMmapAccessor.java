public final class com.picotrading.tech.madase.mmap.MarketDataMmapAccessor extends Object implements com.picotrading.tech.madase.mmap.MarketDataMmapAccessable,com.picotrading.tech.madase.record.Sizable,clojure.lang.IObj,clojure.lang.ILookup,clojure.lang.IKeywordLookup,clojure.lang.IPersistentMap,java.util.Map,java.io.Serializable{
    public com.picotrading.tech.madase.mmap.MarketDataMmapAccessor(Object, Object);
    public com.picotrading.tech.madase.mmap.MarketDataMmapAccessor();
    public Object length();
    public Integer positionSymbol(Integer);
    public Integer offsetSymbol();
    public Integer lengthSymbol();
    public String putSymbol(java.nio.ByteBuffer, String);
    public String putSymbol(java.nio.ByteBuffer, String, Integer);
    public String getSymbol(java.nio.ByteBuffer);
    public String getSymbol(java.nio.ByteBuffer, Integer);
    public Integer positionInternalLatency(Integer);
    public Integer offsetInternalLatency();
    public Integer lengthInternalLatency();
    public Long putInternalLatency(java.nio.ByteBuffer, Long);
    public Long putInternalLatency(java.nio.ByteBuffer, Long, Integer);
    public Long getInternalLatency(java.nio.ByteBuffer);
    public Long getInternalLatency(java.nio.ByteBuffer, Integer);
    public Integer positionLatency(Integer);
    public Integer offsetLatency();
    public Integer lengthLatency();
    public Long putLatency(java.nio.ByteBuffer, Long);
    public Long putLatency(java.nio.ByteBuffer, Long, Integer);
    public Long getLatency(java.nio.ByteBuffer);
    public Long getLatency(java.nio.ByteBuffer, Integer);
    public Integer positionCurrency(Integer);
    public Integer offsetCurrency();
    public Integer lengthCurrency();
    public Object putCurrency(java.nio.ByteBuffer, Object);
    public Object putCurrency(java.nio.ByteBuffer, Object, Integer);
    public Object getCurrency(java.nio.ByteBuffer);
    public Object getCurrency(java.nio.ByteBuffer, Integer);
    public Integer positionVolume(Integer);
    public Integer offsetVolume();
    public Integer lengthVolume();
    public Integer putVolume(java.nio.ByteBuffer, Integer);
    public Integer putVolume(java.nio.ByteBuffer, Integer, Integer);
    public Integer getVolume(java.nio.ByteBuffer);
    public Integer getVolume(java.nio.ByteBuffer, Integer);
    public Integer positionTotalAmount(Integer);
    public Integer offsetTotalAmount();
    public Integer lengthTotalAmount();
    public Long putTotalAmount(java.nio.ByteBuffer, Long);
    public Long putTotalAmount(java.nio.ByteBuffer, Long, Integer);
    public Long getTotalAmount(java.nio.ByteBuffer);
    public Long getTotalAmount(java.nio.ByteBuffer, Integer);
    public Integer positionCondition(Integer);
    public Integer offsetCondition();
    public Integer lengthCondition();
    public Object putCondition(java.nio.ByteBuffer, Object);
    public Object putCondition(java.nio.ByteBuffer, Object, Integer);
    public Object getCondition(java.nio.ByteBuffer);
    public Object getCondition(java.nio.ByteBuffer, Integer);
    public Integer positionVwap(Integer);
    public Integer offsetVwap();
    public Integer lengthVwap();
    public Float putVwap(java.nio.ByteBuffer, Float);
    public Float putVwap(java.nio.ByteBuffer, Float, Integer);
    public Float getVwap(java.nio.ByteBuffer);
    public Float getVwap(java.nio.ByteBuffer, Integer);
    public Integer positionLastSize(Integer);
    public Integer offsetLastSize();
    public Integer lengthLastSize();
    public Integer putLastSize(java.nio.ByteBuffer, Integer);
    public Integer putLastSize(java.nio.ByteBuffer, Integer, Integer);
    public Integer getLastSize(java.nio.ByteBuffer);
    public Integer getLastSize(java.nio.ByteBuffer, Integer);
    public Integer positionAskSize(Integer);
    public Integer offsetAskSize();
    public Integer lengthAskSize();
    public Integer putAskSize(java.nio.ByteBuffer, Integer);
    public Integer putAskSize(java.nio.ByteBuffer, Integer, Integer);
    public Integer getAskSize(java.nio.ByteBuffer);
    public Integer getAskSize(java.nio.ByteBuffer, Integer);
    public Integer positionBidSize(Integer);
    public Integer offsetBidSize();
    public Integer lengthBidSize();
    public Integer putBidSize(java.nio.ByteBuffer, Integer);
    public Integer putBidSize(java.nio.ByteBuffer, Integer, Integer);
    public Integer getBidSize(java.nio.ByteBuffer);
    public Integer getBidSize(java.nio.ByteBuffer, Integer);
    public Integer positionLast(Integer);
    public Integer offsetLast();
    public Integer lengthLast();
    public Float putLast(java.nio.ByteBuffer, Float);
    public Float putLast(java.nio.ByteBuffer, Float, Integer);
    public Float getLast(java.nio.ByteBuffer);
    public Float getLast(java.nio.ByteBuffer, Integer);
    public Integer positionAsk(Integer);
    public Integer offsetAsk();
    public Integer lengthAsk();
    public Float putAsk(java.nio.ByteBuffer, Float);
    public Float putAsk(java.nio.ByteBuffer, Float, Integer);
    public Float getAsk(java.nio.ByteBuffer);
    public Float getAsk(java.nio.ByteBuffer, Integer);
    public Integer positionBid(Integer);
    public Integer offsetBid();
    public Integer lengthBid();
    public Float putBid(java.nio.ByteBuffer, Float);
    public Float putBid(java.nio.ByteBuffer, Float, Integer);
    public Float getBid(java.nio.ByteBuffer);
    public Float getBid(java.nio.ByteBuffer, Integer);
    public Integer positionTradeCondition(Integer);
    public Integer offsetTradeCondition();
    public Integer lengthTradeCondition();
    public Object putTradeCondition(java.nio.ByteBuffer, Object);
    public Object putTradeCondition(java.nio.ByteBuffer, Object, Integer);
    public Object getTradeCondition(java.nio.ByteBuffer);
    public Object getTradeCondition(java.nio.ByteBuffer, Integer);
    public Integer positionQuoteCondition(Integer);
    public Integer offsetQuoteCondition();
    public Integer lengthQuoteCondition();
    public Object putQuoteCondition(java.nio.ByteBuffer, Object);
    public Object putQuoteCondition(java.nio.ByteBuffer, Object, Integer);
    public Object getQuoteCondition(java.nio.ByteBuffer);
    public Object getQuoteCondition(java.nio.ByteBuffer, Integer);
    public Integer positionTradeTime(Integer);
    public Integer offsetTradeTime();
    public Integer lengthTradeTime();
    public Long putTradeTime(java.nio.ByteBuffer, Long);
    public Long putTradeTime(java.nio.ByteBuffer, Long, Integer);
    public Long getTradeTime(java.nio.ByteBuffer);
    public Long getTradeTime(java.nio.ByteBuffer, Integer);
    public Integer positionQuoteTime(Integer);
    public Integer offsetQuoteTime();
    public Integer lengthQuoteTime();
    public Long putQuoteTime(java.nio.ByteBuffer, Long);
    public Long putQuoteTime(java.nio.ByteBuffer, Long, Integer);
    public Long getQuoteTime(java.nio.ByteBuffer);
    public Long getQuoteTime(java.nio.ByteBuffer, Integer);
    public Integer positionTimestamp(Integer);
    public Integer offsetTimestamp();
    public Integer lengthTimestamp();
    public Long putTimestamp(java.nio.ByteBuffer, Long);
    public Long putTimestamp(java.nio.ByteBuffer, Long, Integer);
    public Long getTimestamp(java.nio.ByteBuffer);
    public Long getTimestamp(java.nio.ByteBuffer, Integer);
    public int hashCode();
    public boolean equals(Object);
    public clojure.lang.IPersistentMap meta();
    public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap);
    public Object valAt(Object);
    public Object valAt(Object, Object);
    public clojure.lang.ILookupThunk getLookupThunk(clojure.lang.Keyword);
    public int count();
    public clojure.lang.IPersistentCollection empty();
    public clojure.lang.IPersistentCollection cons(Object);
    public boolean equiv(Object);
    public boolean containsKey(Object);
    public clojure.lang.IMapEntry entryAt(Object);
    public clojure.lang.ISeq seq();
    public clojure.lang.IPersistentMap assoc(Object, Object);
    public clojure.lang.IPersistentMap without(Object)       throws Exception;
    public int size();
    public boolean isEmpty();
    public boolean containsValue(Object);
    public Object get(Object);
    public Object put(Object, Object);
    public Object remove(Object);
    public void putAll(java.util.Map);
    public void clear();
    public java.util.Set keySet();
    public java.util.Collection values();
    public java.util.Set entrySet();
    public clojure.lang.Associative assoc(Object, Object)       throws Exception;
}

