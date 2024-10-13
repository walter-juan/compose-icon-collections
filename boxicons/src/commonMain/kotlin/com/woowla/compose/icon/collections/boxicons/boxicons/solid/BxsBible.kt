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

public val SolidGroup.BxsBible: ImageVector
    get() {
        if (_bxsBible != null) {
            return _bxsBible!!
        }
        _bxsBible = Builder(name = "BxsBible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.012f)
                curveTo(5.55f, 19.988f, 5.0f, 19.805f, 5.0f, 19.0f)
                reflectiveCurveToRelative(0.55f, -0.988f, 1.012f, -1.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.206f, 0.0f, -3.0f, 0.799f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _bxsBible!!
    }

private var _bxsBible: ImageVector? = null
