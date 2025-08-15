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

public val SolidGroup.FilterCircleXmark: ImageVector
    get() {
        if (_filterCircleXmark != null) {
            return _filterCircleXmark!!
        }
        _filterCircleXmark = Builder(name = "FilterCircleXmark", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveTo(19.1f, 64.0f, 7.4f, 71.8f, 2.4f, 83.8f)
                lineTo(273.6f, 508.6f)
                curveToRelative(8.2f, 4.1f, 17.9f, 4.6f, 26.6f, 1.0f)
                curveToRelative(9.1f, -3.8f, 15.8f, -11.5f, 18.5f, -20.6f)
                curveToRelative(26.4f, 33.5f, 67.3f, 55.1f, 113.3f, 55.1f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveTo(511.5f, 256.0f, 432.0f, 256.0f)
                curveToRelative(-45.2f, 0.0f, -85.6f, 20.9f, -112.0f, 53.5f)
                lineToRelative(0.0f, -8.2f)
                lineToRelative(182.6f, -182.6f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveTo(492.9f, 64.0f, 480.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                close()
                moveTo(491.3f, 363.3f)
                lineToRelative(-36.7f, 36.7f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-36.7f, -36.7f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(36.7f, -36.7f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(36.7f, 36.7f)
                lineToRelative(36.7f, -36.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _filterCircleXmark!!
    }

private var _filterCircleXmark: ImageVector? = null
