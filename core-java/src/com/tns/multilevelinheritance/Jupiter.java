package com.tns.multilevelinheritance;

public class Jupiter extends Bullet {
	private long maxspeed;
//set getters and setters

	public long getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(long maxspeed) {
		this.maxspeed = maxspeed;
	}
//to string functions

	@Override
	public String toString() {
		return "Jupiter [maxspeed=" + maxspeed + "]";
	}
	

}
