package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMusic: ImageVector
    get() {
        if (_bxsMusic != null) {
            return _bxsMusic!!
        }
        _bxsMusic = Builder(name = "BxsMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.573f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineTo(4.428f)
                lineTo(19.0f, 7.7f)
                verticalLineToRelative(7.43f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, false, -2.0f, -0.557f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineTo(7.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.658f, -0.939f)
                lineToRelative(-11.0f, -4.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 8.0f, 3.0f)
                verticalLineToRelative(8.13f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, false, -2.0f, -0.557f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsMusic!!
    }

private var _bxsMusic: ImageVector? = null
