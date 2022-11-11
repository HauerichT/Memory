public class MemoryTest {
    public static void main(String[] args) {

        // Test n=4
        Memory memory4 = new Memory();
        int[][] field4 = memory4.generateField(4);
        System.out.println("Test n=4:");
        memory4.showField(field4);

        // spacer
        System.out.println("----------");

        // Test n=6
        Memory memory6 = new Memory();
        int[][] field6 = memory6.generateField(6);
        System.out.println("Test n=6:");
        memory6.showField(field6);
    }
}