package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.XingLine: ImageVector
    get() {
        if (_xingLine != null) {
            return _xingLine!!
        }
        _xingLine = Builder(name = "XingLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.444f, 3.5f)
                lineTo(13.81f, 14.99f)
                lineTo(17.857f, 22.0f)
                horizontalLineTo(15.547f)
                lineTo(11.502f, 14.991f)
                lineTo(11.5f, 14.99f)
                lineTo(18.134f, 3.5f)
                horizontalLineTo(20.444f)
                close()
                moveTo(8.31f, 7.0f)
                lineTo(10.732f, 11.196f)
                lineTo(10.731f, 11.197f)
                lineTo(7.669f, 16.5f)
                horizontalLineTo(5.361f)
                lineTo(8.422f, 11.195f)
                lineTo(6.001f, 7.0f)
                horizontalLineTo(8.31f)
                close()
            }
        }
        .build()
        return _xingLine!!
    }

private var _xingLine: ImageVector? = null
