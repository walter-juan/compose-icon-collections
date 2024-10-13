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

public val SolidGroup.BxsUserMinus: ImageVector
    get() {
        if (_bxsUserMinus != null) {
            return _bxsUserMinus!!
        }
        _bxsUserMinus = Builder(name = "BxsUserMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(4.5f, 8.552f)
                curveToRelative(0.0f, 1.995f, 1.505f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.505f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.505f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.505f, -3.5f, 3.5f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsUserMinus!!
    }

private var _bxsUserMinus: ImageVector? = null
