# 开发中遇到的flex布局问题

## 1. 左右两栏布局，右侧列表，两列，子元素高度被撑开
以下代码，会出现右侧栏li高度自动撑高，并且在容器中均匀分布
```
// 样式
.box {
  display: flex;
  width: 1000px;
  margin: 0 auto;
  background: #f1f1f1;
}
.img-box {
  width: 200px;
  height: 500px;
}
.list {
  display: flex;
  flex: 1;
  overflow: hidden;
  background: red;
}
li {
  width: 50%;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap; 
}
<div class="box">
  <div class="img-box">
    <img />
  </div>
  <ul class="list">
    <li>1</li>
    <li>2</li>
    <li>3</li>
    <li>4</li>
    <li>5</li>
    <li>6</li>
  </ul>
</div>
```
### 解决方案
在list样式中，设置<kbd>align-content: flex-start;</kbd>或者<kbd>align-self: flex-start;</kbd>，之后li高度是自身高度，且依次排列，不会出现均匀分布的情况

## 左右两栏，左侧宽度固定，右侧自适应，右侧内容过多导致左侧空间被压缩，并且右侧文字超不不会隐藏
布局同上
```
// 样式
.box {
  display: flex;
  width: 1000px;
  margin: 0 auto;
  background: #f1f1f1;
}
.img-box {
  width: 200px;
  height: 500px;
}
.list {
  flex: 1;
}
li {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap; 
}
```
### 解决方案
在list样式中，设置<kbd>overflow: hidden;</kbd>
