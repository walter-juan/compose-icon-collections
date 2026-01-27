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

public val SolidGroup.RoadCircleExclamation: ImageVector
    get() {
        if (_roadCircleExclamation != null) {
            return _roadCircleExclamation!!
        }
        _roadCircleExclamation = Builder(name = "RoadCircleExclamation", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                lineToRelative(-76.3f, 0.0f)
                curveToRelative(-29.4f, 0.0f, -55.1f, 20.1f, -62.1f, 48.6f)
                lineTo(65.4f, 420.5f)
                curveTo(57.9f, 450.7f, 80.8f, 480.0f, 112.0f, 480.0f)
                lineToRelative(209.4f, 0.0f)
                curveToRelative(-11.2f, -24.4f, -17.4f, -51.4f, -17.4f, -80.0f)
                curveToRelative(0.0f, -28.6f, 6.2f, -55.7f, 17.4f, -80.0f)
                curveToRelative(-0.5f, 0.0f, -1.0f, 0.0f, -1.5f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 49.0f)
                curveToRelative(35.2f, -39.9f, 86.7f, -65.0f, 144.0f, -65.0f)
                curveToRelative(9.0f, 0.0f, 17.8f, 0.6f, 26.5f, 1.8f)
                lineToRelative(-32.0f, -129.2f)
                curveTo(483.4f, 52.1f, 457.8f, 32.0f, 428.3f, 32.0f)
                lineToRelative(-76.4f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(496.0f, 544.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(496.0f, 444.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -40.0f)
                close()
                moveTo(496.0f, 304.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _roadCircleExclamation!!
    }

private var _roadCircleExclamation: ImageVector? = null
