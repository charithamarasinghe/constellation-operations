package com.starlink.constellationoperations.service;

import com.starlink.constellationoperations.model.ConstellationSatInfo;
import com.starlink.constellationoperations.model.ConstellationInfo;
import com.starlink.constellationoperations.repository.ConstellationInfoRepository;
import com.starlink.constellationoperations.repository.ConstellationSatInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstellationOperationsService {

    @Autowired
    ConstellationSatInfoRepository constellationSatInfoRepository;

    @Autowired
    ConstellationInfoRepository constellationInfoRepository;

    public Iterable<ConstellationSatInfo> getAllConSatInfo() {
        return constellationSatInfoRepository.findAll();
    }

    public Iterable<ConstellationInfo> getAllConInfo() {
        return constellationInfoRepository.findAll();
    }


    public ConstellationSatInfo getConSatInfoBySatId(Integer satId) {
        return constellationSatInfoRepository.findBySatelliteId(satId);
    }

    public ConstellationInfo getConInfoByConId(Integer conId) {
        return constellationInfoRepository.findByConstellationId(conId);
    }

    public void addToConstellation(ConstellationSatInfo constellationSatInfo) {
        // need to add sat id validation

        constellationSatInfoRepository.save(constellationSatInfo);
    }

    public void addConstellation(ConstellationInfo constellationInfo) {
        constellationInfoRepository.save(constellationInfo);
    }

}
