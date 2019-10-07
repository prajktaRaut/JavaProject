package com.bridgelabz.designpattern.AdapterDesignPattern;

import com.bridgelabz.oops.CommercialDataProcessing.StockInterface;

public class SocketClassAdpaterimpl extends Socket implements SocketAdapter
{

	@Override
	public Volt get120Volt() {
		
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		
		Volt v=getVolt();
		
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		
		Volt v= getVolt();
		
		return convertVolt(v, 40);
	}

	public Volt convertVolt(Volt v, int i)
	{
		return new Volt(v.getVolt()/i);	
	}
	
}
