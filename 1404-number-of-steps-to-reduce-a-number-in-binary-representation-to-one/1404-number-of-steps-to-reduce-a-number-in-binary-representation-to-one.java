class Solution {
    public int numSteps(String s) {
        int Numsteps = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) - '0' + carry == 1) { // carry is 1 and bit is zero means that it needs another add 1 and shift ||| carry is 0 and bit is 1 so one more add and shift to it.
                carry = 1;
                Numsteps += 2; 
            } else { // in case of carry 1 and bit 1 this mean that bit is now 0 so one operation shift and carry kept for he comming bits
                Numsteps += 1;
            }
        }
        return Numsteps + carry; // in case we have carry 1 >> 1111 so one carry remain
    }
}