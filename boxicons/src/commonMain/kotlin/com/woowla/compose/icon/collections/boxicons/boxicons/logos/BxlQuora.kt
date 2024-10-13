package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlQuora: ImageVector
    get() {
        if (_bxlQuora != null) {
            return _bxlQuora!!
        }
        _bxlQuora = Builder(name = "BxlQuora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.555f, 17.025f)
                curveToRelative(-0.624f, -1.227f, -1.354f, -2.465f, -2.781f, -2.465f)
                curveToRelative(-0.271f, 0.0f, -0.546f, 0.046f, -0.795f, 0.157f)
                lineToRelative(-0.484f, -0.967f)
                curveToRelative(0.59f, -0.509f, 1.544f, -0.911f, 2.77f, -0.911f)
                curveToRelative(1.908f, 0.0f, 2.889f, 0.922f, 3.667f, 2.094f)
                curveToRelative(0.459f, -1.001f, 0.678f, -2.354f, 0.678f, -4.03f)
                curveToRelative(0.0f, -4.188f, -1.308f, -6.336f, -4.366f, -6.336f)
                curveToRelative(-3.014f, 0.0f, -4.318f, 2.148f, -4.318f, 6.336f)
                curveToRelative(0.0f, 4.164f, 1.305f, 6.291f, 4.318f, 6.291f)
                curveToRelative(0.478f, 0.0f, 0.913f, -0.051f, 1.311f, -0.169f)
                close()
                moveTo(13.302f, 18.486f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, true, -2.059f, 0.274f)
                curveToRelative(-4.014f, 0.0f, -7.941f, -3.202f, -7.941f, -7.858f)
                curveTo(3.303f, 6.203f, 7.229f, 3.0f, 11.243f, 3.0f)
                curveToRelative(4.081f, 0.0f, 7.972f, 3.179f, 7.972f, 7.903f)
                curveToRelative(0.0f, 2.628f, -1.226f, 4.763f, -3.007f, 6.143f)
                curveToRelative(0.572f, 0.861f, 1.157f, 1.436f, 1.988f, 1.436f)
                curveToRelative(0.899f, 0.0f, 1.261f, -0.687f, 1.328f, -1.236f)
                horizontalLineToRelative(1.167f)
                curveToRelative(0.07f, 0.73f, -0.301f, 3.754f, -3.574f, 3.754f)
                curveToRelative(-1.989f, 0.0f, -3.035f, -1.146f, -3.822f, -2.496f)
                lineToRelative(0.007f, -0.018f)
                close()
            }
        }
        .build()
        return _bxlQuora!!
    }

private var _bxlQuora: ImageVector? = null
