package week1.day1;

public class TwoWheeler {
public int noOfWheels = 2;
public short noOfmirrors = 2;
public long chasisNumber = 123473645L;
public boolean isPunctured = false;
public String bikeName = "Pulsar";
public double runningKM = 80.08;

	public static void main(String[] args) {
		TwoWheeler Vehicle = new TwoWheeler();
		System.out.println("noOfWheels:"+Vehicle.noOfWheels);
		System.out.println("noOfmirrors:"+Vehicle.noOfmirrors);
		System.out.println("chasisNumber:"+Vehicle.chasisNumber);
		System.out.println("bikeName:"+Vehicle.bikeName);
		System.out.println("runningKM:"+Vehicle.runningKM);

	}

}
