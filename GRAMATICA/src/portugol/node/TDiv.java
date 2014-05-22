/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TDiv extends Token
{
    public TDiv()
    {
        super.setText("div");
    }

    public TDiv(int line, int pos)
    {
        super.setText("div");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDiv(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDiv(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDiv text.");
    }
}
