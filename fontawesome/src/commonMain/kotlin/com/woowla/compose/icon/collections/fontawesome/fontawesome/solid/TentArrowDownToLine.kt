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

public val SolidGroup.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.0f, 121.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-31.0f, 31.0f)
                lineToRelative(0.0f, -102.1f)
                curveTo(120.0f, 2.7f, 109.3f, -8.0f, 96.0f, -8.0f)
                reflectiveCurveTo(72.0f, 2.7f, 72.0f, 16.0f)
                lineToRelative(0.0f, 102.1f)
                lineToRelative(-31.0f, -31.0f)
                curveTo(31.6f, 77.7f, 16.4f, 77.7f, 7.0f, 87.0f)
                reflectiveCurveTo(-2.3f, 111.6f, 7.0f, 121.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                close()
                moveTo(155.8f, 260.6f)
                lineTo(132.1f, 448.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(512.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -2.8f, -0.4f, -5.5f, -1.0f, -8.0f)
                lineTo(548.2f, 260.7f)
                curveToRelative(-1.2f, -9.7f, -6.9f, -18.4f, -15.3f, -23.4f)
                lineTo(367.4f, 137.9f)
                curveToRelative(-10.2f, -6.1f, -22.9f, -6.1f, -33.1f, 0.1f)
                lineTo(170.9f, 237.3f)
                curveToRelative(-8.3f, 5.1f, -13.9f, 13.7f, -15.1f, 23.3f)
                close()
                moveTo(448.0f, 448.0f)
                lineToRelative(-97.1f, 0.0f)
                lineToRelative(0.0f, -149.4f)
                curveToRelative(0.0f, -5.9f, 4.7f, -10.6f, 10.6f, -10.6f)
                curveToRelative(4.0f, 0.0f, 7.7f, 2.3f, 9.5f, 5.9f)
                lineTo(448.0f, 448.0f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
