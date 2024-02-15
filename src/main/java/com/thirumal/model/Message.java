/**
 * 
 */
package com.thirumal.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Thirumal
 */
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString@Builder
public class Message implements Serializable {

	private static final long serialVersionUID = 5653791537575336879L;

	private Long messageId;
	private String content;
	private OffsetDateTime createdOn;
	
}
