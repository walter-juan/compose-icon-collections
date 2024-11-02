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

public val SolidGroup.SquareH: ImageVector
    get() {
        if (_squareH != null) {
            return _squareH!!
        }
        _squareH = Builder(name = "SquareH", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(336.0f, 152.0f)
                lineToRelative(0.0f, 104.0f)
                lineToRelative(0.0f, 104.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -208.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _squareH!!
    }

private var _squareH: ImageVector? = null
