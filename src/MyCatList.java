public class MyCatList {
        public int size;
        public Cat[] array;

        MyCatList() {
            size = 0;
            array = new Cat[5];
        }

        public void add(Cat num) throws ArrayFullException {
            try {
                array[size] = num;
                size++;
            }catch(ArrayIndexOutOfBoundsException e) {
                throw new ArrayFullException("The array is full and " + num + " cannot be inserted.");
            }
        }

        public void addAt(int pos, Cat num) throws ArrayFullException, InvalidPositionException {
            if(size == 5)
                throw new ArrayFullException("The array is full and " + num + " cannot be inserted.");
            if(pos > size+1 || pos <= 0)
                throw new InvalidPositionException(size + 1);

            for(int i = 4; i >= pos; i--) {
                array[i] = array[i - 1];
            }
            array[pos - 1] = num;
            size++;
        }

        public boolean remove(String num) {
            for (int i = 0; i < size; i++) {
                if (array[i].name == num) {
                    for (int j = i; j < size - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    array[size - 1] = null;
                    size--;
                    return true;
                }
            }
            return false;
        }

        public Cat removeAt(int pos) throws InvalidPositionException{
            if(pos > size)
                throw new InvalidPositionException(size);

            Cat removed = array[pos - 1];
            for(int i = pos - 1; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;

            return removed;
        }

        public boolean contains(String num) {
            for(int i = 0; i < size; i++) {
                if (array[i].name == num) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public Cat get(int pos)throws InvalidPositionException {
            if(pos > size || pos <= 0)
                throw new InvalidPositionException(size);
            Cat temp = array[pos - 1];
            return temp;
        }

        public Cat set(int pos, Cat num) throws InvalidPositionException{
            if(pos >= 1 && pos <= size) {
                Cat temp = array[pos - 1];
                array[pos - 1] = num;
                return temp;
            } else throw new InvalidPositionException(size);
        }
}
