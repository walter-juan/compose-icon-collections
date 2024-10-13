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

public val RegularGroup.BxArrowFromLeft: ImageVector
    get() {
        if (_bxArrowFromLeft != null) {
            return _bxArrowFromLeft!!
        }
        _bxArrowFromLeft = Builder(name = "BxArrowFromLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(8.586f)
                lineToRelative(-4.293f, 4.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(20.414f, 12.0f)
                lineToRelative(-6.707f, -6.707f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(16.586f, 11.0f)
                lineTo(8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bxArrowFromLeft!!
    }

private var _bxArrowFromLeft: ImageVector? = null
