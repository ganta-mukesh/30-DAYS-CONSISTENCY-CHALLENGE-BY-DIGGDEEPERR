class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> 
            Integer.compare(distance(a), distance(b))
        );

        return Arrays.copyOfRange(points, 0, k);
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1]; 
    }
}
