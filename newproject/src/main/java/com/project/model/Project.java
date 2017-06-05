package com.project.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 

 
@Entity
@Table(name = "project")
public class Project {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
    
  private String ProjectName;
  private String Station;
  private String StartDate;
  private String EndDate;
  private Integer EstimatePeriod;
  private Integer PlotSize;
  private Integer NumberOfFlats;
  private Integer NumberOfFloors;
   
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  public Project() { }

  public Project(long id) { 
    this.id = id;
  }
  
 

  // Getter and setter methods

  public Project(String projectName, String station, String startDate, String endDate, int estimatePeriod,int plotSize, int numberOfFlats, int numberOfFloors) {
	 this.ProjectName=projectName;
	 this.Station=station;
	 this.StartDate=startDate;
	 this.EndDate=endDate;
	 this.EstimatePeriod=estimatePeriod;
     this.PlotSize = plotSize;
	 this.NumberOfFlats = numberOfFlats;
     this.NumberOfFloors = numberOfFloors;
}
  
  

 

public Integer getPlotSize() {
	return PlotSize;
}

public void setPlotSize(Integer plotSize) {
	PlotSize = plotSize;
}

public Integer getNumberOfFlats() {
	return NumberOfFlats;
}

public void setNumberOfFlats(Integer numberOfFlats) {
	NumberOfFlats = numberOfFlats;
}

public Integer getNumberOfFloors() {
	return NumberOfFloors;
}

public void setNumberOfFloors(Integer numberOfFloors) {
	NumberOfFloors = numberOfFloors;
}

public Long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  
public String getProjectName() {
	return ProjectName;
}

public void setProjectName(String projectName) {
	this.ProjectName = projectName;
}

public String getStation() {
	return Station;
}

public void setStation(String station) {
	this.Station = station;
}

public String getStartDate() {
	return StartDate;
}

public void setStartDate(String startDate) {
	this.StartDate = startDate;
}

public String getEndDate() {
	return EndDate;
}

public void setEndDate(String endDate) {
	this.EndDate = endDate;
}

public Integer getEstimatePeriod() {
	return EstimatePeriod;
}

public void setEstimatePeriod(int estimatePeriod) {
	this.EstimatePeriod = estimatePeriod;
}
  

} 