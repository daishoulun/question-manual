
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
比较相邻的元素。如果第一个比第二个大，就交换它们两个；
对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
针对所有的元素重复以上的步骤，除了最后一个；
重复步骤1~3，直到排序完成。
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
从第一个元素开始，该元素可以认为已经被排序；
取出下一个元素，在已经排序的元素序列中从后向前扫描；
如果该元素（已排序）大于新元素，将该元素移到下一位置；
重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
将新元素插入到该位置后；
重复步骤2~5。
  * 算法分析
  * 平均时间复杂度: T(n) = O(n²)
  * 最坏时间复杂度: T(n) = O(n²)：输入数组按降序排列（完全逆序）
  * 最好时间复杂度: T(n) = O(n)：输入数组按升序排列（基本有序）
  * 空间复杂度: O(1)
  * 稳定性：稳定
*/
