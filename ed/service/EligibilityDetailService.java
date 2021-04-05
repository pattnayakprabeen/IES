package com.ashokit.ies.ed.service;

import com.ashokit.ies.ed.domain.EligibilityDetailDTO;

public interface EligibilityDetailService {

	public EligibilityDetailDTO findByCaseNum(Long caseNum);

}
