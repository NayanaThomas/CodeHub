package codeing;
import java.util.Arrays;

public class Elevator {
	
	public static void main(String[] args){
			int[] floor = new int [] {3,3,2,2,3};
			int[] weights = new int [] {40,40,100,80,20};
			int maxWeight=200;
			int maxNumber=5;
			int liftweight =0;
			int start =0;
			int stops=0;
			int[] liftFloors = new int[floor.length];
			int count=0;
			for(int i=0;i<floor.length;i++) {
				if(count<maxNumber && liftweight+weights[i]<=maxWeight)
				{
					count ++;
					liftweight = liftweight + weights[i];
					
				}
				else
				{   int[] currFloors = new int[count];
					for(int p=start,q=0;p<start+count;p++,q++)
					{
						currFloors[q]=floor[p];
					}
					
					Arrays.sort(currFloors); 
					int curr = currFloors[0];
					stops = stops+1;
				 	for(int j=1;j<count;j++) {
				 		if(currFloors[j]!=curr) {
				 			curr=currFloors[j];
				 			stops = stops+1;
				 		}
				 	}
					count=0;
					liftweight =0;
					
					start = i;
					stops = stops+1;
					count ++;
					liftweight = liftweight + weights[i];
					
				}
			}
			int[] currFloors = new int[count];
			for(int p=start,q=0;p<start+count;p++,q++)
			{
				currFloors[q]=floor[p];
			}
			
			Arrays.sort(currFloors);
			int curr = currFloors[0];
			stops = stops+1;
		 	for(int j=1;j<count;j++) {
		 		if(currFloors[j]!=curr) {
		 			curr=currFloors[j];
		 			stops = stops+1;
		 		}
		 	}
			stops = stops+1;
		    System.out.println(stops);     
		    }
		}
	
	