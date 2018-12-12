package com.algorithms.example;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {

    public static class Pet {
        private String type;
        public Pet(String type) {
            this.type = type;
        }
        public String getPetType() {
            return this.type;
        }

    }

    public static class Dog extends Pet {
        public Dog() {
            super("dog");
        }
    }

    public static class Cat extends Pet {
        public Cat() {
            super("cat");
        }
    }

    public static class petEnter{

        private int count;
        private Pet pet;

        public petEnter(Pet pet, int count) {
            this.count = count;
            this.pet = pet;
        }

        public Pet getPet() {
            return this.pet;
        }

        public int getCount(){
            return this.count;
        }

        public String getPetEnterType() {
            return this.pet.getPetType();
        }
    }


    public static class cdQueue {
        private Queue<petEnter> dogQ;
        private Queue<petEnter> catQ;
        private int count;

        public cdQueue() {
            this.dogQ = new LinkedList<petEnter>();
            this.catQ = new LinkedList<petEnter>();
            this.count = 0;
        }

        public void add(Pet pet) {
            if(pet.getPetType().equals("dog")){
                this.dogQ.add(new petEnter(pet, count++));
            } else if (pet.getPetType().equals("cat")) {
                this.catQ.add(new petEnter(pet, count++));
            } else {
                throw new RuntimeException("error, not dog or cat");
            }
        }

        public Pet pollAll() {
            if (this.dogQ.isEmpty() && this.catQ.isEmpty()) {
                throw new RuntimeException("error, queue is empty!");
            } else if (this.catQ.isEmpty()) {
                return this.dogQ.poll().getPet();
            } else if (this.dogQ.isEmpty()) {
                return this.catQ.poll().getPet();
            } else {
                return this.catQ.peek().getCount()<this.dogQ.peek().getCount() ? this.catQ.poll().getPet() : this.dogQ.poll().getPet();
            }
        }

        public Pet pollDog() {
            if (this.dogQ.isEmpty()) {
                throw new RuntimeException("error, no dog!");
            } else {
                return dogQ.poll().getPet();
            }
        }

        public Pet pollCat() {
            if (this.catQ.isEmpty()) {
                throw new RuntimeException("error, no cat!");
            } else {
                return catQ.poll().getPet();
            }
        }

        public boolean isEmpty() {
            if (catQ.isEmpty() && dogQ.isEmpty()){
                return true;
            } else {
                return false;
            }
        }

        public boolean isDogEmpty() {
            return dogQ.isEmpty();
        }

        public boolean isCatEmpty() {
            return catQ.isEmpty();
        }
    }


    public static void main (String[] args) {
        cdQueue test = new cdQueue();

        Pet dog1 = new Dog();
        Pet cat1 = new Cat();
        Pet dog2 = new Dog();
        Pet cat2 = new Cat();
        Pet dog3 = new Dog();
        Pet cat3 = new Cat();

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        while (!test.isEmpty()) {
            System.out.println(test.pollAll().getPetType());
        }
    }

}



