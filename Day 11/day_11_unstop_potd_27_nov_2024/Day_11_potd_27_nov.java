/*

https://unstop.com/code/practice/307597

Given a linked list of size N, where each element is a positive integer,
the task is to find the largest element in the list with the minimum frequency.
In other words, you need to determine the integer value that appears the least number of times in the list 
but has the highest value among those least frequent elements.

Input Format
The first line contains an integer, N, representing the size of the linked list.
The next line contains N space-separated positive integers, representing the elements of the linked list.
Output Format
The output is a single integer, representing the largest element with the minimum frequency in the linked list.


----------------------------- code ----------------------------

import java.util.HashMap;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void push(int data) {
        Node temp = new Node(data);
        if (this.head == null) {
            this.head = temp;
            this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
    }

    int findLargestMinFreq() {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        Node current = this.head;

        while (current != null) {
            frequencyMap.put(current.data, frequencyMap.getOrDefault(current.data, 0) + 1);
            current = current.next;
        }

        int minFrequency = Integer.MAX_VALUE;
        int largestElement = Integer.MIN_VALUE;

        for (int key : frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);
            if (freq < minFrequency || (freq == minFrequency && key > largestElement)) {
                minFrequency = freq;
                largestElement = key;
            }
        }

        return largestElement;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            ll.push(t);
        }

        System.out.println(ll.findLargestMinFreq());
    }
}

 */