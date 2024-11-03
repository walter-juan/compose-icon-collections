package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 2.748f)
                lineToRelative(-0.717f, -0.737f)
                curveTo(5.6f, 0.281f, 2.514f, 0.878f, 1.4f, 3.053f)
                curveTo(0.918f, 3.995f, 0.78f, 5.323f, 1.508f, 7.0f)
                horizontalLineTo(0.43f)
                curveToRelative(-2.128f, -5.697f, 4.165f, -8.83f, 7.394f, -5.857f)
                quadToRelative(0.09f, 0.083f, 0.176f, 0.171f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.176f, -0.17f)
                curveToRelative(3.23f, -2.974f, 9.522f, 0.159f, 7.394f, 5.856f)
                horizontalLineToRelative(-1.078f)
                curveToRelative(0.728f, -1.677f, 0.59f, -3.005f, 0.108f, -3.947f)
                curveTo(13.486f, 0.878f, 10.4f, 0.28f, 8.717f, 2.01f)
                close()
                moveTo(2.212f, 10.0f)
                horizontalLineToRelative(1.315f)
                curveTo(4.593f, 11.183f, 6.05f, 12.458f, 8.0f, 13.795f)
                curveToRelative(1.949f, -1.337f, 3.407f, -2.612f, 4.473f, -3.795f)
                horizontalLineToRelative(1.315f)
                curveToRelative(-1.265f, 1.566f, -3.14f, 3.25f, -5.788f, 5.0f)
                curveToRelative(-2.648f, -1.75f, -4.523f, -3.434f, -5.788f, -5.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.464f, 3.314f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.945f, 0.049f)
                lineTo(7.921f, 8.956f)
                lineTo(6.464f, 5.314f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.88f, -0.091f)
                lineTo(3.732f, 8.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.416f, -0.223f)
                lineToRelative(1.473f, -2.209f)
                lineToRelative(1.647f, 4.118f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.945f, -0.049f)
                lineToRelative(1.598f, -5.593f)
                lineToRelative(1.457f, 3.642f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.0f, 9.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-3.162f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
