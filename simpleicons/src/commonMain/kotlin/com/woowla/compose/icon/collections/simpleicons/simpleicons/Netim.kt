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

public val Simpleicons.Netim: ImageVector
    get() {
        if (_netim != null) {
            return _netim!!
        }
        _netim = Builder(name = "Netim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.305f, 11.95f)
                curveToRelative(-1.014f, -1.134f, -2.772f, -1.242f, -3.927f, -0.248f)
                lineToRelative(-0.67f, 0.577f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, 1.274f, 2.309f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, -2.403f, 2.35f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, -2.564f, -2.484f)
                curveToRelative(0.067f, -1.745f, 1.41f, -2.484f, 2.517f, -2.484f)
                lineToRelative(-2.745f, -6.504f)
                curveToRelative(-0.59f, -1.396f, -2.215f, -2.054f, -3.631f, -1.477f)
                curveToRelative(-0.296f, 0.128f, -1.101f, 0.463f, -1.55f, 1.484f)
                lineToRelative(-2.149f, 4.994f)
                lineTo(5.35f, 5.486f)
                curveTo(4.765f, 4.09f, 3.134f, 3.432f, 1.718f, 4.009f)
                curveTo(0.295f, 4.586f, -0.376f, 6.184f, 0.214f, 7.574f)
                lineToRelative(4.632f, 10.96f)
                curveToRelative(0.59f, 1.397f, 2.215f, 2.055f, 3.631f, 1.477f)
                curveToRelative(0.437f, -0.194f, 1.108f, -0.53f, 1.55f, -1.483f)
                lineToRelative(2.149f, -4.994f)
                lineToRelative(2.108f, 4.987f)
                arcToRelative(2.756f, 2.756f, 0.0f, false, false, 1.644f, 1.53f)
                arcToRelative(2.83f, 2.83f, 0.0f, false, false, 2.806f, -0.51f)
                lineToRelative(4.33f, -3.738f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 0.241f, -3.853f)
                close()
            }
        }
        .build()
        return _netim!!
    }

private var _netim: ImageVector? = null
