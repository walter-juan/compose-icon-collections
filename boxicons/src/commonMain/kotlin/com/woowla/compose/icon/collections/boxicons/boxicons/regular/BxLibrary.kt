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

public val RegularGroup.BxLibrary: ImageVector
    get() {
        if (_bxLibrary != null) {
            return _bxLibrary!!
        }
        _bxLibrary = Builder(name = "BxLibrary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                lineTo(7.0f, 21.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                lineTo(4.0f, 21.0f)
                close()
                moveTo(10.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(19.062f, 20.792f)
                lineTo(12.839f, 3.902f)
                lineTo(14.716f, 3.21f)
                lineTo(20.939f, 20.1f)
                close()
            }
        }
        .build()
        return _bxLibrary!!
    }

private var _bxLibrary: ImageVector? = null
