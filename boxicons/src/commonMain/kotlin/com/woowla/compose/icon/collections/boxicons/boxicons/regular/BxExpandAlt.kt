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

public val RegularGroup.BxExpandAlt: ImageVector
    get() {
        if (_bxExpandAlt != null) {
            return _bxExpandAlt!!
        }
        _bxExpandAlt = Builder(name = "BxExpandAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _bxExpandAlt!!
    }

private var _bxExpandAlt: ImageVector? = null
