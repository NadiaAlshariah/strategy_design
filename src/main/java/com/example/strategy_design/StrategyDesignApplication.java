package com.example.strategy_design;

import com.example.strategy_design.Filter.GreaterthanFilter;
import com.example.strategy_design.Filter.LessthanFilter;
import com.example.strategy_design.Search.BinarySearch;
import com.example.strategy_design.Search.LinearSearch;
import com.example.strategy_design.Search.Search;
import com.example.strategy_design.Sort.BubbleSort;
import com.example.strategy_design.Sort.InsertionSort;
import com.example.strategy_design.Sort.MergeSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDesignApplication {

	public static void main(String[] args) {

		//SpringApplication.run(StrategyDesignApplication.class, args);

		int [] array = {1,7,43,8,2,6,8,2,56};
		// print the array
		System.out.println("The array:");
		for(int num:array){
			System.out.print(num + " ");
		}
		System.out.println();

		// array Processor1
		ArrayProcessor arrayProcessor1 = new ArrayProcessor(new BubbleSort(), new BinarySearch(), new GreaterthanFilter());

		// sort the array
		arrayProcessor1.sort(array);
		System.out.println("The array after sorting:");
		for(int num:array){
			System.out.print(num + " ");
		}
		System.out.println();

		// search
		System.out.println("the index of value (7): ");
		System.out.println(arrayProcessor1.search(array, 7));

		// filter
		System.out.println("The array after filtering with greater than:");
		arrayProcessor1.filter(array, 7);

		// ------------------------------

		int [] array2 = {6,3,6,8,23,6,8,3,78,9,67,4};
		// print the array
		System.out.println("The array:");
		for(int num:array2){
			System.out.print(num + " ");
		}
		System.out.println();

		// array Processor1
		ArrayProcessor arrayProcessor2 = new ArrayProcessor(new MergeSort(), new LinearSearch(), new LessthanFilter());

		// sort the array
		arrayProcessor2.sort(array2);
		System.out.println("The array after sorting:");
		for(int num:array2){
			System.out.print(num + " ");
		}
		System.out.println();

		// search
		System.out.println("the index of value (78): ");
		System.out.println(arrayProcessor2.search(array2, 78));

		// filter
		System.out.println("The array after filtering with greater than:");
		arrayProcessor2.filter(array2, 9);

		// ----------------------------------------

		int [] array3 = {645,645,87,245,7568,253645,76574};
		// print the array
		System.out.println("The array:");
		for(int num:array3){
			System.out.print(num + " ");
		}
		System.out.println();

		// array Processor1
		ArrayProcessor arrayProcessor3 = new ArrayProcessor(new InsertionSort(), new LinearSearch(), new GreaterthanFilter());

		// sort the array
		arrayProcessor3.sort(array3);
		System.out.println("The array after sorting:");
		for(int num:array3){
			System.out.print(num + " ");
		}
		System.out.println();

		// search
		System.out.println("the index of value (78): ");
		System.out.println(arrayProcessor3.search(array3, 78));

		// filter
		System.out.println("The array after filtering with greater than:");
		arrayProcessor3.filter(array3, 245);


	}

}
