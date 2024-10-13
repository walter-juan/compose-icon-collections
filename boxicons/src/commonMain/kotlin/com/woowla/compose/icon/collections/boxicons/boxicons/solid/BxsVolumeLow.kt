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

public val SolidGroup.BxsVolumeLow: ImageVector
    get() {
        if (_bxsVolumeLow != null) {
            return _bxsVolumeLow!!
        }
        _bxsVolumeLow = Builder(name = "BxsVolumeLow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(2.697f)
                lineTo(14.0f, 21.868f)
                verticalLineTo(2.132f)
                lineTo(6.697f, 7.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(16.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(1.225f, -1.1f, 2.0f, -3.229f, 2.0f, -5.0f)
                reflectiveCurveToRelative(-0.775f, -3.9f, -2.0f, -5.0f)
                close()
            }
        }
        .build()
        return _bxsVolumeLow!!
    }

private var _bxsVolumeLow: ImageVector? = null
