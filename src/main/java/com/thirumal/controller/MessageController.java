/**
 * 
 */
package com.thirumal.controller;

import java.time.OffsetDateTime;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.thirumal.model.Message;

/**
 * @author Thirumal
 */
@Controller
public class MessageController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Message greeting(Message message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new Message(1L, "Hello, " + HtmlUtils.htmlEscape(message.getContent()) + "!", OffsetDateTime.now());
	}
}
