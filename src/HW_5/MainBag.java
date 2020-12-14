package HW_5;

public class MainBag {
    static Bag<BagPackage> bag = new Bag<BagPackage>(15);
    static BagPackage p1 = new BagPackage(2, 5);
    static BagPackage p2 = new BagPackage(10, 3);
    static BagPackage p3 = new BagPackage(3, 8);
    static BagPackage p4 = new BagPackage(7, 5);
    static BagPackage[] b = {p1, p2, p3, p4};
    public static void main(String[] args) {
        System.out.println(findBestRes(b.length - 1, bag.getCapacity()));
    }

    private static int findBestRes(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (b[i].getWeight() > weight) {
            return findBestRes(i - 1, weight);
        } else {
            return Math.max(findBestRes(i - 1, weight), findBestRes(i - 1, weight - b[i].getWeight()) + b[i].getValue());
        }
    }
}

