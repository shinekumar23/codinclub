class HelloWorld{
	 public static void main(String args[]){
				int i=0;
				while(true){
							System.out.println("Hello world : "+i);
							i++;
							try{
										Thread.sleep(3000);
							}catch(Exception e){
										  System.out.println(e);
							}
				}
	  }
}
	
