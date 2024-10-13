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

public val RegularGroup.BxSortDown: ImageVector
    get() {
        if (_bxSortDown != null) {
            return _bxSortDown!!
        }
        _bxSortDown = Builder(name = "BxSortDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 20.0f)
                lineToRelative(4.0f, -4.0f)
                lineTo(7.0f, 16.0f)
                lineTo(7.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 16.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _bxSortDown!!
    }

private var _bxSortDown: ImageVector? = null
