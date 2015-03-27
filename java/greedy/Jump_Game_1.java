public class Solution {

    public boolean canJump(int[] A) {

       if(A.length ==1)

            return A[0] >= 0;

        int Pilot = 0;

        int max = 0;

        int rePilot = -1;

        int temp = 0;

        while (rePilot != Pilot) {



            rePilot = Pilot;

            for(int j = Pilot + 1; j < A[Pilot] + Pilot + 1; j++){

                int se =A[j] + j ;

                if(se > max){

                    max = se;

                    if(se >= A.length - 1)

                        return true;

                    temp = j;

                }

            }

            Pilot = temp;



        }

        return false;

    }

}
