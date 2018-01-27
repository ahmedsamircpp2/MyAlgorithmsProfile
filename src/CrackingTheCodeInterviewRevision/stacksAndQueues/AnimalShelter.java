package CrackingTheCodeInterviewRevision.stacksAndQueues;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<AnimalType> animalShelters=new LinkedList<>();

    enum AnimalType {
        CAT(0), DOG(0);
        private int type;

        AnimalType(int type) {
            this.type = type;
        }

    }

    void enqueue(AnimalType as) {
        animalShelters.addLast(as);
    }

    AnimalType dequeue(AnimalType type) {
        if (animalShelters.isEmpty())
            return null;
        else {
            if (type == null) animalShelters.removeFirst();
            else {
                Iterator<AnimalType> it = animalShelters.iterator();
                while (it.hasNext()) {
                    AnimalType current = it.next();
                    if (current.equals(type)) {
                        it.remove();
                        return current;
                    }
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(AnimalType.CAT);
        animalShelter.enqueue(AnimalType.CAT);
        animalShelter.enqueue(AnimalType.DOG);
        animalShelter.enqueue(AnimalType.CAT);
        animalShelter.enqueue(AnimalType.DOG);
        animalShelter.enqueue(AnimalType.CAT);

        System.out.println(animalShelter.animalShelters);
//        System.out.println(animalShelter.dequeueAny());
        animalShelter.dequeue(null);
        System.out.println(animalShelter.animalShelters);

    }
}

