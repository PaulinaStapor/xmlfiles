package staporpaulina.readxml;

import org.springframework.stereotype.Service;
import staporpaulina.readxml.RateDTO;
import staporpaulina.readxml.RateModel;

@Service
public class RateMapper {
public RateModel rewriteDTOtoModel(RateDTO rateDTO){
    RateModel rateModel=new RateModel();
    rateModel.setCurrency(rateDTO.getCurrency());
    rateModel.setCode(rateDTO.getCode());
    rateModel.setBid(rateDTO.getBid());
    rateModel.setAsk(rateDTO.getAsk());
    return rateModel;
}

}
