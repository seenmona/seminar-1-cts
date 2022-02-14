package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private ZooKeeper zookeeper;
	private List<Animal>animalList;
	
	
	public Zoo() {
		animalList=new ArrayList<>();
		zookeeper=new ZooKeeper("Ion");
	}


	public Zoo(ZooKeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	public void AdaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	public void FeedAnimals() {
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
}
