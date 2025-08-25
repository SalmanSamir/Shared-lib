def call() { return this }

int toInt(def value, int min = 1, int max = 4, int defaultVal = 1) {
    try {
        int v = value.toInteger()
        if (v < min) return min
        if (v > max) return max
        return v
    } catch (Exception e) {
        echo "⚠️ Invalid number: ${value}, using default ${defaultVal}"
        return defaultVal
    }
}