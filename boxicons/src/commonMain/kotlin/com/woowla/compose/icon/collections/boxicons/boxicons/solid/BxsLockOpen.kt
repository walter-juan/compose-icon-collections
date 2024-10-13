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

public val SolidGroup.BxsLockOpen: ImageVector
    get() {
        if (_bxsLockOpen != null) {
            return _bxsLockOpen!!
        }
        _bxsLockOpen = Builder(name = "BxsLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveTo(7.0f, 4.243f, 7.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(10.061f, 15.499f)
                arcTo(2.002f, 2.002f, 0.0f, false, true, 14.0f, 16.0f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, -1.0f, 1.723f)
                lineTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.277f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, true, -0.939f, -2.224f)
                close()
            }
        }
        .build()
        return _bxsLockOpen!!
    }

private var _bxsLockOpen: ImageVector? = null
