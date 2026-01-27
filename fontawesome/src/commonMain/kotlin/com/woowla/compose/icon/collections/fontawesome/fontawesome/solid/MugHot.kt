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

public val SolidGroup.MugHot: ImageVector
    get() {
        if (_mugHot != null) {
            return _mugHot!!
        }
        _mugHot = Builder(name = "MugHot", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, -16.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                curveToRelative(0.0f, 38.9f, 23.4f, 59.4f, 39.1f, 73.1f)
                lineToRelative(1.1f, 1.0f)
                curveToRelative(16.3f, 14.3f, 23.8f, 21.8f, 23.8f, 37.9f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -38.9f, -23.4f, -59.4f, -39.1f, -73.1f)
                lineToRelative(-1.1f, -1.0f)
                curveTo(183.5f, 31.7f, 176.0f, 24.1f, 176.0f, 8.0f)
                curveTo(176.0f, -5.3f, 165.3f, -16.0f, 152.0f, -16.0f)
                close()
                moveTo(96.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(41.8f, 0.0f, 77.4f, -26.7f, 90.5f, -64.0f)
                lineToRelative(5.5f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(518.7f, 192.0f, 448.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                close()
                moveTo(448.0f, 384.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(288.0f, 8.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(240.0f, -5.3f, 240.0f, 8.0f)
                curveToRelative(0.0f, 38.9f, 23.4f, 59.4f, 39.1f, 73.1f)
                lineToRelative(1.1f, 1.0f)
                curveToRelative(16.3f, 14.3f, 23.8f, 21.8f, 23.8f, 37.9f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -38.9f, -23.4f, -59.4f, -39.1f, -73.1f)
                lineToRelative(-1.1f, -1.0f)
                curveTo(295.5f, 31.7f, 288.0f, 24.1f, 288.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mugHot!!
    }

private var _mugHot: ImageVector? = null
