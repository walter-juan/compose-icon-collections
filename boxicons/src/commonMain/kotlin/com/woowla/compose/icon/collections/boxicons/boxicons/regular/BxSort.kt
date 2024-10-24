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

public val RegularGroup.BxSort: ImageVector
    get() {
        if (_bxSort != null) {
            return _bxSort!!
        }
        _bxSort = Builder(name = "BxSort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                lineToRelative(6.0f, 6.0f)
                lineTo(10.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                close()
                moveTo(14.0f, 5.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _bxSort!!
    }

private var _bxSort: ImageVector? = null