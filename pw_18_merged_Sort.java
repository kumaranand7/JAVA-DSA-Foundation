package pw;

public class pw_18_merged_Sort {

public static void didvide(int arr[],int se, int ee){

    if (se>=ee){
        return;
    }
    int mid = se+(ee-se)/2;
//      int mid = (se+ee)/2;  why? + problem of array idex out of bound

    didvide(arr,se,mid);
    didvide(arr,mid+1,ee);
    conquer(arr,se,mid,ee);


}


public static void conquer(int arr[],int se,int mid,int ee){

    int merged[]=new int[ee-se+1];

    int idx1=se;
    int indx2=mid+1;
    int x=0;

   while (idx1<=mid && indx2<=ee){

       if (arr[idx1]<=arr[indx2]){
           merged[x++]=arr[idx1++];

       }
       else {

           merged[x++]=arr[indx2++];
       }

   }

    while (idx1<=mid){

        merged[x++]=arr[idx1++];

    }

    while ( indx2<=ee){

        merged[x++]=arr[indx2++];
    }


   for(int i=0, j=se; i<merged.length; i++,j++){

       arr[j]=merged[i];

    }

}


    public static void main(String[] args) {


        int arr[]={12,33,3,23,77,1,4};

        int se=0;
        int ee= arr.length-1;

        didvide(arr,0, arr.length-1 );

        for (int element:arr) {
            System.out.print(element+" ") ;
        }

    }
}
