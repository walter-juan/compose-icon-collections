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

public val Simpleicons.Effect: ImageVector
    get() {
        if (_effect != null) {
            return _effect!!
        }
        _effect = Builder(name = "Effect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.846f, 0.007f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.312f, 0.103f)
                lineTo(0.454f, 6.346f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.397f, 0.855f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.408f, 0.78f)
                lineTo(3.99f, 9.976f)
                lineTo(1.033f, 11.64f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.374f, 0.838f)
                curveToRelative(-0.033f, 0.265f, 0.07f, 0.541f, 0.378f, 0.715f)
                lineToRelative(10.546f, 5.967f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.61f, 0.073f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.27f, -0.094f)
                lineToRelative(10.548f, -5.968f)
                curveToRelative(0.31f, -0.175f, 0.412f, -0.454f, 0.376f, -0.72f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.383f, -0.79f)
                lineToRelative(-3.01f, -1.693f)
                lineToRelative(3.554f, -2.012f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.399f, -0.836f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.412f, -0.753f)
                lineTo(12.455f, 0.13f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.28f, -0.097f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.227f, -0.033f)
                moveToRelative(6.482f, 10.853f)
                lineToRelative(2.78f, 1.566f)
                lineToRelative(-9.205f, 5.21f)
                lineToRelative(-9.21f, -5.213f)
                lineToRelative(2.76f, -1.554f)
                lineToRelative(5.99f, 3.387f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, 0.638f, 0.076f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.285f, -0.098f)
                close()
                moveTo(22.002f, 16.883f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.35f, 0.098f)
                lineToRelative(-9.67f, 5.47f)
                lineToRelative(-9.635f, -5.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.01f, 0.267f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, false, 0.27f, 0.99f)
                lineToRelative(9.976f, 5.644f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.372f, 0.098f)
                curveToRelative(0.079f, 0.0f, 0.294f, -0.026f, 0.46f, -0.117f)
                lineToRelative(9.978f, -5.645f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, false, 0.27f, -0.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.661f, -0.364f)
            }
        }
        .build()
        return _effect!!
    }

private var _effect: ImageVector? = null
