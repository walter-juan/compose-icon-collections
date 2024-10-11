package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ExpandWidthLine: ImageVector
    get() {
        if (_expandWidthLine != null) {
            return _expandWidthLine!!
        }
        _expandWidthLine = Builder(name = "ExpandWidthLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 18.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(9.45f, 7.05f)
                lineTo(4.5f, 12.0f)
                lineTo(9.447f, 16.947f)
                lineTo(10.861f, 15.533f)
                lineTo(8.328f, 13.0f)
                horizontalLineTo(15.671f)
                lineTo(13.136f, 15.535f)
                lineTo(14.55f, 16.949f)
                lineTo(19.5f, 12.0f)
                lineTo(14.55f, 7.05f)
                lineTo(13.136f, 8.464f)
                lineTo(15.672f, 11.0f)
                horizontalLineTo(8.328f)
                lineTo(10.864f, 8.464f)
                lineTo(9.45f, 7.05f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _expandWidthLine!!
    }

private var _expandWidthLine: ImageVector? = null
