// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.nixos.idea.psi.NixTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.nixos.idea.psi.*;

public class NixLogicalImpl extends ASTWrapperPsiElement implements NixLogical {

  public NixLogicalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NixVisitor visitor) {
    visitor.visitLogical(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) accept((NixVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixRelExpr getRelExpr() {
    return findChildByClass(NixRelExpr.class);
  }

  @Override
  @Nullable
  public NixRelative getRelative() {
    return findChildByClass(NixRelative.class);
  }

}
