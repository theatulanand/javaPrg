import java.lang.*;
import java.io.*;
class emp
    {
       InputStreamReader ir=new InputStreamReader(System.in); 
       BufferedReader br =new BufferedReader(ir); 
          
       String cd,nm,jnm;
       int sal,alw,nsal;
       
       public void getdata()throws IOException
         {
              System.out.println("Enter code");
              cd=br.readLine();
  
              System.out.println("Enter name");
              nm=br.readLine();

              System.out.println("Enter jobname");
              jnm=br.readLine();

              System.out.println("Enter salary");
              sal=Integer.parseInt(br.readLine());
         }

       public void show()
         {
       
          if(jnm.compareTo("clerk")==0)
               alw=sal*20/100;
          else
             {
               if(jnm.compareTo("peon")==0)
                  alw=sal*15/100;
               else
                 { 
                  if(jnm.compareTo("guard")==0)
                      alw=sal*10/100;
                  else
                      alw=0;
                 }
               }
            nsal=sal+alw; 
              
          System.out.println("code  "+cd);     
          System.out.println("name  "+nm); 
          System.out.println("Job name  "+jnm);     
          System.out.println("salary  "+sal);     
          System.out.println("Net salary  "+nsal);     
         }
     

       public static void main(String args[])throws IOException
         
         {
             emp e=new emp();
             e.getdata();
             e.show();    
         }                          

     		
	      
    }   










       








       