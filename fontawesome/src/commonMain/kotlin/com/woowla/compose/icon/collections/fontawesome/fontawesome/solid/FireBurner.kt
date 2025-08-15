package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.FireBurner: ImageVector
    get() {
        if (_fireBurner != null) {
            return _fireBurner!!
        }
        _fireBurner = Builder(name = "FireBurner", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(281.7f, 48.3f)
                lineTo(294.0f, 34.5f)
                curveToRelative(5.4f, -6.1f, 13.3f, -8.8f, 20.9f, -8.9f)
                curveToRelative(7.2f, 0.0f, 14.3f, 2.6f, 19.9f, 7.8f)
                curveToRelative(19.7f, 18.3f, 39.8f, 43.2f, 55.0f, 70.6f)
                curveToRelative(15.1f, 27.2f, 26.2f, 58.1f, 26.2f, 88.1f)
                curveToRelative(0.0f, 88.7f, -71.3f, 159.8f, -160.0f, 159.8f)
                curveToRelative(-89.6f, 0.0f, -160.0f, -71.3f, -160.0f, -159.8f)
                curveToRelative(0.0f, -37.3f, 16.0f, -73.4f, 36.8f, -104.5f)
                curveToRelative(20.9f, -31.3f, 47.5f, -59.0f, 70.9f, -80.2f)
                curveToRelative(5.7f, -5.2f, 13.1f, -7.7f, 20.3f, -7.5f)
                reflectiveCurveToRelative(13.4f, 3.2f, 18.8f, 7.5f)
                curveToRelative(14.4f, 11.4f, 38.9f, 40.7f, 38.9f, 40.7f)
                close()
                moveTo(320.0f, 240.2f)
                curveToRelative(0.0f, -36.5f, -37.0f, -73.0f, -54.8f, -88.4f)
                curveToRelative(-5.4f, -4.7f, -13.1f, -4.7f, -18.5f, 0.0f)
                curveToRelative(-17.7f, 15.4f, -54.8f, 51.9f, -54.8f, 88.4f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
                moveTo(92.8f, 320.0f)
                curveToRelative(37.7f, 48.3f, 96.1f, 80.0f, 163.2f, 80.0f)
                curveToRelative(66.5f, 0.0f, 125.1f, -31.7f, 163.0f, -80.0f)
                lineToRelative(45.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(44.8f, 0.0f)
                close()
                moveTo(456.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fireBurner!!
    }

private var _fireBurner: ImageVector? = null
