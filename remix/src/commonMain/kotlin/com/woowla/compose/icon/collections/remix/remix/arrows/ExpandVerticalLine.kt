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

public val ArrowsGroup.ExpandVerticalLine: ImageVector
    get() {
        if (_expandVerticalLine != null) {
            return _expandVerticalLine!!
        }
        _expandVerticalLine = Builder(name = "ExpandVerticalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.5f)
                lineTo(16.949f, 5.449f)
                lineTo(15.535f, 6.863f)
                lineTo(13.0f, 4.328f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 4.328f)
                lineTo(8.466f, 6.861f)
                lineTo(7.052f, 5.447f)
                lineTo(12.0f, 0.5f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(11.0f, 19.67f)
                lineTo(8.464f, 17.135f)
                lineTo(7.05f, 18.55f)
                lineTo(12.0f, 23.5f)
                lineTo(16.95f, 18.55f)
                lineTo(15.535f, 17.136f)
                lineTo(13.0f, 19.672f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _expandVerticalLine!!
    }

private var _expandVerticalLine: ImageVector? = null
