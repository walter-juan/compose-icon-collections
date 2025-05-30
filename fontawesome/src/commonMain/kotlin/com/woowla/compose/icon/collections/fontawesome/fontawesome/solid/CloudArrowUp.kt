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

public val SolidGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 480.0f)
                curveTo(64.5f, 480.0f, 0.0f, 415.5f, 0.0f, 336.0f)
                curveToRelative(0.0f, -62.8f, 40.2f, -116.2f, 96.2f, -135.9f)
                curveToRelative(-0.1f, -2.7f, -0.2f, -5.4f, -0.2f, -8.1f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(59.3f, 0.0f, 111.0f, 32.2f, 138.7f, 80.2f)
                curveTo(409.9f, 102.0f, 428.3f, 96.0f, 448.0f, 96.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 12.2f, -2.3f, 23.8f, -6.4f, 34.6f)
                curveTo(596.0f, 238.4f, 640.0f, 290.1f, 640.0f, 352.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineToRelative(-368.0f, 0.0f)
                close()
                moveTo(223.0f, 263.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(39.0f, -39.0f)
                lineTo(296.0f, 392.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -134.1f)
                lineToRelative(39.0f, 39.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-80.0f, -80.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
