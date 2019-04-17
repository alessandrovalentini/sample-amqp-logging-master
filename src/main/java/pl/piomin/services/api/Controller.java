package pl.piomin.services.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	protected Logger logger = LoggerFactory.getLogger(Controller.class.getName());

	@RequestMapping("/hello/{param}")
	public String hello(@PathVariable("param") String param) {
		logger.info("Controller.hello(" + param + ")");
		return "Hello";
	}

	@RequestMapping("/log/{level}/{param}")
	public String log(@PathVariable("level") String level, @PathVariable("param") String param) {

		switch (level) {
			case "i":
				logger.info(param);
				return "saved info";
			case "d":
				logger.debug(param);
				return "saved debug";
			case "t":
				logger.trace(param);
				return "saved trace";
			case "w":
				logger.warn(param);
				return "saved warn";
			case "e":
				logger.error(param);
				return "saved error";
			default:
				logger.info(param);
				return "saved default info";
		}
	}

}
