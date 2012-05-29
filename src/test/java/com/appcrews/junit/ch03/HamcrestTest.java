package com.appcrews.junit.ch03;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class HamcrestTest {
	private List<String> values;
	
	@Before
	public void setUpList() {
		values = new ArrayList<String>();
		values.add("x");
		values.add("y");
		values.add("z");
	}
	
	@Test
	@Ignore(value="testWithoutHamcrest is ignored")
	public void testWithoutHamcrest() {
		assertTrue(values.contains("one")
				||values.contains("two")
				||values.contains("three"));
	}
	
	@Test
	@Ignore(value="testWithHamcrest is ignored")
	public void testWithHamcrest() {
		assertThat(values, hasItem(anyOf(equalTo("one"), equalTo("two"), equalTo("three"))));
	}

 }
