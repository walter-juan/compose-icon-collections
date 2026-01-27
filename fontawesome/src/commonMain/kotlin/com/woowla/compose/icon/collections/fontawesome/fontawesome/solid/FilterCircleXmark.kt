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
                reflectiveCurveTo(0.2f, 109.5f, 9.4f, 118.6f)
                lineTo(192.0f, 301.3f)
                lineTo(192.0f, 416.0f)
                curveToRelative(0.0f, 8.5f, 3.4f, 16.6f, 9.4f, 22.6f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(2.5f, 2.5f, 5.3f, 4.5f, 8.3f, 6.0f)
                curveToRelative(-21.2f, -30.9f, -33.6f, -68.3f, -33.6f, -108.6f)
                curveToRelative(0.0f, -99.4f, 75.5f, -181.1f, 172.3f, -191.0f)
                lineToRelative(90.4f, -90.4f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveTo(492.9f, 64.0f, 480.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                close()
                moveTo(432.0f, 544.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
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
