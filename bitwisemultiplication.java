public class bitwisemultiplication{
    public static void main(String[] args) {
     bitwiseMultiply(4, 03);
    

    }
        public static void bitwiseMultiply(int n1, int n2) {
            int a = n1;
            int b = n2;
            int result = 0;
        
           
            while (b != 0)
            {
               
                if ((b & 1) != 0)
                {
                   
                    result = result + a;
                }    
                a <<= 1;
                b >>>= 1;
            }
        
            System.out.println(result);
        }    
}




      
    

