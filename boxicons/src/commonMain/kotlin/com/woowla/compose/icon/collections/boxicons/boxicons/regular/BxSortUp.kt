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

public val RegularGroup.BxSortUp: ImageVector
    get() {
        if (_bxSortUp != null) {
            return _bxSortUp!!
        }
        _bxSortUp = Builder(name = "BxSortUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 7.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(5.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 4.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxSortUp!!
    }

private var _bxSortUp: ImageVector? = null
