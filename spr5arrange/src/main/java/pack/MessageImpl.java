package pack;

public class MessageImpl implements MessageInter{
	private String name;
	private String spec;
	
	public MessageImpl(String name) {
		this.name = name;
	}
	
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public void sayHi() {
		String msg = name + " " + spec;	
		System.out.println(msg);
	}

}
