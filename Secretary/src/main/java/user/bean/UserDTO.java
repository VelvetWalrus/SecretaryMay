package user.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
	private String user_mail;
	private String user_pwd;
	private String user_name;
	private String user_phone;
	private String user_nickname;
}
