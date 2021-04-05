package com.ashokit.ies.co.batches.service;

import java.util.List;

import com.ashokit.ies.co.batches.domain.CoBatchRunDetailsModel;
import com.ashokit.ies.co.batches.domain.CoTriggersModel;

public interface CoBatchService {

	public CoBatchRunDetailsModel insertBatchRunDetails(CoBatchRunDetailsModel model);

	public List<CoTriggersModel> findPendingTriggers();

	public boolean updatePendingTrigger(CoTriggersModel model);


	public CoBatchRunDetailsModel updateBatchRunDetails(CoBatchRunDetailsModel model);
	
	public CoBatchRunDetailsModel findByRunSeqNum(Integer runSeqNum);


}
