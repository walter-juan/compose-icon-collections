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

public val SolidGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.9f, 48.0f)
                curveTo(19.7f, 48.0f, 0.0f, 67.7f, 0.0f, 91.9f)
                lineTo(0.0f, 420.1f)
                curveToRelative(0.0f, 24.3f, 19.7f, 43.9f, 43.9f, 43.9f)
                curveToRelative(5.5f, 0.0f, 10.7f, -1.0f, 15.7f, -2.9f)
                curveToRelative(12.9f, -4.9f, 103.4f, -37.1f, 228.4f, -37.1f)
                reflectiveCurveToRelative(215.5f, 32.3f, 228.4f, 37.1f)
                curveToRelative(5.0f, 1.9f, 10.2f, 2.9f, 15.7f, 2.9f)
                curveToRelative(24.3f, 0.0f, 43.9f, -19.7f, 43.9f, -43.9f)
                lineToRelative(0.0f, -328.2f)
                curveToRelative(0.0f, -24.3f, -19.7f, -43.9f, -43.9f, -43.9f)
                curveToRelative(-5.5f, 0.0f, -10.7f, 1.0f, -15.7f, 2.9f)
                curveToRelative(-12.9f, 4.9f, -103.4f, 37.1f, -228.4f, 37.1f)
                reflectiveCurveTo(72.5f, 55.7f, 59.6f, 50.9f)
                curveTo(54.6f, 49.0f, 49.4f, 48.0f, 43.9f, 48.0f)
                close()
                moveTo(72.0f, 176.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
                close()
                moveTo(336.1f, 160.0f)
                curveToRelative(7.5f, 0.0f, 14.6f, 3.6f, 19.1f, 9.6f)
                lineTo(479.7f, 336.2f)
                curveToRelative(5.9f, 7.9f, 6.4f, 18.5f, 1.3f, 26.9f)
                reflectiveCurveToRelative(-14.8f, 12.8f, -24.5f, 11.1f)
                curveToRelative(-45.8f, -7.8f, -103.3f, -14.2f, -168.4f, -14.2f)
                curveToRelative(-65.6f, 0.0f, -123.4f, 6.5f, -169.3f, 14.4f)
                curveToRelative(-9.8f, 1.7f, -19.7f, -2.9f, -24.7f, -11.5f)
                reflectiveCurveToRelative(-4.3f, -19.4f, 1.9f, -27.2f)
                lineTo(165.3f, 249.0f)
                curveToRelative(4.6f, -5.7f, 11.5f, -9.0f, 18.7f, -9.0f)
                reflectiveCurveToRelative(14.2f, 3.3f, 18.7f, 9.0f)
                lineToRelative(27.5f, 34.4f)
                lineToRelative(86.7f, -113.9f)
                curveToRelative(4.6f, -6.0f, 11.7f, -9.5f, 19.2f, -9.5f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
