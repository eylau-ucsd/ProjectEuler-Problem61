package problem61;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import problem61.Figurates.Heptagon;
import problem61.Figurates.Hexagon;
import problem61.Figurates.Octagon;
import problem61.Figurates.Pentagon;
import problem61.Figurates.Square;
import problem61.Figurates.Triangle;

public class Solution {
    public static void main(String[] args) {
        Set<Figurate> figurates = new HashSet<Figurate>();
        figurates.add(new Triangle());
        figurates.add(new Square());
        figurates.add(new Pentagon());
        figurates.add(new Hexagon());
        figurates.add(new Heptagon());
        figurates.add(new Octagon());
        for (Figurate f : figurates) {
            Set<Figurate> newFigurates = new HashSet<>(figurates);
            newFigurates.remove(f);
            for (int num : new NumberSequence(f)) {
                List<Integer> nums = new ArrayList<>();
                nums.add(num);
                List<Integer> result = getCyclic(newFigurates, nums);
                if (result != null) {
                    System.out.println(result);
                    int sum = 0;
                    for (int i : result) {
                        sum += i;
                    }
                    System.out.println(String.format("Sum = %d", sum));
                    return;
                }
            }
        }
    }

    public static List<Integer> getCyclic(Set<Figurate> remainingFigurates, List<Integer> nums) {
        int prefix = nums.get(nums.size() - 1) % 100;
        // if all figurates cleared AND first two digits is same as last two digits
        if (remainingFigurates.size() == 0 && nums.get(0) / 100 == nums.get(nums.size() - 1) % 100) {
            return nums;
        }
        for (Figurate f : remainingFigurates) {
            Set<Figurate> newRemainingFigurates = new HashSet<>(remainingFigurates);
            newRemainingFigurates.remove(f);
            // iterate over numbers with that prefix in the number sequence of that particular figurate
            // no recursive calls will be made if there are no numbers with that prefix, of that particular figurate
            for (int possibleNum : new NumberSequence(prefix, f)) {
                if (possibleNum / 100 != prefix) {
                    System.out.println("This isn't supposed to happen");
                }
                if (possibleNum < 1000) continue; // don't count a 4-digit-number if it doesn't have 4 digits
                List<Integer> newNums = new ArrayList<>(nums);
                newNums.add(possibleNum);
                List<Integer> result = getCyclic(newRemainingFigurates, newNums);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
}
