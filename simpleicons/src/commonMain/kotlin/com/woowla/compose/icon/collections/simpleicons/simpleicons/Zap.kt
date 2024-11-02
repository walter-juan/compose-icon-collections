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

public val Simpleicons.Zap: ImageVector
    get() {
        if (_zap != null) {
            return _zap!!
        }
        _zap = Builder(name = "Zap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.145f, 14.103f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, true, 0.086f, -0.269f)
                lineToRelative(1.715f, -0.42f)
                curveToRelative(0.126f, -0.037f, 0.136f, -0.174f, 0.124f, -0.229f)
                arcToRelative(0.166f, 0.166f, 0.0f, false, false, -0.022f, -0.04f)
                lineTo(13.071f, 8.163f)
                curveToRelative(-0.073f, -0.102f, -0.029f, -0.227f, 0.074f, -0.266f)
                lineToRelative(1.344f, -0.433f)
                arcToRelative(0.167f, 0.167f, 0.0f, false, false, 0.08f, -0.257f)
                lineTo(9.557f, 0.08f)
                arcToRelative(0.154f, 0.154f, 0.0f, false, false, -0.189f, -0.068f)
                lineTo(0.099f, 4.03f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.031f, 0.29f)
                lineToRelative(5.168f, 3.672f)
                arcToRelative(0.161f, 0.161f, 0.0f, false, true, 0.068f, 0.152f)
                curveToRelative(-0.002f, 0.063f, -0.049f, 0.108f, -0.056f, 0.114f)
                lineToRelative(-0.04f, 0.025f)
                lineToRelative(-1.215f, 0.532f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.09f, 0.096f)
                verticalLineToRelative(0.04f)
                arcToRelative(0.182f, 0.182f, 0.0f, false, false, 0.068f, 0.154f)
                curveToRelative(1.775f, 1.281f, 3.55f, 2.561f, 5.325f, 3.842f)
                curveToRelative(0.109f, 0.084f, 0.074f, 0.243f, -0.04f, 0.294f)
                lineToRelative(-1.579f, 0.618f)
                curveToRelative(-0.128f, 0.054f, -0.14f, 0.23f, -0.022f, 0.3f)
                lineToRelative(13.114f, 7.572f)
                curveToRelative(0.151f, 0.063f, 0.29f, -0.11f, 0.198f, -0.244f)
                lineToRelative(-5.823f, -7.384f)
                close()
                moveTo(15.293f, 6.701f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, true, 0.136f, 0.927f)
                arcToRelative(1.045f, 1.045f, 0.0f, false, true, -0.668f, 0.661f)
                lineToRelative(-0.362f, 0.117f)
                lineToRelative(3.319f, 4.191f)
                arcToRelative(1.048f, 1.048f, 0.0f, false, true, -0.566f, 1.672f)
                lineToRelative(-0.618f, 0.154f)
                lineToRelative(4.482f, 5.678f)
                arcTo(11.677f, 11.677f, 0.0f, false, false, 12.317f, 0.631f)
                curveToRelative(-0.414f, 0.0f, -0.822f, 0.022f, -1.236f, 0.062f)
                close()
                moveTo(7.211f, 14.928f)
                arcToRelative(1.051f, 1.051f, 0.0f, false, true, 0.139f, -1.882f)
                lineToRelative(0.377f, -0.145f)
                lineTo(3.459f, 9.81f)
                arcToRelative(1.051f, 1.051f, 0.0f, false, true, 0.192f, -1.811f)
                lineToRelative(0.062f, -0.028f)
                lineToRelative(-1.691f, -1.187f)
                arcToRelative(11.68f, 11.68f, 0.0f, false, false, 17.098f, 15.021f)
                close()
            }
        }
        .build()
        return _zap!!
    }

private var _zap: ImageVector? = null
