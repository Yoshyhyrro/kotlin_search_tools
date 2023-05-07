fun getAdjacentElements(array: Array<Array<Int>?>?, i: Int, j: Int): List<Int> {
    // 隣接する要素のリスト
    val result = mutableListOf<Int>()
    // 上
    result.add(array?.getOrNull(i-1)?.getOrNull(j) ?: 0)
    // 下
    result.add(array?.getOrNull(i+1)?.getOrNull(j) ?: 0)
    // 左
    result.add(array?.getOrNull(i)?.getOrNull(j-1) ?: 0)
    // 右
    result.add(array?.getOrNull(i)?.getOrNull(j+1) ?: 0)
    return result
    }
