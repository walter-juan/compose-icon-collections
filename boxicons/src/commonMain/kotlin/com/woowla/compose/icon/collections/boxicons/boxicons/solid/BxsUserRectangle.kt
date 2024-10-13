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

public val SolidGroup.BxsUserRectangle: ImageVector
    get() {
        if (_bxsUserRectangle != null) {
            return _bxsUserRectangle!!
        }
        _bxsUserRectangle = Builder(name = "BxsUserRectangle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 4.999f)
                curveToRelative(1.647f, 0.0f, 3.0f, 1.351f, 3.0f, 3.0f)
                curveTo(15.0f, 9.647f, 13.647f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(9.0f, 9.647f, 9.0f, 7.999f)
                curveToRelative(0.0f, -1.649f, 1.353f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(6.0f, 17.25f)
                curveToRelative(0.0f, -2.219f, 2.705f, -4.5f, 6.0f, -4.5f)
                reflectiveCurveToRelative(6.0f, 2.281f, 6.0f, 4.5f)
                lineTo(18.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-0.75f)
                close()
            }
        }
        .build()
        return _bxsUserRectangle!!
    }

private var _bxsUserRectangle: ImageVector? = null
