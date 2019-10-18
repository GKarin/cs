package com.allianity.cs.clientone;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String hi(@PathVariable String name){
        return "say hi"+name;
    }
}
