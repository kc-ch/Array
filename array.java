public class array{
    static int[] array;
	public static void main(String[] args){

		array=new int[3];
        array[0]=1;
        array[1]=2;
        array[2]=3;

        int [] newarr=resize(4);
        for(int i=0; i < newarr.length; i++){
            System.out.println(newarr[i]);
        }
	}
    public static int[] resize(int length){
        int[] temp=new int[length];
        for(int i=0; i<array.length; i++){
            temp[i]=array[i];
        }
        temp[length -1]=4;
        array = temp;
        return array;
    }
}
