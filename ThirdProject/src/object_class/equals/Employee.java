package object_class.equals;

public class Employee {
	int id;

	Employee(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(this == null || obj == null || this.getClass() != obj.getClass())
			return false;
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
}
