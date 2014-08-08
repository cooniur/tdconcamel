package com.brunoborges.tdconcamel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import twitter4j.Status;

public class StatisticsProcessor implements Processor {

	private Statistics statistics = new Statistics();

	public Statistics getCurrentStatistics() {
		return this.statistics;
	}

	@Override
	public void process(Exchange exchange) throws Exception {
		if (exchange.getIn().getBody() instanceof Status) {
			this.statistics.increaseTweetCount();
		} else if (exchange.getIn().getBody() instanceof Tweet) {
			this.statistics.increaseImageAndTweetCount();
		}
	}

	public void clear() {
		this.statistics.clear();
	}
}
