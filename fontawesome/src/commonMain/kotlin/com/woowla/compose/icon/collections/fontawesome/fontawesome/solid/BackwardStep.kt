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

public val SolidGroup.BackwardStep: ImageVector
    get() {
        if (_backwardStep != null) {
            return _backwardStep!!
        }
        _backwardStep = Builder(name = "BackwardStep", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.0f, 36.8f)
                curveToRelative(-12.9f, -7.0f, -28.7f, -6.3f, -41.0f, 1.8f)
                lineTo(64.0f, 208.1f)
                lineTo(64.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(0.0f, 46.3f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -144.1f)
                lineToRelative(258.0f, 169.6f)
                curveToRelative(12.3f, 8.1f, 28.0f, 8.8f, 41.0f, 1.8f)
                reflectiveCurveToRelative(21.0f, -20.5f, 21.0f, -35.2f)
                lineToRelative(0.0f, -368.0f)
                curveToRelative(0.0f, -14.7f, -8.1f, -28.2f, -21.0f, -35.2f)
                close()
            }
        }
        .build()
        return _backwardStep!!
    }

private var _backwardStep: ImageVector? = null
