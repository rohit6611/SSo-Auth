package com.altruist.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class RequestDto {

	@Min(value = 1,message = "deptId must be between 1 to 3")
	@Max(value = 3,message = "deptId must be between 1 to 3")
	private Integer deptId;
	
	@Pattern(regexp = "^(tech|account|finance)$",message = "deptName can only be tech,account,finance")
	private String deptName;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "RequestDto [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
