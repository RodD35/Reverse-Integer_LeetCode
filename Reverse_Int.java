class Solution {
    public int reverse(int x) {
        int l, z = 0;
        if(x < 0) {
            x = Math.abs(x);
            l = String.valueOf(x).length();
            for(int y = l; y > 0; y--) {
                z += (x % 10)*Math.pow(10, y - 1);
                x = x/10;
            }
            if (z >= Math.pow(2, 31) - 1 || z <= Math.pow(-2, 31)){
                return 0;
            }
            return -z;
        } else {
            l = String.valueOf(x).length();
            for(int y = l; y > 0; y--) {
                z += (x % 10)*Math.pow(10, y - 1);
                x = x/10;
            }
            if (z >= Math.pow(2, 31) - 1 || z < Math.pow(-2, 31)-1){
                return 0;
            }
            return z;
        }
    }
}
