class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


   char x = '#';
  
                for (int i = 1; i < 20; i++)
                {
                    System.out.print("\t");
                    for (int j = 1; j < i; j++)
                    {
                        System.out.print(""+ x);
                    }
                    System.out.println();
                }
     for (int i = 20; i > 0; i--)
                {
                    System.out.print("\t");
                    for (int j = 20; j > i; j--)
                    {
                        System.out.print(x);
                    }
                    System.out.println();
                }
    
    }
}

