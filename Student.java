class Student {
	String index;
	String firstName;
	String lastName;


	List<Integer> labPoints = new ArrayList<Integer>()
	//TODO constructor
    Student(index,firstName,lastName){
    this.index=index;
    this.firstName=firstName;
    this.lastName=lastName;

	}
	//TODO seters & getters

	public void setLastName(String lastName){
		this.lastName=lastName;

	}
    public  void setIndex(String index){
		this.index=index;

	}

	public void setFirstName(String firstName){

		this.firstName=firstName
	}

	public String getFirstName() {
		return firstName;
	}

	public String getIndex() {
		return index;
	}

	public String getLastName() {
		return lastName;
	}

	public double getAverage() {
		//TODO
		n = labPoints.size();
		for (int i=0;i<n;i++)
		{
			sum+=labPoints(i);

		}
		sum=sum/n;
		return sum;
	}

	public boolean hasSignature() {
		//TODO
		if(n>8)
			return System.out.println("Ima Potpis");
		else
			System.out.println("Nema Potpis");
	}
}
