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

public val RegularGroup.BxHomeAlt: ImageVector
    get() {
        if (_bxHomeAlt != null) {
            return _bxHomeAlt!!
        }
        _bxHomeAlt = Builder(name = "BxHomeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, -0.71f)
                lineToRelative(-8.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineToRelative(-8.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 11.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(10.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 11.41f)
                lineTo(12.0f, 4.41f)
                lineTo(19.0f, 11.41f)
                lineTo(19.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxHomeAlt!!
    }

private var _bxHomeAlt: ImageVector? = null
