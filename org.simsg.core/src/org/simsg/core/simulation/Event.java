package org.simsg.core.simulation;

import java.util.Objects;

public class Event implements Comparable<Event> {
	public final double time;
	
	public final String rule;
	
	public Event(double time, String rule) {
		this.time = time;
		this.rule = rule;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Event)) return false;
		Event other = (Event) obj;
		return time == other.time && rule.equals(other.rule);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(time, rule);
	}
	
	@Override
	public String toString() {
		return "Event at "+time+"s activates rule: "+rule;
	}

	@Override
	public int compareTo(Event o) {
		if(time > o.time) {
			return 1;
		}else if(time < o.time) {
			return -1;
		}else {
			return 0;
		}
	}
}
