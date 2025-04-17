package methodOverridiing;

public class Son extends Father{
//	@Override
	Father createObject() {
		return new Son();
	}
}
