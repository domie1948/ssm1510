
var projectName = '社区管理与服务';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

]


var indexNav = [

{
	name: '社区公共场所',
	url: './pages/shequgonggongchangsuo/list.jsp'
}, 
{
	name: '新闻资讯',
	url: './pages/xinwenzixun/list.jsp'
}, 
{
	name: '社区政务服务',
	url: './pages/shequzhengwufuwu/list.jsp'
}, 
{
	name: '社区活动',
	url: './pages/shequhuodong/list.jsp'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.jsp'
}, 
]

var adminurl =  "http://localhost:8080/jspm8b5r9/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区用户","menuJump":"列表","tableName":"shequyonghu"}],"menu":"社区用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区停车","menuJump":"列表","tableName":"shequtingche"}],"menu":"社区停车管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区公共场所","menuJump":"列表","tableName":"shequgonggongchangsuo"}],"menu":"社区公共场所管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"新闻类型","menuJump":"列表","tableName":"xinwenleixing"}],"menu":"新闻类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"新闻资讯","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区政务服务","menuJump":"列表","tableName":"shequzhengwufuwu"}],"menu":"社区政务服务管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区活动","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"服务类型","menuJump":"列表","tableName":"fuwuleixing"}],"menu":"服务类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区安保维护","menuJump":"列表","tableName":"shequanbaoweihu"}],"menu":"社区安保维护管理"},{"child":[{"buttons":["审核","查看","修改","删除"],"menu":"住户反馈","menuJump":"列表","tableName":"zhuhufankui"}],"menu":"住户反馈管理"},{"child":[{"buttons":["审核","查看","修改","删除"],"menu":"公共场所预约","menuJump":"列表","tableName":"gonggongchangsuoyuyue"}],"menu":"公共场所预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社区论坛","tableName":"forum"}],"menu":"社区论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"社区公共场所列表","menuJump":"列表","tableName":"shequgonggongchangsuo"}],"menu":"社区公共场所模块"},{"child":[{"buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"},{"child":[{"buttons":["查看"],"menu":"社区政务服务列表","menuJump":"列表","tableName":"shequzhengwufuwu"}],"menu":"社区政务服务模块"},{"child":[{"buttons":["查看","活动报名"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"住户反馈","menuJump":"列表","tableName":"zhuhufankui"}],"menu":"住户反馈管理"},{"child":[{"buttons":["查看","删除"],"menu":"公共场所预约","menuJump":"列表","tableName":"gonggongchangsuoyuyue"}],"menu":"公共场所预约管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"社区公共场所列表","menuJump":"列表","tableName":"shequgonggongchangsuo"}],"menu":"社区公共场所模块"},{"child":[{"buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"},{"child":[{"buttons":["查看"],"menu":"社区政务服务列表","menuJump":"列表","tableName":"shequzhengwufuwu"}],"menu":"社区政务服务模块"},{"child":[{"buttons":["查看","活动报名"],"menu":"社区活动列表","menuJump":"列表","tableName":"shequhuodong"}],"menu":"社区活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"社区用户","tableName":"shequyonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
