public class Solution {

    public int jump(int[] A) {

        if (A.length == 1)

            return 0;

        if(A.length == 2)

            return 1;

        int Pilot = 0;

        int max = 0;

        int rePilot = -1;

        int temp = 0;

        int count = 1;

        while (rePilot != Pilot) {

            rePilot = Pilot;

            if(A[Pilot] >= A.length - 1 - Pilot)

                    return count;

            for (int j = Pilot + 1; j < A[Pilot] + Pilot + 1; j++) {



                int se = A[j] + j;

                if (se > max) {

                    max = se;

                    if (se >= A.length - 1)

                        return count + 1;

                    temp = j;

                }

            }

            Pilot = temp;

            count++;

        }

        return  count;

    }

}
