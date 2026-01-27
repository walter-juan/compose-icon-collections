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

public val SolidGroup.ArrowRightToFile: ImageVector
    get() {
        if (_arrowRightToFile != null) {
            return _arrowRightToFile!!
        }
        _arrowRightToFile = Builder(name = "ArrowRightToFile", defaultWidth = 384.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineToRelative(0.0f, 240.0f)
                lineToRelative(182.1f, 0.0f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(-182.1f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -277.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(258.7f, 18.7f)
                curveTo(246.7f, 6.7f, 230.5f, 0.0f, 213.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(325.5f, 176.0f)
                lineTo(232.0f, 176.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(208.0f, 58.5f)
                lineTo(325.5f, 176.0f)
                close()
            }
        }
        .build()
        return _arrowRightToFile!!
    }

private var _arrowRightToFile: ImageVector? = null
