package com.ashokit.ies.co.batches.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.co.batches.entity.CoBatchRunDetailsEntity;
import com.ashokit.ies.co.batches.entity.CoTriggersEntity;
import com.ashokit.ies.co.batches.domain.CoBatchRunDetailsModel;
import com.ashokit.ies.co.batches.domain.CoTriggersModel;
import com.ashokit.ies.co.batches.repository.CoBatchRunDetailsRepository;
import com.ashokit.ies.co.batches.repository.CoTriggersRepository;

@Service
public class CoBatchServiceImpl implements CoBatchService {

	@Autowired
	private CoBatchRunDetailsRepository coBatchRunDetailRepo;

	@Autowired
	private CoTriggersRepository coTrgRepository;

	@Override
	public CoBatchRunDetailsModel insertBatchRunDetails(CoBatchRunDetailsModel model) {
		CoBatchRunDetailsEntity entity = new CoBatchRunDetailsEntity();
		BeanUtils.copyProperties(model, entity);
		CoBatchRunDetailsEntity savedEntity = coBatchRunDetailRepo.save(entity);
		model.setRunSeq(entity.getRunSeq());
		return model;
	}
	@Override
	public CoBatchRunDetailsModel findByRunSeqNum(Integer runSeqNum) {
		CoBatchRunDetailsEntity entity = coBatchRunDetailRepo.findById(runSeqNum).get();
		CoBatchRunDetailsModel model = new CoBatchRunDetailsModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}

	@Override
	public List<CoTriggersModel> findPendingTriggers() {

		List<CoTriggersEntity> entities = coTrgRepository.findByTriggerStatus("P");
		List<CoTriggersModel> models = new ArrayList<>();
		if(entities!=null) {
		entities.forEach(entity->{
			CoTriggersModel model = new CoTriggersModel();
			System.out.println(entity);
			BeanUtils.copyProperties(entity, model);
			models.add(model);
		});
		}
		return models;
	}

	@Override
	public boolean updatePendingTrigger(CoTriggersModel model) {
		return false;
	}

	@Override
	public CoBatchRunDetailsModel updateBatchRunDetails(CoBatchRunDetailsModel model) {
		CoBatchRunDetailsEntity entity = new CoBatchRunDetailsEntity();
		BeanUtils.copyProperties(model, entity);
		coBatchRunDetailRepo.save(entity);
		return model;
	}

}
