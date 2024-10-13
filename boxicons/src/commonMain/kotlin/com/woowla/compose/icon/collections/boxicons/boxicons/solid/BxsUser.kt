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

public val SolidGroup.BxsUser: ImageVector
    get() {
        if (_bxsUser != null) {
            return _bxsUser!!
        }
        _bxsUser = Builder(name = "BxsUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 6.5f)
                curveTo(7.5f, 8.981f, 9.519f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveTo(14.481f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(7.5f, 4.019f, 7.5f, 6.5f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(17.0f)
                close()
            }
        }
        .build()
        return _bxsUser!!
    }

private var _bxsUser: ImageVector? = null
