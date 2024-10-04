class Solution {
    public int solution(int[] array, int n) {
        int closest = array[0];
        
        for (int num : array) {
            int currentDistance = Math.abs(num - n);
            int closestDistance = Math.abs(closest - n);
            
            if (currentDistance < closestDistance || 
                (currentDistance == closestDistance && num < closest)) {
                closest = num;
            }
        }
        
        return closest;
    }
}
