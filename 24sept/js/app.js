// to show notes when page load
showNotes();
//when user enter note from user
let addBtn=document.getElementById("addBtn");
addBtn.addEventListener("click",function(e){
    let addTxt=document.getElementById("addTxt");
    let notes=localStorage.getItem("notes");
    if(notes==null){
        notesObj=[];
    }
    else{
        notesObj=JSON.parse(notes);
    }
    notesObj.push(addTxt.value);
    localStorage.setItem("notes",JSON.stringify(notesObj));
    addTxt.value="";

    showNotes();
});
//function to show notes
function showNotes(){
    let notes=localStorage.getItem("notes");
    if(notes == null){
        notesObj=[];
    }
    else{
        notesObj=JSON.parse(notes);
      
    }
    let html="";
    notesObj.forEach((element,index) => {
        html+=
        `<div class="noteCard my-2 mx-2 card" style="width: 18rem;">
        <div class="card-body">
          <h5 class="card-title">Note ${index+1}</h5>
          <p class="card-text">${element}</p>
          <button id="${index}" onclick="deleteNotes(this.id)" class="btn btn-primary">Delete Note</button>
        </div>
      </div>`;
        
    });
    let notesEle=document.getElementById("notes");
    if(notesObj.length!=0){
        notesEle.innerHTML=html;
    }
    else{
        notesEle.innerHTML=`Nothing to show! Use "Add a Note" section above to add notes`;
    }
}
//function to delete note
function deleteNotes(index){
    console.log("delete",index);
    let notes=localStorage.getItem("notes");
    if(notes==null){
        notesObj=[];
    }
    else{
        notesObj=JSON.parse(notes);
    }
    notesObj.splice(index,1);
    localStorage.setItem("notes", JSON.stringify(notesObj));
    showNotes();
}