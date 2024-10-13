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

public val RegularGroup.BxArrowFromTop: ImageVector
    get() {
        if (_bxArrowFromTop != null) {
            return _bxArrowFromTop!!
        }
        _bxArrowFromTop = Builder(name = "BxArrowFromTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(12.0f, 20.414f)
                lineTo(18.707f, 13.707f)
                lineTo(17.293f, 12.293f)
                lineTo(13.0f, 16.586f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.586f)
                lineToRelative(-4.293f, -4.293f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _bxArrowFromTop!!
    }

private var _bxArrowFromTop: ImageVector? = null
