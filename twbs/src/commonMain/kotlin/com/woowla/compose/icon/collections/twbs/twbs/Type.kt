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

public val Twbs.Type: ImageVector
    get() {
        if (_type != null) {
            return _type!!
        }
        _type = Builder(name = "Type", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.244f, 13.081f)
                lineToRelative(0.943f, -2.803f)
                lineTo(6.66f, 10.278f)
                lineToRelative(0.944f, 2.803f)
                lineTo(8.86f, 13.081f)
                lineTo(5.54f, 3.75f)
                lineTo(4.322f, 3.75f)
                lineTo(1.0f, 13.081f)
                close()
                moveTo(4.944f, 5.158f)
                lineTo(6.34f, 9.314f)
                lineTo(3.51f, 9.314f)
                lineToRelative(1.4f, -4.156f)
                close()
                moveTo(14.09f, 12.185f)
                horizontalLineToRelative(0.035f)
                verticalLineToRelative(0.896f)
                horizontalLineToRelative(1.128f)
                lineTo(15.253f, 8.125f)
                curveToRelative(0.0f, -1.51f, -1.114f, -2.345f, -2.646f, -2.345f)
                curveToRelative(-1.736f, 0.0f, -2.59f, 0.916f, -2.666f, 2.174f)
                horizontalLineToRelative(1.108f)
                curveToRelative(0.068f, -0.718f, 0.595f, -1.19f, 1.517f, -1.19f)
                curveToRelative(0.971f, 0.0f, 1.518f, 0.52f, 1.518f, 1.464f)
                verticalLineToRelative(0.731f)
                lineTo(12.19f, 8.959f)
                curveToRelative(-1.647f, 0.007f, -2.522f, 0.8f, -2.522f, 2.058f)
                curveToRelative(0.0f, 1.319f, 0.957f, 2.18f, 2.345f, 2.18f)
                curveToRelative(1.06f, 0.0f, 1.716f, -0.43f, 2.078f, -1.011f)
                close()
                moveTo(12.327f, 12.22f)
                curveToRelative(-0.752f, 0.0f, -1.456f, -0.397f, -1.456f, -1.244f)
                curveToRelative(0.0f, -0.65f, 0.424f, -1.115f, 1.408f, -1.115f)
                horizontalLineToRelative(1.805f)
                verticalLineToRelative(0.834f)
                curveToRelative(0.0f, 0.896f, -0.752f, 1.525f, -1.757f, 1.525f)
            }
        }
        .build()
        return _type!!
    }

private var _type: ImageVector? = null
