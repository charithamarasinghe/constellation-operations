package com.starlink.constellationoperations.repository;

import com.starlink.constellationoperations.model.ConstellationSatInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConstellationSatInfoRepository extends JpaRepository<ConstellationSatInfo, Long> {


    @Query(value="SELECT * FROM constellation_sat_info where constellation_id = ?1", nativeQuery = true)
    List<ConstellationSatInfo> findByConstellationId(Integer constellationId);

    @Query(value="SELECT * FROM constellation_sat_info where satellite_id = ?1", nativeQuery = true)
    ConstellationSatInfo findBySatelliteId(Integer satelliteId);

    @Query(value="SELECT * FROM constellation_sat_info where satellite_name = ?1", nativeQuery = true)
    ConstellationSatInfo findBySatelliteName(Integer satelliteName);
}
