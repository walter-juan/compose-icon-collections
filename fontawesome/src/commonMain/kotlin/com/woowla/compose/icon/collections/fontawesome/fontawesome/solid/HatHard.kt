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

public val SolidGroup.HatHard: ImageVector
    get() {
        if (_hatHard != null) {
            return _hatHard!!
        }
        _hatHard = Builder(name = "HatHard", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 264.0f)
                lineToRelative(0.0f, -200.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 200.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -185.9f)
                curveTo(90.0f, 109.8f, 32.0f, 191.8f, 32.0f, 288.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(512.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(-1.0f, -95.2f, -58.4f, -177.7f, -144.0f, -209.8f)
                lineTo(400.0f, 264.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(40.0f, 400.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(496.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                reflectiveCurveToRelative(-17.9f, -40.0f, -40.0f, -40.0f)
                lineTo(40.0f, 400.0f)
                close()
            }
        }
        .build()
        return _hatHard!!
    }

private var _hatHard: ImageVector? = null
