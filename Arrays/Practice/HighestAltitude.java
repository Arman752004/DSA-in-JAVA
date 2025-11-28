package Arrays.Practice;
//https://leetcode.com/problems/find-the-highest-altitude/description/

public class HighestAltitude {
    // public int largestAltitude(int[] gain) {
    //     int altitude = 0;
    //     int maxAltitude = 0;

    //     for(int g : gain){
    //         altitude += g;
    //         if(altitude > maxAltitude){
    //             maxAltitude = altitude;
    //         }
    //     }
    //     return maxAltitude;
    // }

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for(int g : gain){
            altitude += g;
            maxAltitude = Math.max(maxAltitude,altitude);
        }
        return maxAltitude;
    }
}
