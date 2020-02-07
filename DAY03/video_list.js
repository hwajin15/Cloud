import React from 'react';
import ViedoListItem from './video_list_item';

const VideoList =(props) =>{
    const videoItems =
    props.videos.map((v)=>{
        return(
            <ViedoListItem
            onVideoSelect ={props.onVideoSelect} 
            key ={v.etag}
            video={v}/>

        )
    });
    return(
        <div>
            <ul className="col-md-4 list-group">
           
         {videoItems}

            </ul>

        </div>
    )
}

export default VideoList;