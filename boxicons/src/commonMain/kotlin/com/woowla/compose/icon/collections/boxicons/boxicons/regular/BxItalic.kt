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

public val RegularGroup.BxItalic: ImageVector
    get() {
        if (_bxItalic != null) {
            return _bxItalic!!
        }
        _bxItalic = Builder(name = "BxItalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.868f)
                lineTo(9.012f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.868f)
                lineToRelative(2.856f, -10.0f)
                close()
            }
        }
        .build()
        return _bxItalic!!
    }

private var _bxItalic: ImageVector? = null
