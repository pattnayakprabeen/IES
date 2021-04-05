package com.ashokit.ies.ed.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.ed.entity.EligibilityDetailEntity;

public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetailEntity, Serializable> {

	@Query(name = "FROM EligibilityDetailEntity where caseNum=:caseNum")
	public EligibilityDetailEntity findByCaseNum(Long caseNum);
}
