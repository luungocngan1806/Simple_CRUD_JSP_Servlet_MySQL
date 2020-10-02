package models;

public class StudentModel
{

	private long 	id;
	private String 	name;
	private String 	mail;
	private String 	address;

	public StudentModel()
	{

	}

	public StudentModel( String name , String mail , String address )
	{

		this.name 		= name;
		this.mail 		= mail;
		this.address 	= address;

	}

	public StudentModel( long id , String name , String mail , String address )
	{

		super();
		this.id 		= id;
		this.name 		= name;
		this.mail 		= mail;
		this.address 	= address;

	}

	public long getId()
	{

		return id;

	}

	public void setId( long id )
	{

		this.id = id;

	}

	public String getName()
	{

		return name;

	}

	public void setName( String name )
	{

		this.name = name;

	}

	public String getMail()
	{

		return mail;

	}

	public void setMail( String mail )
	{

		this.mail = mail;

	}

	public String getAddress()
	{

		return address;

	}

	public void setAddress( String address )
	{

		this.address = address;

	}

}
