package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private String phone;
	@Column(name="relationship")
	private String relationship;
	@Autowired
	private Address address;
	
	public Contact() {
		super();
		this.relationship = "spouse";
	}
	public Contact(String name) {
		
	}
	public Contact(String name, String phone, String relationship) {
		
	}
	public Contact(int id, String name, String phone, String relationship) {
		
	}
	//create getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	
	@Override
	public String toString() {
		return "Contact [id= " + id + " , name=" + name + ", phone=" + phone + ", relationship=" + relationship + "]";
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address a) {
		// TODO Auto-generated method stub
		this.address = address;
		
	}
	
}
