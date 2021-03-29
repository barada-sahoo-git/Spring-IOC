package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String wish(String name) {
		
		int hr = date.getHours();
		if(hr<12) {
			return "good morning ::" +name;
		}
		else if(hr<16) {
			return "good afternoon ::" +name;
		}
		else if(hr<20) {

			return "good evening ::" +name;
			}
		else {
			return "good night ::" +name;
		}
		
		
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	

	

}
