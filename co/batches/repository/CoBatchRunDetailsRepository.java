package com.ashokit.ies.co.batches.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.co.batches.entity.CoBatchRunDetailsEntity;;


public interface CoBatchRunDetailsRepository extends JpaRepository<CoBatchRunDetailsEntity, Serializable> {

}
