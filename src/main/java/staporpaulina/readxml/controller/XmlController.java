package staporpaulina.readxml.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import staporpaulina.readxml.dto.ArrayOfExchangeRatesTable;
import staporpaulina.readxml.service.XmlService;

import java.io.IOException;

@RestController
//localhost:8080/swagger-ui.html
public class XmlController {

    private XmlService xmlService;
    private ArrayOfExchangeRatesTable arrayOfExchangeRatesTable;

    @Autowired
    public XmlController(XmlService xmlService) {
        this.xmlService = xmlService;
        this.arrayOfExchangeRatesTable = arrayOfExchangeRatesTable;
    }

    @RequestMapping(value = "/nbp", method = RequestMethod.GET)
    public ArrayOfExchangeRatesTable showXmlFile() throws IOException {
        return xmlService.showXmlFile();

    }
//    @RequestMapping(value = "/nbp", method = RequestMethod.GET)
//    public static void xmlMapper() throws IOException {
//        XmlMapper xmlMapper = new XmlMapper();
//        String url = "http://api.nbp.pl/api/exchangerates/tables/C/today/";
//        ExchangeRatesTable exchangeRatesTable = xmlMapper.readValue(url, ExchangeRatesTable.class);
//        System.out.println(exchangeRatesTable);
//    }

}