package com.ashokit.ies.co.batches.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.co.batches.entity.CoTriggersEntity;

public interface CoTriggersRepository extends JpaRepository<CoTriggersEntity, Serializable> {

	@Query(name = " FROM CoTriggersEntity where triggerStatus=:status")
	public List<CoTriggersEntity> findByTriggerStatus(String status);
}
