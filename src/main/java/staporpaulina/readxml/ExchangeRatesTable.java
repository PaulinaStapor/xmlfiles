package staporpaulina.readxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "Rates")
public class ExchangeRatesTable {
    @JacksonXmlProperty(localName = "No")
    private String id;
    @JacksonXmlProperty(localName = "Table")
    private String table;
    @JacksonXmlProperty(localName = "TradingDate")
    private String tradingDate;
    @JacksonXmlProperty(localName = "EffectiveDate")
    private String effectiveDate;
    @JacksonXmlProperty(localName = "Rate")
    @JacksonXmlElementWrapper
    private List<RateDTO> rates;
}
