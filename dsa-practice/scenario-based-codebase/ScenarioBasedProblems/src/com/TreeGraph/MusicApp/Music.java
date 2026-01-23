package com.TreeGraph.MusicApp;

public class Music {

	public int track;
	public String name;
	
	public Music(int track, String name) {
		this.track =track;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "trackID: "+track+", Music name: "+name;
	}
}