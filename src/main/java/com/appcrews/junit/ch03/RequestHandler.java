package com.appcrews.junit.ch03;

public interface RequestHandler {
	Response process(Request request) throws Exception;
}
