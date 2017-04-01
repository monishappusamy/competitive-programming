public class Solution {
    public int HammingDistance(int x, int y) {
        int z = x^y;
        return CountBits((uint)z);
    }
    public int CountBits(uint value)
        {
            int count = 0;
            while (value != 0)
            {
                count++;
                value &= value - 1;
            }
            return count;
        }
}
