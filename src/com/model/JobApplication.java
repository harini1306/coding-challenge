package com.model;

import java.time.LocalDate;

public class JobApplication {
	private int id;
	private int jobId;
	private int applicantId;
	private LocalDate appdate;
	private String coverLetter;
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobApplication(int jobId, int applicantId, LocalDate appdate, String coverLetter) {
		super();
		this.jobId = jobId;
		this.applicantId = applicantId;
		this.appdate = appdate;
		this.coverLetter = coverLetter;
	}
	
	public JobApplication(int id, int jobId, int applicantId, String coverLetter) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.applicantId = applicantId;
		this.coverLetter = coverLetter;
	}
	public JobApplication(int id, int jobId, int applicantId, LocalDate appdate, String coverLetter) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.applicantId = applicantId;
		this.appdate = appdate;
		this.coverLetter = coverLetter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public LocalDate getAppdate() {
		return appdate;
	}
	public void setAppdate(LocalDate appdate) {
		this.appdate = appdate;
	}
	public String getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	
	@Override
	public String toString() {
		return "JobApplication [id=" + id + ", jobId=" + jobId + ", applicantId=" + applicantId + ", appdate=" + appdate
				+ ", coverLetter=" + coverLetter + "]";
	}
	
	
	

}
