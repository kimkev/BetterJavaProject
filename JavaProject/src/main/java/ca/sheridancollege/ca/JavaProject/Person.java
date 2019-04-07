package ca.sheridancollege.ca.JavaProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Person {

		@Id
		@GeneratedValue
		private Long id;
		
		@Column(name = "Name", length = 64, nullable = false)
		private String name;
	
}
