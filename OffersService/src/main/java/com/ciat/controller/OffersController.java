package com.ciat.controller;

/**
 * Created by ksairamesh on 2/8/17.
 */

import com.ciat.component.Offer;
import com.ciat.component.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciat.component.AvailableOffer;
import com.ciat.service.OffersService;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.io.IOException;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class OffersController {

    @RequestMapping("/")
    String home() {
        return "Welcome to offers service - CIAT!";
    }

    @RequestMapping(value="/offers/{sku}", method = RequestMethod.GET)
    public Response offers(@PathVariable(value="sku") String sku) throws IOException{

        if (StringUtils.isNotBlank(sku)){
            OffersService offersService = new OffersService();

            Offer offer = offersService.getAvailableOffers(sku);

            if (null != offer){
                return createSuccessResponse(offer);
            }

        }

        return createErrorResponse();
    }

    private Response createErrorResponse(){

        Response errorResponse = new Response();
        errorResponse.setStatus("FAIL");
        errorResponse.setOffer(null);
        errorResponse.setStatusCode(500);

        return errorResponse;
    }

    private Response createSuccessResponse(Offer offer){

        Response successResponse = new Response();
        successResponse.setStatusCode(200);
        successResponse.setStatus("SUCCESS");
        successResponse.setOffer(offer);

        return successResponse;
    }



}

