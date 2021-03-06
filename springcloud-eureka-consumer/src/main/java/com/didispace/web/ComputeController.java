package com.didispace.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.didispace.feign.ConsumerApi;

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

  /*  @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) throws Exception {
    	//Thread.sleep(5000L);  测试服务熔断   5s 20
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }*/
    
    @Autowired
    ConsumerApi consumerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return consumerClient.add(10, 20);
    }

}