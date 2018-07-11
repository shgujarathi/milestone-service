package com.milestone.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milestone.business.Milestone;
import com.milestone.repo.MilestoneRepo;

@RestController
@RequestMapping("/milestone")
public class MilestoneController {

	Logger log = Logger.getLogger(MilestoneController.class.getName());

	@Autowired
	MilestoneRepo repo;

	@GetMapping(value = "/getAll")
	public List<Milestone> getAll() {
		return repo.getAll();
	}

	@PostMapping(value = "/add")
	public void addMilestone(@RequestBody Milestone milestone) {
		repo.addMilestone(milestone);
	}

	@DeleteMapping(value = "/delete")
	public void deleteMilestone(String milestoneNumber) {
		repo.deleteMilestone(milestoneNumber);
	}

	@GetMapping(value = "/getMilestone/{milestoneNumber}")
	public Milestone getOne(@PathVariable("milestoneNumber") String milestoneNumber) {
		log.log(Level.INFO, "Getting Particular Milestone");
		return repo.getMilestone(milestoneNumber);
	}
}


	/*
	 * @RequestMapping(value = "/getAll", method = RequestMethod.GET) public
	 * List<Milestone> getAll() { return repo.getAll(); }
	 * 
	 * @RequestMapping(value = "/add", method = RequestMethod.POST) public void
	 * addMilestone(@RequestBody Milestone milestone) {
	 * repo.addMilestone(milestone); }
	 * 
	 * @RequestMapping(value = "delete", method = RequestMethod.DELETE) public void
	 * deleteMilestone(String milestoneNumber) {
	 * repo.deleteMilestone(milestoneNumber); }
	 * 
	 * @RequestMapping(value = "/getMilestone/{milestoneNumber}", method =
	 * RequestMethod.GET) public Milestone getOne(@PathVariable("milestoneNumber")
	 * String milestoneNumber) { log.log(Level.INFO,
	 * "Getting Particular Milestone"); return repo.getMilestone(milestoneNumber); }
	 */
