function downloadFile(res) {
    const blob = new Blob([res], {type: 'application/vnd.openxmlformats-officedocument.presentationml.presentation'})
    const fileName = ''
    if (window.navigator && window.navigator.msSaveBlob){ // 兼容IE
      window.navigator.msSaveBlob(blob, fileName);
      return;
    }
    const link = document.createElement('a');
    link.style.display = 'none';
    link.download = fileName
    link.href = window.URL.createObjectURL(blob);
    document.body.appendChild(link);
    console.log(link.download)
    link.click();
    document.body.removeChild(link);
}

// IE url不支持中文，会报错

// IE 日期不支持横杠，需要转换为斜杠
