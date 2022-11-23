package 선택정렬;
class Main {	
	public int[] solution(int n, int[] arr){
		for(int i=0; i<n-1; i++){
			int idx=i;
			for(int j=i+1; j<n; j++){
				if(arr[j]<arr[idx]) idx=j;
			}
			int tmp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
		}
		return arr;
	}

	public static void main(String[] args){
		Main T = new Main();
		int n=6;
		int arr[]= {7,5,9,4,65,1};
		for(int x : T.solution(n,arr)) System.out.print(x+" ");
	}
}