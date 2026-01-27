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

public val BrandsGroup.GooglePlusG: ImageVector
    get() {
        if (_googlePlusG != null) {
            return _googlePlusG!!
        }
        _googlePlusG = Builder(name = "GooglePlusG", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.3f, 228.5f)
                curveToRelative(1.8f, 9.7f, 3.1f, 19.4f, 3.1f, 32.0f)
                curveToRelative(0.0f, 109.8f, -73.6f, 187.5f, -184.4f, 187.5f)
                curveToRelative(-106.1f, 0.0f, -192.0f, -85.9f, -192.0f, -192.0f)
                reflectiveCurveTo(98.9f, 64.0f, 205.0f, 64.0f)
                curveToRelative(51.9f, 0.0f, 95.1f, 18.9f, 128.6f, 50.3f)
                lineToRelative(-52.1f, 50.0f)
                curveToRelative(-14.1f, -13.6f, -39.0f, -29.6f, -76.5f, -29.6f)
                curveToRelative(-65.5f, 0.0f, -118.9f, 54.2f, -118.9f, 121.3f)
                reflectiveCurveTo(139.5f, 377.3f, 205.0f, 377.3f)
                curveToRelative(76.0f, 0.0f, 104.5f, -54.7f, 109.0f, -82.8f)
                lineToRelative(-109.0f, 0.0f)
                lineToRelative(0.0f, -66.0f)
                lineToRelative(181.3f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(571.7f, 234.9f)
                lineToRelative(0.0f, -55.7f)
                lineToRelative(-56.0f, 0.0f)
                lineToRelative(0.0f, 55.7f)
                lineToRelative(-55.7f, 0.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(55.7f, 0.0f)
                lineToRelative(0.0f, 55.7f)
                lineToRelative(56.0f, 0.0f)
                lineToRelative(0.0f, -55.7f)
                lineToRelative(55.7f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(-55.7f, 0.0f)
                close()
            }
        }
        .build()
        return _googlePlusG!!
    }

private var _googlePlusG: ImageVector? = null
