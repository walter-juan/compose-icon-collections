package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsTagAlt: ImageVector
    get() {
        if (_bxsTagAlt != null) {
            return _bxsTagAlt!!
        }
        _bxsTagAlt = Builder(name = "BxsTagAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.868f, 11.504f)
                lineToRelative(-4.0f, -7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 4.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.868f, 1.496f)
                lineTo(5.849f, 12.0f)
                lineToRelative(-3.717f, 6.504f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.868f, -0.504f)
                lineToRelative(4.0f, -7.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.0f, -0.992f)
                close()
            }
        }
        .build()
        return _bxsTagAlt!!
    }

private var _bxsTagAlt: ImageVector? = null
