class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val length = strs.size
        
        // strsの長さが0の場合、共通接頭辞は存在しないため空文字列を返す
        if (length == 0) {
            return ""
        }
        
        // strsの長さが1の場合、共通接頭辞はその要素自体なので、その要素を返す
        if (length == 1) {
            return strs[0]
        }
        
        // 共通接頭辞を探索するためのループ処理
        for (i in 0 until strs[0].length) {
            val c = strs[0][i]
            
            // strsの各要素を順に比較し、共通接頭辞の一致をチェックする
            for (j in 1 until length) {
                // 接頭辞の長さがstrs[j]の長さを超えた場合や
                // strs[j]の該当の文字が共通接頭辞の対応する位置の文字と一致しない場合、ループを抜ける
                if (i == strs[j].length || strs[j][i] != c) {
                    return strs[0].substring(0, i)  // 共通接頭辞の部分文字列を返す
                }
            }
        }
        
        return strs[0]  // 全ての要素が一致した場合は、最初の要素をそのまま共通接頭辞として返す
    }
}
