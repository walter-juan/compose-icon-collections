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

public val SolidGroup.ToiletsPortable: ImageVector
    get() {
        if (_toiletsPortable != null) {
            return _toiletsPortable!!
        }
        _toiletsPortable = Builder(name = "ToiletsPortable", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 0.0f)
                lineTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(0.0f, 64.0f)
                lineTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                close()
                moveTo(0.0f, 96.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(208.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(0.0f, 368.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                lineTo(48.0f, 480.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(0.0f, 120.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(192.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(352.0f, 0.0f)
                lineTo(544.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(320.0f, 64.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(320.0f, 96.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(208.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(0.0f, 368.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -368.0f)
                lineToRelative(0.0f, -24.0f)
                close()
                moveTo(512.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _toiletsPortable!!
    }

private var _toiletsPortable: ImageVector? = null
