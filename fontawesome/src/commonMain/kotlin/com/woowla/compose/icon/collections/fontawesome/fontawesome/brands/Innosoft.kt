package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Innosoft: ImageVector
    get() {
        if (_innosoft != null) {
            return _innosoft!!
        }
        _innosoft = Builder(name = "Innosoft", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 96.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(21.0f, 0.0f, 41.8f, -4.1f, 61.2f, -12.2f)
                reflectiveCurveToRelative(37.0f, -19.8f, 51.9f, -34.7f)
                reflectiveCurveToRelative(26.6f, -32.5f, 34.7f, -51.9f)
                reflectiveCurveToRelative(12.2f, -40.2f, 12.2f, -61.2f)
                reflectiveCurveToRelative(-4.1f, -41.8f, -12.2f, -61.2f)
                reflectiveCurveToRelative(-19.8f, -37.1f, -34.7f, -51.9f)
                reflectiveCurveToRelative(-32.5f, -26.6f, -51.9f, -34.7f)
                reflectiveCurveToRelative(-40.2f, -12.2f, -61.2f, -12.2f)
                close()
                moveTo(0.0f, 256.0f)
                lineTo(160.0f, 416.0f)
                lineTo(320.0f, 256.0f)
                lineTo(160.0f, 96.0f)
                lineTo(0.0f, 256.0f)
                close()
                moveTo(480.0f, 256.0f)
                curveToRelative(0.0f, 21.0f, 4.1f, 41.8f, 12.2f, 61.2f)
                reflectiveCurveToRelative(19.8f, 37.0f, 34.7f, 51.9f)
                reflectiveCurveToRelative(32.5f, 26.6f, 51.9f, 34.7f)
                reflectiveCurveToRelative(40.2f, 12.2f, 61.2f, 12.2f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(-42.4f, 0.0f, -83.1f, 16.9f, -113.1f, 46.9f)
                reflectiveCurveTo(480.0f, 213.6f, 480.0f, 256.0f)
                close()
            }
        }
        .build()
        return _innosoft!!
    }

private var _innosoft: ImageVector? = null
