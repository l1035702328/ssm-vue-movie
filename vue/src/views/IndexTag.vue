<template>
    <div>
      <el-card class="box-card">
        <div slot="header" class="clearfix">
          <span><b>电影类型</b></span>
        </div>
        <div v-for="o in 4" :key="o" class="text item">
          <el-tag>标签一</el-tag>
          <el-tag type="success">标签二</el-tag>
          <el-tag type="info">标签三</el-tag>
          <el-tag type="warning">标签四</el-tag>
          <el-tag type="danger">标签五</el-tag>
        </div>
      </el-card>


    </div>
</template>

<script>
    export default {
        name: "IndexTag"
    }
</script>

<style scoped>

</style>
