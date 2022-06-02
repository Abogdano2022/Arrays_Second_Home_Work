public class Main {
    public static void main(String[] args) {
        int[] arr = {102000, 140000, 145000, 130000, 199000, 126000, 178000, 180000, 178500, 189561, 145632, 189632, 123458, 177899, 123456, 178963, 156789, 168945, 132458, 133698, 154897, 132568, 189456, 165789, 168698, 179658, 112335, 156988, 132566, 148965};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];

            }
            if(arr[i]<min){
                min = arr[i];
            }
            System.out.print("Максимальная сумма трат за день составила " + max + " рублей");
            System.out.println();
            System.out.print("Минимальная сумма трат за день составила " + min + " рублей");
        }
        System.out.println("_______________");
        int month = 30;
        float averageSum = sum/month;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        System.out.println("_______________");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length-1; c >= 0; c --) {
            System.out.print(reverseFullName[c]);

        }

    }}