package com.ciat.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ciat.component.AvailableOffer;
import com.ciat.component.Offer;
import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.databind.DeserializationFeature.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksairamesh on 2/8/17.
 */
public class OffersService {

    public Offer getAvailableOffers(String sku) throws IOException{

        Offer availableOffer = new Offer();
        // Get all offers
        List<Offer> offers =  jsonFileToObject();

        for (Offer offer : offers){
            if (StringUtils.equals(sku, offer.getSku())){
                availableOffer = offer;
            }
        }

        return availableOffer;
    }

    private List<Offer> jsonFileToObject () throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AvailableOffers.json").getFile());

        TypeReference<List<Offer>> mapType = new TypeReference<List<Offer>>() {};
        List<Offer> offers = mapper.readValue(file, mapType);

        return offers;
    }

}
