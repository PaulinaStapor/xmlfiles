package staporpaulina.readxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "ArrayOfExchangeRatesTable")
public class ArrayOfExchangeRatesTable {
    @JacksonXmlProperty
    private ExchangeRatesTable exchangeRatesTable;
}
