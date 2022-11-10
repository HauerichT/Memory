public class MemoryTest {
    public static void main(String[] args) {
        Memory memory = new Memory();
        int[][] field = memory.generateField(3);
        memory.showField(field);
    }
}