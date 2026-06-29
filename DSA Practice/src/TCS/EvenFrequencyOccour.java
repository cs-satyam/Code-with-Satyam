package TCS;

import java.io.*;
import java.util.HashMap;

public class EvenFrequencyOccour {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int c=1;
        int ans=0;
        for(int i=1;i<s.length();i++) {
           if( s.charAt(i)== s.charAt(i-1)) {
               c++;
           } else {
                   if(c%2==0){
                       ans+=c;
                   }
                   c=1;
               }
           }
        if (c % 2 == 0) {
            ans += c;
        }

        System.out.println(ans);
        }


    }

