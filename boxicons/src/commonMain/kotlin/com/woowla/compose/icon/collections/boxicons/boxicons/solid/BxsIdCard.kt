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

public val SolidGroup.BxsIdCard: ImageVector
    get() {
        if (_bxsIdCard != null) {
            return _bxsIdCard!!
        }
        _bxsIdCard = Builder(name = "BxsIdCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.715f, 8.0f)
                curveToRelative(1.151f, 0.0f, 2.0f, 0.849f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.849f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.849f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.848f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(12.43f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(-0.465f)
                curveToRelative(0.0f, -1.373f, 1.676f, -2.785f, 3.715f, -2.785f)
                reflectiveCurveToRelative(3.715f, 1.412f, 3.715f, 2.785f)
                lineTo(12.43f, 16.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsIdCard!!
    }

private var _bxsIdCard: ImageVector? = null
