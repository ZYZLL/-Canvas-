package com.java.zimu;

public class DataInfo {
	private int x;
	private int y;
	private String name;
	public DataInfo(int x,int y,String name) {
		this.x=x;
		this.y=y;
		this.setName(name);
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
