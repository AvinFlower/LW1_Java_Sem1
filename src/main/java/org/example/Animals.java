package org.example;

public class Animals
{
    String name;
    int maxRunDist;
    int maxSwimDist;
    public Animals(String name, int maxRunDist, int maxSwimDist)
    {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

    public void run(int distance) {
        if (distance <= maxRunDist)
        {
            System.out.println(name + " пробежал " + distance + "м");
        }
        else
        {
            System.out.println(name + " не может пробежать " + distance + "м");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDist)
        {
            System.out.println(name + " проплыл " + distance + "м");
        }
        else
        {
            System.out.println(name + " не может проплыть " + distance + "м");
        }
    }
}

class Cat extends Animals
{
    public Cat(String name)
    {
        super(name, 300 , 0);
    }
}

class Dog extends Animals
{
    public Dog(String name)
    {
        super(name, 500 , 20);
    }
}

class Tiger extends Animals
{
    public Tiger(String name)
    {
        super(name,700,30);
    }
}

abstract class Beast extends Animals
{
    public Beast(String name, int maxRunDist, int maxSwimDist)
    {
        super(name, maxRunDist, maxSwimDist);
    }
    public abstract String eat();
}

class Wolf extends Beast
{
    public Wolf(String name)
    {
        super(name,600,15);
    }

    @Override
    public String eat()
    {
        return "зайцами";
    }
}

class Lion extends Beast
{
    public Lion(String name)
    {
        super(name,250,25);
    }

    @Override
    public String eat()
    {
        return "зебрами";
    }
}

class Crocodile extends Beast
{
    public Crocodile(String name)
    {
        super(name,50,100);
    }

    @Override
    public String eat()
    {
        return "рыбами";
    }
}