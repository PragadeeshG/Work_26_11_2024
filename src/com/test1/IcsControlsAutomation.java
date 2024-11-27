package com.test1;

public class IcsControlsAutomation {
	private String controlsCode;
	private String isAutomatiionApplicable;
	private String requirementsWorkitemURL;
	private String appScoped;
	private String releaseFeature;
	private boolean auditDone;
	private String auditType;
	private String helmRelease;
	private String lineOfBusiness;
	private String poApprovalDate;
	private String uvtUrl;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public IcsControlsAutomation() {

	}

	public IcsControlsAutomation(String controlsCode, String isAutomatiionApplicable, String requirementsWorkitemURL,
			String appScoped, String releaseFeature, boolean auditDone, String auditType, String helmRelease,
			String lineOfBusiness, String poApprovalDate, String uvtUrl, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.controlsCode = controlsCode;
		this.isAutomatiionApplicable = isAutomatiionApplicable;
		this.requirementsWorkitemURL = requirementsWorkitemURL;
		this.appScoped = appScoped;
		this.releaseFeature = releaseFeature;
		this.auditDone = auditDone;
		this.auditType = auditType;
		this.helmRelease = helmRelease;
		this.lineOfBusiness = lineOfBusiness;
		this.poApprovalDate = poApprovalDate;
		this.uvtUrl = uvtUrl;
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

	public String getIsAutomatiionApplicable() {
		return isAutomatiionApplicable;
	}

	public void setIsAutomatiionApplicable(String isAutomatiionApplicable) {
		this.isAutomatiionApplicable = isAutomatiionApplicable;
	}

	public String getRequirementsWorkitemURL() {
		return requirementsWorkitemURL;
	}

	public void setRequirementsWorkitemURL(String requirementsWorkitemURL) {
		this.requirementsWorkitemURL = requirementsWorkitemURL;
	}

	public String getAppScoped() {
		return appScoped;
	}

	public void setAppScoped(String appScoped) {
		this.appScoped = appScoped;
	}

	public String getReleaseFeature() {
		return releaseFeature;
	}

	public void setReleaseFeature(String releaseFeature) {
		this.releaseFeature = releaseFeature;
	}

	public boolean isAuditDone() {
		return auditDone;
	}

	public void setAuditDone(boolean auditDone) {
		this.auditDone = auditDone;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getHelmRelease() {
		return helmRelease;
	}

	public void setHelmRelease(String helmRelease) {
		this.helmRelease = helmRelease;
	}

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getPoApprovalDate() {
		return poApprovalDate;
	}

	public void setPoApprovalDate(String poApprovalDate) {
		this.poApprovalDate = poApprovalDate;
	}

	public String getUvtUrl() {
		return uvtUrl;
	}

	public void setUvtUrl(String uvtUrl) {
		this.uvtUrl = uvtUrl;
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
