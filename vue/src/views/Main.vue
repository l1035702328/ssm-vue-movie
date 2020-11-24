<template>
  <div>
    <el-container>
      <el-header>
       <headindex></headindex>
      </el-header>
      <el-container>
        <el-container>
          <el-main>
            <slideshow></slideshow>
            <footnew></footnew>
          </el-main>
          <el-footer>
          </el-footer>
        </el-container>
        <el-aside width="400px">
            <rightindex></rightindex>
            <indextag></indextag>
          <indexcard></indexcard>
        </el-aside>
      </el-container>
    </el-container>
  </div>
</template>
<style>
  body{
    background: #ddd;
  }
  .el-header, .el-footer {
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  .el-aside {
    /*background-color: #D3DCE6;*/
    color: #333;
    text-align: left;
    line-height: 10px;
  }
  .el-main {
    /*background-color: #E9EEF3;*/
    color: #333;
    text-align: center;
    line-height: 10px;
  }

  body > .el-container {
    margin-bottom: 40px;
  }

  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }

  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
</style>


<script>
  import HeadIndex from "./HeadIndex";
  import SlideShow from "./SlideShow";
  import RightIndex1 from "./RightIndex1";
  import IndexTag from "./IndexTag";
  import IndexCard from "./IndexCard";
  import FootNew from "./FootNew";
    export default {
      components: {
        headindex:HeadIndex,
        slideshow:SlideShow,
        rightindex:RightIndex1,
        indextag:IndexTag,
        indexcard:IndexCard,
        footnew:FootNew,
      },
      props:['username'],
        name: "Main",
    }
</script>
