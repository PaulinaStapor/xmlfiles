package staporpaulina.readxml.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Rate")
public class RateDTO {
    @JacksonXmlProperty(localName = "Currency")
    private String currency;
    @JacksonXmlProperty(localName = "Code")
    private String code;
    @JacksonXmlProperty(localName = "Bid")
    private String bid;
    @JacksonXmlProperty(localName = "Ask")
    private String ask;
}
