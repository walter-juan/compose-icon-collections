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

public val ArrowsGroup.ExpandVerticalSLine: ImageVector
    get() {
        if (_expandVerticalSLine != null) {
            return _expandVerticalSLine!!
        }
        _expandVerticalSLine = Builder(name = "ExpandVerticalSLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.949f, 7.449f)
                lineTo(12.0f, 2.5f)
                lineTo(7.052f, 7.447f)
                lineTo(8.466f, 8.861f)
                lineTo(11.0f, 6.328f)
                lineTo(11.0f, 17.67f)
                lineTo(8.464f, 15.135f)
                lineTo(7.05f, 16.55f)
                lineTo(12.0f, 21.5f)
                lineTo(16.95f, 16.55f)
                lineTo(15.535f, 15.136f)
                lineTo(13.0f, 17.672f)
                lineTo(13.0f, 6.328f)
                lineTo(15.535f, 8.863f)
                lineTo(16.949f, 7.449f)
                close()
            }
        }
        .build()
        return _expandVerticalSLine!!
    }

private var _expandVerticalSLine: ImageVector? = null
