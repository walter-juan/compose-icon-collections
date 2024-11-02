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

public val Simpleicons.Coreldraw: ImageVector
    get() {
        if (_coreldraw != null) {
            return _coreldraw!!
        }
        _coreldraw = Builder(name = "Coreldraw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.651f, 0.0f)
                curveTo(10.265f, 0.019f, 9.4f, 0.272f, 8.584f, 0.657f)
                curveToRelative(-0.816f, 0.39f, -3.696f, 2.161f, -3.752f, 6.536f)
                curveToRelative(0.072f, 4.145f, 3.847f, 11.191f, 6.397f, 13.455f)
                curveToRelative(0.0f, 0.0f, -4.141f, -6.952f, -4.439f, -13.013f)
                curveTo(6.488f, 1.575f, 10.651f, 0.0f, 10.651f, 0.0f)
                close()
                moveTo(13.33f, 0.0f)
                reflectiveCurveToRelative(4.159f, 1.575f, 3.861f, 7.635f)
                curveToRelative(-0.299f, 6.061f, -4.439f, 13.013f, -4.439f, 13.013f)
                curveToRelative(2.547f, -2.264f, 6.324f, -9.31f, 6.396f, -13.455f)
                curveToRelative(-0.057f, -4.375f, -2.936f, -6.146f, -3.752f, -6.536f)
                curveTo(14.58f, 0.272f, 13.715f, 0.019f, 13.33f, 0.0f)
                close()
                moveTo(11.95f, 0.019f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -0.555f, 0.144f)
                curveTo(9.864f, 0.99f, 8.909f, 3.982f, 9.177f, 8.66f)
                curveToRelative(0.185f, 3.242f, 1.009f, 7.291f, 2.422f, 11.988f)
                horizontalLineToRelative(0.7f)
                curveToRelative(1.413f, -4.697f, 2.24f, -8.742f, 2.425f, -11.984f)
                curveToRelative(0.268f, -4.677f, -0.688f, -7.674f, -2.219f, -8.501f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -0.555f, -0.144f)
                close()
                moveTo(7.017f, 1.066f)
                reflectiveCurveTo(2.543f, 2.909f, 3.431f, 8.225f)
                curveToRelative(0.884f, 5.32f, 5.588f, 10.995f, 6.986f, 12.2f)
                curveToRelative(0.503f, 0.457f, -5.777f, -6.548f, -6.386f, -12.699f)
                curveToRelative(-0.291f, -2.323f, 0.39f, -4.9f, 2.986f, -6.66f)
                close()
                moveTo(16.983f, 1.066f)
                curveToRelative(2.595f, 1.76f, 3.276f, 4.337f, 2.985f, 6.66f)
                curveToRelative(-0.608f, 6.151f, -6.888f, 13.156f, -6.386f, 12.699f)
                curveToRelative(1.398f, -1.205f, 6.103f, -6.88f, 6.987f, -12.2f)
                curveToRelative(0.888f, -5.316f, -3.586f, -7.159f, -3.586f, -7.159f)
                close()
                moveTo(10.168f, 21.846f)
                lineTo(10.647f, 24.0f)
                horizontalLineToRelative(2.599f)
                lineToRelative(0.488f, -2.154f)
                horizontalLineToRelative(-3.566f)
                close()
            }
        }
        .build()
        return _coreldraw!!
    }

private var _coreldraw: ImageVector? = null
