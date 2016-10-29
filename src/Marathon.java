public class Marathon {

  public static int FindFastestRunner(int[] times) {

    int FastestRunnerIndex = 0;

    for (int i = 0; i < times.length; i++) {

      if (times[i] < times[FastestRunnerIndex]) {
        FastestRunnerIndex = i;
      }

    }
    return FastestRunnerIndex;
  }

  public static int FindSecondFastestRunner(int[] times,
    int FastestRunnerIndex) {

    int SecondFastestRunnerIndex = 0;

    for (int i = 0; i < times.length; i++) {

      if ((times[i] < times[SecondFastestRunnerIndex])
        && (times[i] > times [FastestRunnerIndex])) {
          SecondFastestRunnerIndex = i;
      }

    }
    return SecondFastestRunnerIndex;
  }

  public static void main(String[] arguments) {

    String[] names = {
    "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
    "Alex", "Emma", "John", "James", "Jane", "Emily",
    "Daniel", "Neda", "Aaron", "Kate"
    };

    int[] times = {
    341, 273, 278, 329, 445, 402, 388, 275, 243,
    334, 412, 393, 299, 343, 317, 265
    };

    int FastestRunnerIndex = FindFastestRunner(times);
    int SecondFastestRunnerIndex = FindSecondFastestRunner(times, FastestRunnerIndex);

    System.out.println("The fastest runner is " + names[FastestRunnerIndex] +
      " with a time of " + times[FastestRunnerIndex] + " minutes");

    System.out.println("The second fastest is " + names[SecondFastestRunnerIndex]
      + " with a time of " + times[SecondFastestRunnerIndex] + " minutes");

  }
}
