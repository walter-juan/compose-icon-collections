package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.CommentAi24: ImageVector
    get() {
        if (_commentAi24 != null) {
            return _commentAi24!!
        }
        _commentAi24 = Builder(name = "CommentAi24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.331f, 0.22f, 0.53f)
                verticalLineToRelative(3.195f)
                lineToRelative(3.743f, -3.725f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(9.977f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcToRelative(1.746f, 1.746f, 0.0f, false, true, -1.237f, 0.513f)
                horizontalLineToRelative(-9.684f)
                lineToRelative(-3.579f, 3.57f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, true, -1.588f, 0.316f)
                arcTo(1.456f, 1.456f, 0.0f, false, true, 5.0f, 21.04f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                verticalLineTo(4.25f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(17.748f, 1.0f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.192f, 0.061f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.124f, 0.161f)
                lineToRelative(0.323f, 0.88f)
                arcToRelative(5.051f, 5.051f, 0.0f, false, false, 3.008f, 3.007f)
                lineToRelative(0.879f, 0.323f)
                arcToRelative(0.332f, 0.332f, 0.0f, false, true, 0.221f, 0.316f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, true, -0.221f, 0.316f)
                lineToRelative(-0.879f, 0.323f)
                arcToRelative(5.034f, 5.034f, 0.0f, false, false, -1.836f, 1.172f)
                arcToRelative(5.034f, 5.034f, 0.0f, false, false, -1.172f, 1.836f)
                lineToRelative(-0.323f, 0.879f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, -0.316f, 0.221f)
                arcToRelative(0.332f, 0.332f, 0.0f, false, true, -0.316f, -0.221f)
                lineToRelative(-0.323f, -0.879f)
                arcToRelative(5.045f, 5.045f, 0.0f, false, false, -3.007f, -3.008f)
                lineToRelative(-0.88f, -0.323f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, 0.0f, -0.632f)
                lineToRelative(0.88f, -0.323f)
                arcToRelative(5.062f, 5.062f, 0.0f, false, false, 1.836f, -1.171f)
                arcToRelative(5.062f, 5.062f, 0.0f, false, false, 1.171f, -1.836f)
                lineToRelative(0.323f, -0.88f)
                arcTo(0.333f, 0.333f, 0.0f, false, true, 17.748f, 1.0f)
                close()
            }
        }
        .build()
        return _commentAi24!!
    }

private var _commentAi24: ImageVector? = null
