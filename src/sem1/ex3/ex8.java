package sem1.ex3;


public class ex8 {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char[] omitArray = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++)
        {
            Boolean statement = true;
            for(j = 0; j < omitArray.length; j++)
            {
                if(b == omitArray[j])
                {
                    i--;
                    statement = false;
                    break;
                }
            }
            if(statement)
            {
                charArray[i] = b;
            }
            b++;
        }

        for(int k = 0; k < n; k++){
            System.out.print(charArray[k] + "\t");
        }
    }
}