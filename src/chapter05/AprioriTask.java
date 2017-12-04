package chapter05;

import weka.core.Instances;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;

import weka.associations.Apriori;

public class AprioriTask {
	public static void main(String args[]) throws Exception {
		Instant start = Instant.now();
		Instances data = new Instances(new BufferedReader(new FileReader("data/supermarket.arff")));
		
		Apriori model = new Apriori();
		model.buildAssociations(data);
		System.out.println(model);
		
		Instant end = Instant.now();
		System.out.println("Processing Time: " + Duration.between(start, end));
	}
}
