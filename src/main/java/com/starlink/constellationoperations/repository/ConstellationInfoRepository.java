package com.starlink.constellationoperations.repository;

import com.starlink.constellationoperations.model.ConstellationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConstellationInfoRepository extends JpaRepository<ConstellationInfo, Long> {


    @Query(value="SELECT * FROM constellation_info where constellation_id = ?1", nativeQuery = true)
    ConstellationInfo findByConstellationId(Integer constellationId);

    @Query(value="SELECT * FROM constellation_info where constellation_name = ?1", nativeQuery = true)
    List<ConstellationInfo> findByConstellationName(String constellationName);

}
