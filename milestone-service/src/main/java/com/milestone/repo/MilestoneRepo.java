package com.milestone.repo;

import java.util.List;

import com.milestone.business.Milestone;

public interface MilestoneRepo {

	public List<Milestone> getAll();

	public Milestone getMilestone(String milestoneNum);

	public void deleteMilestone(String milestoneNum);

	public void addMilestone(Milestone milestone);

}
