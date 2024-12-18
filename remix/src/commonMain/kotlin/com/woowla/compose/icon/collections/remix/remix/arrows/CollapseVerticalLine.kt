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

public val ArrowsGroup.CollapseVerticalLine: ImageVector
    get() {
        if (_collapseVerticalLine != null) {
            return _collapseVerticalLine!!
        }
        _collapseVerticalLine = Builder(name = "CollapseVerticalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.5f)
                lineTo(16.949f, 18.449f)
                lineTo(15.535f, 19.864f)
                lineTo(13.0f, 17.328f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 17.328f)
                lineTo(8.466f, 19.861f)
                lineTo(7.052f, 18.447f)
                lineTo(12.0f, 13.5f)
                close()
                moveTo(11.0f, 1.0f)
                lineTo(11.0f, 6.67f)
                lineTo(8.464f, 4.135f)
                lineTo(7.05f, 5.55f)
                lineTo(12.0f, 10.5f)
                lineTo(16.95f, 5.55f)
                lineTo(15.535f, 4.136f)
                lineTo(13.0f, 6.672f)
                verticalLineTo(1.0f)
                lineTo(11.0f, 1.0f)
                close()
            }
        }
        .build()
        return _collapseVerticalLine!!
    }

private var _collapseVerticalLine: ImageVector? = null
