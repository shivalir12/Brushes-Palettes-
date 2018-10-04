 //1.check permission 
//we can request permission here again if its value is 'default' //using the previously discussed code
/*desktopNotification: function() {
    if (Notification.permission === “granted”) {
      var text = "your Notification Body goes here";
      this.sendDesktopNotification(text);
    }
  }
//2. send Notification
sendDesktopNotification: function(text) {
    let notification = new Notification(‘Your Page Title’, {
      icon: ‘https://www.ShivaliArtGallery.com/your_web_page_image_icon.png’,
      body: text,
      tag: ‘soManyNotification’
    });
    //’tag’ handles muti tab scenario i.e when multiple tabs are 
    // open then only one notification is sent
//3. handle notification events and set timeout 
notification.onclick = function() {
      parent.focus();
      window.focus(); //just in case, older browsers
      this.close();
    };
    setTimeout(notification.close.bind(notification), 5000);
  }


   */     /* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}
// Close the dropdown if the user clicks outside of it
window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
    var myDropdown = document.getElementById("myDropdown");
      if (myDropdown.classList.contains('show')) {
        myDropdown.classList.remove('show');
      }
  }
}
function myFunction1() {
    document.getElementById("myDropdown1").classList.toggle("show");
}
// Close the dropdown if the user clicks outside of it
window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
    var myDropdown1 = document.getElementById("myDropdown");
      if (myDropdown1.classList.contains('show')) {
        myDropdown1.classList.remove('show');
      }
  }}