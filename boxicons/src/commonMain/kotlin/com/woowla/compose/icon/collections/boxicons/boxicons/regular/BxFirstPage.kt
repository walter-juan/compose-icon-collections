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

public val RegularGroup.BxFirstPage: ImageVector
    get() {
        if (_bxFirstPage != null) {
            return _bxFirstPage!!
        }
        _bxFirstPage = Builder(name = "BxFirstPage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.293f, 17.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 12.0f)
                lineToRelative(4.293f, -4.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 12.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _bxFirstPage!!
    }

private var _bxFirstPage: ImageVector? = null
