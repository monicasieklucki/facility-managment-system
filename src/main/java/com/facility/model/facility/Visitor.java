package main.java.com.facility.model.facility;

public class Visitor implements IVisitor {

	@Override
	public void visitFacility(Facility facility) {
		System.out.println("Visiting facility object.");
		
	}

}
