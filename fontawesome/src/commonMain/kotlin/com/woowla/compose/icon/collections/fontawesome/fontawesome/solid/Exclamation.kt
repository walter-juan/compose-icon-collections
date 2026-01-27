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

public val SolidGroup.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 128.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 128.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 432.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.9f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.9f, -40.0f, -40.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                close()
                moveTo(64.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 0.6f, 0.0f, 1.1f, 0.0f, 1.7f)
                lineToRelative(-16.0f, 304.0f)
                curveToRelative(-0.9f, 17.0f, -15.0f, 30.3f, -32.0f, 30.3f)
                reflectiveCurveTo(33.0f, 370.7f, 32.0f, 353.7f)
                lineTo(16.0f, 49.7f)
                curveToRelative(0.0f, -0.6f, 0.0f, -1.1f, 0.0f, -1.7f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
