package mm.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/MeetingMinutes")
@Slf4j
public class HomeController {
	@RequestMapping("/")
	public String get() {
		log.trace("In Home Controller");
		log.debug("In Home Controller");
		log.info("In Home Controller");
		log.warn("In Home Controller");
		log.error("In Home Controller");
		
		return "Hey dude";
	}
}
