package chapter05;

import weka.core.Instances;
import java.io.BufferedReader;
import java.io.FileReader;
import weka.associations.FPGrowth;

public class FPGrowthTask {
	public static void main(String args[]) throws Exception {
		Instances data = new Instances(new BufferedReader(new FileReader("data/supermarket.arff")));
		
		FPGrowth model = new FPGrowth();
		model.buildAssociations(data);
		
		System.out.println(model);
	}
}
