public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     * 
     * preconditions: from LTE Zero to, from LTE 0, to LT length, length GT 0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int[] data, int from, int to) throws BadArgumentsForMaxException{
        int result = 0;

        if(data==null || data.length==0 || from < 0 || to >= data.length || from > to){
            throw new BadArgumentsForMaxException("");
        }

        if(from==to){
            result = data[from];
        }

        else{
            int mid = (from+to)/2;
            int leftMax = max(data, from, mid);
            int rightMax = max(data, mid+1, to);
            result = Math.max(leftMax, rightMax);
        }

        return result;
    }
    
    
}
