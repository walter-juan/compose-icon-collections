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

public val RegularGroup.BxCircleQuarter: ImageVector
    get() {
        if (_bxCircleQuarter != null) {
            return _bxCircleQuarter!!
        }
        _bxCircleQuarter = Builder(name = "BxCircleQuarter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 4.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 19.94f, 11.0f)
                close()
            }
        }
        .build()
        return _bxCircleQuarter!!
    }

private var _bxCircleQuarter: ImageVector? = null
