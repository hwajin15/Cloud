import _ from 'lodash';
import React from 'react';
import { Sparklines, SparklinesLine } from 'react-sparklines';
import { SparklinesReferenceLine } from 'react-sparklines';

export default (props) => {
  return (
    <div>
      <Sparklines width={160} height={160}
      data={props.data}>
        <SparklinesLine color={props.color}/>
        <SparklinesReferenceLine type="avg"/>

      </Sparklines>
    </div>
  );
};