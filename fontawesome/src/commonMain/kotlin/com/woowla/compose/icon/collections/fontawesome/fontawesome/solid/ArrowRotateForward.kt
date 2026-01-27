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

public val SolidGroup.ArrowRotateForward: ImageVector
    get() {
        if (_arrowRotateForward != null) {
            return _arrowRotateForward!!
        }
        _arrowRotateForward = Builder(name = "ArrowRotateForward", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(436.7f, 74.7f)
                lineTo(448.0f, 85.4f)
                lineTo(448.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(47.9f, 0.0f)
                lineToRelative(-7.6f, -7.2f)
                curveToRelative(-0.2f, -0.2f, -0.4f, -0.4f, -0.6f, -0.6f)
                curveToRelative(-75.0f, -75.0f, -196.5f, -75.0f, -271.5f, 0.0f)
                reflectiveCurveToRelative(-75.0f, 196.5f, 0.0f, 271.5f)
                reflectiveCurveToRelative(196.5f, 75.0f, 271.5f, 0.0f)
                curveToRelative(8.2f, -8.2f, 15.5f, -16.9f, 21.9f, -26.1f)
                curveToRelative(10.1f, -14.5f, 30.1f, -18.0f, 44.6f, -7.9f)
                reflectiveCurveToRelative(18.0f, 30.1f, 7.9f, 44.6f)
                curveToRelative(-8.5f, 12.2f, -18.2f, 23.8f, -29.1f, 34.7f)
                curveToRelative(-100.0f, 100.0f, -262.1f, 100.0f, -362.0f, 0.0f)
                reflectiveCurveTo(-25.0f, 175.0f, 75.0f, 75.0f)
                curveToRelative(99.9f, -99.9f, 261.7f, -100.0f, 361.7f, -0.3f)
                close()
            }
        }
        .build()
        return _arrowRotateForward!!
    }

private var _arrowRotateForward: ImageVector? = null
