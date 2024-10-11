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

public val LogosGroup.DriveFill: ImageVector
    get() {
        if (_driveFill != null) {
            return _driveFill!!
        }
        _driveFill = Builder(name = "DriveFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.94f, 4.146f)
                lineTo(11.422f, 10.176f)
                lineTo(5.482f, 20.469f)
                lineTo(2.0f, 14.44f)
                lineTo(7.94f, 4.146f)
                close()
                moveTo(10.116f, 14.44f)
                horizontalLineTo(22.0f)
                lineTo(18.518f, 20.469f)
                horizontalLineTo(6.635f)
                lineTo(10.116f, 14.44f)
                close()
                moveTo(14.459f, 13.44f)
                lineTo(8.518f, 3.145f)
                horizontalLineTo(15.482f)
                lineTo(21.423f, 13.44f)
                horizontalLineTo(14.459f)
                close()
            }
        }
        .build()
        return _driveFill!!
    }

private var _driveFill: ImageVector? = null
