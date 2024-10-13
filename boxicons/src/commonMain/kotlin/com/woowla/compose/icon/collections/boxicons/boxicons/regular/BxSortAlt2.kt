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

public val RegularGroup.BxSortAlt2: ImageVector
    get() {
        if (_bxSortAlt2 != null) {
            return _bxSortAlt2!!
        }
        _bxSortAlt2 = Builder(name = "BxSortAlt2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 4.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxSortAlt2!!
    }

private var _bxSortAlt2: ImageVector? = null
