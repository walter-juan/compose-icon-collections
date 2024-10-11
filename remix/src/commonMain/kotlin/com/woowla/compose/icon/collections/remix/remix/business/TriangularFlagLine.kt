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

public val BusinessGroup.TriangularFlagLine: ImageVector
    get() {
        if (_triangularFlagLine != null) {
            return _triangularFlagLine!!
        }
        _triangularFlagLine = Builder(name = "TriangularFlagLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.144f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.339f)
                lineTo(6.0f, 5.144f)
                close()
                moveTo(4.0f, 2.932f)
                curveTo(4.0f, 2.072f, 5.015f, 1.613f, 5.661f, 2.181f)
                lineTo(21.65f, 16.249f)
                curveTo(22.342f, 16.858f, 21.912f, 18.0f, 20.99f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.932f)
                close()
            }
        }
        .build()
        return _triangularFlagLine!!
    }

private var _triangularFlagLine: ImageVector? = null
