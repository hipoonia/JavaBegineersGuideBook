class ErrorInfo {
	
	String msg[] = {
		"OUtput Error",
		"Input Error",
		"Disk Full",
		"INdex Out Of Bounds"
	
	};
	
	int howbad[] = { 3,3,2,4 };
	
	Err getErrorInfo( int i) {
		if (i>=0 && i<msg.length)
			return new Err(msg[i], howbad[i]);
		else 
			return new Err("Invalid Error Code",0);
	}

}

class Err {
	
	String msg;
	int severity;
	Err(String m, int s) {
		msg = m;
		severity = s;
	}

}


class ErrInfo {
	public static void main (String args[]) {
	
		ErrorInfo err = new ErrorInfo();
		
		Err e;
		
		e = err.getErrorInfo(2);
		System.out.println(e.msg+" severity: "+e.severity);
		
		e = err.getErrorInfo(12);
		System.out.println(e.msg+" severity: "+e.severity);
		
	
	}	
		

}























