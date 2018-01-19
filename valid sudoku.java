public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        int[] hash;
        
        //rows
        for(int i=0;i<9;i++){
            hash=new int[10];
            for(int j=0;j<9;j++){
                char temp=A.get(i).charAt(j);
                if(temp!='.'&&hash[temp-'0']==1){
                    return 0;
                }
                else if(temp!='.'){
                    hash[temp-'0']=1;
                }
            }
        }
        
        //columns
        for(int i=0;i<9;i++){
            hash=new int[10];
            for(int j=0;j<9;j++){
                char temp=A.get(j).charAt(i);
                if(temp!='.'&&hash[temp-'0']==1){
                    return 0;
                }
                else if(temp!='.'){
                    hash[temp-'0']=1;
                }
            }
        }
        
        //blocks
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                hash=new int[10];
                for(int is=i*3;is<i*3+3;is++){
                    for(int js=j*3;js<j*3+3;js++){
                        char temp=A.get(js).charAt(is);
                        if(temp!='.'&&hash[temp-'0']==1){
                            return 0;
                        }
                        else if(temp!='.'){
                            hash[temp-'0']=1;
                        }
                    }
                }
                
                
            }
        }
        return 1;
        
        
    }
}