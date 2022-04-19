package com.example.demo;

public class student {
int sid;
String sname;
String sphone;
public student(int sid, String sname, String sphone) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sphone = sphone;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSphone() {
	return sphone;
}
public void setSphone(String sphone) {
	this.sphone = sphone;
}
@Override
public String toString() {
	return "student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + "]";
}

}
