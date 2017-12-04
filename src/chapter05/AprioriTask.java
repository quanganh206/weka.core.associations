package chapter05;

import weka.core.Instances;
import java.io.BufferedReader;
import java.io.FileReader;

import weka.associations.Apriori;

public class AprioriTask {
	public static void main(String args[]) throws Exception {
		Instances data = new Instances(new BufferedReader(new FileReader("data/supermarket.arff")));
		
		Apriori model = new Apriori();
		model.buildAssociations(data);
		System.out.println(model);
	}
}
