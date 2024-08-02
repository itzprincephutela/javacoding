class unique {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        int unique = 0;

        for (int num : nums) {
            unique ^= num;
        }
        System.out.println(unique);
    }
}
