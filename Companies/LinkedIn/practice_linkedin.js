var addClass = function(el, class) {
  var elem_id = el.getElementById(el);
  var elem_classes = el.className.split(" ");
  var boolean = false;

  
  for(var i = 0; i < elem_classes.length;i++){  
    if(class === elem_classes[i]){
       boolean = true;
    }    
  }
  if(boolean === false){
    elem_id.className += " " + class;
  } 
}




<!---------
    
    http://i.imgur.com/wWnr2m1.png

----------->
  
<header>
  <h4>Interview scheduled for J.Doe at 3/17/2011 1:15 PDT</h4>
</header>
<section>
    <dl>
      <dt>location</dt>
        <dd>Room 1</dd>
      <dt>invitees</dt>
        <dd>George</dd>
        <dd>John</dd>
        <dd>Paul</dd>
        <dd>Ringo</dd>
      <dt>calendar</dt>
        <dd>
          <select>
            <option>Calendar</option>
            <option>Tasks</option>
          </select>
        </dd>
      <dt>alarm</dt>
        <dd>
          <select>
            <option>Message</option>
            <option>15 mins before</option>
          </select>
        </dd>   
      <dt>note</dt>
            <dd>Dear George,</dd>
    </dl>  
</section> 
            
<footer>
     <button>Maybe</button>
     <button>Decline</button>
     <button>Accept</button>
</footer>
  


