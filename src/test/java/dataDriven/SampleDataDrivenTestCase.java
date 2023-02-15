package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.TargetDataLine;

public class SampleDataDrivenTestCase {

	public static void main(String[] args) throws IOException {
		DataDriven d = new DataDriven();
		ArrayList<String> data = d.getData("Add profile");

		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		data.add("XYZ");
		System.out.println(data.get(4));
		data.add(4, "XYZ");
		System.out.println(data.get(4));

	}
}
