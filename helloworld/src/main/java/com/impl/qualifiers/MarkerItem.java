package com.impl.qualifiers;

import javax.inject.Named;

@Named("mi")
@Marker
public class MarkerItem implements Item{

	public MarkerItem(){
		
	}
	public String getName() {
		return null;
	}

}
