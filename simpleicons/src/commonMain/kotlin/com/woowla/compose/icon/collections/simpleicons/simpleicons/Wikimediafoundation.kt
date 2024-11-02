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

public val Simpleicons.Wikimediafoundation: ImageVector
    get() {
        if (_wikimediafoundation != null) {
            return _wikimediafoundation!!
        }
        _wikimediafoundation = Builder(name = "Wikimediafoundation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.074f, 3.126f)
                curveTo(22.486f, 5.321f, 24.0f, 8.485f, 24.0f, 12.0f)
                curveToRelative(0.0f, 6.623f, -5.377f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.623f, 0.0f, 12.0f)
                curveToRelative(0.0f, -3.515f, 1.514f, -6.679f, 3.926f, -8.874f)
                lineToRelative(2.265f, 2.265f)
                curveTo(4.358f, 7.005f, 3.2f, 9.368f, 3.2f, 12.0f)
                curveToRelative(0.0f, 4.857f, 3.943f, 8.8f, 8.8f, 8.8f)
                reflectiveCurveToRelative(8.8f, -3.943f, 8.8f, -8.8f)
                curveToRelative(0.0f, -2.632f, -1.158f, -4.995f, -2.991f, -6.609f)
                close()
                moveTo(16.675f, 6.525f)
                curveTo(18.22f, 7.846f, 19.2f, 9.81f, 19.2f, 12.0f)
                curveToRelative(0.0f, 3.703f, -2.802f, 6.757f, -6.4f, 7.156f)
                lineTo(12.8f, 10.4f)
                close()
                moveTo(11.2f, 19.156f)
                curveTo(7.602f, 18.757f, 4.8f, 15.703f, 4.8f, 12.0f)
                curveToRelative(0.0f, -2.19f, 0.98f, -4.154f, 2.525f, -5.475f)
                lineTo(11.2f, 10.4f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(2.208f, 0.0f, 4.0f, 1.792f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.792f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.792f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.792f, -4.0f, 4.0f, -4.0f)
            }
        }
        .build()
        return _wikimediafoundation!!
    }

private var _wikimediafoundation: ImageVector? = null
