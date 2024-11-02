package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Ticktick: ImageVector
    get() {
        if (_ticktick != null) {
            return _ticktick!!
        }
        _ticktick = Builder(name = "Ticktick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                horizontalLineToRelative(-2.7f)
                curveToRelative(0.0f, 5.128f, -4.172f, 9.3f, -9.3f, 9.3f)
                curveToRelative(-5.128f, 0.0f, -9.3f, -4.172f, -9.3f, -9.3f)
                curveToRelative(0.0f, -5.128f, 4.172f, -9.3f, 9.3f, -9.3f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(19.4f, 2.583f)
                lineTo(11.895f, 11.954f)
                lineTo(8.388f, 9.08f)
                lineToRelative(-2.002f, 2.436f)
                lineToRelative(4.741f, 3.888f)
                arcToRelative(1.573f, 1.573f, 0.0f, false, false, 2.231f, -0.233f)
                lineToRelative(8.504f, -10.617f)
                lineTo(19.4f, 2.583f)
                close()
            }
        }
        .build()
        return _ticktick!!
    }

private var _ticktick: ImageVector? = null
