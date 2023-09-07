package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Animals[] animals ={
                new Cat("Том"),
                new Dog("Бо"),
                new Tiger("Тим"),
                new Wolf("Тайлер"),
                new Lion("Лева"),
                new Crocodile("Лакост")
        };

        int numCats = 0;
        int numDogs = 0;
        int numTigers = 0;
        int numWolfs = 0;
        int numLions = 0;
        int numCrocodiles = 0;
        int numAnimals = 0;

        for(Animals animal : animals)
        {
            animal.run(300);
            animal.swim(15);
            if (animal instanceof Cat)
            {
                numCats++;
                numAnimals++;
            }
            else if (animal instanceof Dog)
            {
                numDogs++;
                numAnimals++;
            }
            else if (animal instanceof Tiger)
            {
                numTigers++;
                numAnimals++;
            }
            else if (animal instanceof Wolf)
            {
                numWolfs++;
                numAnimals++;
            }
            else if (animal instanceof Lion)
            {
                numLions++;
                numAnimals++;
            }
            else if (animal instanceof Crocodile)
            {
                numCrocodiles++;
                numAnimals++;
            }

            if (animal instanceof Beast) {
                Beast beast = (Beast) animal;
                System.out.println(animal.name + " питается " + beast.eat());
            }

            System.out.println();
        }
        System.out.println("Создано котов: " + numCats);
        System.out.println("Создано собак: " + numDogs);
        System.out.println("Создано тигров: " + numTigers);
        System.out.println("Создано волков: " + numWolfs);
        System.out.println("Создано львов: " + numLions);
        System.out.println("Создано крокодилов: " + numCrocodiles);
        System.out.println("Создано животных: " + numAnimals);
    }

}