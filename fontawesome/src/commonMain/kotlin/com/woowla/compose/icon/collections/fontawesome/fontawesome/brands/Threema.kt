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

public val BrandsGroup.Threema: ImageVector
    get() {
        if (_threema != null) {
            return _threema!!
        }
        _threema = Builder(name = "Threema", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.4f, 445.1f)
                curveToRelative(18.5f, 0.0f, 33.5f, 15.0f, 33.5f, 33.4f)
                reflectiveCurveTo(105.9f, 512.0f, 87.4f, 512.0f)
                reflectiveCurveTo(54.0f, 497.0f, 54.0f, 478.5f)
                reflectiveCurveTo(69.0f, 445.1f, 87.4f, 445.1f)
                close()
                moveTo(196.6f, 445.1f)
                curveToRelative(18.5f, 0.0f, 33.5f, 15.0f, 33.5f, 33.4f)
                reflectiveCurveToRelative(-15.0f, 33.5f, -33.5f, 33.5f)
                reflectiveCurveToRelative(-33.4f, -15.0f, -33.4f, -33.5f)
                reflectiveCurveToRelative(15.0f, -33.4f, 33.4f, -33.4f)
                close()
                moveTo(305.9f, 445.1f)
                curveToRelative(18.5f, 0.0f, 33.5f, 15.0f, 33.5f, 33.4f)
                reflectiveCurveToRelative(-15.0f, 33.5f, -33.5f, 33.5f)
                reflectiveCurveToRelative(-33.5f, -15.0f, -33.5f, -33.5f)
                reflectiveCurveToRelative(15.0f, -33.4f, 33.5f, -33.4f)
                close()
                moveTo(192.3f, 0.3f)
                curveToRelative(109.8f, 0.0f, 199.2f, 89.3f, 199.2f, 199.1f)
                reflectiveCurveTo(302.2f, 398.5f, 192.4f, 398.5f)
                curveToRelative(-40.5f, 0.0f, -78.1f, -12.1f, -109.6f, -32.9f)
                lineToRelative(-76.5f, 24.5f)
                lineToRelative(24.8f, -74.0f)
                curveTo(7.3f, 283.4f, -6.8f, 243.0f, -6.8f, 199.4f)
                curveTo(-6.8f, 89.7f, 82.5f, 0.3f, 192.3f, 0.3f)
                close()
                moveTo(192.4f, 94.0f)
                curveToRelative(-31.6f, 0.0f, -57.3f, 25.8f, -57.3f, 57.3f)
                lineToRelative(0.0f, 26.7f)
                lineToRelative(-1.8f, 0.0f)
                curveToRelative(-10.0f, 0.0f, -18.0f, 8.0f, -18.0f, 18.0f)
                lineToRelative(0.0f, 72.3f)
                curveToRelative(0.0f, 10.0f, 8.0f, 18.0f, 18.0f, 18.0f)
                lineToRelative(118.1f, 0.0f)
                curveToRelative(10.0f, 0.0f, 18.0f, -8.0f, 18.0f, -18.0f)
                lineToRelative(0.1f, 0.0f)
                lineToRelative(0.0f, -72.3f)
                curveToRelative(0.0f, -10.0f, -8.1f, -18.0f, -18.0f, -18.0f)
                lineToRelative(-1.8f, 0.0f)
                lineToRelative(0.0f, -26.7f)
                curveToRelative(0.0f, -31.6f, -25.8f, -57.3f, -57.3f, -57.3f)
                close()
                moveTo(192.3f, 117.5f)
                curveToRelative(18.6f, 0.0f, 33.8f, 15.1f, 33.8f, 33.8f)
                lineToRelative(0.0f, 26.7f)
                lineToRelative(-67.6f, 0.0f)
                lineToRelative(0.0f, -26.7f)
                curveToRelative(0.0f, -18.6f, 15.1f, -33.8f, 33.8f, -33.8f)
                close()
            }
        }
        .build()
        return _threema!!
    }

private var _threema: ImageVector? = null
