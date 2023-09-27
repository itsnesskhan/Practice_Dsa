package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
class User implements Serializable {

	private static final long serialVersionUID = -5036607376273706296L;
	private Integer id;
	private String name;
	private transient String password;
	private transient static String city;
	private transient static final String mobileNumber = "9713216901";
	
//	if we write this two method the it is cusomizer serialization
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		String encryptedPass = 123+this.password;
		out.writeObject(encryptedPass);	
	}
	
	private void readObject(ObjectInputStream oin) throws ClassNotFoundException, IOException {
		oin.defaultReadObject();
		Object readObject = oin.readObject();
		System.out.println(readObject);
		String encryptedPass = (String)readObject;
		password = encryptedPass.substring(3);
		System.out.println(password+"  **********");
		
		
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ",password=" + password +", mobileNumber=" + mobileNumber + "]";
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		User.city = city;
	}

	public static String getMobilenumber() {
		return mobileNumber;
	}

}

public class UserSerialization {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		User user = User.builder().id(101).name("Nasser Khan").password("iness123").build();

		User user1 = User.builder().id(101).name("Nasser Khan").build();

		System.out.println(user == user1);

		User.setCity("Dharampuri");

		System.out.println(user);

//		 serialization of user object
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("nas.txt"));
		outputStream.writeObject(user);

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("nas.txt"));
		Object object = inputStream.readObject();
		if (object instanceof User) {
			System.out.println((User) object);
		}
		
		System.out.println("there hascodes "+user.hashCode()+"  "+object.hashCode());

		
//		we are losing the value of password in deserialization
//		overwride readObject and rightObject method to recover value of password
//		incrypt something with password
//		increapt password before serializing
//		and depcreapt passsword before deserializing
		
		
	}
}
