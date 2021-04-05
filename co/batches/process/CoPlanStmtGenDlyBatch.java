package com.ashokit.ies.co.batches.process;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ashokit.ies.co.batches.domain.CoBatchRunDetailsModel;
import com.ashokit.ies.co.batches.domain.CoTriggersModel;
import com.ashokit.ies.co.batches.service.CoBatchService;
import com.ashokit.ies.ed.service.EligibilityDetailServiceImpl;

//@Service()
@Component("demo")
public class CoPlanStmtGenDlyBatch {

	@Autowired
	private CoBatchService coBatchService;

	@Autowired
	private EligibilityDetailServiceImpl edDetailService;
	
	private static final String BATCH_ID = "CO-PLN-STMT-DLY";
	

	public void init() {
		Integer runSeq = preProcess();
		start();
		postProcess(runSeq);
	}

	public Integer preProcess() {

		CoBatchRunDetailsModel model = new CoBatchRunDetailsModel();
		model.setBatchName(BATCH_ID);
		model.setBatchRunStatus("ST");
		model.setStartDate(new Date());
		System.out.println(coBatchService.getClass().getName());
		model = coBatchService.insertBatchRunDetails(model);

		return model.getRunSeq();
	}

	public void start() {

		List<CoTriggersModel> triggers = coBatchService.findPendingTriggers();

		// call process method for eachTrigger
		triggers.forEach(trigger -> {
			process(trigger);
		});
	}

	public void process(CoTriggersModel trgModel) {
		System.out.println("process");
		System.out.println("hello kishan");
	}

	public void postProcess(Integer runSeq) {
		// update batch run status as EN with EndDate
		CoBatchRunDetailsModel model = coBatchService.findByRunSeqNum(runSeq);
		model.setBatchRunStatus("EN");
		model.setEndDate(new Date());
		coBatchService.updateBatchRunDetails(model);
	}

}
