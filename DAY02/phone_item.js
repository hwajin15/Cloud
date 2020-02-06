import React ,{Component } from 'react';

class PhoneItem extends Component{
    state ={
        editable: false,
        name:'',
        phone:''
    }
    
    componentDidUpdate(preProps,prestate){
        const { info ,onUpdate } =this.props;
       
        if(!prestate.editable && this.state.editable){
            this.setState({
                name: info.name,
                phone:info.phone
            });
        }
        //update
        if(prestate.editable && !this.state.editable){
            onUpdate(info.id, {
            name:this.state.name,
            phone:this.state.phone});   
        }
    }
    handleRemove =(e) =>{
        const {info, onRemove}= this.props;
        onRemove(info.id);
        // 부모에 있는 remove -> 즉 list 의 remove
    }
    handleUpdate = (e)=>{
      const {editable} =this.state;
    //   const {editable} =this.state.editable;
       this.setState({
           editable: !editable //true

       });
 }
     handleChange =(e) => {
     const {name ,value} = e.target;
     this.setState({
         [name] :value
     });
 }
    render(){
        const css ={
            border:'1px solid black',
            padding:'8px',
            margin:'5px'
        };
        const {editable} =this.state;
        if(editable){
            console.log('수정모드');
            return(
                <div style={css}>
                    <div>
                    <input value={this.state.name} name ="name"
                    placeholder ="이름을 입력하세요"
                    onChange = {this.handleChange}
                    />
                    </div>
                    <div>
                    <input value={this.state.phone} name ="phone"
                    placeholder ="연락처를 입력하세요"
                    onChange = {this.handleChange}
                    />
                    </div>
                    <button onClick={this.handleRemove}>삭제</button>
                    <button onClick={this.handleUpdate}>적용</button>
            
                </div>
            )
        
        }
        
        const {name ,phone, id} =this.props.info;
        console.log(id);
        console.log(name);
        console.log(phone);

        return(
            <div style={css}>
                <div><b>{name}</b></div>
                <div>{phone}</div>
                <button onClick={this.handleRemove}>삭제</button>
                <button onClick ={this.handleUpdate}>수정</button>
            </div>

        );

    };
}
export default PhoneItem;
