class ErrorMsg {
	
	String msg[] = {
		"OUtput Error",
		"Input Error",
		"Disk Full",
		"INdex Out Of Bounds"
	
	};
	
	String getErrorMsg( int i) {
		if (i>=0 && i<msg.length)
			return msg[i];
		else 
			return "Invalid Error Code";
	}

}


class ErrMsg {
	public static void main (String args[]) {
	
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(12));
		
	
	}	
		

}























