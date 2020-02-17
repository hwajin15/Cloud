import React, { Component } from 'react';
import { connect } from 'react-redux';
import Chart from '../components/chart';


class CoinList extends Component {
    renderbitcoin(Data){
   console.log(Data);
   
   const high =Data.map(bitcoin => bitcoin.high);
   const low = Data.map(bitcoin => bitcoin.low);
   
   return (
     <tr key ={Data}>
           <td><Chart data={high}/></td>
           <td><Chart data={low}/></td>
       </tr>
   )

}
  render() {
    return (
        
      <table>
       <tr>
            <th>high</th>
            <th>low</th>
            
          </tr>
        <tbody>
          {this.props.bitcoin.map(this.renderbitcoin)}
        </tbody>
      </table>
    );
  }
}
// mapSrtateToProps funciton
function mapSrtateToProps(state){
  return{ bitcoin: state.bitcoin};
}

// connect mapping
export default connect(mapSrtateToProps)(CoinList);