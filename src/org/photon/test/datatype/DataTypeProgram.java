package org.photon.test.datatype;

public class DataTypeProgram {
	
	private void forInt() {
		// TODO Auto-generated method stub
		int myid = 125314;
		System.out.println("My Employee ID is:" +myid );
		
	}
	private void forByte() {
		// TODO Auto-generated method stub
		byte age = 29;
		System.out.println("My age is:" +age );
	}
	
	private void forShort() {
		// TODO Auto-generated method stub
		short yearOfJoined = 2020;
		System.out.println("My year of joining is:"+yearOfJoined );
	}
	
	private void forLong() {
		// TODO Auto-generated method stub
		long accNo = 3214567892345678901l;
		System.out.println("My Account number is:" +accNo);
	}
	
	private void forFloat() {
		// TODO Auto-generated method stub
		float height = 4.2345678981f;
		System.out.println("My height  is:" +height);
	}
	
	private void forDouble() {
		// TODO Auto-generated method stub
		double salary = 10.345678123452536459820578d;
		System.out.println("My salary is:" +salary);
	}
	
	private void forString() {
		// TODO Auto-generated method stub
		String email = "gnanasundari.g1810$*Nans@gmail.com";
		System.out.println("My email id is:" +email);

	}
	
	private void forChar() {
		// TODO Auto-generated method stub
		char gender ='F';
		System.out.println("My Gender is:" +gender);
	}
	
	private void forBoolean() {
		// TODO Auto-generated method stub
		boolean status = true;
		System.out.println("Am I avaialble in Office:" +status);
	}
	
	public static void main(String[] args) {
		DataTypeProgram dtp = new DataTypeProgram();
		dtp.forInt();
		dtp.forByte();
		dtp.forShort();
		dtp.forLong();
		dtp.forDouble();
		dtp.forFloat();
		dtp.forString();
		dtp.forChar();
		dtp.forBoolean();
	}

}
