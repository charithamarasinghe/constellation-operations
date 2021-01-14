package com.starlink.constellationoperations.controller;

import com.starlink.constellationoperations.model.ConstellationSatInfo;
import com.starlink.constellationoperations.model.ConstellationInfo;
import com.starlink.constellationoperations.service.ConstellationOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CO")
public class ConstellationOperationsController {

    @Autowired
    ConstellationOperationsService constellationOperationsService;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "SUCCESS";
    }

    @GetMapping("/getAllConstellationSatInfo")
    public Iterable<ConstellationSatInfo> getAllConstellationSatInfo() {
        return constellationOperationsService.getAllConSatInfo();
    }

    @GetMapping("/getAllConstellationInfo")
    public Iterable<ConstellationInfo> getAllConstellationInfo() {
        return constellationOperationsService.getAllConInfo();
    }

    @GetMapping("/getConSatInfoBySatId")
    public ConstellationSatInfo getConSatInfoBySatId(@RequestBody Integer satId) {
        return constellationOperationsService.getConSatInfoBySatId(satId);
    }

    @GetMapping("/getConInfoByConId")
    public ConstellationInfo getConInfoByConId(@RequestBody Integer conId) {
        return constellationOperationsService.getConInfoByConId(conId);
    }

    @PutMapping("/addToConstellation")
    public ConstellationSatInfo addToConstellation(@RequestBody ConstellationSatInfo constellationSatInfo) {
        constellationOperationsService.addToConstellation(constellationSatInfo);
        return constellationSatInfo;
    }

    @PutMapping("/addConstellation")
    public ConstellationInfo addConstellation(@RequestBody ConstellationInfo constellationInfo) {
        constellationOperationsService.addConstellation(constellationInfo);
        return constellationInfo;
    }



}
