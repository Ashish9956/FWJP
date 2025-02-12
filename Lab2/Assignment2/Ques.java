package Assignment2;

class Ques{
   public static void evenrange(int s, int e){
    for(;s<=e;s++){
      if(s%2==0){
        System.out.print(s+" ");
      }
     }
   }

   public static void main(String[] args) {
           evenrange(2, 10);
   }
}
