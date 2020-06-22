import java.util.List;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Showroom showroom = new Showroom();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("What would you like to do?");
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. Add a vehicle.");
			System.out.println("2. Remove a Vehicle");
			System.out.println("3. Show vehicle list with details");
			System.out.println("4. Show vehicle list with expected visitors");
			System.out.println("5. Exit program.\n\n");

			int choice = 0;

			
				choice = sc.nextInt();
				if (choice == 1) {
					addVehicle(showroom);
				} else if (choice == 2) {
					removeVehicle(showroom);
				} else if (choice == 3) {
					showVehicleDetails(showroom);
				} else if (choice == 4) {
					VehicleDetailsWithVisitors(showroom);
				} else if (choice == 5) {
					System.out.println("Terminated!");
					break;
				} else {
					System.out.print("Invalid action! please Enter Input again: ");
					choice = 0;
				}
			
		}
	}

	private static void VehicleDetailsWithVisitors(Showroom showroom) {
		
		
		showroom.showVehiclesWithVisitors();

	}

	private static void showVehicleDetails(Showroom showroom) {
		showroom.showDetails();

	}

	private static void removeVehicle(Showroom showroom) {
		showroom.removeVehicle();

	}

	private static void addVehicle(Showroom showroom) {

		String vehicleType = "";
		int modelNumber = 0;
		String engineType = "";
		int enginePower = 0;
		int tireSize = 0;
		int weight = 0;
		boolean isTurbo = false;

		// vehicle type

		System.out.println("Choose the Vehicle type:");
		System.out.println("\t1. " + "normal");
		System.out.println("\t2. " + "heavy");
		System.out.println("\t3. " + "sports");
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		while (choice == 0) {
			choice = sc.nextInt();
			if (choice == 1) {
				vehicleType = "normal";

			} else if (choice == 2) {
				vehicleType = "heavy";

			} else if (choice == 3) {
				vehicleType = "sports";

			}

			else {
				System.out.println("Invalid Vehicle Type! please Enter Input again: ");
				choice = 0;
			}
		}

		// model number
		System.out.print("Choose the model number: ");
		modelNumber = sc.nextInt();
		;

		// engine type
		if (vehicleType == "normal") {
			System.out.println("Choose the Engine type:");
			System.out.println("\t1. " + "oil");
			System.out.println("\t2. " + "gas");
			System.out.println("\t3. " + "diesel");

			int choiceEngine = 0;

			while (choiceEngine == 0) {
				choiceEngine = sc.nextInt();
				if (choiceEngine == 1) {
					engineType = "oil";
				} else if (choiceEngine == 2) {
					vehicleType = "gas";
				} else if (choiceEngine == 3) {
					vehicleType = "diesel";
				}

				else {
					System.out.println("Invalid Engine Type! please Enter Input again: ");
					choiceEngine = 0;
				}
			}
		} else if (vehicleType == "sports") {
			engineType = "oil";

			System.out.println("Choose turbo or not");
			System.out.println("\t1. yes");
			System.out.println("\t2. no");
			int choiceTurbo = 0;
			while (choiceTurbo == 0) {
				choiceTurbo = sc.nextInt();
				if (choiceTurbo == 1) {
					isTurbo = true;
				} else if (choiceTurbo == 2) {
					isTurbo = false;
				} else {
					System.out.println("Invalid turbo type! please Enter Input again: ");
					choiceTurbo = 0;
				}

			}
		} else if (vehicleType == "heavy") {
			engineType = "diesel";
			System.out.print("Enter the weight of vehicle: ");
			weight = sc.nextInt();
		}

		// engine power

		System.out.print("Enter engine's power: ");
		enginePower = sc.nextInt();

		// tire size

		System.out.print("Enter tire's size: ");
		tireSize = sc.nextInt();

		// creating object

		if (vehicleType == "normal") {
			NormalVehicle vehicle1 = new NormalVehicle(vehicleType, modelNumber, engineType, enginePower, tireSize);
			showroom.addVehicle(vehicle1);

		} else if (vehicleType == "heavy") {
			HeavyVehicle vehicle1 = new HeavyVehicle(vehicleType, modelNumber, enginePower, tireSize, weight);
			showroom.addVehicle(vehicle1);
		} else if (vehicleType == "sports") {
			SportsVehicle vehicle1 = new SportsVehicle(vehicleType, modelNumber, enginePower, tireSize, isTurbo);
			showroom.addVehicle(vehicle1);
		}

	}

}
