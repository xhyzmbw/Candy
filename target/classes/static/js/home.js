var candylist = new Vue({
    el: '#candylist',
    data:function () {
        return getCandys();
    }
});

function getCandys() {
    var a = {
        candy: [
            { title: '初音未来',cover: 'http://i0.hdslb.com/bfs/article/19eb87afa87197f6e5fa760133e26eae316f9b18.jpg',summary: '世界第一公主殿下'},
            { title: 'Bar',cover: 'http://i0.hdslb.com/bfs/article/19eb87afa87197f6e5fa760133e26eae316f9b18.jpg',summary: '世界第一公主殿下'}
        ]
    };
    return a;
}