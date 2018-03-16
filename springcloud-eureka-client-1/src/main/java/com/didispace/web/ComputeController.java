package com.didispace.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    ConsumerApi consumerClient;

    @RequestMapping(value = "/adds" ,method = RequestMethod.GET)
    public Integer adds(@RequestParam Integer a, @RequestParam Integer b) throws Exception {
    	System.out.println("sdfsdfsdfsdfsdfdsfsdf0ewioruwoeuioewuroeu");
    	
    	System.out.println(consumerClient.add(5, 7));
    	
        return 0;
    }

}