package base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import domain.StudentDomainModel;

public class Person_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date bday = null;
		try {
			bday = sdf.parse("21/12/2012");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PersonDomainModel per = new PersonDomainModel();

		per.setFirstName("Dick");
		per.setLastName("Butt");
		per.setStreet("12th");
		per.setPostalCode(19711);
		per.setCity("Newark");
		per.setBirthday(bday);
		
		
		PersonDAL.addPerson(per);
		
		
		
		

		// String String firstName, String middleName, String lastName, Date dOB
	}
	@Test
	public void testDelete() {
		PersonDomainModel per = new PersonDomainModel();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date bday = null;
		try {
			bday = sdf.parse("21/12/2012");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		per.setFirstName("OldDick");
		per.setLastName("Butt");
		per.setStreet("12th");
		per.setPostalCode(19711);
		per.setCity("Newark");
		per.setBirthday(bday);
		
		
		PersonDAL.addPerson(per);
		PersonDAL.deletePerson(per.getPersonID());
	}
	
	@Test
	public void testUpdatePerson() {
PersonDomainModel per = new PersonDomainModel();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Date bday = null;
try {
	bday = sdf.parse("21/12/2012");
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		per.setFirstName("SmallDick");
		per.setLastName("Butt");
		per.setStreet("12th");
		per.setPostalCode(19711);
		per.setCity("Newark");
		per.setBirthday(bday);
		
		PersonDAL.addPerson(per);
		
		per.setFirstName("SmallerDick");
		PersonDAL.updatePerson(per);
	}
	

}
