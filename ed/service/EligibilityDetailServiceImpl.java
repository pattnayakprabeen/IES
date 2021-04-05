package com.ashokit.ies.ed.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.ed.entity.EligibilityDetailEntity;
import com.ashokit.ies.ed.domain.EligibilityDetailDTO;
import com.ashokit.ies.ed.repository.EligibilityDetailsRepository;

@Service()
public class EligibilityDetailServiceImpl implements EligibilityDetailService {

	@Autowired
	private EligibilityDetailsRepository eligRepository;

	@Override
	public EligibilityDetailDTO findByCaseNum(Long caseNum) {
		EligibilityDetailEntity entity = eligRepository.findByCaseNum(caseNum);
		EligibilityDetailDTO model = null;
		if (entity != null) {
			model = new EligibilityDetailDTO();
			BeanUtils.copyProperties(entity, model);
		}
		return model;
	}

}
