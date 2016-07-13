package pl.seweryn;

import java.util.ArrayList;
import java.util.List;

public class Prison {
	private String name;
	private List<Cargo> storedGoods = new ArrayList<Cargo>(); 
	
	public Prison(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void storeCargo(Cargo cargo) {
		storedGoods.add(cargo);
	}
}
