package staporpaulina.readxml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
@Service
public class XmlService {
    public ArrayOfExchangeRatesTable showXmlFile() throws IOException {
        Logger logger = LoggerFactory.getLogger(ArrayOfExchangeRatesTable.class);
        String url = "http://api.nbp.pl/api/exchangerates/tables/C/today/";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<String> httpEntity = new HttpEntity<>("parameters", httpHeaders);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        String responseBody = responseEntity.getBody();
        logger.info(responseBody);

        XmlMapper xmlMapper=new XmlMapper();
        ArrayOfExchangeRatesTable arrayOfExchangeRatesTable=xmlMapper.readValue(responseBody,ArrayOfExchangeRatesTable.class);
        logger.info(arrayOfExchangeRatesTable.toString());

        return arrayOfExchangeRatesTable;
    }

}
