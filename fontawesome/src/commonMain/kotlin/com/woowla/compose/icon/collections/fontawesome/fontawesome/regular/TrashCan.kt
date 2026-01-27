package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.TrashCan: ImageVector
    get() {
        if (_trashCan != null) {
            return _trashCan!!
        }
        _trashCan = Builder(name = "TrashCan", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.2f, -16.0f)
                curveToRelative(-13.3f, 0.0f, -25.3f, 8.3f, -30.0f, 20.8f)
                lineTo(120.0f, 48.0f)
                lineTo(24.0f, 48.0f)
                curveTo(10.7f, 48.0f, 0.0f, 58.7f, 0.0f, 72.0f)
                reflectiveCurveTo(10.7f, 96.0f, 24.0f, 96.0f)
                lineToRelative(400.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(-16.2f, -43.2f)
                curveTo(307.1f, -7.7f, 295.2f, -16.0f, 281.8f, -16.0f)
                lineTo(166.2f, -16.0f)
                close()
                moveTo(32.0f, 144.0f)
                lineToRelative(0.0f, 304.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -304.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 304.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(96.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -304.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
                moveTo(192.0f, 216.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -176.0f)
                close()
                moveTo(304.0f, 216.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -176.0f)
                close()
            }
        }
        .build()
        return _trashCan!!
    }

private var _trashCan: ImageVector? = null
