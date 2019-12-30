package io.github.cepr0.demo.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Data
@EqualsAndHashCode(of = "email")
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Version
	private Short version;

	@Column(nullable = false, length = 64)
	private String name;

	@NaturalId
	@Column(length = 64, nullable = false)
	private String email;

	private String password;

	private String avatarUrl;

	@Column(length = 64)
	private String googleId;
}
