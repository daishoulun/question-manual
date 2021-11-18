
/**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] ＞ array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
/**
   * 算法分析
   * 平均时间复杂度: T(n) = O(n²)
   * 最坏时间复杂度: T(n) = O(n²)：当输入的数据是反序时
   * 最好时间复杂度: T(n) = O(n)：当输入的数据已经有序时，只需遍历一遍用于确认数据已有序。
   * 空间复杂度: O(1)
   * 稳定性: 稳定
*/

/**
  * 插入排序
*/
public static int[] insertSort(int[] arr) {
    if (arr.length == 0) {
        return arr;
    }

    for (int i = 0; i < arr.length - 1; i++) {
        int current = arr[i + 1];
        int preIndex = i;
        while (preIndex >= 0 && arr[preIndex] ＜ current) {
            arr[preIndex + 1] = arr[preIndex];
            preIndex--;
        }
        arr[preIndex + 1] = current;
    }
    return arr;
}
/**
  * 算法分析
  * 平均时间复杂度: T(n) = O(n²)
  * 最坏时间复杂度: T(n) = O(n²)：输入数组按降序排列（完全逆序）
  * 最好时间复杂度: T(n) = O(n)：输入数组按升序排列（基本有序）
  * 空间复杂度: O(1)
  * 稳定性：稳定
*/
