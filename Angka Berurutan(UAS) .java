class Main {
   public static void main(String[] args) {
       int[] angka = {4,2,3,3,2,4,6,7,3,9};
       
        System.out.println(ujian(angka));

    }

    public static int ujian(int[] data) {

        int count =1, max =1;
        for (int j = 1; j < data.length; j++) {
            if (data[j] > data[j - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count >= max) {
                max = count;
            }
        }
        return max;
    }
}