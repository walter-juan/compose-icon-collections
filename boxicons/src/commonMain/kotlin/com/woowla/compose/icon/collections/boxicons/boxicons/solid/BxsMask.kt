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

public val SolidGroup.BxsMask: ImageVector
    get() {
        if (_bxsMask != null) {
            return _bxsMask!!
        }
        _bxsMask = Builder(name = "BxsMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveTo(3.346f, 6.0f, 2.0f, 7.346f, 2.0f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(1.637f)
                curveToRelative(1.166f, 0.0f, 2.28f, -0.557f, 2.981f, -1.491f)
                curveToRelative(0.66f, -0.879f, 2.104f, -0.88f, 2.764f, 0.001f)
                arcTo(3.744f, 3.744f, 0.0f, false, false, 16.363f, 18.0f)
                lineTo(18.0f, 18.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(7.5f, 13.0f)
                curveTo(6.119f, 13.0f, 5.0f, 12.328f, 5.0f, 11.5f)
                reflectiveCurveTo(6.119f, 10.0f, 7.5f, 10.0f)
                reflectiveCurveToRelative(2.5f, 0.672f, 2.5f, 1.5f)
                reflectiveCurveTo(8.881f, 13.0f, 7.5f, 13.0f)
                close()
                moveTo(16.5f, 13.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -0.672f, -2.5f, -1.5f)
                reflectiveCurveToRelative(1.119f, -1.5f, 2.5f, -1.5f)
                reflectiveCurveToRelative(2.5f, 0.672f, 2.5f, 1.5f)
                reflectiveCurveToRelative(-1.119f, 1.5f, -2.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bxsMask!!
    }

private var _bxsMask: ImageVector? = null
