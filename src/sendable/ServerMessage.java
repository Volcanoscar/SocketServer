package sendable;

import java.io.Serializable;
import java.util.Set;

public class ServerMessage extends Message implements Serializable {

	/**
	 * For server background communication purposes.
	 */
	private static final long serialVersionUID = 3772354662147009097L;
	
	private Set<Client> clist = null;

	public ServerMessage buildMessage(String s) {
		setServresponse(s);
		setTimestamp();
		return this;
	}
	
	public ServerMessage(String s) {
		super();
		setServresponse(s);
		setTimestamp();
	}
	
	public ServerMessage() {
		super();
	}
	
/*	public ServerMessage(Client [] clist) {
		super();
		setClist(clist);
	}*/
	
	public ServerMessage(Set<Client> clist) {
		super();
		setClist(clist);
	}

	@Override
	public String toString() {
		return "[" + this.getTimestamp() + "]" + " " + "SERVER> " + this.getServresponse();
	}

	public Set<Client> getClist() {
		return this.clist;
	}

	public void setClist(Set<Client> clist) {
		this.clist = clist;
	}
}
