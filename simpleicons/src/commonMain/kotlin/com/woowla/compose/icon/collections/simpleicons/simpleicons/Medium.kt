package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(name = "Medium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.21f, 0.0f)
                arcTo(4.201f, 4.201f, 0.0f, false, false, 0.0f, 4.21f)
                verticalLineToRelative(15.58f)
                arcTo(4.201f, 4.201f, 0.0f, false, false, 4.21f, 24.0f)
                horizontalLineToRelative(15.58f)
                arcTo(4.201f, 4.201f, 0.0f, false, false, 24.0f, 19.79f)
                verticalLineToRelative(-1.093f)
                curveToRelative(-0.137f, 0.013f, -0.278f, 0.02f, -0.422f, 0.02f)
                curveToRelative(-2.577f, 0.0f, -4.027f, -2.146f, -4.09f, -4.832f)
                arcToRelative(7.592f, 7.592f, 0.0f, false, true, 0.022f, -0.708f)
                curveToRelative(0.093f, -1.186f, 0.475f, -2.241f, 1.105f, -3.022f)
                arcToRelative(3.885f, 3.885f, 0.0f, false, true, 1.395f, -1.1f)
                curveToRelative(0.468f, -0.237f, 1.127f, -0.367f, 1.664f, -0.367f)
                horizontalLineToRelative(0.023f)
                curveToRelative(0.101f, 0.0f, 0.202f, 0.004f, 0.303f, 0.01f)
                lineTo(24.0f, 4.211f)
                arcTo(4.201f, 4.201f, 0.0f, false, false, 19.79f, 0.0f)
                close()
                moveTo(4.408f, 5.583f)
                horizontalLineToRelative(4.165f)
                lineToRelative(3.588f, 8.435f)
                lineToRelative(3.59f, -8.435f)
                horizontalLineToRelative(3.864f)
                verticalLineToRelative(0.146f)
                lineToRelative(-0.019f, 0.004f)
                curveToRelative(-0.705f, 0.16f, -1.063f, 0.397f, -1.063f, 1.254f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(0.003f, 10.274f)
                curveToRelative(0.06f, 0.676f, 0.424f, 0.885f, 1.063f, 1.03f)
                lineToRelative(0.02f, 0.004f)
                verticalLineToRelative(0.145f)
                horizontalLineToRelative(-4.923f)
                verticalLineToRelative(-0.145f)
                lineToRelative(0.019f, -0.005f)
                curveToRelative(0.639f, -0.144f, 0.994f, -0.353f, 1.054f, -1.03f)
                lineTo(15.766f, 7.267f)
                lineToRelative(-4.745f, 11.15f)
                horizontalLineToRelative(-0.261f)
                lineTo(6.15f, 7.569f)
                verticalLineToRelative(9.445f)
                curveToRelative(0.0f, 0.857f, 0.358f, 1.094f, 1.063f, 1.253f)
                lineToRelative(0.02f, 0.004f)
                verticalLineToRelative(0.147f)
                lineTo(4.405f, 18.418f)
                verticalLineToRelative(-0.147f)
                lineToRelative(0.019f, -0.004f)
                curveToRelative(0.705f, -0.16f, 1.065f, -0.397f, 1.065f, -1.253f)
                lineTo(5.489f, 6.987f)
                curveToRelative(0.0f, -0.857f, -0.358f, -1.094f, -1.064f, -1.254f)
                lineToRelative(-0.018f, -0.004f)
                close()
                moveTo(23.658f, 9.251f)
                curveToRelative(-1.086f, 0.023f, -1.733f, 1.323f, -1.813f, 3.124f)
                lineTo(24.0f, 12.375f)
                lineTo(24.0f, 9.298f)
                arcToRelative(1.378f, 1.378f, 0.0f, false, false, -0.342f, -0.047f)
                close()
                moveTo(21.796f, 12.883f)
                curveToRelative(-0.1f, 1.756f, 0.86f, 3.239f, 2.204f, 3.634f)
                verticalLineToRelative(-3.634f)
                close()
            }
        }
        .build()
        return _medium!!
    }

private var _medium: ImageVector? = null
