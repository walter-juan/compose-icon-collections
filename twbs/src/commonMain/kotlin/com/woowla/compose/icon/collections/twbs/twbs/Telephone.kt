package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Telephone: ImageVector
    get() {
        if (_telephone != null) {
            return _telephone!!
        }
        _telephone = Builder(name = "Telephone", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.654f, 1.328f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, false, -1.015f, -0.063f)
                lineTo(1.605f, 2.3f)
                curveToRelative(-0.483f, 0.484f, -0.661f, 1.169f, -0.45f, 1.77f)
                arcToRelative(17.6f, 17.6f, 0.0f, false, false, 4.168f, 6.608f)
                arcToRelative(17.6f, 17.6f, 0.0f, false, false, 6.608f, 4.168f)
                curveToRelative(0.601f, 0.211f, 1.286f, 0.033f, 1.77f, -0.45f)
                lineToRelative(1.034f, -1.034f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, false, -0.063f, -1.015f)
                lineToRelative(-2.307f, -1.794f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.58f, -0.122f)
                lineToRelative(-2.19f, 0.547f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.657f, -0.459f)
                lineTo(5.482f, 8.062f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.46f, -1.657f)
                lineToRelative(0.548f, -2.19f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.122f, -0.58f)
                close()
                moveTo(1.884f, 0.511f)
                arcToRelative(1.745f, 1.745f, 0.0f, false, true, 2.612f, 0.163f)
                lineTo(6.29f, 2.98f)
                curveToRelative(0.329f, 0.423f, 0.445f, 0.974f, 0.315f, 1.494f)
                lineToRelative(-0.547f, 2.19f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.178f, 0.643f)
                lineToRelative(2.457f, 2.457f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.644f, 0.178f)
                lineToRelative(2.189f, -0.547f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.494f, 0.315f)
                lineToRelative(2.306f, 1.794f)
                curveToRelative(0.829f, 0.645f, 0.905f, 1.87f, 0.163f, 2.611f)
                lineToRelative(-1.034f, 1.034f)
                curveToRelative(-0.74f, 0.74f, -1.846f, 1.065f, -2.877f, 0.702f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, true, -7.01f, -4.42f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, true, -4.42f, -7.009f)
                curveToRelative(-0.362f, -1.03f, -0.037f, -2.137f, 0.703f, -2.877f)
                close()
            }
        }
        .build()
        return _telephone!!
    }

private var _telephone: ImageVector? = null
