package com.spring.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private int cid;
	private String cname;
	private String email;
	private long phone;

	public Customer(int cid, String cname, String email, long phone) {
		System.out.println("constructor -4 args");
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	private List<String> emails;

	private Set<String> phones;

	private Map<String, Long> refs;

	private Properties myprops;

	private Address address;

	private List<Account> accounts;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	public Properties getMyprops() {
		return myprops;
	}

	public void setMyprops(Properties myprops) {
		this.myprops = myprops;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void show() {

		System.out.println("cid :-" + cid);
		System.out.println("cname " + cname);
		System.out.println("email :-" + email);
		System.out.println("phone :-" + phone);
		System.out.println("emails :-" + emails);
		System.out.println("phones :-" + phones);
		System.out.println("refs :-" + refs);
		System.out.println("myprops :-" + myprops);
		System.out.println("address :-" + address);

		for (Account acc : accounts) {

			System.out.println(" account :" + acc);

		}

		System.out.println(" emails.getClass().getName()  " + emails.getClass().getName());
		System.out.println(" phones.getClass().getName()  " + phones.getClass().getName());
		System.out.println(" refs.getClass().getName()    " + refs.getClass().getName());
		System.out.println(" myprops.getClass().getName() " + myprops.getClass().getName());
		System.out.println("__________________");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
