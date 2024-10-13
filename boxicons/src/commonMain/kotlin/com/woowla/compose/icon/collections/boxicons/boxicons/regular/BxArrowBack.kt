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

public val RegularGroup.BxArrowBack: ImageVector
    get() {
        if (_bxArrowBack != null) {
            return _bxArrowBack!!
        }
        _bxArrowBack = Builder(name = "BxArrowBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                horizontalLineTo(6.414f)
                lineToRelative(5.293f, -5.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(2.586f, 12.0f)
                lineToRelative(7.707f, 7.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(6.414f, 13.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _bxArrowBack!!
    }

private var _bxArrowBack: ImageVector? = null
