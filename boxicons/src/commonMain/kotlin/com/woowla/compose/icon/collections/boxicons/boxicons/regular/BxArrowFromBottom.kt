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

public val RegularGroup.BxArrowFromBottom: ImageVector
    get() {
        if (_bxArrowFromBottom != null) {
            return _bxArrowFromBottom!!
        }
        _bxArrowFromBottom = Builder(name = "BxArrowFromBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(12.0f, 3.586f)
                lineTo(5.293f, 10.293f)
                lineTo(6.707f, 11.707f)
                lineTo(11.0f, 7.414f)
                lineTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 7.414f)
                lineToRelative(4.293f, 4.293f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _bxArrowFromBottom!!
    }

private var _bxArrowFromBottom: ImageVector? = null
