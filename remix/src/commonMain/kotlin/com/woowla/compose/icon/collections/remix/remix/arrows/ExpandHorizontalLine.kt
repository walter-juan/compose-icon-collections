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

public val ArrowsGroup.ExpandHorizontalLine: ImageVector
    get() {
        if (_expandHorizontalLine != null) {
            return _expandHorizontalLine!!
        }
        _expandHorizontalLine = Builder(name = "ExpandHorizontalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 12.0f)
                lineTo(5.45f, 7.05f)
                lineTo(6.864f, 8.465f)
                lineTo(4.328f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.328f)
                lineTo(6.861f, 15.533f)
                lineTo(5.447f, 16.947f)
                lineTo(0.5f, 12.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(19.671f)
                lineTo(17.136f, 15.535f)
                lineTo(18.55f, 16.949f)
                lineTo(23.5f, 12.0f)
                lineTo(18.55f, 7.05f)
                lineTo(17.136f, 8.464f)
                lineTo(19.672f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _expandHorizontalLine!!
    }

private var _expandHorizontalLine: ImageVector? = null
