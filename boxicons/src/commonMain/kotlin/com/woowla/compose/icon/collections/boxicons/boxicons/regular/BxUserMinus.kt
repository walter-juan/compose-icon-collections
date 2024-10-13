package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxUserMinus: ImageVector
    get() {
        if (_bxUserMinus != null) {
            return _bxUserMinus!!
        }
        _bxUserMinus = Builder(name = "BxUserMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(4.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(7.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxUserMinus!!
    }

private var _bxUserMinus: ImageVector? = null
