# Css 问题

## flex布局

### flex布局下，子元素高度问题。
> 在父元素添加了align-items之后，子元素的高度，由自身内容决定。当不添加align-items时，父元素高度由最高子元素决定，不够的就占满

### 父元素设置display: inline-flex; 子元素设置min-width: 100px; 导致子元素宽度不能自适应
> 给子元素设置flex-shrink: 0;
