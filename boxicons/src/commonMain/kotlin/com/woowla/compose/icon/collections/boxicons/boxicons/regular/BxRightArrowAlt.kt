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

public val RegularGroup.BxRightArrowAlt: ImageVector
    get() {
        if (_bxRightArrowAlt != null) {
            return _bxRightArrowAlt!!
        }
        _bxRightArrowAlt = Builder(name = "BxRightArrowAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.293f, 17.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(19.414f, 12.0f)
                lineToRelative(-6.707f, -6.707f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(15.586f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.586f)
                close()
            }
        }
        .build()
        return _bxRightArrowAlt!!
    }

private var _bxRightArrowAlt: ImageVector? = null
