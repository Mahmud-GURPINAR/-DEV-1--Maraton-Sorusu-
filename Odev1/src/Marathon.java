public class Marathon {

    private final int[] time;

    private final String[] name;

    public Marathon(int[] time, String[] name) {
        this.time = time;
        this.name = name;
    }

    public void processMarathon() {
        int firstTime = time[0], firstCount = 0, secondTime = time[0], secondCount = 0,thirdTime = time[0], thirdCount = 0;

        for (int i = 0; i < time.length; i++) {
            if (time[i] < firstTime) {
                firstTime = time[i];
                firstCount = i;
            }
        }
        for (int i = 0; i < time.length; i++) {
            if (time[i] < secondTime && time[i] > firstTime) {
                secondTime = time[i];
                secondCount = i;
            }
        }
        for (int i = 0; i < time.length; i++) {
            if (time[i] < thirdTime && time[i] > secondTime) {
                thirdTime = time[i];
                thirdCount = i;
            }
        }
        System.out.println("Birinci: " + name[firstCount] + " " + firstTime + "'");
        System.out.println("İkinci: " + name[secondCount]+ " " + secondTime + "'");
        System.out.println("Üçüncü: " + name[thirdCount]+ " " + thirdTime + "'");
    }

    public void outputChart() {
        int A = 0, B = 0, C = 0;

        for (int time : time) {
            if (time < 300)
                A++;
            else if (time < 400)
                B++;
            else
                C++;
        }
        System.out.println("A -> " + A);
        System.out.println("B -> " + B);
        System.out.println("C -> " + C);
    }
}