<template>
  <div class="navigation-container">
<!--    <div class="navigation-box">-->
<!--      <div class="navigation-image">-->
<!--        <img src="../../assets/image/cat.jpg"/>-->
<!--      </div>-->

<!--      <div class="navigation-font">-->
<!--        <h3>BlOgGeR_WW</h3>-->
<!--      </div>-->
<!--    </div>-->

    <!-- el-menu导航栏
     1.default-active:高亮显示 刷新页面后，对应menu高亮
     2.collapse:侧边栏是否收展
     3.@select:选中事件
     4.background-color:菜单的背景色
     5.text-color:菜单的文字颜色
     6.active-text-color:当前激活菜单的文字颜色
     7.unique-opened:是否只保持一个子菜单的展开
     8.collapse-transition:是否开启折叠动画
     rgb(191, 203, 217)
     -->
    <el-menu class="el-menu-vertical-demo" :default-active="activeIndex" :collapse="isCollapse" @select="handleSelect"
             background-color="#474b4c" text-color="#f9f4dc" active-text-color="#1890ff"
             :unique-opened="true" :collapse-transition="false">

      <!-- 首页 -->
      <el-menu-item index="HomePage">
        <i class="el-icon-s-grid"></i>
        <span slot="title">首页</span>
      </el-menu-item>

      <!-- 用户管理 -->
      <el-submenu index="UserManage">
        <template slot="title">
          <i class="el-icon-s-custom"></i>
          <span>用户管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="UserManage">
            <span>用户一览</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 角色管理 -->
      <el-submenu index="RoleManage">
        <template slot="title">
          <i class="el-icon-coordinate"></i>
          <span>角色管理</span>
        </template>
        <el-menu-item-group class="itemGroup">
          <el-menu-item class="twoGroup" index="RoleManage">
            <span>角色一览</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 模块管理 -->
      <el-submenu index="MenusManage">
        <template slot="title">
          <i class="el-icon-date"></i>
          <span>模块管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="MenusManage">
            <span>模块一览</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 权限管理 -->
      <el-submenu index="PermissionManage">
        <template slot="title">
          <i class="el-icon-s-opportunity"></i>
          <span>权限管理</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="PermissionManage">
            <span>权限一览</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 博客文章 -->
      <el-submenu index="ArticleManage">
        <template slot="title">
          <i class="el-icon-notebook-2"></i>
          <span>博客文章</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="ArticleManage">
            <span>文章一览</span>
          </el-menu-item>
          <el-menu-item class="twoGroup" index="BloggerCreatePage">
            <span>博客创建</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 产品展示 -->
      <el-submenu index="3">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>产品展示</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="3-1">
            <span>新闻一览</span>
          </el-menu-item>
          <el-menu-item class="twoGroup" index="3-2">
            <span>新闻创建</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 图片展示 -->
      <el-submenu index="4">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>图片展示</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="4-1">
            <span>产品一览</span>
          </el-menu-item>
          <el-menu-item class="twoGroup" index="4-2">
            <span>产品创建</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

      <!-- 列表拖拽  -->
      <el-submenu index="BloggerListPage">
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>列表拖拽</span>
        </template>
        <el-menu-item-group>
          <el-menu-item class="twoGroup" index="BloggerListPage">
            <span>博客一览</span>
          </el-menu-item>
          <el-menu-item class="twoGroup" index="BloggerCreatePage">
            <span>博客创建</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>

    </el-menu>

  </div>
</template>

<script>
  export default {
    name: "navigation",
    // 存储数据
    data() {
      return {
        activeIndex: this.$route.name,
        // 是否水平折叠收起菜单
        isCollapse: this.store.state.isCollapse
      };
    },
    // 初始化加载
    created() {
      // this.$refs.changeStatus
    },
    // 方法
    methods: {
      // 选择路由方法
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
        switch (key) {
          case "HomePage":
            this.$router.push("/HomePage");
            break;
          case "UserManage":
            this.$router.push("/UserManage");
            break;
          case "RoleManage":
            this.$router.push("/RoleManage");
            break;
          case "PermissionManage":
            this.$router.push("/PermissionManage");
            break;
          case "MenusManage":
            this.$router.push("/MenusManage");
            break;
          case "ArticleManage":
            this.$router.push("/ArticleManage");
            break;
        }
      },
      changeStatus() {
        this.isCollapse = true;
      }
    }
  };
</script>


<style scoped>
  .navigation-container {
    height: 100%;
    width: 100%;
    overflow: hidden;
  }

  .navigation-box {
    display: flex;
    justify-content: space-around;
    background-color: #5B5B5B;
    height: 60px;
    width: 220px
  }

  .navigation-image {
    border: 1px solid #fffef8;
    /*圆弧*/
    border-radius: 50%;
    padding: 2px;
    /*阴影*/
    box-shadow: 0 0 10px #cdd1d3;
    height: 50px;
    width: 50px;
    background-color: #737c7b;
  }

  .navigation-image img {
    height: 100%;
    width: 100%;
    border-radius: 50%;
    background-color: #eee;
  }

  .navigation-font{
    font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif;
    font-size:1em;
    color: #cdd1d3;
  }


  /* 导航栏收缩样式 */
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    /*width: 219px !important;*/
    min-width: 140px;
    height: 100%;
  }

  /* 二级目录背景样式 */
  .navigation-container .el-menu-vertical-demo .twoGroup {
    background-color: #363433 !important;
  }

</style>
