/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brunoborges.tdconcamel;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bruno borges
 */
public class Statistics {

	private Date startedOn = Calendar.getInstance().getTime();
	private long tweetCount = 0L;
	private long imageCount = 0L;
	private String keywords;

	void increaseTweetCount() {
		this.tweetCount++;
	}

	void increaseImageAndTweetCount() {
		this.increaseTweetCount();
		this.imageCount++;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String arg) {
		this.keywords = arg;
	}

	public long getImageCount() {
		return this.imageCount;
	}

	public long getTweetCount() {
		return this.tweetCount;
	}

	public long getStartedOn() {
		return this.startedOn.getTime();
	}

	public void clear() {
		this.tweetCount = 0;
		this.imageCount = 0;
	}

}
