class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {
            int value = romanValue(c);
            sum += (value > prevValue) ? (value - 2 * prevValue) : value;
            prevValue = value;
        }
        return sum;
    }
    private int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
