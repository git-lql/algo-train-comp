package org.lql.practice.week10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lql
 * @date: 2022/3/13 21:08
 * @description: 218. 天际线问题 https://leetcode-cn.com/problems/the-skyline-problem/
 */
public class GetSkyline {

    /**
     * 城市的 天际线 是从远处观看该城市中所有建筑物形成的轮廓的外部轮廓。给你所有建筑物的位置和高度，请返回 由这些建筑物形成的 天际线 。
     * <p>
     * 每个建筑物的几何信息由数组 buildings 表示，其中三元组 buildings[i] = [lefti, righti, heighti] 表示：
     * <p>
     * lefti 是第 i 座建筑物左边缘的 x 坐标。
     * righti 是第 i 座建筑物右边缘的 x 坐标。
     * heighti 是第 i 座建筑物的高度。
     * 你可以假设所有的建筑都是完美的长方形，在高度为 0的绝对平坦的表面上。
     * <p>
     * 天际线 应该表示为由 “关键点” 组成的列表，格式 [[x1,y1],[x2,y2],...] ，
     * 并按 x 坐标 进行 排序 。关键点是水平线段的左端点。
     * 列表中最后一个点是最右侧建筑物的终点，y 坐标始终为 0 ，仅用于标记天际线的终点。
     * 此外，任何两个相邻建筑物之间的地面都应被视为天际线轮廓的一部分。
     * <p>
     * 注意：输出天际线中不得有连续的相同高度的水平线。
     * 例如 [...[2 3], [4 5], [7 5], [11 5], [12 7]...] 是不正确的答案；
     * 三条高度为 5 的线应该在最终输出中合并为一个：[...[2 3], [4 5], [12 7], ...]
     * <p>
     * 1 <= buildings.length <= 104
     * 0 <= lefti < righti <= 231 - 1
     * 1 <= heighti <= 231 - 1
     * buildings 按 lefti 非递减排序
     */
    public List<List<Integer>> getSkyline(int[][] buildings) {
        return new ArrayList<>();
    }
}
