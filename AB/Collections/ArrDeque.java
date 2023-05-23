import java.util.*;

class ArrDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.add(45);
        ad.add(26);
        ad.add(82);
        ad.add(91);
        ad.add(76);

        for(Integer i:ad){
            System.out.print(i+" "); //45 26 82 91 76 
        }

        System.out.println();
        System.out.println(ad); //[45, 26, 82, 91, 76]
        ad.clear();
        System.out.println(ad); //[]

        ad.add(98);
        ad.add(430);
        ad.addFirst(564);
        ad.addFirst(456);
        ad.addLast(678);
        ad.addLast(291);
        System.out.println(ad); //[456, 564, 98, 430, 678, 291]

        int first=ad.removeFirst();
        int last=ad.removeLast();
        System.out.println(first+" "+last); //456 291
        System.out.println(ad); //[564, 98, 430, 678]



        for (Iterator itr = ad.iterator();itr.hasNext();) {
            System.out.print(itr.next()+" "); //564 98 430 678
        }

        System.out.println();
        for (Iterator dItr = ad.descendingIterator();dItr.hasNext();) {
            System.out.print(dItr.next()+" "); //678 430 98 564
        }

        System.out.println();
        System.out.println(ad.element()); //564
        System.out.println(ad.getFirst()); //564
        System.out.println(ad.getLast()); //678
        System.out.println(ad.peek()); //564
        System.out.println(ad.poll()); //564


        Object[] arr = ad.toArray();
        System.out.println("Array Size:"+arr.length); //Array Size:3
        System.out.print("Array elements : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]); //Array elements :  98 430 678

        System.out.println();
        System.out.println(ad.poll()); //98
        System.out.println(ad); //[430, 678]
        ad.push(265);
        ad.push(984);
        ad.push(2365);
        System.out.println(ad); //[2365, 984, 265, 430, 678]
        System.out.println(ad.remove()); //2365
        System.out.println(ad); //[984, 265, 430, 678]


        ad.offer(234);
        System.out.println(ad); //[984, 265, 430, 678, 234]
        ad.offerFirst(532);
        ad.offerLast(879);
        System.out.println(ad); //[532, 984, 265, 430, 678, 234, 879]

        System.out.println(ad.poll()); //532
        System.out.println(ad.pollFirst()); //984
        System.out.println(ad.pop()); //265
        System.out.println(ad.pollLast()); //879
        System.out.println(ad); //[430, 678, 234]
    }
}