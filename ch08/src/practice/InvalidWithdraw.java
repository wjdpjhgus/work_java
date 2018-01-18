package practice;

public class InvalidWithdraw extends /*Exception*/RuntimeException {

	private static final long serialVersionUID = 1L;//버전맞추는것
	public InvalidWithdraw(String msg) {
		super(msg);
	}

}
