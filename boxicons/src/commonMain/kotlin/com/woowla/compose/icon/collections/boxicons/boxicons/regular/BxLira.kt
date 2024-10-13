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

public val RegularGroup.BxLira: ImageVector
    get() {
        if (_bxLira != null) {
            return _bxLira!!
        }
        _bxLira = Builder(name = "BxLira", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -4.038f, 8.0f, -9.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 3.86f, -2.691f, 7.0f, -6.0f, 7.0f)
                verticalLineToRelative(-7.358f)
                lineToRelative(6.0f, -1.385f)
                verticalLineTo(8.204f)
                lineToRelative(-6.0f, 1.385f)
                verticalLineTo(7.642f)
                lineToRelative(6.0f, -1.385f)
                verticalLineTo(4.204f)
                lineToRelative(-6.0f, 1.385f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.05f)
                lineToRelative(-3.0f, 0.693f)
                verticalLineToRelative(2.053f)
                lineToRelative(3.0f, -0.692f)
                verticalLineToRelative(1.947f)
                lineToRelative(-3.0f, 0.692f)
                verticalLineToRelative(2.053f)
                lineToRelative(3.0f, -0.692f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _bxLira!!
    }

private var _bxLira: ImageVector? = null
