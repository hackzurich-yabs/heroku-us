package com.yabs.hackzurich.controller

import com.yabs.hackzurich.dto.RetailerData
import com.yabs.hackzurich.service.RetailersService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@CompileStatic
class RetailersController {

    @Autowired
    private RetailersService retailersService

    @RequestMapping(value = "/getRetailers", method = RequestMethod.GET, produces = 'application/json')
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    List<RetailerData> list() {
        return retailersService.list()
    }
}

