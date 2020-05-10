

public class ArrayCustomIterator implements Container{

    private int[] array;
    private int numbersOfElements;

    public ArrayCustomIterator(int numbersOfElements, int[] array) {
        this.numbersOfElements = numbersOfElements;
        this.array = array;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < array.length){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return array[index++];
            }
            return null;
        }
    }
}
