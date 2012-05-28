package com.appcrews.junit.ch03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestDefaultController {
	private DefaultController controller;
	private Request request;
	private RequestHandler handler;

	private class SampleRequest implements Request {

		@Override
		public String getName() {
			return "Test";
		}
				
	}
	
	private class SampleHandler implements RequestHandler {

		@Override
		public Response process(Request request) throws Exception {
			return new SampleResponse();
		}
		
	}
	
	private class SampleResponse implements Response {
		private static final String NAME = "Test";

		@Override
		public String getName() {
			return NAME;
		}
		
		@Override
		public boolean equals(Object object) {
			boolean result = false;
			if (object instanceof SampleResponse) {
				result = ((SampleResponse)object).getName().equals(getName());
			}
			return result;
		}
		
		public int hashCode() {
			return NAME.hashCode();
		}
	}
	 

	@Before
	public void instantiate() throws Exception {
		controller = new DefaultController();
		request = new SampleRequest();
		handler = new SampleHandler();
		controller.addHandler(request, handler);
	}
	
	@Test 
	public void testAddHandler() {
		RequestHandler handler2 = controller.getHandler(request);
		assertSame("Handler we set in controller should be the same handler we get", handler, handler2);
	}
	
	@Test 
	public void testProcessRequest() {
		Response response = controller.processRequest(request);
		assertNotNull("Must not return a null response", response);
		assertEquals( new SampleResponse(), response);
	}

}