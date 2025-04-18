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

public val SolidGroup.Stapler: ImageVector
    get() {
        if (_stapler != null) {
            return _stapler!!
        }
        _stapler = Builder(name = "Stapler", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 299.3f)
                lineToRelative(0.0f, 4.7f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(-64.0f, 0.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(384.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineTo(96.0f, 368.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -116.6f)
                lineTo(33.8f, 214.0f)
                curveTo(14.2f, 210.5f, 0.0f, 193.5f, 0.0f, 173.7f)
                curveToRelative(0.0f, -8.9f, 2.9f, -17.5f, 8.2f, -24.6f)
                lineToRelative(35.6f, -47.5f)
                curveTo(76.7f, 57.8f, 128.2f, 32.0f, 182.9f, 32.0f)
                curveToRelative(27.0f, 0.0f, 53.6f, 6.3f, 77.8f, 18.4f)
                lineTo(586.9f, 213.5f)
                curveTo(619.5f, 229.7f, 640.0f, 263.0f, 640.0f, 299.3f)
                close()
                moveTo(448.0f, 304.0f)
                lineToRelative(0.0f, -16.0f)
                lineTo(128.0f, 230.9f)
                lineToRelative(0.0f, 73.1f)
                lineToRelative(320.0f, 0.0f)
                close()
            }
        }
        .build()
        return _stapler!!
    }

private var _stapler: ImageVector? = null
