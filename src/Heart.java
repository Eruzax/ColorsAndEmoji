public class Heart
{
    private final String RED = "\u001B[31m";
    private String name;

    public Heart(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        // adding color to the console
        // note how you append a color string to change its color
        System.out.println(RED + "Hello, my name is " + RED + name);
        System.out.println(RED + "This is me " + "\uD83D\uDC93");
    }
    public void animateHeart()
    {
        makeHeart(10);
        makeHeart(8);
        makeHeart(10);
        makeHeart(8);

    }

    private void makeHeart(int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j <= 4 * size; j++)
            {
                double d1 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - size, 2));
                double d2 = Math.sqrt(Math.pow(i - size, 2) + Math.pow(j - 3 * size, 2));

                if (d1 < size + 0.5 || d2 < size + 0.5) {
                    System.out.print(RED + "*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * size; i++)
        {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 4 * size + 1 - 2 * i; j++) {
                System.out.print(RED + "*");
            }
            System.out.print(System.lineSeparator());
        }

    }
}
