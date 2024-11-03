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

public val Twbs.HeartPulseFill: ImageVector
    get() {
        if (_heartPulseFill != null) {
            return _heartPulseFill!!
        }
        _heartPulseFill = Builder(name = "HeartPulseFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.475f, 9.0f)
                curveTo(2.702f, 10.84f, 4.779f, 12.871f, 8.0f, 15.0f)
                curveToRelative(3.221f, -2.129f, 5.298f, -4.16f, 6.525f, -6.0f)
                horizontalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.464f, -0.314f)
                lineToRelative(-1.457f, -3.642f)
                lineToRelative(-1.598f, 5.593f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.945f, 0.049f)
                lineTo(5.889f, 6.568f)
                lineToRelative(-1.473f, 2.21f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.88f, 8.0f)
                curveTo(-2.427f, 1.68f, 4.41f, -2.0f, 7.823f, 1.143f)
                quadToRelative(0.09f, 0.083f, 0.176f, 0.171f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.176f, -0.17f)
                curveTo(11.59f, -2.0f, 18.426f, 1.68f, 15.12f, 8.0f)
                horizontalLineToRelative(-2.783f)
                lineToRelative(-1.874f, -4.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.945f, 0.049f)
                lineTo(7.921f, 8.956f)
                lineTo(6.464f, 5.314f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.88f, -0.091f)
                lineTo(3.732f, 8.0f)
                close()
            }
        }
        .build()
        return _heartPulseFill!!
    }

private var _heartPulseFill: ImageVector? = null
