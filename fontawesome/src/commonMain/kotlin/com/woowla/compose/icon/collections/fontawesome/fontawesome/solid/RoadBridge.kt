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

public val SolidGroup.RoadBridge: ImageVector
    get() {
        if (_roadBridge != null) {
            return _roadBridge!!
        }
        _roadBridge = Builder(name = "RoadBridge", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                lineToRelative(208.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 129.3f)
                curveToRelative(-45.4f, 7.6f, -80.0f, 47.1f, -80.0f, 94.7f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -94.0f)
                curveToRelative(0.0f, -38.8f, -26.4f, -72.6f, -64.0f, -82.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-8.0f, 0.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(88.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-80.0f, 0.0f)
                close()
                moveTo(336.0f, 32.0f)
                lineToRelative(72.0f, 0.0f)
                lineToRelative(0.0f, 72.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -72.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, -72.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 72.0f)
                lineToRelative(-72.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -352.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
                moveTo(432.0f, 192.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _roadBridge!!
    }

private var _roadBridge: ImageVector? = null
