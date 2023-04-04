public class JewelsInStones {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        System.out.println("Task0: ");
        JewelsInStones task = new JewelsInStones();
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(task.findJewelsInStones(jewels, stones));
    }
    public String findJewelsInStones(String jewels, String stones) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewel) {
                    count++;
                }
            }
            result.append(jewel).append(count);
        }
        return result.toString();
    }
}
