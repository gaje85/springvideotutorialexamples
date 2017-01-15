package com.sample.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.sample.domain.Events;
import com.sample.repository.EventsBo;

@Named
public class EventServiceBoImpl implements EventServiceBO{

	@Inject
	EventsBo eventBo;
	
	public EventServiceBoImpl() {
	}
	
	@Override
	public List<Events> getAllEvents() {
		return eventBo.getAllEvents();
	}

	
}
