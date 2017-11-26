package cn.allInner.pojo.Impl;


import cn.allInner.pojo.Dog;



public class DogOne implements Dog {

    private DogTwo dogTwo ;
    public DogOne(DogTwo dogTwo) {
        this.dogTwo = dogTwo;
    }
    public void run() {
        dogTwo.run();
        System.out.println("moreFast");
    }
}
