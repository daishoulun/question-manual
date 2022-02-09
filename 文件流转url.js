function convertFileForDownload(fileData, fileName) {
  // application/vnd.openxmlformats-officedocument.spreadsheetml.sheet这里表示xlsx类型
  let blob = new Blob([fileData], {
    type:
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8",
  });
  if (window.navigator.msSaveOrOpenBlob) {
    //兼容ie
    window.navigator.msSaveBlob(blob,  fileName);
  } else {
    var downloadElement = document.createElement("a");
    var href = window.URL.createObjectURL(blob); // 创建下载的链接
    downloadElement.href = href;
    downloadElement.download = fileName; // 下载后文件名
    document.body.appendChild(downloadElement);
    downloadElement.click(); // 点击下载
    document.body.removeChild(downloadElement); // 下载完成移除元素
    window.URL.revokeObjectURL(href); // 释放掉blob对象
  }
}
function exportFile() {
  exportExcel().then(res => {
    let filename = res.headers['content-disposition'] // 获取文件名
        filename = filename.split(";")[1].split("filename=")[1];
    this.convertFileForDownload(res.data, filename)
  })
}

function exportExcel() {
  return request({
    url: '/resourceLoad/downExcel',
    method: 'post',
    responseType: 'blob' // 不加responseType，下载下来的文件打不开
  })
}








