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

public val SolidGroup.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 288.0f)
                curveTo(96.5f, 288.0f, 32.0f, 223.5f, 32.0f, 144.0f)
                reflectiveCurveTo(96.5f, 0.0f, 176.0f, 0.0f)
                curveToRelative(27.2f, 0.0f, 52.6f, 7.5f, 74.3f, 20.6f)
                curveToRelative(20.1f, -13.0f, 44.0f, -20.6f, 69.7f, -20.6f)
                curveToRelative(47.4f, 0.0f, 88.7f, 25.7f, 110.9f, 64.0f)
                lineToRelative(1.1f, 0.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, 50.1f, 112.0f, 112.0f)
                curveToRelative(0.0f, 60.3f, -47.6f, 109.4f, -107.2f, 111.9f)
                curveToRelative(-22.6f, 20.0f, -52.3f, 32.1f, -84.8f, 32.1f)
                curveToRelative(-32.5f, 0.0f, -62.1f, -12.1f, -84.7f, -32.0f)
                lineTo(176.0f, 288.0f)
                close()
                moveTo(512.0f, 392.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 416.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(464.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                close()
                moveTo(88.0f, 464.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(264.0f, 464.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-288.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
