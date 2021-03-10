package bookshopServlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarService {
	private static List<Car>cars = new ArrayList<Car>();
	
	private static int carCount= 5;
	
	static {
		cars.add(new Car(1,"Mercedez","Benz","nice car","https://images.unsplash.com/photo-1529534571712-fad9a49b5ee9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OHx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60","100"));
		cars.add(new Car(2,"Mercedez","Benz","nice car","https://images.unsplash.com/photo-1529534571712-fad9a49b5ee9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OHx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60","100"));
		cars.add(new Car(3,"Mercedez","Benz","nice car","https://images.unsplash.com/photo-1529534571712-fad9a49b5ee9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OHx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60","100"));
		cars.add(new Car(4,"Mercedez","Benz","nice car","https://images.unsplash.com/photo-1529534571712-fad9a49b5ee9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OHx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60","100"));
		cars.add(new Car(5,"Mercedez","Benz","nice car","https://images.unsplash.com/photo-1529534571712-fad9a49b5ee9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8OHx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60","100"));
		}
	public List<Car>retrieveAllCars(){
		return cars;
	}
//	public void addCar(Car car) {//void when there is no need for a return statement.
//		cars.add(car);
//		}
	public Car obtainCarById(int id) {
		for(Car car: cars) {
			if(car.getId()==id);
			return car;
		}
		return null;
	}
	
	public void addCar(String name, String model, String description, String picture, String price) {
		cars.add(new Car(++carCount, name, model, description, picture, price));
	}
	
	public void deleteById(int id ) {
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext()) {
			Car car = iterator.next();
			if(car.getId()==id) {
				iterator.remove();
			}
		}
	}
}
