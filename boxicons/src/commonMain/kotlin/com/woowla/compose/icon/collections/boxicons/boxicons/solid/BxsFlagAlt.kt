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

public val SolidGroup.BxsFlagAlt: ImageVector
    get() {
        if (_bxsFlagAlt != null) {
            return _bxsFlagAlt!!
        }
        _bxsFlagAlt = Builder(name = "BxsFlagAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.303f, 6.0f)
                lineToRelative(-3.0f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.697f)
                lineToRelative(3.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bxsFlagAlt!!
    }

private var _bxsFlagAlt: ImageVector? = null
