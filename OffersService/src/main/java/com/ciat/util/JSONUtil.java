package com.ciat.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ciat.component.Offer;

import java.io.File;
import java.io.IOException;


/**
 * Created by ksairamesh on 2/8/17.
 */
public class JSONUtil {

    // Object to JSON

    // JSON to object

    public Object jsonFileToObject () throws IOException{

        ObjectMapper mapper = new ObjectMapper();

        Offer offers = mapper.readValue(new File("AvailableOffers.json"), Offer.class);

        return offers;
    }


}

