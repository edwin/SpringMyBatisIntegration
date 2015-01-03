package com.edw.springmybatis.controller;

import com.edw.springmybatis.service.TestingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author edwin < edwinkun at gmail dot com >
 */
@Controller
public class IndexController {

    @Autowired
    private TestingService testingService;
    
    private final Logger logger = Logger.getLogger(this.getClass());
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody Integer index() {
        try {
            testingService.insert();
            return 1;
        } catch (Exception e) {
            logger.error(e);
        }
        return 0;
    }
    
}
