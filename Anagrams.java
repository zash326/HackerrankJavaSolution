static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        if(a.length()!=b.length()){
            return false;
        }
        int hash1[]=new int[26];
        int hash2[]=new int[26];
        for(int i=0;i<a.length();i++){
            if(Character.isUpperCase(a.charAt(i))){
                hash1[a.charAt(i)-65]=hash1[a.charAt(i)-65]+1;
            }
            else{
                hash1[a.charAt(i)-97]=hash1[a.charAt(i)-97]+1;
            }
        }
            for(int i=0;i<b.length();i++){
            if(Character.isUpperCase(b.charAt(i))){
                hash2[b.charAt(i)-65]=hash2[b.charAt(i)-65]+1;
            }
            else{
                hash2[b.charAt(i)-97]=hash2[b.charAt(i)-97]+1;
            }
        }
        int val=0;
        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]){
                val=1;
                return false;
            }
        }
       
            return true;
     
    }