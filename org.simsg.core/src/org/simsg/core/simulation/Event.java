package org.simsg.core.simulation;

import java.util.Objects;

import org.simsg.core.pm.match.SimSGMatch;

public class Event implements Comparable<Event> {
	public double time;
	public final String rule;
	public final SimSGMatch match;
	
	public Event(double time, final String rule) {
		this.time = time;
		this.rule = rule;
		this.match = null;
	}
	
	public Event(double time, final String rule, final SimSGMatch match) {
		this.time = time;
		this.rule = rule;
		this.match = match;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Event)) return false;
		Event other = (Event) obj;
		return rule.equals(other.rule) && match.equals(other.match);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rule, match);
	}
	
	@Override
	public String toString() {
		return "Event at "+time+"s activates rule: "+rule+", with match:\n"+match;
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
