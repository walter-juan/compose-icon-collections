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

public val SolidGroup.PlaneLock: ImageVector
    get() {
        if (_planeLock != null) {
            return _planeLock!!
        }
        _planeLock = Builder(name = "PlaneLock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 24.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                lineToRelative(0.0f, 127.3f)
                lineToRelative(82.1f, 75.2f)
                curveTo(409.7f, 248.1f, 400.0f, 274.9f, 400.0f, 304.0f)
                lineToRelative(0.0f, 24.4f)
                curveToRelative(-7.3f, 6.6f, -13.6f, 14.2f, -18.7f, 22.7f)
                lineToRelative(-37.3f, -12.4f)
                lineToRelative(0.0f, 99.7f)
                lineToRelative(24.0f, 19.2f)
                lineToRelative(0.0f, 38.3f)
                curveToRelative(0.0f, 13.5f, 2.8f, 26.4f, 7.8f, 38.1f)
                lineTo(288.0f, 512.0f)
                lineTo(179.9f, 539.0f)
                curveToRelative(-10.1f, 2.5f, -19.9f, -5.1f, -19.9f, -15.5f)
                lineToRelative(0.0f, -19.8f)
                curveToRelative(0.0f, -4.9f, 2.2f, -9.5f, 6.0f, -12.5f)
                lineToRelative(66.0f, -52.8f)
                lineToRelative(0.0f, -99.7f)
                lineToRelative(-162.9f, 54.3f)
                curveTo(58.7f, 396.4f, 48.0f, 388.7f, 48.0f, 377.8f)
                lineToRelative(0.0f, -43.7f)
                curveToRelative(0.0f, -9.0f, 3.8f, -17.5f, 10.4f, -23.6f)
                lineTo(232.0f, 151.3f)
                lineTo(232.0f, 24.0f)
                close()
                moveTo(560.0f, 304.1f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                close()
                moveTo(416.0f, 400.0f)
                curveToRelative(0.0f, -20.9f, 13.4f, -38.7f, 32.0f, -45.3f)
                lineToRelative(0.0f, -50.6f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 50.6f)
                curveToRelative(18.6f, 6.6f, 32.0f, 24.4f, 32.0f, 45.3f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _planeLock!!
    }

private var _planeLock: ImageVector? = null
