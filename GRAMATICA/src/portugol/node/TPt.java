/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TPt extends Token
{
    public TPt()
    {
        super.setText(".");
    }

    public TPt(int line, int pos)
    {
        super.setText(".");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPt(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPt text.");
    }
}