package logics_programs;

public class swap_number_2_logic {
public static void main(String[] args) {
	int first = 12, second = 24;

    System.out.println("--Before swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);

    first = first - second;//12-24=-12
    second = first + second;//-12+24=12
    first = second - first;//12-(-12)=24

    System.out.println("--After swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
}
}

