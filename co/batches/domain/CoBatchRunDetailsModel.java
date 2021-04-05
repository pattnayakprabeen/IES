
package com.ashokit.ies.co.batches.domain;

import java.util.Date;

import lombok.Data;

@Data
public class CoBatchRunDetailsModel {
	private Integer runSeq;
	private String batchName;
	private Date startDate;
	private Date endDate;
	private String batchRunStatus;
}
