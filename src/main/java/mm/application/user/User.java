package mm.application.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table (name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column( name = "id" )
	private int id;
	
	@NotNull
	@Column( name = "username", unique = true )
	private String username;
	
	@Column( name = "password" )
	private String password;
	
	@Column( name = "name" )
	private String name;
	
	@Column( name = "email" )
	private String email;
	
	@Column( name = "mobile" )
	private String mobile;
	
	@Column( name = "created_on" )
	private Date createdOn;
	
	@Column( name= "is_active" )
	private boolean isActive;
}
