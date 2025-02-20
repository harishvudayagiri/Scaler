package com.NotScalerPractice;

public class RainWaterTrapped {


    public int totalRainWaterTrapped(int[] height) {
        int n=height.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        int totalWater = 0;
        lmax[0]=height[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(height[i],lmax[i-1]);

        }
        rmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(height[i],rmax[i+1]);

        }
        for (int i = 0; i < n; i++) {
            totalWater=totalWater+(Math.min(lmax[i],rmax[i])-height[i]);
            System.out.println(height[i]+" "+",Total water="+totalWater);
        }

return totalWater;
    }


    public static void main(String[] args) {
RainWaterTrapped rainWaterTrapped=new RainWaterTrapped();
    int[] hea= {5,4,3,1,2,6};
   System.out.println("Total trapped="+rainWaterTrapped.totalRainWaterTrapped(hea));
    }
}
