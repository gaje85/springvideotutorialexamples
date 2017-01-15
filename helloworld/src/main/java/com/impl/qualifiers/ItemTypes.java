package com.impl.qualifiers;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ItemTypes {
	
	@Inject @Board
	Item boardItem;
	@Inject @Marker
	Item markerItem; 
	
	public ItemTypes(){
		
	}
	
	

}
