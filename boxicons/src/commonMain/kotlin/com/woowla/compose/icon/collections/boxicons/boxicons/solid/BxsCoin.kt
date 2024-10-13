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

public val SolidGroup.BxsCoin: ImageVector
    get() {
        if (_bxsCoin != null) {
            return _bxsCoin!!
        }
        _bxsCoin = Builder(name = "BxsCoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(7.031f, 5.0f, 2.0f, 6.546f, 2.0f, 9.5f)
                reflectiveCurveTo(7.031f, 14.0f, 12.0f, 14.0f)
                curveToRelative(4.97f, 0.0f, 10.0f, -1.546f, 10.0f, -4.5f)
                reflectiveCurveTo(16.97f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(7.0f, 14.938f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.237f, 0.299f, 2.605f, 0.482f, 4.0f, 0.541f)
                verticalLineToRelative(-3.0f)
                arcToRelative(21.166f, 21.166f, 0.0f, false, true, -4.0f, -0.541f)
                close()
                moveTo(13.0f, 15.478f)
                verticalLineToRelative(3.0f)
                arcToRelative(20.994f, 20.994f, 0.0f, false, false, 4.0f, -0.541f)
                verticalLineToRelative(-3.0f)
                arcToRelative(20.994f, 20.994f, 0.0f, false, true, -4.0f, 0.541f)
                close()
                moveTo(19.0f, 14.297f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.801f, -0.755f, 3.0f, -1.857f, 3.0f, -3.297f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.44f, -1.199f, 2.542f, -3.0f, 3.297f)
                close()
                moveTo(5.0f, 17.297f)
                verticalLineToRelative(-3.0f)
                curveTo(3.2f, 13.542f, 2.0f, 12.439f, 2.0f, 11.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.439f, 1.2f, 2.542f, 3.0f, 3.297f)
                close()
            }
        }
        .build()
        return _bxsCoin!!
    }

private var _bxsCoin: ImageVector? = null
