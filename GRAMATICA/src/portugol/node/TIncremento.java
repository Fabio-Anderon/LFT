/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TIncremento extends Token
{
    public TIncremento()
    {
        super.setText("++");
    }

    public TIncremento(int line, int pos)
    {
        super.setText("++");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIncremento(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIncremento(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIncremento text.");
    }
}
