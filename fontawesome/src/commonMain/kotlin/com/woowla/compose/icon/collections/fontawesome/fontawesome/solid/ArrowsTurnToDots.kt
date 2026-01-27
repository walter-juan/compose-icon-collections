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

public val SolidGroup.ArrowsTurnToDots: ImageVector
    get() {
        if (_arrowsTurnToDots != null) {
            return _arrowsTurnToDots!!
        }
        _arrowsTurnToDots = Builder(name = "ArrowsTurnToDots", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(265.4f, -6.6f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(285.3f, 64.0f)
                lineTo(352.0f, 64.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-66.7f, 0.0f)
                lineToRelative(25.4f, 25.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(80.0f, -80.0f)
                close()
                moveTo(182.7f, 265.4f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(162.7f, 400.0f)
                lineTo(96.0f, 400.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(0.0f, 481.7f, 0.0f, 464.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                lineToRelative(66.7f, 0.0f)
                lineToRelative(-25.4f, -25.4f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(32.8f, -12.5f, 45.3f, 0.0f)
                close()
                moveTo(320.0f, 368.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
                moveTo(64.0f, 160.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                close()
            }
        }
        .build()
        return _arrowsTurnToDots!!
    }

private var _arrowsTurnToDots: ImageVector? = null
