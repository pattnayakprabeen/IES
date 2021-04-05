package com.ashokit.ies.ed.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EligibilityDetailDTO {

	private Integer edTraceId;
	private Long caseNum;
	private String planName;
	private String planStatus;
	private String planStartDate;
	private String planEndDate;
	private String benefitAmt;
	private String denialReason;
	private Date createdDate;
	private Date updatedDate;

}
