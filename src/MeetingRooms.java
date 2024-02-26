import java.util.Arrays;
import java.util.Comparator;
class MeetingRooms {
    public static void main(String[] args){
        int[][] s = {{0,30},{5,10},{15,20}};
        System.out.println(MeetingRoomsone(s));
        System.out.println(MeetingRoomstwo(s));
    }
    public static void sortbyColumn(int arr[][], int col) //sorting function of 2d array by column
    {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(final int[] entry1,final int[] entry2)
            {
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });
    }
    static boolean MeetingRoomsone(int[][] intervals) {
        int col = 1;
        sortbyColumn(intervals, col - 1);
        int i = 0;
        while(i<intervals.length-1){
            if(intervals[i][1]>intervals[i+1][0]){
                return false;
            }
            i++;
        }
        return true;
        
    }
    public static int MeetingRoomstwo(int[][] intervals) {
        int[] start = {0,5,15}; //sorted
        int[] end = {10,15,30};
        int res= 0;
        int count = 0;
        int s = 0;
        int e = 0;
        while (s < intervals.length ){
            if (start[s] < end[e]){
                s++;
                count++;
            }
            else{
                e++;
                count--;
            }
            res = Math.max(res, count);
        }
    return res;
    }
    public static int MeetingRoomsthree(int n, int[][] meetings) {
        long[] roomAvailabilityTime = new long[n];
        int[] count = new int[n];
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            boolean UnusedRoom = false;
            int minAvailableTimeRoom = 0;
            long minRoomAvailabilityTime = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (roomAvailabilityTime[i] <= start) {
                    UnusedRoom = true;
                    count[i]++;
                    roomAvailabilityTime[i] = end;
                    break;
                }
                if (minRoomAvailabilityTime > roomAvailabilityTime[i]) {
                    minRoomAvailabilityTime = roomAvailabilityTime[i];
                    minAvailableTimeRoom = i;
                }
            }
            if (!UnusedRoom) {
                roomAvailabilityTime[minAvailableTimeRoom] += end - start;
                count[minAvailableTimeRoom]++;
            }
        }
        int maxMeetingCount = 0, maxMeetingCountRoom = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > maxMeetingCount) {
                maxMeetingCount = count[i];
                maxMeetingCountRoom = i;
            }
        }
        return maxMeetingCountRoom;
    }
    
}