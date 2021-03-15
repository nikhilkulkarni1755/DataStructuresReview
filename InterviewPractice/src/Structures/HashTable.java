package Structures;

import java.util.Random;

public class HashTable {

	//Key Value Pair
	//we create a key for every value we want to insert
	
	//Access -> O(1)
	//Search -> N/A
	//Insertion -> O(1)
	//Deletion -> O(1)
	
	/*
	_ _ 4 _ _ 3 _
	5, 3
	5, 7
	
	
	
	*/
	
	//COLLISION
	//O(n) linkedlist
	//O(1) binary search tree
	
	//hashing algorithms can be anything, prime numbers 
	//203 % 21
	//14 
	
	//this could not only be int. 
	
	//instance variable
	//public, private or protected
	private int[] table; 
	private int hash;
	
	//
	private int size;
	
	public HashTable() {
		this.size = 100;
		table = new int[size];
		//now we need hashing function
		this.hash = getPrimeNumber();
	}
	
	//definition of prime is num is divisible by 1 and itself ONLY
	
	public static boolean isPrime(int x) {
		
		for(int i = 2; i <= x/2; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		
		return true; 
	}
	
	public static int getPrimeNumber() {
		
		Random rand = new Random();
		int num;
		do {
			num = rand.nextInt(100) + 100; //101 - 200
		}
		while(!isPrime(num));
		
		return num;	
	}
	
	public int getHash() {
		return this.hash;
	}
	
	public void printTable() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " -> " + table[i]);
		}
	}
	
	//non collision
	//keep the previous value, hence it never changes
	//keep the new value, hence it only keeps the latest changes IMPLEMENTING
	
	//works for 101010, getting index out of bounds for some greater vals. 
	public boolean insert(int x) {
		int index = x % getHash();
		
		//what if index > 100?
		//
		
		//check how many digits there are in index.
		//divide accordingly so we get something in between 2 - 3 digits. 
		if(index > 100 && index <= 999) {
			index = index/10;
		}
		
		//there is no value, so can insert. 
		if(table[index] == 0) {
			table[index] = x;
			return true;
		}
		else {
			table[index] = x;
			return false; 
		}
		
	}
	
	public static void main(String[] args) {

		HashTable h = new HashTable();
		System.out.println(h.getHash());
		System.out.println(h.hash);
		h.printTable();
		h.insert(101010);

		h.printTable();
		
	}

}
