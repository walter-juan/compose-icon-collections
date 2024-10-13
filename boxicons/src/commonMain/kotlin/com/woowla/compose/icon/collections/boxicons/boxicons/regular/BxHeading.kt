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

public val RegularGroup.BxHeading: ImageVector
    get() {
        if (_bxHeading != null) {
            return _bxHeading!!
        }
        _bxHeading = Builder(name = "BxHeading", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _bxHeading!!
    }

private var _bxHeading: ImageVector? = null
