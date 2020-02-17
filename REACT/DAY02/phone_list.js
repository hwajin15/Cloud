import React, {Component} from 'react';
import PhoneItem from './phone_item';

class PhoneList extends Component {
    render(){
        const {data , onRemove, onUpdate} =this.props; //contact-> contact
        //data ->data.data
        //onRemove ->data.onRemove
       const list =data.map(value =>
       (
           <PhoneItem 
           key ={value.id}
            info={value}
            onRemove={onRemove}
            onUpdate ={onUpdate}/>

       )
       );
        // for(let i=0; i<data.length; i++){
        //     console.log(data[i]);
        // }
        return(
        <div>
        {list}
        </div>
        );
    }
}
export default PhoneList;