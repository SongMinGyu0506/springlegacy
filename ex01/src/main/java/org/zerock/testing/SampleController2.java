package org.zerock.testing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;


@Controller
@RequestMapping("/sample2/*")
@Log4j
public class SampleController2 {
	@RequestMapping("")
	public void basic2() {
		log.info("Basic2............");
	}
}
