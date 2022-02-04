package hi;

public class PersonAge
{
	String firstname;
	String lastname;
	int age;
	

	/**
	 * @param fname -First name
	 * @param lname -Last name
	 * @param age - age of person in years
	 */
	public PersonAge(String fname, String lname, int age)
	{
		super();
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
	}


	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstname;
	}


	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstname = fname;
	}


	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lastname;
	}


	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lastname = lname;
	}


	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person: "+ firstname + " "+ lastname + " age=" + age;
	}
	
	public PersonAge makePerson(PersonAge that) throws UnderAgeException
	{
		if(age<18 | that.age<18)
		{
			throw new UnderAgeException();
		}
		
		PersonAge child = new PersonAge(this.firstname, that.lastname, 0);
		return child;
	}

	public static void main(String[] args)
	{
		PersonAge p = new PersonAge("Julio", "Caesar", 21);
		
		System.out.println("P "+ p);
	}
	
}
