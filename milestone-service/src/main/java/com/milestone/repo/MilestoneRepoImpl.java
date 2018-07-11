package com.milestone.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.milestone.business.Milestone;

@Repository
public class MilestoneRepoImpl implements MilestoneRepo {

	private Map<String, Milestone> milestones = new HashMap<>();

	@Override
	public List<Milestone> getAll() {
		return milestones.entrySet().stream().map(m -> m.getValue()).collect(Collectors.toList());
	}

	@Override
	public Milestone getMilestone(String milestoneNum) {
		return milestones.get(milestoneNum);
	}

	@Override
	public void deleteMilestone(String milestoneNum) {
		milestones.remove(milestoneNum);
	}

	@Override
	public void addMilestone(Milestone milestone) {
		milestones.put(milestone.getId().toString(), milestone);

	}

}
