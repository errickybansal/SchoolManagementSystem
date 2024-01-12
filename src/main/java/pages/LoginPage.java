package pages;


import base.Base;

public class LoginPage extends Base {
String emailAddress_txt = "//input[@id='widget-user-email']";
String password_txt = "";
String signIn_Button ="";

public void enterDataInEmailAddress(String value) {
	enterText(emailAddress_txt, value);
}

public void enterDataInPassword(String value) {
	enterText(password_txt, value);
}

public void clickOnLoginButton() {
	click(signIn_Button);
}


	

}
