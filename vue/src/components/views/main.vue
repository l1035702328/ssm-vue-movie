<template>
  <div style="background-color: #f8f8f8">
  <head-index :username='username'></head-index>
    <el-main>
  <content-index></content-index>
 </el-main>
    <el-footer>
    <foot-index></foot-index>
    </el-footer>
  </div>

</template>

<script>
  import headIndex from "./headIndex";
  import contentIndex from "./contentIndex";
  import footIndex from "./footIndex";
    export default {
        data(){
          return{


          }
        },

        name: "mainIndex",
        components:{
          headIndex,
          contentIndex,
          footIndex,
        },
      props:['username'],
    }
</script>

<style scoped>
</style>
