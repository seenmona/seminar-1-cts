package clase;

public class ZooKeeper {
private String name;

public ZooKeeper(String name) {
	super();
	this.name = name;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void feed(Animal animal) {
	System.out.println(name+ "hraneste animalul "+animal.getName());
}
}
