package com.dasannetworks.vn.tms.service;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneralTest {
	@Test
	public void testStringFormat() {
		String test = String.format("%%%s%%", "xxx");
		assertThat(test).isEqualTo("%xxx%");
	}
}
