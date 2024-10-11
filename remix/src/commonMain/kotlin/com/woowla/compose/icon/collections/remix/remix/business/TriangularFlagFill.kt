package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.TriangularFlagFill: ImageVector
    get() {
        if (_triangularFlagFill != null) {
            return _triangularFlagFill!!
        }
        _triangularFlagFill = Builder(name = "TriangularFlagFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.661f, 2.181f)
                curveTo(5.015f, 1.613f, 4.0f, 2.072f, 4.0f, 2.932f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.99f)
                curveTo(21.912f, 18.0f, 22.342f, 16.858f, 21.65f, 16.249f)
                lineTo(5.661f, 2.181f)
                close()
            }
        }
        .build()
        return _triangularFlagFill!!
    }

private var _triangularFlagFill: ImageVector? = null
