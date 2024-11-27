package com.test1;

public class ControlsAutomation {
	private String controlsCode;
	private String controlsType;
	private String isManualProcess;
	private String manualPipelinesOwner;
	private boolean requirementsAllocated;
	private Integer productOwner;
	private boolean businessCritical;
	private String criticalityLevel;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ControlsAutomation() {

	}

	public ControlsAutomation(String controlsCode, String controlsType, String isManualProcess,
			String manualPipelinesOwner, boolean requirementsAllocated, Integer productOwner, boolean businessCritical,
			String criticalityLevel, String creationDate, String modifiedDate, String entityState) {
		super();
		this.controlsCode = controlsCode;
		this.controlsType = controlsType;
		this.isManualProcess = isManualProcess;
		this.manualPipelinesOwner = manualPipelinesOwner;
		this.requirementsAllocated = requirementsAllocated;
		this.productOwner = productOwner;
		this.businessCritical = businessCritical;
		this.criticalityLevel = criticalityLevel;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getControlsCode() {
		return controlsCode;
	}

	public void setControlsCode(String controlsCode) {
		this.controlsCode = controlsCode;
	}

	public String getControlsType() {
		return controlsType;
	}

	public void setControlsType(String controlsType) {
		this.controlsType = controlsType;
	}

	public String getIsManualProcess() {
		return isManualProcess;
	}

	public void setIsManualProcess(String isManualProcess) {
		this.isManualProcess = isManualProcess;
	}

	public String getManualPipelinesOwner() {
		return manualPipelinesOwner;
	}

	public void setManualPipelinesOwner(String manualPipelinesOwner) {
		this.manualPipelinesOwner = manualPipelinesOwner;
	}

	public boolean isRequirementsAllocated() {
		return requirementsAllocated;
	}

	public void setRequirementsAllocated(boolean requirementsAllocated) {
		this.requirementsAllocated = requirementsAllocated;
	}

	public Integer getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(Integer productOwner) {
		this.productOwner = productOwner;
	}

	public boolean isBusinessCritical() {
		return businessCritical;
	}

	public void setBusinessCritical(boolean businessCritical) {
		this.businessCritical = businessCritical;
	}

	public String getCriticalityLevel() {
		return criticalityLevel;
	}

	public void setCriticalityLevel(String criticalityLevel) {
		this.criticalityLevel = criticalityLevel;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
