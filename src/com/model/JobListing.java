package com.model;

import java.time.LocalDate;

public class JobListing {
 
	private int jobId;
	private int companyId;
	private String jobTitle;
	private String jobDesc;
	private String jobLocation;
	private double salary;
	private  String jobType;
	private LocalDate postedDate;
	public JobListing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobListing(int jobId, int companyId, String jobTitle, String jobDesc, String jobLocation, double salary,
			String jobType, LocalDate postedDate) {
		super();
		this.jobId = jobId;
		this.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.jobType = jobType;
		this.postedDate = postedDate;
	}
	public JobListing(int companyId, String jobTitle, String jobDesc, String jobLocation, double salary, String jobType,
			LocalDate postedDate) {
		super();
		this.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.jobType = jobType;
		this.postedDate = postedDate;
	}
	
	public JobListing(int jobId, int companyId, String jobTitle, String jobDesc, String jobLocation, double salary,
			String jobType) {
		super();
		this.jobId = jobId;
		this.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.jobType = jobType;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public LocalDate getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "JobListing [jobId=" + jobId + ", companyId=" + companyId + ", jobTitle=" + jobTitle + ", jobDesc="
				+ jobDesc + ", jobLocation=" + jobLocation + ", salary=" + salary + ", jobType=" + jobType
				+ ", postedDate=" + postedDate + "]";
	}
	
	
}
