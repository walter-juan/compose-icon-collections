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

public val RegularGroup.BxObjectsHorizontalRight: ImageVector
    get() {
        if (_bxObjectsHorizontalRight != null) {
            return _bxObjectsHorizontalRight!!
        }
        _bxObjectsHorizontalRight = Builder(name = "BxObjectsHorizontalRight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(18.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(7.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(8.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxObjectsHorizontalRight!!
    }

private var _bxObjectsHorizontalRight: ImageVector? = null
