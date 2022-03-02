// A组件
custom-cascader 内部
...
<el-cascader
  v-bind="$attrs"
  v-on="$listeners"
  ...
/>
...

// B组件
调用 custom-cascader 的地方
<custom-cascader
  :options="xxx"
  size="mini"
  @remove-tag="xxx"
/>
