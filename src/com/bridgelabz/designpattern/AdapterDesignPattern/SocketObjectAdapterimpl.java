package com.bridgelabz.designpattern.AdapterDesignPattern;

public class SocketObjectAdapterimpl implements SocketAdapter{

	Socket socket= new Socket();

	@Override
	public Volt get120Volt() {
		
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		
		Volt v= socket.getVolt();
		
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		
		Volt v= socket.getVolt();
		
		return convertVolt(v, 40);
	}
	
	public Volt convertVolt(Volt v,int i)
	{
		return new Volt(v.getVolt()/i);
	}
	
}