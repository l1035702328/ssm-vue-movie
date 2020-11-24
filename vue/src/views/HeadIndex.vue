<template>
  <el-menu
    :default-active="activeIndex2"
    class="el-menu-demo"
    mode="horizontal"
    @select="handleSelect"
    background-color="#545c64"
    text-color="#fff"
    active-text-color="#ffd04b">
    <el-menu-item><a href="https://www.ele.me" target="_blank"><img src="../assets/wadyw.jpg" style="width: 90px;height: 100%"></a></el-menu-item>
    <el-menu-item index="1"><a href="https://www.baidu.com" target="_blank" style="text-decoration:none">首页</a></el-menu-item>
    <el-submenu index="2">
      <template slot="title">高清电影</template>
      <el-menu-item index="2-1">选项1</el-menu-item>
      <el-menu-item index="2-2">选项2</el-menu-item>
      <el-menu-item index="2-3">选项3</el-menu-item>
      <el-submenu index="2-4">
        <template slot="title">选项4</template>
        <el-menu-item index="2-4-1">选项1</el-menu-item>
        <el-menu-item index="2-4-2">选项2</el-menu-item>
        <el-menu-item index="2-4-3">选项3</el-menu-item>
      </el-submenu>
    </el-submenu>
    <el-submenu index="3">
      <template slot="title">高清电视剧</template>
      <el-menu-item index="3-1">选项1</el-menu-item>
      <el-menu-item index="3-2">选项2</el-menu-item>
      <el-menu-item index="3-3">选项3</el-menu-item>
    </el-submenu>
    <el-menu-item index="4"><a href="https://www.baidu.com" target="_blank" style="text-decoration:none">纪录片</a></el-menu-item>
    <el-submenu index="5" style="float: right">
      <template slot="title">username</template>
      <el-menu-item index="5-1">管理</el-menu-item>
      <el-menu-item index="5-2">注销</el-menu-item>
    </el-submenu>
    <span style="float: right;margin-right: 70px">
    <Input search v-model="value14" placeholder="Enter something..." clearable style="width: 200px" />
    </span>
  </el-menu>
</template>

<script>
    export default {
        name: "HeadIndex",
      data() {
        return {
          activeIndex: '1',
          activeIndex2: '1',
          input:''
        };
      },
      methods: {
        handleSelect(key, keyPath) {
          console.log(key, keyPath);
        }
      }
    }
</script>

<style scoped>
  .el-input {
    width: 200px;

  }
  .input-with-select .el-input-group__prepend {
    background-color: #fff;
  }

</style>
